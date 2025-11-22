package OOPS;

public class Abstraction {
    // abstraction classes 
    public static void main(String[] args) {
    Dog m = new Dog();
    m.makeSound();
    System.out.println(m.color);
     }
    }
    abstract class Animal{
       String color;

        Animal(){
            color = "brown";
        }
        void sleep(){
            System.out.println("Sleeping..");
        }
           abstract void makeSound();
    }
    class Dog extends Animal{
        void changeColor(){
            color = "Black";
        }
        void makeSound(){
            System.out.println("woof!");
        }
    }
    class Horse extends Animal{
        void changeColor(){
            color = "red";
        }
        void makeSound(){
            System.out.println("euuiii!");
        }
    }
class Mustang extends Horse{
    void hearSound(){
        System.out.println("ruiii!");
    }
}