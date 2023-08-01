public class CardTester {
    public static void main(String[] args){
        //Holiday card1 = new Holiday("leander");
        Birthday card2 = new Birthday("leander", 19);
        
        card2 = new YouthBirthday("lorenz", 19);
        card2.greeting();

        Card card3 = new AdultBirthday("lubguban", 99);
        card3.greeting();
    }
}
