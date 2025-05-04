package OOPS;

public class inheritance {
   public static void main(String[] args) {
        Bird bird = new Bird();
        System.out.print("Work: ");
        bird.eat();
        System.out.println("Species: "+bird.species);
   }
}
// Species:  mammals, birds, reptiles, amphibians, and insects
class Animal{
    int legs;
    int eyes;
    String species = "Generic";

    void eat(){
        System.out.println("Eating");
    }
    
}

class Fish extends Animal{
    String species = "reptiles";
    void swim(){
        System.out.println("Swimming");
    }
}

class Bird extends Animal{
    // String species = "Bird";
    void fly(){
        System.out.println("Flying");
    }
}

class Mammals extends Animal{
    String species = "Mammals";
    void walk(){
        System.out.println("Walking");
    }
}