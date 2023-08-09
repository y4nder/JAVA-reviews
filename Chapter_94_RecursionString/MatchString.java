public class MatchString {
    public boolean matchWith(String word1, String word2) {
        if(word1.length() != word2.length()){
            return false;
        }
        else if(word1.equals("") && word2.equals("")){
            return true;
        }
        else if(word1.charAt(0) == '?' || word2.charAt(0) == '?'){
            return matchWith(word1.substring(1) , word2.substring(1));
        }
        else if(word1.toLowerCase().charAt(0) == word2.toLowerCase().charAt(0)){
            return matchWith(word1.substring(1) , word2.substring(1));
        }
        else{
            return false;
        }
    }
}
