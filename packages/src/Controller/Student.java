package src.Controller;


public class Student {
    public String name;
    public int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void talk () {
        System.out.printf("Student %s of age %d is talking.\n", this.name, this.age);
    }
}