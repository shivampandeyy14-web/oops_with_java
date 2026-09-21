public class exception {
    
    public static void main(String [] args){


        int arr[] = {2,4,6,8};
        int arr2[]= {1,2,0,4};
    try{
        for(int i=0;i<5;i++){
            System.out.println(divide(arr[i],arr2[i]));
        }
    }
    catch(IndexOutOfBoundsException e){
        System.out.println("invalid index ");
    }
        
        
    }

    public static int divide(int a, int b){
        try{
            return a/b;
        }
        catch(ArithmeticException e){
            System.out.println("cannot divide by zero");
            return -1;
        }
    }
}
