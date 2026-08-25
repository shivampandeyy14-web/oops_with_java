import java.util.*;
public class circle{
    float r;
    circle(float r){
        this.r = r;
    }

    void area(){
        System.out.println(3.14*r*r);
    }
}

class Main{
    public static void main(String[] args){
       // Scanner scn = new Scanner(System.in);
        float r = 5;

        circle obj = new circle(r);
        obj.area();
    }
}

