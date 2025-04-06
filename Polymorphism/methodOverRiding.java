package Polymorphism;
class Parent {
    void show() {
        System.out.println("Parent show");
    }
}

class Child extends Parent {
    @Override
    void show() {
        System.out.println("Child show");
    }
}

public class methodOverRiding {
    public static void main(String[] args) {
        Parent p = new Child(); // Upcasting
        p.show(); // Child show
    }
    
}
