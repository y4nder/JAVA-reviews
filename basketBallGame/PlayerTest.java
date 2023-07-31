public class PlayerTest {
    public static void main(String[] args){
        Player p1 = new Player("James", 75, 82);
        Player p2 = new Player("Bryant", 80, 72);

        OneVOne game1 = new OneVOne(p1, p2);

        game1.startOneVOne();
    }
}
