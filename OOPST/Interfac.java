package OOPS;

public class Interfac {
    public static void main(String[] args) {
        Bear b = new Bear();
        b.eatMeat();
        b.eatPlants();
    }
}
interface  Herbivore{
void eatPlants();
    
}
interface Carnivore{
void eatMeat();
    
}
class Bear implements Herbivore, Carnivore {
    public void eatPlants(){
            System.out.println("Beat eats plants");
        }
    
    public void eatMeat(){
        System.out.println("Bear eats meat");
    }
}
