package FinalKeyword;

final class Constants {
    final int MAX;

    // Constructor to initialize MAX
    Constants() {
        this.MAX = 100;
    }
}

class Base {
    final void display() {
        System.out.println("Base display");
    }
}

class Derived extends Base {
}

public class test {
    public static void main(String[] args) {
        Constants c = new Constants();
        System.out.println("MAX value: " + c.MAX);
    }
}
