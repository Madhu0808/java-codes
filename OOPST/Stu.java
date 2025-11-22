package OOPS;

import Strings.bitmanuplation.setBits;

public class Stu {
    public static void main(String[] args) {
        Student s1 = new Student("Madhukar rayalla", 6642, "second year", 89000); 
        s1.setRollnum(6642);
        s1.calcCgpa(7.6f, 7.4f);
        s1.setGrade("Second year");
        s1.setFee(95000);
        s1.setName("Madhukar Rayalla");
        s1.setFee(89000);

        s1.printDetails();
    }
}
class Student{
    String name;
    int rollnum;
    String grade;
    int fee;
    float cpgapercentage;
// constructor below
    Student(String name, int rollnum, String grade, int fee){
        this.name = name;
        this.grade=grade;
        this.rollnum=rollnum;
        this.fee=fee;
    }
    void calcCgpa(float sem1, float sem2){
        this.cpgapercentage = (((sem1+sem2) / 2.0f) * 10 );
    } 
    void setName(String name){
        this.name = name;
    }
    void setRollnum(int rollnum){
        this.rollnum = rollnum;
    }
    void setGrade(String grade){
         this.grade = grade;
        }
    void setFee(int fee){
        this.fee = fee;
    }
    void printDetails(){
        System.out.println("Student Name :" +name);
        System.out.println("Student Percentage :" +cpgapercentage);
        System.out.println("Student Studying :" +grade);
        System.out.println("Student Fee :" +fee);
    }
}