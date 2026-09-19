import java.util.*;
class A{
    int rollno;
    String name;
    double percent;

     A(){
        System.out.println("default constructor automatically called");
     }

      A(int a){
        this.rollno = a;
        System.out.println("constructor with one parameter rollno ");
     }

      A(int a, double c){
        this.rollno = a;
         this.percent = c;
        System.out.println(" constructor with two parameter rollno and percent");
     }

      A(int a, String name, double c){
        this.rollno = a;
        this.percent = c;
        this.name = name;
        System.out.println("constructor with three parameter rollno, name and percent");
     }
}

public class constructor_overloading {
    public static void main(String[] args){

       A obj1 = new A();

        A obj2  = new A(10);

        A obj3 = new A(10,20.7);

        A obj4 = new A(10, "raju" ,30.3);
        
    }
}
