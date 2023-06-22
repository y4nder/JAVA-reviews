public class Inserter2Tester {
    public static void main (String [] args){
        inserter2 list = new inserter2();
        inserter2 stringList = new inserter2();

        list.insert(2);
        list.insert(1);
        list.insert(0);
        list.insert(9);

        System.out.print("Sorted Int: ");
        list.displayNum();

        stringList.insert("cat");
        stringList.insert("apple");
        stringList.insert("banana");
        stringList.insert("apples");
        
        System.out.print("\nSorted String: ");
        stringList.displayStr();
        
    }
}
