package com.javarush.task.task19.task1919;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* 
Считаем зарплаты
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));

        TreeMap<String, Double> list = new TreeMap<String, Double>();
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
        for (Map.Entry<String, Double> ass : list.entrySet()) {
            System.out.println(ass.getKey() + " " + ass.getValue());
        }
        bufferedReader.close();
    }
}
