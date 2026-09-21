

class static_demo{
    static int a = 20;
     int b = 30;

        static  void display(){
            System.out.println("inside static inner class");
        }
    

    void nonstaticDisplay(){
        System.out.println("inside non static class");
    }
}

public class static_exp {

    public static void main(String[] args){

        System.out.println(static_demo.a);

        static_demo obj = new static_demo();
         System.out.println(obj.b);

         static_demo.display();

         obj.nonstaticDisplay();
            
    }
}
