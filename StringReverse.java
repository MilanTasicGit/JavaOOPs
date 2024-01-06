package org.JavaOOPs;
/* T3 Reverse a String: Write a function to reverse a given string. For example,
given the input "Hello", the output should be "olleH". */
public class StringReverse {
    public static void main(String[] args) {

        String str="Java programming";
        String [] strR=str.split(" ");

        for(String s:strR) {
            for (int i = s.length() - 1; i >= 0; i--) {
                System.out.print(s.charAt(i));
            }
            System.out.print(" ");
        }
    }
}
