package OOPS;

import java.util.Arrays;

public class SDcopy {
        public static void main(String[] args) {
            Student s1 = new Student("Madhukar rayalla", 6642, "second year", 89000); 
            s1.setRollnum(6642);
            s1.calcCgpa(7.6f, 7.4f);
            s1.setGrade("Second year");
            s1.setFee(95000);
            s1.setName("Madhukar Rayalla");
            // s1.setFee(89000);
            s1.marks[0] = 100;
            s1.marks[1] = 90;
            s1.marks[2] = 80;

            Student s2 = new Student(s1);
            s2.marks[1] = 93;
            s2.printDetails();
            s1.printDetails();
        }
}
class Student{
    String name;
    int rollnum;
    String grade;
    int fee;
    float cpgapercentage;
    int marks[] = new int[3];

    Student(String name, int rollnum, String grade, int fee){
        this.name = name;
        this.grade=grade;
        this.rollnum=rollnum;
        this.fee=fee;
    }
    // shallow copy
     //Student(Student s1){
    //     this.marks = s1.marks;
    //     this.name = s1.name;
    //     this.grade = s1.grade;
    //     this.fee = s1.fee;
    //     this.cpgapercentage = s1.cpgapercentage;
    //     this.rollnum = s1.rollnum;
    // }
    // deep copy
    Student(Student s1){
        this.name = s1.name;
        this.grade = s1.grade;
        this.fee = s1.fee;
        this.cpgapercentage = s1.cpgapercentage;
        this.rollnum = s1.rollnum;
        // this.marks = Arrays.copyOf(s1.marks, s1.marks.length);
        for(int i=0; i<marks.length; i++){
            this.marks[i] = s1.marks[i];
        }
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
        System.out.println("marks : " + Arrays.toString(marks));
    }
}
