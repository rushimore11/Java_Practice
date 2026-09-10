public class bitmanipulation {
    public static void oddOrEven (int n){
        int bitMask = 1;
        if((n & bitMask ) == 0) {
            //even number
            System.out.println("even number");
        }else {
            System.out.println("odd number");

        }
    }

    // get ith bit 
    public static int getIthBit(int n , int i){
        int bitMask = 1<<i;
        if((n & bitMask)==0 ){
            return 0;

        }else {
            return 1;
        }
    }


    // set ith bit
    public static int setIthBit (int n, int i){
        int bitMask = 1<<i;
        return n| bitMask;

    }

    // clear ith bit

    public static int clearIthBit(int n , int i){
        int bitMask = ~(1<< i);
        return n & bitMask ;


    }

    // update ith bit
     public static int updateIthBit(int n , int i , int newBit){

      //  if(newBit == 0 ){
       //     return clearIthBit (n , i);
       // }else{
       //     return setIthBit (n, i);
       // }

        n = clearIthBit(n , i);
        int BitMask = newBit << i;
        return n | BitMask ;
     }


     // clear last i bits 

     public static int clearLastIBits(int n , int i ){
        int bitMask = (~0)<< i;
        return n & bitMask;    

     }

     // clear range of bits
     public static int clearRangeBits (int n , int i, int j){
        int a = ((~0)<< (j + 1));
        int b = (1<<i)-1;
        int bitMask = a| b;
        return n & bitMask ;
     }


     // check n umber is power of two
     
     public static boolean isPowerOfTwo(int n){
        return (n&(n-1)) == 0;
     }
     

     // count set bits in a number 

     public static int countBits(int n ){
        int count =0 ;
        while ( n> 0){
            if ((n & 1 ) != 0){
                count++;

            }
            n = n>>1;
        }
        return count;
     }

     //fast exponention

     public static int fastExpo(int a , int n){
        int ans = 1;
        while(n>0){
            if ((n & 1) != 0) {
                ans = ans * a;
            }
            a = a * a ;
            n = n >>1;

        }
        return ans;
    }



    // modular exponention ====== google
    
     public static int power(int x, int y, int p)
    {
        int res = 1; // Initialize result
 
        while (y > 0) {
 
            // If y is odd, multiply x with result
            if ((y & 1) != 0)
                res = res * x;
 
            // y must be even now
            y = y >> 1; // y = y/2
            x = x * x; // Change x to x^2
        }
        return res % p;
    }
 
    public static void main(String[] args)
    {
        int x = 2;
        int y = 5;
        int p = 13;
 
        int mod = power(x, y, p);
        System.out.print("Power is " + mod);
    }
}
    

