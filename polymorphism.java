public class polymorphism {
    public static void main(String[] args){
        Calculator calc= new Calculator();
        System.out.println(calc.sum(5,9 ));
        System.out.println(calc.sum((float)5.5, (float)4.2));
        System.out.println(calc.sum(5, 10, 15));
        deer d =new deer();
        d.eat();
    }
}
// method overloading 
class Calculator{
     int  sum(int a, int b){
        return a+b;

    }
    float sum(float a, float b){
            return a+b;
        }
        int sum(int a, int b, int c){
            return a+b+c;
        }
}
// method overriding 
class Animal{
    void eat(){
        System.out.println("eats anything");
    }
}
class deer extends Animal{
    void eat(){
        System.out.println("eat a grass");
    }
}
