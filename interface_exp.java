interface payment{

    void pay();
}

class upi implements payment{

    @Override
    public void pay(){
        System.out.println("payment through upi");
    }
}

class creditcard implements payment{

    @Override
    public void pay(){
        System.out.println("payment through credit card");
    }
}


public class interface_exp {
    
    public static void main(String[] args){

        upi obj1 = new upi();
        obj1.pay();

        creditcard obj2 = new creditcard();
        obj2.pay();
        
    }
}
