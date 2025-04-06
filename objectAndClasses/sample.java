package objectAndClasses;

class Student{
     int age;
     String name;
    //  if no constructor is  jvm automatically called default constructor;
     void Display(){
        System.out.println("Name : "+name +" Age: "+ age);
     }
}
class DefaultInstance{
    
     int x;
     static int y;
}

public class sample {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Aryan";
        s1.age=21;
        s1.Display();


        DefaultInstance obj=new DefaultInstance();
        System.out.println(DefaultInstance.y);
        System.out.println(obj.x);
    }
}
