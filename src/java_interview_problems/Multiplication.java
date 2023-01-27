package java_interview_problems;

import java.util.Scanner;

public class Multiplication {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int c = sc.nextInt();
    static int mul;

    @Override
    public String toString() {
        return "Multiplication{" +
                "sc=" + sc +
                ", n=" + n +
                ", c=" + c +
                '}';
    }

    public static void main(String[] args) {
        Multiplication Product = new Multiplication();
        int mul1 = Product.multiplicaton();
        System.out.println(mul);

    }

    int multiplicaton() {
        for (int i = 1; i <= n; i++) {
            mul = c * i;
            System.out.println(c + " * " + i + " = " + mul);
        }

        return mul;
    }

}
