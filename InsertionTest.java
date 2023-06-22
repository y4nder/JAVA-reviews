public class InsertionTest {
    public static void main (String []args){
        Arraylist list = new Arraylist();

        list.insert(2);
        list.insert(3);
        list.insert(1);
        list.insert(5);
        list.insert(54);
        list.insert(43);
        list.insert(2);
        list.insert(3);
        list.insert(1);
        list.insert(5);
        list.insert(54);
        list.insert(43);
        

        System.out.println("Sorted");
        list.display();
    }
}
