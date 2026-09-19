class encapsulation{
    private int age;


    void setage(int age){
        if(age<0 || age>150){
            System.out.println("invalid age");
        }
        else{
            this.age = age;
        }
    }

    void getage(){
        System.out.println("your age is : " + age);
    }
}

public class age_validation {
    public static void main(String[] args){
       
        encapsulation obj = new encapsulation();

        obj.setage(-2);

        obj.getage();


    }
}
