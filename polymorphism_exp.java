class shape{
    void area(){
        System.out.println("print area of this shape ");
    }
}

class circle extends shape{

    void area(int r){
        System.out.println("area of circle is "+ (Math.PI*r*r));
    }
}

class rect extends shape{
    void area(int l, int b){
        System.out.println("area of rectangle is " + (l*b));
    }
}


public class polymorphism_exp {
    public static void main(String [] args){
        
        shape obj1 = new shape();
        circle obj2 = new circle();

        rect obj3 = new rect();

        obj1.area();
        obj2.area(7);

        obj3.area(5,3);
    }
}
