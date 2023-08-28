public class RecursionStringTester {
    public static void main(String[] args) {
        // CountChar count = new CountChar();
        // VowelRemover rem = new VowelRemover();
        // MatchString match = new MatchString();
        // MatchCount mat = new MatchCount();
        Palindrome pal = new Palindrome();
        // String word = "AUDIOBOOK";
        // char c = 'e';
        // System.out.println("The letter " + c + " in the word " + word + " appears : " + count.countChar(word, c) + " times");
        String word1 = "Ah! Satan sees Natasha.";
        System.out.println("Palindrome = " + pal.isPalindrome(word1));
    }
}
