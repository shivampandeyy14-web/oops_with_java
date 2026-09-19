class bank{
    private int balance = 500;

    void updateamount(int amt,String opr){
        if(opr.equals("deposit")){
            balance = balance + amt;
        }
        else if(opr.equals("withdraw")){
            balance = balance-amt;
        }

        System.out.println("your updated balance is : "+ balance);
    }

    void deposit(int amt){
        updateamount(amt,"deposit");
    }

    void withdraw(int amt){
        if(amt>balance){
            System.out.println("invalid amount");
        }
        else{
            updateamount(amt,"withdraw");
        }
    }
}

public class bank_balance {
    public static void main(String [] args){
        bank  obj = new bank();

        obj.deposit(300);
        obj.withdraw(200);
        obj.withdraw(800);


    }
}
