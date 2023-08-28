public class Palindrome {
    public boolean isPalindrome(String word){
        System.out.println(word);
        if(word.length() == 1 || word.equals("")){
            return true;
        }
        else{
            if(Character.isLetterOrDigit(word.charAt(0)) == false){
                return isPalindrome(word.substring(1));
            }
            else if(Character.isLetterOrDigit(word.charAt(word.length() - 1)) == false){
                return isPalindrome(word.substring(0, word.length() - 1));
            }
            else{
                if(word.toLowerCase().charAt(0) != word.toLowerCase().charAt(word.length()-1)){
                    return false;
                }
                else{
                    return isPalindrome(word.substring(1, word.length() - 1));
                }
            }
        }
    }
}
