import java.util.*;
public class printn {
    public  static void main (String args [] ){
        @SuppressWarnings("resource")
        Scanner sc= new Scanner (System.in) ;
        int range=sc.nextInt() ;
        int counter=1;

        while (counter<=range){
            System.out.print(counter + " ");
            counter++;

        }
        System.out.println();
    }
}
