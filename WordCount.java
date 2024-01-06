package org.JavaOOPs;
/* T7 Count the Number of Words in a String: Write a function to count the
number of words in a given string. Words are separated by spaces or
punctuation. For example, the input "Hello, world!" should return 2. */
public class WordCount {
    public static void main(String[] args) {

        String str = "Hello, world! Today is Java programming revise day again?!";
        String[] strArr = str.split("[\\s,.!?]+"); // \\s -> for 'space' (regExr)
                                                          // + to treat multiple characters together as one occurrence

        System.out.println("The number of words in the given string is: "+strArr.length);
    }
}

