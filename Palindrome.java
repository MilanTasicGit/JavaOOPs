package org.JavaOOPs;
/* T4 Check if a String is Palindrome: Determine whether a given string is a
palindrome, which means it reads the same forwards and backward. For
example, "madam" is a palindrome.
 */
public class Palindrome {
    public static void main(String[] args) {

        String str="Java programming";
        String strR="";

        for (int i = str.length()-1; i >=0; i--) {
            strR = strR + str.charAt(i);
        }
        if(str.equalsIgnoreCase(strR)){
            System.out.println("Given string is a Palindrome");
        }else{
            System.out.println("Given string is not a Palindrome");
        }
    }
}
