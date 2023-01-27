package java_interview_problems;

import java.util.Scanner;

public class CheckSum1 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int check = checkSum(a, b);
        System.out.printf("value of check is %d", check);
    }

    static int checkSum(int a, int b) {
        int check = 0;
        int sum = a + b;
        if (sum < 100) {
            check = 0;
        } else if (sum > 100) {
            check = 1;

        } else {
            check = 2;
        }
        return check;
    }

}
