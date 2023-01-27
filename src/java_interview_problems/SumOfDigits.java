package java_interview_problems;

public class SumOfDigits {
    public static void main(String[] args) {
        int input = 3557;
        int sum=0;
        while(input>0 ){
            sum= sum+input%10;
            input=input/10;
        }
        System.out.println(sum);

    }
}
