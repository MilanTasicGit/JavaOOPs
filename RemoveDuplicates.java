package org.JavaOOPs;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {

        List<String> originalList = new ArrayList<>();
        originalList.add("apple");
        originalList.add("banana");
        originalList.add("orange");
        originalList.add("apple");
        originalList.add("grape");
        originalList.add("banana");
        System.out.println("Original list: " + originalList);

        List<String> originalListWithoutDuplicates = new ArrayList<>();
        for (String list : originalList) {
            if (!originalListWithoutDuplicates.contains(list)) {
                originalListWithoutDuplicates.add(list);
            }
        }
        System.out.println("Original list without duplicates: "+originalListWithoutDuplicates);

    }
}
