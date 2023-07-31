public class PlayerTest {
    public static void main(String[] args){
        Player p1 = new Player("James", 85, 82);
        Player p2 = new Player("Curry", 80, 94);


        OneVOne game1 = new OneVOne(p1, p2);

        p1.setBlock(80);
        p2.setBlock(68);
        p2.setRebound(89);
        game1.startOneVOne();

    }
}
