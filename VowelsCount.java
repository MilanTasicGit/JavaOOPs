package org.JavaOOPs;
/*
Create a method to count how many vowels are present in a string “documentation”
 */
public class VowelsCount {
    public static void main(String[] args) {

        int vowelsCount=0;
        String str="documentation";
        for (int i = 0; i < str.length(); i++) {
            char currentChar=str.charAt(i);

            if (currentChar =='a'||currentChar=='e'||currentChar=='i'
            ||currentChar=='o'||currentChar=='u'){
              vowelsCount++;
            }
        }
        System.out.println("The number of vowels present in a given string is: "+vowelsCount);
    }
}
