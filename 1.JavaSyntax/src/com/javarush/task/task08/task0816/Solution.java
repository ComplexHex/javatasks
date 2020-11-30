package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Смирнов", dateFormat.parse("MAY 11 2012"));
        map.put("Смирнов1", dateFormat.parse("MAY 12 2012"));
        map.put("Смирнов2", dateFormat.parse("MAY 3 2012"));
        map.put("Смирнов3", dateFormat.parse("MAY 14 2012"));
        map.put("Смирнов4", dateFormat.parse("MAY 15 2012"));
        map.put("Смирнов5", dateFormat.parse("JULY 11 2012"));
        map.put("Смирнов6", dateFormat.parse("MAY 16 2012"));
        map.put("Смирнов7", dateFormat.parse("MAY 17 2012"));
        map.put("Смирнов8", dateFormat.parse("MAY 18 2012"));
        map.put("Смирнов9", dateFormat.parse("JUNE 12 2012"));


        return map;
        //напишите тут ваш код
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код
        int mon;
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Date date = iterator.next().getValue();
            mon = date.getMonth();
            if (mon == 5 || mon == 6 || mon == 7)iterator.remove();
        }


    }

    public static void main(String[] args) {

    }
}
