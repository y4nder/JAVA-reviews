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
    private void detailBuilder(String message){ detailedActions += "\n" + message; }

    //game method
    public void startOneVOne(Player p1, Player p2){
        p1.giveBall(true);
        p2.giveBall(false);
        while(scoreP1 < MAX && scoreP2 < MAX){
            while(p1.hasTheBall()){
                if(scoreP1 >= MAX) break;
                detailBuilder(p1.getPlayerName() + " now has possession");
                int score = ChooseActionOffense(p1, p2);
                scoreP1 += score;
                if(score != 0) detailBuilder("\n    current score -- " + scoreP1 + ":" + scoreP2 +"\n");
            }
    
            while(p2.hasTheBall()){
                if(scoreP1 >= MAX) break;
                detailBuilder(p2.getPlayerName() + " now has possession");
                int score = ChooseActionOffense(p2, p1);
                scoreP2 += score;
                if(score != 0) detailBuilder("\n    current score -- " + scoreP1 + ":" + scoreP2 +"\n");
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
    private int ChooseActionOffense(Player p1, Player p2){
        int action = getRandomIntForShot();
        switch(action){
            case 1: //midrange shot
                detailBuilder(p1.getPlayerName() + " attempts a midrange shot ");
                int defActionMid = chooseActionDefense(p2, p1, action);
                if(defActionMid == -1) return 0; // zero points 
                else if(defActionMid == 2) return 2; // 2 points from contested midrange
                else if(defActionMid == 0){     
                    //if defAction is zero it means that the defender did nothing   
                    if(p1.shootMidrange()) {
                        detailBuilder(p1.getPlayerName() + "'s midrange shot went in. +2 pt");
                        swapPossession(p1, p2);
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
                int defActionThree = chooseActionDefense(p2, p1, action);
                if(defActionThree == -1) return 0; // zero points
                else if(defActionThree == 3) return 3;  // 2 points from contested three point
                else if (defActionThree == 0){
                    //if defAction is zero it means that the defender did nothing
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
    private int chooseActionDefense(Player p2, Player p1, int action){
        switch(getRandomIntForDef()){
            case 1: //block shot
                if(p2.blockShot()){
                    detailBuilder(p2.getPlayerName() + " blocked the shot");
                    if(tryRebound(p2, p1)){ //try to rebound after blocking the shot..
                        swapPossession(p1, p2);
                        return -1;
                    }
                    else return -1; //add later chance for foul
                }
                else return 0; //failed to block the shot
            case 2: //for contesting shots
                double pctContest = p2.contestShot();
                switch(action){
                    case 1: //contested midrange
                        detailBuilder(p2.getPlayerName() + " contested the midrange shot");
                        if (p1.contestedMidrange(pctContest)){
                            detailBuilder(p1.getPlayerName() + " midrange shot went in +2 pt");
                            swapPossession(p1, p2);
                            return 2;
                        }
                        else{
                            detailBuilder(p1.getPlayerName() + " missed the shot");
                            if(tryRebound(p2, p1)){ //try to rebound after missed shot..
                                swapPossession(p1, p2);
                                return -1;
                            }
                            return -1;
                        }
                    case 2: //contested three point
                        detailBuilder(p2.getPlayerName() + " contested the three point shot");
                        if(p1.contestedThreePoint(pctContest)){
                            detailBuilder(p1.getPlayerName() + " three point shot went in +3 pt");
                            swapPossession(p1, p2);
                            return 3;
                        }
                        else{
                            detailBuilder(p1.getPlayerName() + " missed the shot");
                            if(tryRebound(p2, p1)){
                                swapPossession(p1, p2);
                                return -1;
                            }
                            return -1;
                        }
                    case 3: return 0; //defender does nothing
                }
        }
        return 0;
    }

    private boolean tryRebound(Player p1, Player p2){
        if(p1.reboundBall()){
            detailBuilder(p1.getPlayerName() + " rebounds the ball");
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
        return ran.nextInt(3) + 1;
    }


    public void showGameDetails(){
        System.out.println(getDetailedActions());
    }
}
