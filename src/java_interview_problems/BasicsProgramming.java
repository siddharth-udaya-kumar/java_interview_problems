package java_interview_problems;

import java.util.Scanner;

public class BasicsProgramming {
    public static void main(String[] args) {
        IOFunction();
    }
    static void IOFunction() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String s1= s+sc.nextLine();
        System.out.println(s1);
    }


}
