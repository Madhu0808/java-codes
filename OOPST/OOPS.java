package OOPS;
public class OOPS {
    public static void main(String[] args) {
        // Car c1 = new Car();
        // c1.brand = "Tesla";
        // c1.color = "Black";
        // c1.price = 3000000;
        
        // Car c2 = new Car();
        // c2.brand = "BMW";
        // c2.color = "Black";
        // c2.price = 5000000;

        // c1.showDetails();
        // c2.showDetails();
        BankAccount B1 = new BankAccount();
        B1.setUsername("Madhukar Rayalla");
        B1.setPassword("Madhu@4266");

        //we can use setters and getters to access private 
       
        System.out.println(B1.getuserName());
        System.out.println(B1.getPassword());

            }
        }
        // access modifier below
        // getters and setters
        class BankAccount {
    private  String userName;
    private String password;
    String getPassword(){
        return this.password;
    }
    String getuserName(){
        return this.userName;
    }

    void setPassword(String password){
        this.password = password;
    }
    void setUsername(String userName){
        this.userName = userName;
    }
}

class pen {
    String color;
    int tip;

    String getColor(){
        return this.color;
    }
    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}

class Car {
    String color;
    int  price;
    String brand;
     void showDetails(){
        System.out.println(brand +" "+ color + " costs " + price);
     }
}

