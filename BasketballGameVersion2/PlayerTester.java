public class PlayerTester {
    public static void main(String[] args){
        Player p1 = new Player("player 1");
        Player p2 = new Player("player 2");

        p1.stealBall(p2);
        System.out.println(p1.getPlayerName() + " ball: " + p1.getHasBall());
        System.out.println(p2.getPlayerName() + " ball: " + p2.getHasBall());
    }    
}
