class InsufficientBalanceException extends Exception{

    InsufficientBalanceException(String message){

        super(message);

    }
}

class bank{

    void withdraw(int balance , int amount) throws InsufficientBalanceException{
            if(balance<amount){
                throw new InsufficientBalanceException("insufficient balance");
            }
              System.out.println("withdrawal successfull");
    }
}


public class bank_exception_handling {
    
    public static void main(String[] args){

        bank b = new bank();
        
        try{
            b.withdraw(500,600);
        }
        catch(InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }

    }
}
