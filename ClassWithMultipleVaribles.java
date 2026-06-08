package Oops;
class Student {
    String name;
    int age;
}
public class ClassWithMultipleVaribles  {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Logapriya";
        s.age = 20;
        System.out.println("Name: " + s.name);
        System.out.println("Age: " + s.age);
    }
}