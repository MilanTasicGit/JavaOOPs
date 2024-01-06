package org.JavaOOPs;

import java.util.Arrays;
/* T5 Check if Two Strings are Anagrams: Given two strings, determine if they
are anagrams, meaning they contain the same characters in a different order.
For example, "listen" and "silent" are anagrams
 */
public class Anagrams {

            public static boolean areAnagrams(String str1, String str2) {
                if (str1.length() != str2.length()) {
                    return false;
                }
                char[] charArray1 = new char[str1.length()];
                char[] charArray2 = new char[str2.length()];

                for (int i = 0; i < str1.length(); i++) {
                    charArray1[i] = str1.charAt(i);
                    charArray2[i] = str2.charAt(i);
                }
                Arrays.sort(charArray1);
                Arrays.sort(charArray2);

                for (int i = 0; i < charArray1.length; i++) {
                    if (charArray1[i] != charArray2[i]) {
                        return false;
                    }
                }
                return true;
            }
            public static void main(String[] args) {
                String str1 = "listen";
                String str2 = "silent";

                if (areAnagrams(str1, str2)) {
                    System.out.println("The given strings: "+str1 +" and "+ str2+" are anagrams.");
                } else {
                    System.out.println("The given strings: "+str1 +" and "+ str2+" are not anagrams.");
                }
            }
        }