package OOPS;

public class Abra {
    public static void main(String args[]){
    // Horse h = new Horse();
    // h.eat();
    // h.walk();
    // System.out.println(h.color);

    // Chicken c = new Chicken();
    // c.eat();
    // c.walk();
    // System.out.println(c.color);


    Mustang myHorse = new Mustang();
    


    }
}
abstract class Animal{
    String color;
    Animal(){
        System.out.println("Animal constructor is called");
        color = "brown";
    }
    void eat(){
        System.out.println("animal eats");
    }

    abstract void walk();
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor is called");
    }
    void changeColor(){
        color = "Dark Brown";
    }
    void walk() {
        System.out.println("walks on 4 legs");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor is called");
    }
}

class Chicken extends Animal{
    void changeColor(){
        color = "yellow";
    }
    void walk(){
        System.out.println("walks on 2 legs");
    }
}