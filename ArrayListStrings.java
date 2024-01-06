package org.JavaOOPs;

import java.util.ArrayList;

/*
You have a list of strings and you want to keep only those that start with
“A” and you want to return them in lower case".
 */
public class ArrayListStrings {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Belgrade");
        cities.add("Ankara");
        cities.add("Athens");
        cities.add("Munich");
        cities.add("Bucharest");

        for (int i = 0; i < cities.size(); i++) {
            if (!cities.get(i).toLowerCase().startsWith("a")) {
                cities.remove(i);
                i--;
            }
        }
        for (String citiesL : cities) {
            System.out.println(citiesL.toLowerCase());
        }
    }
}
