package oopsVsProcedural;
//  you cannot have more than one public class in a single
// If you have multiple public classes in one file, the compiler wouldn’t know what to name the .class files or which one matches the file name.
 class Rectangle{
    int length;
    int breadth;
     public int calculateArea(){
       return length*breadth;
     }
  
  }
//    public -sab me access hoga (same class, package, subclass[diff. package],other package)
//    protected - only not in other package other than that har jagah hoga
//    default (private-package)- bss same class and package me acces hoga
//    private - only same class me access hoga 

public class oopsWay {
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.length=10;
        r.breadth=5;
        System.out.println("Area : "+r.calculateArea());
    }
    
}

