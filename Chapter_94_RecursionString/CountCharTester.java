public class CountCharTester {
    public static void main(String[] args) {
        CountChar count = new CountChar();
        String word = "Leander";
        char c = 'e';

        System.out.println("The letter " + c + " in the word " + word + " appears : " + count.countChar(word, c) + " times");
    }
}
