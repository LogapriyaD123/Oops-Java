package Oops;
class Student {
    String name;
    Student() {
        name = "Logapriya";
    }
}
public class DefaultConstructor {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name);
    }
}