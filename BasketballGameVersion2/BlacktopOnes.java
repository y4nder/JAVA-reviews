public class BlacktopOnes {
    private int MAX_SCORE;
    private String gameDetails;

    public BlacktopOnes(){
        MAX_SCORE = 11;
        gameDetails = "";
    }

    public BlacktopOnes(int max){
        MAX_SCORE = max;
        gameDetails = "";
    }

    public String getGameDetails(){
        return gameDetails;
    }

    public PlayerV2 startNewGame(PlayerV2 p1, PlayerV2 p2){
        gameDetails = "";
        p1.setScore(0);
        p2.setScore(0);
        p1.setHasBall(true);

        while (p1.getScore() < MAX_SCORE && p2.getScore() < MAX_SCORE) {
            if (p1.getHasBall()) {
                ballPossession(p1, p2);
            }
            else{
                ballPossession(p2, p1);
            }
        }

        return determineWinner(p1, p2);
    }

    private void ballPossession(PlayerV2 p1, PlayerV2 p2){
        while(p1.getHasBall()){
            if(p1.getScore() >= MAX_SCORE){ 
                return;
            }
            detailAdd("\n" + p1.getPlayerName() + " has possession.");
            if (p2.stealBall(p1)) {
                detailAdd(p2.getActionDetails());
                return;
            }
            int score = p1.chooseOffense(p2);
            detailAdd(p1.getActionDetails());
            if (score != 0) {
                p1.addScore(score);
                detailAdd(p1.getPlayerName() + " gained " + score + "pts");
                detailAdd("\n      CURRENT SCORES ");
                showPlayerScores(p1, p2);
            }
        }
    }

    private PlayerV2 determineWinner(PlayerV2 p1, PlayerV2 p2) {
        if (p1.getScore() > p2.getScore()) {
            // System.out.println(p1.getPlayerName() + " won the 1v1");
            detailAdd(p1.getPlayerName() + " winner");
            return p1;
        } else {
            // System.out.println(p2.getPlayerName() + " won the 1v1");
            detailAdd(p2.getPlayerName() + " winner");
            return p2;
        }
    }


    private void detailAdd(String message){
        StringBuilder sb = new StringBuilder(gameDetails);
        sb.append(message).append("\n");
        gameDetails = sb.toString();
    }

    private void showPlayerScores(PlayerV2 p1, PlayerV2 p2){
        if(p1.getScore() > p2.getScore()){
            detailAdd("       " + p1.getPlayerName().toUpperCase() + ": " + p1.getScore() );
            detailAdd("       " + p2.getPlayerName().toUpperCase() + ": " + p2.getScore() );
        }
        else{
            detailAdd("       " + p2.getPlayerName().toUpperCase() + ": " + p2.getScore() );
            detailAdd("       " + p1.getPlayerName().toUpperCase() + ": " + p1.getScore() );
        }
    }

    //displayers
    public void showHightlights(){
        System.out.println("SHOWING WHAT HAPPENED DURING THE GAME..");
        System.out.println(gameDetails);
    }
}
