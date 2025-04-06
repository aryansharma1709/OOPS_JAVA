package Interfaces;
interface Engine {
    void start();
    default void service() {
        System.out.println("Default engine service");
    }
}

interface Fuel {
    void refuel();
}

class Car implements Engine, Fuel {
    public void start() {
        System.out.println("Car Started");
    }

    public void refuel() {
        System.out.println("Car Refueled");
    }
}


public class test {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.refuel();
        c.service();
    }
    
}
