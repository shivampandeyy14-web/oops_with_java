abstract class animal{
    abstract void sound();

    void eat(){
        System.out.println("animal can eat");
    }
}

class dog extends animal{

    @Override
    void sound(){
        System.out.println("dog barks");
    }
}

class cat extends animal{

    @Override
    void sound(){
        System.out.println("cat meows");
    }

}



public class abstraction_exp {
    public static void main(String[] args){

        // animal a = new animal();
        // a.sound();
        
        dog d = new dog();
        d.sound();
        d.eat();

        cat c = new cat();
        c.sound();
        c.eat();
    }
}
