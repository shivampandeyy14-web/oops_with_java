public class Static_Demo {
     public static void main(String[] args){

        example obj = new example();

            System.out.println(example.a);
            example.Inner.display();
            System.out.println(obj.b);
        }

}

class example{

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

