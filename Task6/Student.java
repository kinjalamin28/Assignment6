package com.Task6;

public class Student {
    String name;

    public Student() {
        name="Unknown";
    }

    public Student(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2= new Student("Kinjal");

        System.out.println(s1.name);
        System.out.println(s2.name);



    }
}
