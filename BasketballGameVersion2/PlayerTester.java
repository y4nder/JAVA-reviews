public class PlayerTester {
    public static void main(String[] args){
        PlayerV2 p1 = new PlayerV2("James");
        PlayerV2 p2 = new PlayerV2("Bryant");

        BlacktopOnes game1 = new BlacktopOnes(21);
        p1.setHasBall(true);
        System.out.println(p1.getPlayerName() + " : " + p1.getHasBall());
        System.out.println(p2.getPlayerName() + " : " + p2.getHasBall());
        p2.reboundBall(p1);
        p2.showActions();
        System.out.println(p1.getPlayerName() + " : " + p1.getHasBall());
        System.out.println(p2.getPlayerName() + " : " + p2.getHasBall());
    }    
}
