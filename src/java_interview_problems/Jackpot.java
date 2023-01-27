package java_interview_problems;


import java.util.Scanner;

    public class Jackpot {

        public static void main(String[] args) {

            int randomNumber = (int)(Math.random()*100) / 10; // 0-9
            System.out.println("Please enter your Guess");

            Scanner scanner = new Scanner(System.in);
            int userInput = scanner.nextInt();
            // float userInput = scanner.nextFloat();



            System.out.println(userInput);
            if(randomNumber == userInput){
                System.out.println("Jackpot");
            }else
            {
                System.out.println("Better Luck Next Time!!");
            }



        }
    }

