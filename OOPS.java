public class OOPS {
    public static void main(String[] args){
        pen p1 = new pen();
        p1.setColor("orange");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.gettip());
        p1.setColor("yellow");
        System.out.println(p1.getColor());

        Student s1 = new Student("kripal");
         
        System.out.println(s1.name);
    }
    
}
class pen{
    private int tip;
    private String color;
    



    String getColor(){
        return this.color;
    }
    int gettip(){
        return this.tip;
    }

    void setColor(String newcolor){
       this.color = newcolor;
    }
    void setTip(int Tip){
        this.tip= Tip;

    }
    
}
class Student{
    String  name;
    int roll;

    Student(String name){
        this.name = name;
    }

}