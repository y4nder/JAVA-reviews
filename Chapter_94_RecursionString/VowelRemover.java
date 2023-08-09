public class VowelRemover {
    public String removeVowel(String word){
        if(word.length() == 0){
            return "";
        }
        switch(word.toLowerCase().charAt(0)){
            case 'a':   
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return "" + removeVowel(word.substring(1));
        }
        return word.charAt(0) + removeVowel(word.substring(1));
    }
}
