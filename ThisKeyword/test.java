package ThisKeyword;
class ThisExample {
    int x;

    ThisExample(int x) {
        this.x = x; 
    }

    void show() {
        System.out.println("x = " + x);
    }
}

class ChainingExample {
    ChainingExample() {
        this(100);
        System.out.println("Default constructor");
    }

    ChainingExample(int a) {
        System.out.println("Parameterized constructor: " + a);
    }
}

public class test {
    public static void main(String[] args) {
        ThisExample t = new ThisExample(10);
        t.show();
        new ChainingExample();
    }
    
}
