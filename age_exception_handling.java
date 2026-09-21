class InvalidAge extends Exception{
    InvalidAge(String message){
        super(message);
    }
}

class age{

    void age_check(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("Sorry, you are not eligible to vote!");
        }

        System.out.println("congratulations, You are eligible to vote");
    }
}


public class age_exception_handling{
    public static void main(String [] args){

        age a = new age();

        try{
            a.age_check(19);
        }
        catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }

    }
}
