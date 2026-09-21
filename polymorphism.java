class overloading{

    void sum(int a, int b){
        System.out.println("sum "+ (a+b));
    }

    void sum(int a, int b, int c){
        System.out.println("sum " + (a+b+c));
    }

    void sum(int a, int b, int c, int d){
        System.out.println("sum " + (a+b+c+d));
    }
}


class overriding{

    void print(){
        System.out.println("initial overriding statement");
    }
}

class override extends overriding{

    @Override 
    void print(){
        System.out.println("i had override the original statement");
    }
}


public class polymorphism {
    
    public static void main(String [] args){

        // overloading obj = new overloading();
        // obj.sum(1,2,3,4);

        overriding obj2 = new overriding();
        obj2.print();

        override obj3 = new override();
        obj3.print();
    }
}
