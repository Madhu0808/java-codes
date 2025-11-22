package OOPS;

public class hybrid {
    public static void main(String[] args) {
        human m1 = new human();
        m1.Color("White");
        m1.Breathe();
    }
}
class Animal{
    String color;
    String breathe;

    void Color(String color){
        this.color = color;
        System.out.println("color : " + color);
    }
    void Breathe(){
        System.out.println("Breathes");
    }
}
class Fish extends Animal{
    String fins;

    void fins(){
        System.out.println("fins :" +fins);
    }
}
class tuna extends Fish{
    String Healthbenfits;

    void displayHealthbenfits(){
        System.out.println("eating tuna helps in supporting heart and brain health");
    }
}
class shark extends Fish{
    String Healthbenfits;

    void displayHealthbenfits(){
        System.out.println("boost immunity");
    }
}
class bird extends Animal{
    String feather;

    void displayFeather(){
        System.out.println("feather there");
    }
}
class peacock extends bird{
    String Sound;
    void displaySound(String Sound){
        this.Sound = Sound;
        System.out.println(Sound);
    }
}
class mammal extends Animal{
    String milk;
    String fur;

    void produceMilk(String fur){
        this.fur = fur;
        System.out.println(fur);
    }
}
class human extends mammal{
    
    String hair;

    void displayHair(String hair){
        this.hair = hair;
        System.out.println(hair);
    }
}