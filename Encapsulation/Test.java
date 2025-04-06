package Encapsulation;
class Student {
    // private variables - data hiding
    private String name;
    private int age;

    // public getters & setters - controlled access
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty())
            this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0)
            this.age = age;
    }
}


public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Aman");
        s.setAge(22);
        System.out.println(s.getName() + " is " + s.getAge() + " years old.");
    }
    
}
