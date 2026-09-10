
    
public class patterns { 

    //code for hollow rectangle pattern
    public static void Hollow_rectangle (int totRows , int totCols){
        for(int i=1 ; i<= totRows ; i++){
            for(int j=1 ; j<= totCols ; j++){

                if( i==1|| i== totRows || j== 1|| j== totCols ){

                    System.out.print ( "*");
                } else {
                    System.out.print (" ");

                }
            }
            System.out.println();
        }
    }

    //code for inverted pyramid  
    public static void inverted_pyramid(int n ) {
        for ( int i=1 ; i<=n ; i++){
            //spaces
            for ( int j =1 ; j<=n-i ; j++){
                System.out.print(" ");

            }
            //stars
            for( int j=1 ; j<=i; j++){
                System.out.print("*");

            }
            System.out.println();

        }
        

    }




// INVERTED HALF PYRAMID WITH NUMBERS

    public static void pyramid_number( int n){
        for( int i = 1 ; i<=n ; i++){
            //inner- numbers
            for(int j=1 ; j<= n-i+1 ; j++ ){
                System.out.print(j + " ");

            }
            System.out.println();

        }
    }

    //FLOYD'S TRIANGLE
    public static void floyd_triangle(int n){
        int counter= 1;
        for (int i=1 ; i<=n; i++){
            for ( int j=1 ; j<=i ; j++){
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();

        }


    }

    // 0-1 TRIANLE

    public static void triangle (int n){
        for (int i=1; i<= n ; i++){
            for (int j=1 ; j<=i ; j++){
                if ((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();


        }
    }

    //BUTTERFLY PATTERN

    public static void butterfly(int n){
        for (int i=1 ; i<=n ; i++){
            //stars
            for(int j=1 ; j<=i; j++){
                System.out.print("*");
            }
            
            //spaces
            for( int j=1 ; j<=2*(n-i) ; j++){
                System.out.print(" ");
            }
            //stars -i
            for(int j=1 ; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();


        }
        //2nd half 
        for(int i=n; i>=1 ; i--){
             //stars
             for(int j=1 ; j<=i; j++){
                System.out.print("*");
            }
            
            //spaces
            for( int j=1 ; j<=2*(n-i) ; j++){
                System.out.print(" ");
            }
            //stars -i
            for(int j=1 ; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();



        }

    }




    //sold rhombus

    public static void solid_rhombus(int n){
        for(int i=1 ; i<=n; i++){
            //spaces
            for(int j=1 ;j<=(n-i); j++ ){
                System.out.print(" ");
            }
            //stars

            for(int j=1 ; j<=n ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    
    //HOLLOW RHOMBUS===

    public static void hollow_rhombus (int n){
        for(int i=1 ; i<=n ; i++){
            //spaces
            for(int j=1 ; j<=(n-i); j++){
                System.out.print(" ");

            }
            //hollow rectanglels)
            for(int j=1 ; j<=n; j++ ){
                if(i==1 || i==n|| j==1 ||j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");

                }
            }
            System.out.println();
               
        }
    }

    //DIMOND PATTERN

    public static void diamond(int n) {
        //1st half
        for (int i=1; i<=n ; i++){
            //spaces
            for( int j=1 ; j<=(n-i); j++){
                System.out.print (" ");
            }
            //stars
            for( int j=1 ; j<=(2*i)-1; j++){
                System.out.print ("*");
            }
            System.out.println();

        }
        //2nd half
        for (int i=n; i>=1; i--){
            //spaces
            for( int j=1 ; j<=(n-i); j++){
                System.out.print (" ");
            }
            //stars
            for( int j=1 ; j<=(2*i)-1; j++){
                System.out.print ("*");
            }
            System.out.println();

        }
        
    }



    public static void main (String args []){

       // Hollow_rectangle(10, 7);

        //inverted_pyramid(10);

       // pyramid_number(7);
       //floyd_triangle (6);

       //triangle(5);
       //butterfly(10);
       //solid_rhombus(10);
      // hollow_rhombus(9);
      diamond(10);
    }
    
}

    

