public class abstraction {
    public static void main(String[] args){
        /*horse h =new horse();
        h.food();
        h.walk();

        chicken c=new chicken();
        c.food();
        c.walk(); */
        /*Queen q = new Queen();
        q.moves();
        King k =new King();
        System.out.println("king moves");
        k.moves();*/

        Student s1= new Student();
        s1.schoolname="jmv";
        Student s2= new Student();
        System.out.println(s2.schoolname);



    }
}
 /*abstract class Animal{
    void food(){
        System.out.println("animals food");
    }

    abstract void walk();
}
class horse extends Animal{
    void walk(){
        System.out.println("walk on 4 legs");
    }
}
class chicken extends Animal{
    void walk(){
        System.out.println("walk on 2 legs");
    }
}

// interface 

 interface Chessplayer{
    void moves();
}
class Queen implements Chessplayer{
    public void moves(){
        System.out.println("up,down,left,right, diagonaly move all sides");
    }
}
class King implements Chessplayer{
    public void moves(){
        System.out.println("up,down,left,right,one move");
    }
}*/

// static keyword

class Student{

    String name;
    int roll;

    static String schoolname;

    void setname(String name){
        this.name=name;

    }
    String getname(){
        return this.name;
    }
}



