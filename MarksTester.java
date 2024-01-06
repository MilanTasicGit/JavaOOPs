package org.JavaOOPs;

public class MarksTester {
    public static void main(String[] args) {
        A studentA=new A(81,90,84);
        System.out.println("Student A has average mark: "+studentA.getPercentage());
        B studentB=new B(90,92,95,100);
        System.out.println(("Student B has average mark: "+studentB.getPercentage()));
    }
}

