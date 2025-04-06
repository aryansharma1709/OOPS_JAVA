package ObjectClasses;
class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person: " + name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            Person p = (Person) obj;
            return this.name.equals(p.name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}


public class test {
    public static void main(String[] args) {
        Person p1 = new Person("Aman");
        Person p2 = new Person("Aman");

        System.out.println(p1.toString());
        System.out.println(p1.equals(p2)); // true
        System.out.println(p1.hashCode() == p2.hashCode()); // true
    }
    
}
