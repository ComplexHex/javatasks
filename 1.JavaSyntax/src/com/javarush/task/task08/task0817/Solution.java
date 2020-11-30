package com.javarush.task.task08.task0817;

import com.sun.javafx.collections.MappingChange;

import java.util.*;

/*Создать словарь (Map<String, String>) занести в него десять записей по принципу "фамилия" - "имя".
        Удалить людей, имеющих одинаковые имена.


        Требования:
        1. Программа не должна выводить текст на экран.
        2. Программа не должна считывать значения с клавиатуры.
        3. Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, String состоящих из
        10 записей.
        4. Метод removeTheFirstNameDuplicates() должен удалять из словаря всех людей, имеющие одинаковые имена.
        5. Метод removeTheFirstNameDuplicates() должен вызывать метод removeItemFromMapByValue().*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код

        HashMap<String, String> map = new HashMap<String, String>();
        map.put("asd12", "qwe1");
        map.put("asd1", "qwe2");
        map.put("asd2", "qwe43");
        map.put("asd3", "qwe");
        map.put("asd4", "qwe");
        map.put("asd21", "qwe5");
        map.put("asd22", "qwe6");
        map.put("asd7", "qwe87");
        map.put("asd8", "qwe7");
        map.put("asd9", "qwe8");

        return map;

    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        ArrayList<String> list = new ArrayList<>();
        Map<String, String> map1 = new HashMap<>(map);

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            String key = pair.getKey();
            String value = pair.getValue();
            map1.remove(key);
            if (map1.containsValue(value)) {
                list.add(value);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            removeItemFromMapByValue(map, list.get(i));
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}
