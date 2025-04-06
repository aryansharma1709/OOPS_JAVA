package Polymorphism;

class Animal {
    void makeSound() {
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog Barks");
    }
}

public class Test {
    public static void main(String[] args) {
        Animal a = new Dog(); // Upcasting
        a.makeSound(); // Dog Barks (runtime polymorphism)
    }
}
