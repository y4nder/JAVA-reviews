public class CountChar {
    public int countChar(String word, char c){
        if(word.length() == 0){
            return 0;
        }
        else if(word.charAt(0) == c){
            return 1 + countChar(word.substring(1), c);
        }
        else{
            return 0 + countChar(word.substring(1), c);
        }
    }
}
