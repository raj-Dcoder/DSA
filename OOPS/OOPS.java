package OOPS;
class BankAccount{
    String username;
    private long accountNumber;
    String accountType;
    private int accountPin;
    private int cvv;
    int[] desposites = new int[3];

    // constructor
    BankAccount(){
        System.out.println("BankAccount constructor called .... :>");
    }
    // shallow copy constructor
    // BankAccount(BankAccount bk){
    //     this.accountNumber = bk.accountNumber;
    //     this.username = bk.username;
    //     this.accountType =  bk.accountType;
    //     this.cvv = bk.cvv;
    //     this.desposites = bk.desposites;
    // }
    // deep copy constructor
    BankAccount(BankAccount bk){
        this.desposites  = new int[3];
        this.accountNumber = bk.accountNumber;
        this.username = bk.username;
        this.accountType =  bk.accountType;
        this.cvv = bk.cvv;
        for(int i = 0; i<desposites.length; i++){   // only thing is you just have to initialise 
            this.desposites[i] = bk.desposites[i];  // reference properties separately 
        }                                           // to avoid unwanted change due to other objects
    }
    // lazy constructors(combination of shallow and deep constructor)
    
    // setters
    void setPin(int pin){
        this.accountPin = pin;
    }
    void setUsername(String usrnm) {
        this.username = usrnm;
    }
    void setAccountNumber(int n){
        this.accountNumber = n;
    }   
    // getters
    int getCVV(){
        return this.cvv;
    }
    int getPin(){
        return this.accountPin;
    }
    String getUsername(){
        return this.username;
    }
}
// class Pen{
//     String color;
//     int tip;

//     void setColor(String color){
//         this.color = color;
//     }
//     void setTip(int tip){
//         this.tip = tip;
//     }
// }

// class Animal{
//     String habitat;
//     int numberOfFeet;
//     String vegOrNonveg;

//     void changeHabitat(String h){
//         this.habitat = h;
//     }
// }
abstract class Pets{
    String petName;
    Pets(){
        petName = "petty";
    }
    void walk(){
        System.out.println("Pet walking");
    }
    abstract void eat();
}
class cat extends Pets{

    void walk(){
        System.out.println("Cat is walking!!");
    }
    void eat(){
        System.out.println("Cat is eating!!!");
    }
}

public class OOPS {
    public static void main(String[] args) {

    }
}

interface Relationships{
    void wedding();
    void confession();
    void celebrateAniversary();
    void propose(Flower flower);
}
class Flower {
    String name = "Rose";

}
class Couple implements Relationships{

    public void propose(Flower flower){
        System.out.println("Will you marry me");
    }
    public void wedding() {
    }
    public void confession() {
        System.out.println("I have a feelings for you");
    }
    public void celebrateAniversary() {
    }
}