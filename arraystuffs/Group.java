import java.util.Scanner;

public class Group {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String word;

        word = scan.next();
        int counter = word.length();
        char[] wordArr = new char[100];

        for(int i = 0; i < counter; i++){
            wordArr[i] = word.charAt(i);
        }

        int group = 0;

        for(int i = 0; i < counter; i++){
            if(wordArr[i] == '{' && wordArr[i+1]=='}'){
                group++;
                i++;
            }
        }
        System.out.println("groups = " + group);
    }
}
