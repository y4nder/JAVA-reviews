public class RecursionStringTester {
    public static void main(String[] args) {
        // CountChar count = new CountChar();
        // VowelRemover rem = new VowelRemover();
        // MatchString match = new MatchString();
        MatchCount mat = new MatchCount();
        // String word = "AUDIOBOOK";
        // char c = 'e';
        // System.out.println("The letter " + c + " in the word " + word + " appears : " + count.countChar(word, c) + " times");
        String word1 = "XXXX";
        String word2 = "XX";
        // System.out.println(match.matchWith(word1, word2));;
        System.out.println(mat.matchCount(word1, word2));
    }
}
