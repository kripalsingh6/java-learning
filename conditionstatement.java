import java.util.Scanner;

public class conditionstatement {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
     //   int b= sc.nextInt();
       // char operator = sc.next().charAt(0);
       // int b=sc.nextInt();
        /*if(a>b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }

        if(a%2==0){
            System.out.println("it is a even number ");
        }else{
            System.out.println("it is a odd number ");
        }

        if(marks >=33 && marks<=100){
            System.out.println("student is passed ");
        }
        else{
            System.out.println("student are failed");

        }

        // income taxes question 
        if(income<=500000){
            System.out.println("the income taxs of employee is give to government = "+ 0);
        }else if(income>=500000 && income<=1200000){
            System.out.println("the income taxes of employee is gived to government is  20% " + income*0.2);
        }else{
            System.out.println("the income taxes of employee is gived to government is 30% " + income*0.3);
        }

        int a= 5,b=10,c=1;
        if(a>=b && a>=c){
            System.out.println("a is a greater than b and c "+ a);
        } else if(b>=a && b>=c){
            System.out.println("b is a greater than a and c"+ b);

        }else{
            System.out.println(c);
        }
        String reportcard = marks>=33 ? "passed":"fail";
        System.out.println(reportcard);

        switch (number){
                case 1: System.out.println("samosa");
                break;
                case 2:System.out.println("jalebi");
                break;
                case 3:System.out.println("ice cream");
                break;
                default:System.out.println("live in dream ");

                switch (operator) {
                    case '+':System.out.println(a+b);
                        break;
                        case '-':System.out.println(a-b);
                        break;
                        case '*':System.out.println(a*b);
                        break;
                        case '/':System.out.println(a/b);
                        break;
                
                    default:System.out.println(0);
                        break;
                }
                if(a>=0)
              {
                System.out.println("positive");
              }else{
                System.out.println("negative");
              }

              if(temperture>=100f){
                System.out.println("yes i have a fewer ");
              }else{
                System.out.println("i don't have a fewer ");
              }
              switch(number){
                case 1:System.out.println("monday");
                break;
                case 2:System.out.println("tuesday");
                break;
                case 3:System.out.println("wednesday");
                break;
                case 4:System.out.println("thursday");
                break;
                case 5:System.out.println("friday");
                break;
                case 6:System.out.println("saturday");
                break;
                case 7:System.out.println("sunday");
                break;
                default:System.out.println("next week start ");
              }
    
        int a=2;
        int b=4;
        int temp=a;
        a=b;
         b =temp;
        System.out.println(a);
        System.out.println(b); */

        //Quadrant question 
        

        if(x>=0 && y>=0){
            System.out.println("x and y are in first quadrant ");
        }else if(x<=0 && y>=0){
            System.out.println("our coordinate are in second quadrant ");
        }else if(x<=0 && y<=0){
            System.out.println("our coordinate in third quadrant ");
        }else{
            System.out.println("our coordinate in fourth quadrant ");
        }

    }


    }

