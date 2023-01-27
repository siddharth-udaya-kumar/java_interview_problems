package java_interview_problems;

public class CubeRoot {
    public static void main(String[] args) {
        double x = 83.0;
        double y = 62.0;
        double z = 2.0;

        double sum1 = Math.pow(x,2) + Math.pow(y,2);
        double sum2 = Math.abs(z);
        double sum3 = sum1-sum2;

        double finalSum = Math.cbrt(sum3);
        System.out.println(finalSum);
    }
}
