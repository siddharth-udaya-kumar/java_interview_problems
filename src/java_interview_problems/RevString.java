package java_interview_problems;

public class RevString {
    public static void main(String[] args) {
        String str = "asdf";
        StringBuilder str1 = new StringBuilder(str);
        str1.reverse();
        System.out.println(str);
        System.out.println(str1);

        char ch;
        String revStr = "";
        System.out.println("Orginal string" + "" + str);
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            revStr = ch + revStr;
        }
        System.out.println(revStr);
    }
}
