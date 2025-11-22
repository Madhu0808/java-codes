package OOPS;

public class Staticc {
    public static void main(String[] args) {
    Student s1 = new Student();
    s1.setName("Madhukar");
    System.out.println(s1.getName());
    s1.schoolName = "ACE";

    Student s2 = new Student();
    System.out.println(s2.schoolName);
    
    Student s3 = new Student();
    s3.schoolName = "ACE2";

    System.out.println(s1.schoolName);
    System.out.println(s2.schoolName);
    System.out.println(s3.schoolName);
    System.out.println(s1.returnPercentage(40, 97, 57));
    }
}
protected class Student {
    String name;
    int roll;
    static String schoolName;

    static int returnPercentage(int math, int phy, int chem){
        return (math+phy+chem) / 3;
    }

    Student(){
        
    }

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }
}
