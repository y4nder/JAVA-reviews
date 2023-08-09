public class MatchCount {

    private CountChar count;

    public MatchCount(){
        count = new CountChar(); //initialize object to count number of characters
    }

    public boolean matchCount(String word1, String word2) {

        //if both strings has 0 characters return true
        if (word1.length() == 0 && word2.length() == 0){
            return true;
        }

        //other wise get the count of character x in each string
        int count1 = count.countChar(word1.toLowerCase(), 'x');
        int count2 = count.countChar(word2.toLowerCase(), 'x');
        
        //If StringA has no characters and StringB has some characters, then
        if (word1.length() == 0 && word2.length() > 0){
            if( count2 == 0){ //the strings are equalX if StringB has no Xs.
                return true;
            }
            else{
                return false; //the strings are NOT equalX if StringB has any X.
            }
        }

        // If StringB has no characters and StringA has some characters, then
        else if (word2.length() == 0 && word1.length() > 0){
            if(count1 == 0 ){
                return true; // the strings are equalX if StringA has no Xs.
            }
            else{
                return false; // the strings are NOT equalX if StringA has any X.
            }
        }

        // If both strings have some characters, then
        else{
            if( count1 == count2 ){ // If count of character on both strings are equal then return true
                return true;    
            }
            else{
                return false; // otherwhise false
            }
        }


    }
}
