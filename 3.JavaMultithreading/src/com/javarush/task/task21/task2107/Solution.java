package com.javarush.task.task21.task2107;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* 
Глубокое клонирование карты
*/

public class Solution implements Cloneable {

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.users.put("Hubert", new User(172, "Hubert"));
        solution.users.put("Zapp", new User(41, "Zapp"));
        Solution clone = null;
        try {
            clone = solution.clone();
            System.out.println(solution);
            System.out.println(clone);

            System.out.println(solution.users);
            System.out.println(clone.users);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace(System.err);
        }
    }

    @Override
    protected Solution clone() throws CloneNotSupportedException {
        Solution solution = new Solution();
      // solution.users = new LinkedHashMap(this.users);
        for (Map.Entry<String, User> cloneValue : users.entrySet()) {
            solution.users.put (cloneValue.getKey(), cloneValue.getValue().clone());
        }
        return solution;
    }

    protected Map<String, User> users = new LinkedHashMap();

    public static class User implements Cloneable {
        int age;
        String name;

        public User(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        protected User clone() throws CloneNotSupportedException {
            return (User) super.clone();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            User user = (User) o;
            return age == user.age &&
                    Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(age, name);
        }
    }

    @Override
    public int hashCode() {
        if (users == null) { return 0; }
        else { return users.hashCode(); }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) { return false; }
        if (this == obj) { return true; }
        if (this.getClass() != obj.getClass()) { return false; }
        if (!(obj instanceof Solution)) { return false; }
        Solution sol = (Solution) obj;
        return this.equals(sol);
    }
}
