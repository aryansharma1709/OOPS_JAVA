package Constructor;
class Car{
     String brand;
     int model;
    //  Default Constrcutor

     Car(){
        System.out.println("Default constrcutor called");
     }

    //  Parameterized Constructor
    Car(String b,int m)
    {
        brand=b;
        model=m;
    }
    // copy constructor cosntructor
    Car(Car c){
            this.brand=c.brand;
            this.model=c.model;
    }
    void Display(){
        System.out.println(brand+" "+ model);
    }
}
public class TestConstructor {
    public static void main(String[] args) {
        Car c=new Car();
        Car c1=new Car("honda",2023);
        Car c2=new Car(c1);
        c2.Display();
    }
   
}
