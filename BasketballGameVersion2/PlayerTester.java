public class PlayerTester {
    public static void main(String[] args){
        PlayerV2 p1 = new PlayerV2("James");
        PlayerV2 p2 = new PlayerV2("Bryant");
        PlayerV2 p3 = new PlayerV2("Curry");
        PlayerV2 p4 = new PlayerV2("Harden");

        BlacktopOnes game1 = new BlacktopOnes();
        game1.startNewGame(p1, p2);
        game1.showHightlights();
    }    
}