package OOPS;

public class tyInheritance {
    public static void main(String[] args) {
        // dog dobby = new dog();
        // dobby.eat();
        // dobby.legs = 4;
        // dobby.legs();
        // dobby.breed();
            }
        }
        class Animal{
            String color;
        
            void eat(){
                System.out.println("Eats");
            }
        
            void breathe(){
                System.out.println("Breathes");
            }
        }
        class Mammals extends Animal {
            int legs;
        
            void legs(){
                System.out.println("legs " +legs);
            }
        }
        // //multi inheritance
        // class dog extends Mammals{
        //     String breed;
        
        //     public void breed() {
        //         System.out.println("Indian");
        //     }
        //}
        //hierarchical inheritance
        // class fish extends Animal{
        //     int fins;

        //     void swim(){
        //         System.out.println("swims");
        //     }
        // }

        //hybrid inheritance
        

