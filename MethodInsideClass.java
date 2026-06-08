package Oops;
class Student {
    String name;
    void display() {
        System.out.println(name);
    }
}
public class MethodInsideClass {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Logapriya";
        s.display();
    }
}