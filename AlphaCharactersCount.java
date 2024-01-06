package org.JavaOOPs;
/* T2
Find out how many alpha characters are present in a string?
 */
public class AlphaCharactersCount {
    public static void main(String[] args){

        String str="Today is 01/01/2024. We are studying Java programming more than 20 classes.";

        System.out.println("There are "+str.replaceAll("[^A-Z,a-z]","").length()+
                " alpha characters in the String str.");

    }
}

