package java_interview_problems;

public class CopyConstructor {
    String name;
    String id;
    int age;

    public CopyConstructor(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    @Override
    public String toString() {
        return "CopyConstructor{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {


    }
}
