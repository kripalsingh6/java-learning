public class inheritance {
    public static void main(String[] args){
        //Fish shark=new Fish();
        //shark.eat();
        dogs looli = new dogs();
        looli.eat();
        looli.bread="german";
        System.out.println(looli.bread);
        Mammel name =new Mammel();
        name.eat();
        name.walk();

    }
} //base class
class Animal{
    String color;

    void eat(){
        System.out.println("eats");

    }
    void breathe(){
        System.out.println("breathes");
    }
}
//Derived class
/*class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("swims in water");
    }
}*/
//multiple inheritance

/*class Mammel extends Animal{
    int legs;
}
class dogs extends Mammel{
    String bread;
}*/

//hirecrchy inheritance

class Mammel extends Animal{
    int legs;
    void walk(){
        System.out.println("walking");
    }
}
class dogs extends Animal{
    String bread;
}
