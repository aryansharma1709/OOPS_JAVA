package Polymorphism;
class Animal {
    void speak() {
        System.out.println("Animal speaks");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}


public class TyepCasting {
    public static void main(String[] args) {
        Animal a = new Dog();  // Upcasting
        a.speak();

        Dog d = (Dog) a;  // Downcasting
        d.bark();

        Animal a2 = new Animal();
        // Dog d2 = (Dog) a2; // Runtime ClassCastException
        if (a2 instanceof Dog) {
            Dog d2 = (Dog) a2;
        }
    }
}
