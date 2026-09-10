import java.util.*;

public class  Classroom{

    public static void main (String args[]){
        //create
        HashMap<String, Integer> hm = new HashMap<>();

        //insert
        hm.put("india" , 100);
        hm.put("us" , 50);
        hm.put("china" , 150);

        System.out.println(hm);

        //Get O(1)

        int population = hm.get("india");
        System.out.println(population);

        //ContainsKey  -o(1)

        System.out.println(hm.containsKey("india"));


        //remove O(1)

        System.out.println(hm.remove("china"));
        System.out.println(hm);
    }
}