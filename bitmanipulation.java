public class bitmanipulation {
    public static void iseven(int n){
        int bitmask=1;
        if((n&bitmask)==0){
            System.out.println("is a even number ");
        }else{
            System.out.println("is odd number");
        }
    }
    /*public static int git_ith(int n , int i){
        int bitmask=1<<i;
        if((n&bitmask)==0){
            return 0;
        }else{
            return 1;
        }
    }*/
    public static int set_ith(int n, int i){
        int bitmask=1<<i;
        return n|bitmask;
    }
    public static int clear_ith(int n, int i){
        int bitmask=~(1<<i);
        return n&bitmask;
    }
    public static void isodd(int n ){
        int bitmask=1;
        
            if((bitmask&n)==0){
                System.out.print("is a even number ");
            }else{
                System.out.print("is odd number ");
            }
        
    }
    public static int  get_ith(int n,int i){
        int bitmask= (1<<i);
        //return bitmask&n;
        if((bitmask&n)==0){
            return 0;
        }else{
            return 1;
        }
    }
    public static int update_ith(int n, int i, int newbit){
        n= clear_ith(n, newbit);
        int bitmask= newbit<<i;
        return bitmask|n;
    }
    public static int clear_range_ithbit(int n, int i, int j){
        int a= ((-1)<<(j+1));
        int b= ((1<<i)-1);
        int bitmask=a|b;
        return n&bitmask;
    }
    public static boolean ispower_of_two(int n){
     return ((n)&(n-1))==0;

    }
    public static int count_setbit(int n){
        int count= 0;
        while(n>0){
            if((n&1) !=0){
                count++;

            }
           n= n>>1;
        }
        return count;
    }
    public static int exponentiation(int a, int n){
        int ans=1;
        while(n>0){
            if((n&1) !=0){
                ans= ans*a;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
    }

    //GIVEN QUESTIONS
    public static int value_x(int n){
        return n*n;
    }
    // SWAP A TWO NUMBER WITHOUT USING A THIRD VARIABLE
    public static void swap(int a,int b){
        System.out.println("before swaping "+ a + "and"+ b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("after swapping "+a + "and"+ b );
    }
    public static void main(String[] args){
        //0iseven(6);
        //isodd(9);
        //System.out.println(update_ith(15, 3,2));
        //System.out.println(clear_range_ithbit(10,2,4));
        //System.out.println(set_ith(10, 2));
        //System.out.println(clear_ith(10, 1));
        //System.out.println(ispower_of_two(14));
       // System.out.println(exponentiation(5,3 ));
      // System.out.println(value_x(2));
        swap(3, 4);
    }
}
