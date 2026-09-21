interface camera{

    void click();
}

interface gps{

    void location();
}

class photo implements camera, gps{

    @Override 
    public void click(){
        System.out.println("photo clicked");
    }

    @Override 
    public void location(){
        System.out.println("location accessed");
    }
}



public class multiple_interface {
    public static void main(String [] args){

        photo obj  = new photo();
        obj.click();
        obj.location();
    }
}
