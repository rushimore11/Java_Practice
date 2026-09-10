

//

public class primes {
    public static void primeInRange(int n ){
        for(int i =2 ; i<= n ; i++){
            if ( isPrime (i)){//true
                System.out.print( i + " ");
            }
            
        }
        System.out.println();
        

    }
    private static boolean isPrime(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isPrime'");
    }
    public static void main (String args[]){

        primeInRange(20);
    }
    
}
