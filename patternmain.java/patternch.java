public class patternch {
    public static void main (String args []){
        char ch = 'A' ;
         
        for (int line = 1; line<=7 ; line++){
            for(int chars=1 ; chars <=line ; chars++){
                System.out.print(ch);
                ch++ ;

            }
             System.out.println();
        }
    }
    
}
