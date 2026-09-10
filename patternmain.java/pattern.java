
public class pattern {
    public static void main (String args[]){

        for( int line =1; line<= 10; line++){
            for(int star=1 ; star <= 10-line +1 ; star ++ ){
                System.out.print("* ");

            }
            System.out.println();
        }
    }
    
}
