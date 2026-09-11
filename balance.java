
import java.util.*;
public class balance {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        double balance = 5000.0;
        double withdrawamt = 7500.0;
        try{
             withdraw(balance,withdrawamt);
        }
        catch(InvalidAmtException amt){
            System.out.println(amt);
        }
        finally{
            System.out.println("Transcation attempt completed");
        }
    }

    static void withdraw(double balance,double amount) throws InvalidAmtException{
        if(amount>balance) throw new InvalidAmtException( "amount is invalid");
        System.out.println("ammount withdrawed");
    }
}

class InvalidAmtException extends Exception //checked exception
{
    InvalidAmtException(String msg){
        super(msg);
    }
}
