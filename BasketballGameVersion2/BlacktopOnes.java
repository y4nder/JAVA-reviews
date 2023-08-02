public class BlacktopOnes {
    private int scoreP1;
    private int scoreP2;
    private String gameDetails;

    public BlacktopOnes(){
        scoreP1 = 0;
        scoreP2 = 0;
        gameDetails = "";
    }

    public void startGame(Player p1, Player p2){
        p1.setHasBall(true);
    }
}
