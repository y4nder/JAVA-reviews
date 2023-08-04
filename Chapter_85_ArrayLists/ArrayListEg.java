import java.util.ArrayList;
public class ArrayListEg {
    public static void main(String[] args){
        //creating array list object
        ArrayList<String> names = new ArrayList<>();

        //adding elements to the arrayList
        names.add("Leander");
        names.add("Lorenz");
        names.add("Lubguban");
        names.add(0, "LLL");
        //displaying the elements in the arrayList
        System.out.println(names.get(0));
        System.out.println(names.get(1));
        System.out.println(names.get(2));
        System.out.println(names.get(3));
        // names.clear();        
        System.out.println(names.isEmpty());
        System.out.println(names.indexOf("Lubguban"));
        // System.out.println("current size of array: " + names.size() );
        // System.out.println("current capacity of array: " + names. );
    }
}
