public class PlayerTester {
    public static void main(String[] args){
        PlayerV2 p1 = new PlayerV2("James");
        PlayerV2 p2 = new PlayerV2("Bryant");
        PlayerV2 p3 = new PlayerV2("Curry");
        PlayerV2 p4 = new PlayerV2("Durant");

        // BlacktopOnes game1 = new BlacktopOnes();
        // game1.startNewGame(p1, p2);
        // game1.showHightlights();
        TournamentSingle t1 = new TournamentSingle();
        t1.add(p1);
        t1.add(p2);
        t1.add(p3);
        t1.add(p4);
        t1.startTournament();
        t1.showTournamentHighlights();
    }    
}