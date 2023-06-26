import java.util.Scanner;
public class Duplicate{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String word;

        word = scan.nextLine();
        
        int counter = word.length();
        char[] wordArr = new char[100];

        for(int i = 0; i < counter; i++){
            wordArr[i] = word.charAt(i);
        }


        for(int i = 0; i < counter; i++){
            for(int j = counter-1; j > i; j--){
                if(wordArr[i]==wordArr[j]){
                    delete(wordArr, j, counter);
                    counter--;
                }
            }
        }

        display(wordArr, counter);
    }


    public static void display(char[] arr,int count){
        for(int i = 0; i < count; i++){
            System.out.print(arr[i]);
        }
    }

    public static void delete(char[] arr, int j, int count){
        for(int i = j; i < count; i++){
            arr[i] = arr[i+1];
        }
    }
}