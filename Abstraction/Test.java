package Abstraction;
abstract class Shape {
    abstract void draw(); // abstract method

    void info() {
        System.out.println("Shape Info - non-abstract method in abstract class");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle...");
    }
}



public class Test {
    public static void main(String[] args) {
        Shape s = new Circle();  // Upcasting
        s.draw();
        s.info();
    } 
}
