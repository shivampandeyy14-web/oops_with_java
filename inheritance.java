class animal{
    private String name;


    void setname(String a){
        name = a;
    }

    String getname(){
        return name;
    }

    void eat(){
        System.out.println(name + " can eat");
    }

    void sleep(){
        System.out.println(name+ " can sleep");
    }
}

class dog extends animal{

   dog(String name){
    setname(name);
   }

    void barks(){
        System.out.println(getname()+  " can bark");
    }
}


public class inheritance {
    public static void main(String [] args){
        
        String name = "bruno";

        dog d  = new dog(name);

        d.barks();
        d.eat();
        d.sleep();
    }
}
