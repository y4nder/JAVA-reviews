public class PlayerTest {
    public static void main(String[] args){
        Player p1 = new Player("Doncic");
        Player p2 = new Player("Harden");
        Player p3 = new Player("Curry");
        Player p4 = new Player("James");

        p1.setBlock(78);
        p2.setBlock(72);

        OneVOne game1 = new OneVOne(50);
        game1.startOneVOne(p1,p2);

    }
}

