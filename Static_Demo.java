public class Static_Demo {
    static int a = 10;
    int b = 20;
    static class Inner{
        static void display(){
            System.out.println("Inside static inner class");
        }
    }

    void nonStaticDisplay(){
        System.out.println("inside nonstatic method");
    }
}

class Main{
        public static void main(String[] args){
            System.out.println(Static_Demo.a);
            Static_Demo.Inner.display();
            Static_Demo obj = new Static_Demo();
            System.out.println(obj.b);
        }
}

