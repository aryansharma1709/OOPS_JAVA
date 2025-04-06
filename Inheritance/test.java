package Inheritance;
class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}
class Puppy extends Dog {
    void weep() {
        System.out.println("Weeping...");
    }
}
class Cat extends Animal {
    void meow() {
        System.out.println("Meowing...");
    }
}
interface A {
    void show();
}
interface B {
    void display();
}

class C implements A, B {
    public void show() {
        System.out.println("Show from A");
    }

    public void display() {
        System.out.println("Display from B");
    }
}

public class test {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
        obj.display();
    }
}
