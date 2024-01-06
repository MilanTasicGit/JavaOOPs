package org.JavaOOPs;
/* T1
Write a program to swap 2 String without a temporary variable?
 */
public class Swap2Strings {
    public static void main(String[] args){

        String str1="Java";
        String str2="programming";

        System.out.println("Before swapping the strings are: str1: "+str1+", str2: "+str2);

        str1=str1.concat(str2);
        str2=str1.substring(0,str1.length()-str2.length());
        str1=str1.substring(str2.length());

        System.out.println("After swapping the strings are: str1: "+str1+", str2: "+str2);
    }
}
