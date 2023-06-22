public class newSorterTest {
    public static void main(String[]args){
        String[] words = {"cat", "apple"};
        int sum = 0;

        for(int i = 0; i < words.length; i++){
            for(int j = 0; j < words[i].length(); j++ ){
                sum+= words[i].charAt(j);
            }
            System.out.println(sum);
            sum = 0;
        }
    }
}
