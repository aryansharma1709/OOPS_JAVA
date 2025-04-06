package SuperKeyword;
class Animal {
    String type = "Animal";
    void sound() {
        System.out.println("Some sound...");
    }
}

class Dog extends Animal {
    String type = "Dog";

    void printType() {
        System.out.println(super.type); // access parent variable
    }

    void sound() {
        super.sound(); // call parent method
        System.out.println("Barks...");
    }

    Dog() {
        super(); // calls Animal's constructor
    }

    
}

public class test {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.printType();
    }
    
}
