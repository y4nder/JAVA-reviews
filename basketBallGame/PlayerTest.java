public class PlayerTest {
    public static void main(String[] args){
        Player p1 = new Player("Doncic");
        Player p2 = new Player("Harden");
        // Player p3 = new Player("Curry");
        // Player p4 = new Player("James");

        OneVOne game1 = new OneVOne(21);
        // p1.setSteal(99999);
        // p2.setSteal(99999);
        // p1.setThreePoint(999999);
        p1.setAttributes(99, 99, 99, 99);
        p2.setAttributes(99, 99, 99, 99);
        game1.startOneVOne(p2,p1);
        game1.showGameDetails();
    }
}

