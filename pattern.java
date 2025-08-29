public class pattern {
     /*public static void hollow_rectangle(int row,int column){
        for(int i=1; i<=row; i++){
            for(int j=1; j<=column; j++){
                if(i==1 || i==row || j==1 || j==column){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        public static void inverted_tringle(int n){
            for(int i=1; i<=n; i++){
                for(int j=1; j<=n-i; j++){
                    System.out.print(" ");
                }
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }   
           public static void hollow_tringle(int n ){
            for(int i=1; i<=n; i++){
                for(int j=1; j<=n; j++){
                    if(i==1 || i==2 || i==3 ||i==4 || j==1 || j==2 || j==3 || j==4){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }*/

            //to create a prymid
            /*public static void prymid(int n){
                int nums = 1;
                for(int i=1; i<=n; i++){
                    for(int j=1; j<=n-i; j++){
                        System.out.print(" ");
                    }
                    for(int j=1; j<=i; j++){
                        System.out.print(nums);
                        nums++;
                    }
                    for(int j=1;j<=i-1;j++){
                       System.out.print(nums);
                       nums++;
                    }
                    System.out.println();
                }
            }*/

            /*public static void inverted_half_prymid(int n){
                int nums=0;
                for(int i=1; i<=n;i++){
                    for(int j=1; j<=n-i+1;j++){
                        System.out.print(j+"  ");
                        
                        
                    }
                    System.out.println();
                }
            } */

            /*public static void floyd_triangle(int n){
                int nums=1;
                for(int i=1; i<=n; i++){
                    for(int j=1; j<=i; j++){
                        System.out.print(nums+" ");
                        nums++;
                    }
                    System.out.println();
                }
            }*/

            // 01 triangle approach
            /*public static void zo_triangle(int n){
                for(int i=1; i<=n; i++){
                    for(int j=1; j<=i; j++){
                        if((i+j)%2==0){
                            System.out.print("1");
                        }else{
                            System.out.print("0");
                        }
                    }
                    System.out.println();
                }
            }*/
            //butterfly pattern 
            /*public static void butterfly(int n){
                for(int i=1; i<=n; i++){
                    for(int j=1;j<=i; j++){
                        System.out.print("*");
                    }
                
                    for(int j=1; j<=(n-i)*2 ;j++){
                        System.out.print(" ");
                    }
                    for(int j=1; j<=i; j++){
                        System.out.print("*");
                }
                    System.out.println();
            }
            for(int i=n; i>=1; i--){
                for(int j=1;j<=i; j++){
                    System.out.print("*");
                }
            
                for(int j=1; j<=(n-i)*2 ;j++){
                    System.out.print(" ");
                }
                for(int j=1; j<=i; j++){
                    System.out.print("*");
            }
            System.out.println();
        }
    } */

    //rhombus 
    /*public static void rhombus(int row , int coln){
        for(int i=1; i<=row; i++){
                for(int k = 1; k<=row-i; k++){
                    System.out.print(" ");
                }
                for(int k= 1; k<=coln; k++){
                    System.out.print("*");
                }
            System.out.println();
        }
    }*/
    // hollow rhombus 
    /*public static void hollow_rhombus(int row , int coln){
        for(int i=1; i<=row; i++){
            for(int j=1; j<=row-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=coln; j++){
                if(i==1 || i==row || j==1 || j==coln){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }*/

    // diamond 

    /*public static void diamond(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*"+" ");
            }
            for(int j=1; j<=i-1; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for(int i=n; i>=1; i--){
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*"+" ");
            }
            for(int j=1; j<=i-1; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }*/

    public static void hollow_rectangle(int row, int col){
        for(int i=1; i<=row; i++){
            for(int j=1; j<=col; j++){
                if(i==1 || j==1 || i==row  || j==col){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

          
   public static void main(String[] args) {
        hollow_rectangle(10,20 );
        //inverted_tringle(4);
        //hollow_tringle(4);
       // prymid(4);
       //inverted_half_prymid(5);
      // floyd_triangle(5);
     // zo_triangle(5);
     //butterfly(4 );
    // rhombus(4,5 );
      //hollow_rhombus(4,5 );
      //diamond(4);
    }

}
