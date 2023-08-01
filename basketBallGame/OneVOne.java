import java.util.Random;

public class OneVOne {
    Random ran = new Random();
    private int scoreP1;
    private int scoreP2;
    private int MAX;
    private String detailedActions;

    public OneVOne(){
        scoreP1 = 0; 
        scoreP2 = 0;
        MAX = 21;
        detailedActions = "SHOWING GAME DETAILS\n";
    }

    public OneVOne(int max){
        scoreP1 = 0;
        scoreP2 = 0;
        MAX = max;
        detailedActions = "SHOWING GAME DETAILS\n";
    }

    //getters
    public String getDetailedActions(){ return detailedActions; }
    public int getScoreP1(){ return scoreP1; }
    public int getScoreP2(){ return scoreP2; }
    //setters
    private void detailBuilder(String message){
        detailedActions += "\n" + message;
    }

    //game method
    public void startOneVOne(Player p1, Player p2){
        p1.giveBall(true);
        p2.giveBall(false);
        while(scoreP1 < MAX && scoreP2 < MAX){
            while(p1.hasTheBall()){
                if(scoreP1 >= MAX) break;
                int score = newChooseActionOffense(p1, p2);
                scoreP1 += score;
                if(score != 0) detailBuilder("\n    current score -- " + scoreP1 + ":" + scoreP2 +"\n");
            }
    
            while(p2.hasTheBall()){
                if(scoreP1 >= MAX) break;
                int score = newChooseActionOffense(p2, p1);
                scoreP2 += score;
                if(score!=0) detailBuilder("\n    current score -- " + scoreP1 + ":" + scoreP2 +"\n");
            }
            
        }
        //showing of scores after the game.
        if(scoreP1 > scoreP2) {
            System.out.println(p1.getPlayerName().toUpperCase() + " WON!");
            detailBuilder(p1.getPlayerName().toUpperCase() + " WON!");
        }
        else {
            System.out.println(p2.getPlayerName().toUpperCase() + " WON!");
            detailBuilder(p2.getPlayerName().toUpperCase() + " WON!");
        }

        detailBuilder("SCORES -> " + scoreP1 + " : " + scoreP2);
        System.out.println("SCORES -> " + scoreP1 + " : " + scoreP2);
    }

    //offense methods
    private int newChooseActionOffense(Player p1, Player p2){
        switch(getRandomIntForShot()){
            case 1: //midrange shot
                detailBuilder(p1.getPlayerName() + " attempts a midrange shot ");
                if(chooseActionDefense(p2, p1)){
                    if(tryRebound(p2, p1)){
                        swapPossession(p1, p2);
                        return 0;
                    }
                    else return 0; 
                }
                else{
                    if(p1.shootMidrange()) {
                        detailBuilder(p1.getPlayerName() + "'s midrange shot went in. +2 pt");
                        swapPossession(p1, p2);
                        // System.out.println(p1Ball);
                        // System.out.println(p2Ball);
                        return 2;
                    }
                    else {
                        detailBuilder(p1.getPlayerName() + " missed.");
                        if(tryRebound(p2, p1)){
                            swapPossession(p1, p2);
                            return 0;
                        }
                        else return 0;
                    }
                }

            case 2: //three point shot
                detailBuilder(p1.getPlayerName() + " attempts a three-point shot ");
                if(chooseActionDefense(p2, p1)){ 
                    if(tryRebound(p2, p1)){
                        swapPossession(p1, p2);
                        return 0;
                    }
                    else return 0;
                }
                else{                    
                    if(p1.shootThreePoint()){ 
                        detailBuilder(p1.getPlayerName() + "'s three-point shot went in. +3 pt");
                        swapPossession(p1, p2);
                        return 3;
                    }
                    else{ 
                        detailBuilder(p1.getPlayerName() + " missed.");
                        if(tryRebound(p2, p1)){
                            swapPossession(p1, p2);
                            return 0; 
                        }
                        else return 0;
                    }
                }
        }
        return 0;

    }

    //defense methods
    private boolean chooseActionDefense(Player p2, Player p1){
        switch(getRandomIntForDef()){
            case 1: //block shot
                if(p2.blockShot()){
                    detailBuilder(p2.getPlayerName() + " blocked the shot");
                    return true;
                }
                else return false;
            case 2: return false;
        }
        return false;
    }

    private boolean tryRebound(Player p1, Player p2){
        if(p1.reboundBall()){
            detailBuilder(p1.getPlayerName() + " rebounds the ball");
            swapPossession(p1, p2);
            return true;
        }
        else{
            detailBuilder(p2.getPlayerName() + " got the ball back");
            return false;
        }
    }

    private void swapPossession(Player p1, Player p2){
        p1.giveBall(false);
        p2.giveBall(true);
    }

    private int getRandomIntForShot(){
        return ran.nextInt(2) + 1;
    }

    private int getRandomIntForDef(){
        return ran.nextInt(2) + 1;
    }


    public void showGameDetails(){
        System.out.println(getDetailedActions());
    }
}
