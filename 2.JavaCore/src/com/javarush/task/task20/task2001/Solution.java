package com.javarush.task.task20.task2001;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Реализуй логику записи в файл и чтения из файла для класса Human.
        Поле name в классе Human не может быть пустым.
        Метод main реализован только для вас и не участвует в тестировании.


        Требования:
        1. Логика чтения/записи реализованная в методах save/load должна работать корректно в случае, если список assets пустой.
        2. Логика чтения/записи реализованная в методах save/load должна работать корректно в случае, если поле name и список assets не пустые.
        3. Класс Solution.Human не должен поддерживать интерфейс Serializable.
        4. Класс Solution.Human должен быть публичным.
        5. Класс Solution.Human не должен поддерживать интерфейс Externalizable.*/

public class Solution {
    public static void main(String[] args) {
        //исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
          //  File your_file_name = File.createTempFile("C:\\Users\\IMAST\\Desktop\\New.bin", null);
            OutputStream outputStream = new FileOutputStream("C:\\Users\\IMAST\\Desktop\\New.bin");
            InputStream inputStream = new FileInputStream("C:\\Users\\IMAST\\Desktop\\New.bin");

            Human ivanov = new Human("Ivanov", new Asset("home", 999_999.99), new Asset("car", 2999.99));
            ivanov.save(outputStream);
            outputStream.flush();

            Human somePerson = new Human();
            somePerson.load(inputStream);
            inputStream.close();
            //check here that ivanov equals to somePerson - проверьте тут, что ivanov и somePerson равны

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }

    public static class Human {
        public String name;
        public List<Asset> assets = new ArrayList<>();

        public Human() {
        }

        public Human(String name, Asset... assets) {
            this.name = name;
            if (assets != null) {
                this.assets.addAll(Arrays.asList(assets));
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Human human = (Human) o;

            if (name != null ? !name.equals(human.name) : human.name != null) return false;
            return assets != null ? assets.equals(human.assets) : human.assets == null;
        }

        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + (assets != null ? assets.hashCode() : 0);
            return result;
        }

        public void save(OutputStream outputStream) throws Exception {
            //implement this method - реализуйте этот методO
            ObjectOutputStream outputStream1 = new ObjectOutputStream(outputStream);
            outputStream1.writeObject(this.name);
            outputStream1.writeObject(this.assets);

           // outputStream1.close();
        }

        public void load(InputStream inputStream) throws Exception {
            //implement this method - реализуйте этот метод
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            Object one = objectInputStream.readObject();
            Object two = objectInputStream.readObject();
            this.name = (String) one;
            this.assets = (List<Asset>) two;


        }
    }
}
