
class vehicle{
    private Integer wheels;
    private int speed=0;
    private String name;

    public vehicle(int wheels, int speed, String name){
        this.name = name;

        if(wheels<=1){
            System.out.println("invalid number of wheels");
        }
        else{
            this.wheels = wheels;
        }

        if(speed<0 || speed>=250){
            System.out.println("invalid speed");
        }

        else{
            this.speed = speed;
        }

    }

    void move(){
        System.out.println(name+" has "+ wheels + " wheels and moving with a speed = "+ speed);
    }
}

class bike extends vehicle{
    public bike(int wheels,int speed,String name){
        super(wheels,speed,name);
    }

    
}

class ebike extends bike{
    public ebike(int wheels, int speed, String name){
        super(wheels,speed,name);
    }

    void has_battery(){
        System.out.println("it has a electric battery");
    }
}

class car extends vehicle{
    public car(int wheels, int speed, String name){
        super(wheels,speed,name);
    }
}

class ecar extends car{

     public ecar(int wheels, int speed, String name){
        super(wheels,speed,name);
    }

    void has_battery(){
        System.out.println("it has a electric battery");
    }
}

class petrolcar extends car{

    public petrolcar(int wheels, int speed, String name){
        super(wheels, speed,name);
    }
    void has_engine(){
        System.out.println("it has a petrol engine");
    }
}

class dieselcar extends car{

    public dieselcar(int wheels, int speed, String name){
        super(wheels, speed,name);
    }

    void has_engine(){
        System.out.println("it has a diesel engine");
    }

}



public class vehicle_inheritance {
    public static void main(String [] args){

        bike b = new bike(2,80,"pulsur");
        b.move();


        car c = new car(4,150,"fortuner");
        c.move();

        ebike eb = new ebike(2,50,"ather");
        eb.move();

        petrolcar pc = new petrolcar(4,150,"bolero");
        pc.move();

        dieselcar dc = new dieselcar(4,120,"mahindra");
        dc.move();
    }
}
