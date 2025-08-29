public class practice_oop {
    public static void main(String[] args){
        Student s= new Student();
        
        s.setname("kripal");
        System.out.println(s.getname());
    }
}

class Student{
    String name;
    int marks;

    void setname(String name){
        this.name=name;
    }
    String getname(){
        return this.name;

    }
}
