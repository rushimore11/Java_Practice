public class strings {
    public static boolean isPalindrome(String  str){
        for(int i=0; i<str.length()/2; i++){
            int n= str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){
                //not palindrome
                return false;
            }

        }
        return true;
    }




    // SHORTEST PATH...==    codeshaif
    public static float getShortestPath(String path){
        int x= 0 , y =0;
        for(int i=0; i<path.length(); i++){
            char dir = path.charAt(i);
            //south
            if(dir == 'S'){
                y--;
            }
            // north
            else if (dir == 'N'){
                y++;
            }
            // west
            else if (dir == 'W'){
                x--;
            }
            //east
            else{
                x++;

            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2 + Y2);

    }

    // convert letter to uppercase...===  google

    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (int i=1 ; i<str.length(); i++){
            if (str.charAt(i) == ' ' && i<str.length()-1){
                sb.append (str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    //STRING COMPRESSION========= amazon

    public static String compress(String str){
        String newStr = "";
        for (int i=0; i<str.length(); i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if(count > 1){
                newStr += count.toString();
            }
        }
        return newStr;
    } 



    public static void main (String args []){
        String str = "aaabbcccdd";
        System.out.println(compress(str));

    }    
}
