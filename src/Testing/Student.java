package Testing;

public class Student {

    int age;
    int rollNo;


    public void display1(){

        System.out.println("Welcome to class");
    }

    public void display2(){

        System.out.println("Welcome to class 2");
    }

    public static void main(String[] args) {
        Student Deepak = new Student();
        Deepak.age = 35;
        Deepak.rollNo = 101;
        System.out.println("Age of student is: " + Deepak.age);
        System.out.println("Roll number of student is: " + Deepak.rollNo);
        Deepak.display1();
        Deepak.display2();

        Student Deep = new Student();
        Deep.age = 30;
        Deep.rollNo = 50;
        System.out.println("Age of student is: " + Deep.age);
        System.out.println("Roll number of student is: " + Deep.rollNo);
        Deep.display1();
        Deep.display2();




    }

}