public class decimal {
    private static int lastDigit;
    public static void binToDec (int bin){
        int pow = 0;
        int decNum =0 ;
        while( lastDigit>0){
            int lastDigit= lastDigit %10 ;
            decNum = decNum + (lastDigit * (int)Math.pow(2, bin));
            pow ++;
            lastDigit= lastDigit / 10;
            
        }
        System.out.println("decimal num " + lastDigit +" ="+ decNum);
    }
    public static void main ( String args[]){
        binToDec (101);
    }

}
