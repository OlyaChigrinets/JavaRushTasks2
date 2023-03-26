package com.javarush.task.task19.task1920;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* 
Самый богатый
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));
        TreeMap<String, Double> list = new TreeMap<>();
        String s;

        while ((s = bufferedReader.readLine()) != null) {
            String[] array = s.split(" ");
            if (list.containsKey(array[0])) {
                for (Map.Entry<String, Double> ass : list.entrySet()) {
                    if (ass.getKey().equals(array[0])) {
                        double val = ass.getValue() + Double.parseDouble(array[1]);
                        ass.setValue(val);
                    }
                }
            } else {
                list.put(array[0], Double.parseDouble(array[1]));
            }
        }
        double d = 0;
        String a = "";
        for (Map.Entry<String, Double> list2 : list.entrySet()) {
            if (list2.getValue() > d) {
                d = list2.getValue();
            }
        }
        for (Map.Entry<String, Double> list2 : list.entrySet()) {
            if (list2.getValue() == d) {
                System.out.println(list2.getKey());
            }
        }
        bufferedReader.close();
    }
}
