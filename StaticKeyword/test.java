package StaticKeyword;
class Example{
     static int count =0;
     Example(){
        count++;
     }
     static void showCount(){
         System.out.println("Count: "+count);
     }
     static{
        System.out.println("Static block executed beofre main()");
     }
}
public class test {
    public static void main(String[] args) {
        Example obj=new Example();
        Example.showCount();
    }
    
}
