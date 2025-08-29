public class copy_construtor {
    public static void main(String[] args){ 
        Student s1= new Student();
        s1.name="kripal";
        s1.roll=032;
        s1.password="nmdk";

        s1.marks[0]= 100;
        s1.marks[1]=90;
        s1.marks[2]=80;
        System.out.println(s1.name);


        Student s2 = new Student(s1);
        s2.password= "xyz";
        System.out.println(s2.name);

        for(int i=0; i<3; i++){
            System.out.println(s2.marks[i]);
        }
    }
}
class Student{
    int marks[];
    String name;
    int roll;
    String password;

    //copy constructor
    Student(Student s1){
        marks= new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        this.marks =s1.marks;
    }
    Student(){
        marks =new int[3];
        System.out.println("construtor is called 0...");

    }

}
