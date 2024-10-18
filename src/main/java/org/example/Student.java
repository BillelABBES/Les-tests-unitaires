package org.example;

public class Student {
    static int cpt = 0;

    public Student (){
        cpt ++;
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();

        System.out.println(student3.cpt);
    }
}
