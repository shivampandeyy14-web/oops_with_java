public class abstraction{
    public static void main(String[]args){
     payment obj = new upi();
     payment.display();
     obj.paymentmethod();

     payment obj1 = new credit();
     payment.display();
     obj1.paymentmethod();
    }
}

interface payment{
    void paymentmethod();

        static void display(){
            System.out.println("payment successfull");
        }
}

class upi implements payment{
    @Override
    public void paymentmethod(){
        System.out.println("payment using upi");
    }
}

class credit implements payment{
    @Override
    public void paymentmethod(){
        System.out.println("payment using credit card");
    }
}