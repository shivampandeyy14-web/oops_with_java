import java.util.*;
public class agevalidation {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int age = scn.nextInt();
        try{
            agecheck(age);
        }
        catch(InvalidAgeException e){
            System.out.println(e);
        }
        
    }
    static void agecheck(int age) throws InvalidAgeException
    {
        if(age<18) throw new InvalidAgeException( "age is invalid");
        System.out.println("eligible to vote");
    }

}

class InvalidAgeException extends Exception //checked exception
{
    InvalidAgeException(String msg){
        super(msg);
    }
}
