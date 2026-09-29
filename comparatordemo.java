
import java.util.*;
class Student{
        int rollno;
        String name;
        int marks;
        Student(int rollno, String name, int marks){
            this.rollno = rollno;
            this.name = name;
            this.marks = marks;
        }
    }
public class comparatordemo {
    public static void main(String []args){
        ArrayList<Student> std = new ArrayList<>();
        std.add(new Student(10,"rahul",100));
        std.add(new Student(11,"raj",60));
        std.add(new Student(14,"riya",90));
        std.add(new Student(9,"shivam",100));
        std.add(new Student(60,"ankit",80));

        std.sort(new customcomparator());

        for(Student str  : std){
            int rollno = str.rollno;
            String name = str.name;
            int marks = str.marks;
            System.out.println("marks : "+marks +" Rollno : "+rollno + " name : "+name);
        }

    }
}

class customcomparator implements Comparator<Student>{

    public int compare(Student s1, Student s2){
        if(s1.marks!=s2.marks){
            return s2.marks-s1.marks;
        }
        else{
            return s1.rollno-s2.rollno;
        }
    }
}
