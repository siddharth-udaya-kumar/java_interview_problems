package java_interview_problems;

import java.util.Scanner;

public class CheckSum {
    public static void main(String[] args) {
        // Two inputs - 10  , 30 sum > 0 , check = 1 , sum <0 check = 0 , sum = 100 , check =2
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1,2");
        int a = sc.nextInt();
        int b = sc.nextInt();

        // call a function
       int check = checkSum(a,b);
        System.out.println(check);
        sc.close();

    }

    static int checkSum(int a, int b) {
        int check = 0;

        // logic
        int sum = a+b;

        return check;

    }
}
