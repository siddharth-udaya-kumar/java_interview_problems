package java_interview_problems;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        char Operator;
        Double number1, number2, result;
        //create of object Scanner class
        Scanner sc = new Scanner(System.in);
        //ask user to input operator
        System.out.println("Select an operator: +, - , * or / ");
        Operator = sc.next().charAt(0);
        System.out.println("Enter the first no");
        number1 = sc.nextDouble();
        System.out.println("Enter the Second number");
        number2 = sc.nextDouble();
        switch (Operator) {
            case '+':
                result = number1 + number2;
                System.out.println(number1 + "+" + number2 + " = " + result);
                break;
            case '-':
                result = number1 - number2;
                System.out.println(number1 + "+" + number2 + " = " + result);
                break;
            case '*':
                result = number1 * number2;
                System.out.println(number1 + "+" + number2 + " = " + result);
                break;
            case '/':
                result = number1 / number2;
                System.out.println(number1 + "+" + number2 + " = " + result);
                break;
        }

    }
}
