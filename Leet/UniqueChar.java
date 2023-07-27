import java.util.*;
public class UniqueChar {

    static int checkLongestSub(String s){
        Set<Character> set = new HashSet<>();
        if(s == null || s.length() == 0) return -1;

        int i = 0, j = 0, max = 0;

        while(i < s.length()){
            char c = s.charAt(i);
            while(set.contains(c)){
                set.remove(s.charAt(j));
                j++;
            }
            set.add(c);
            max = Math.max(max, i - j + 1);
            i++;
        }
        return max;
    }

    public static void main(String[] args){
        String word = "pwwkelk";
        
        int result = checkLongestSub(word);

        System.out.println(result);
    }
}
