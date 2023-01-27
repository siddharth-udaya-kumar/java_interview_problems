package java_interview_problems;

import java.util.Scanner;

public class Random {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = (int) (Math.random() * 100)/10;
        System.out.println(b);
        if (a == b) {
            System.out.println("Jackpot");
        } else {
            System.out.println("Sorry better luck next time");
        }
    }
}
