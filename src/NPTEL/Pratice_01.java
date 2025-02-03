package NPTEL;

import java.util.Scanner;

class Student
{
    private String name;
    private int age;
//
//    Student(String name,int age)
//    {
//        this.name = name;
//        this.age = age;
//    }

    public String getName() {
        return name;
    }

    public String setName(String name)
    {
        this.name = name;
        return name;
    }

    public void  setAge(int age)
    {
        this.age = age;
        System.out.println(age);
    }

    public int getAge() {
        return age;
    }
}
public class Pratice_01 {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the name of the student : ");
//        String name = sc.nextLine();
//        System.out.println("Enter the age of the student : ");
//        int age = sc.nextInt();
        Student s = new Student();
        s.setName("Rishi");
        s.setAge(21);



    }
}

