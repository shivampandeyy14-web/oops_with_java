class mythread extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(i);
        }
    }
}

class mytask implements Runnable{

    public void run(){
        System.out.println("thread is running");
    }
}



public class thread {
    public static void main(String [] args){

        mytask obj = new mytask();

        Thread t = new Thread(obj);

        t.start();

    }
}
