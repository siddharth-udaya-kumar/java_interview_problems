package java_interview_problems;

public class ArrayClass {
    static int[] marks = {23 , 67 , 98};
    public static void main(String[] args) {
        int max = marks[0];
        for(int i =0;i< marks.length;i++)
        {
            System.out.println(marks[i]);
            if(marks[i]>max){
                max =marks[i];
            }
        }
        System.out.println(max);
    }
}



