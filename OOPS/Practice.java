package OOPS;

public class Practice {
    public static void main(String[] args) {
        Animal a = new Cow();
        a.eat();
    }
}
class Animal{
    void eat(){
        System.out.println("The animal is eating !!!");
    }
}
class Cow extends Animal{
    void eat(){
        System.out.println("The cow is eating !!!");
    }
    void run(){
        System.out.println("The cow is running !!!");
    }
}