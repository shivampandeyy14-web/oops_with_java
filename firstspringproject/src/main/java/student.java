public class student {
    private long id;
    private String name;
    private String email;

    public student(Long id,String name,String email){
        this.id=id;
        this.name = name;
        this.email = email;
    }

    public void set_id(Long id){
        this.id = id;
    }

    public Long get_id(){
        return this.id;
    }

    public void set_name(String name){
        this.name = name;
    }

    public String get_name(){
        return this.name;
    }


public void set_email(String email){
        this.email = email;
    }

    public String get_email(){
        return this.email;
    }

}


