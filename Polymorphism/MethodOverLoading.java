package Polymorphism;
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class MethodOverLoading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Addition of two integers: " + calc.add(5, 10));
        System.out.println("Addition of two doubles: " + calc.add(5.5, 10.5));
        System.out.println("Addition of three integers: " + calc.add(1, 2, 3));
    }
}
