import java.util.Random;
public class PlayerV2 {
    private static Random ran = new Random();
    private String playerName;
    private String detailedActions;
    private int score;
    //offense

    //defense
    private int steal;
    private boolean hasBall;

    

    public PlayerV2(String name){
        playerName = name;
        steal = 60; 
        hasBall = false;
        detailedActions = "";
        score =  0;
    }

    //setters
        public void setPlayerName(String name){ playerName = name; }
        public void setSteal(int stl){ steal = stl;}
        public void setHasBall(boolean ball){ hasBall = ball; }
        public void setScore(int num){ score = num; }
        public void addScore(int num){ score += num; }

    //getters
        public String getPlayerName(){ return playerName; }
        public int getStealRt(){ return steal; }
        public boolean getHasBall(){ return hasBall; }
        public String getActionDetails(){ return detailedActions; }
        public int getScore(){ return score; }

    //displayers
        private void detailBuilder(String message){ detailedActions = message; }
        public void showActions(){ System.out.println(detailedActions); }
        public void showScore(){ System.out.println(score); }
    
    //offense
    public int chooseOffense(PlayerV2 p2){
        int x = getRandomOff();
        switch(x){
            case 1:
                detailBuilder(getPlayerName() + " shoots +2");
                return 2;
            case 2:
                detailBuilder(getPlayerName() + " dunks +2");
                return 2;
        }
        return 0;
    }


    //steal 
    public int stealBall(PlayerV2 p2){
        double pct = getPct();
        if( (pct -= (steal * 0.5) * 0.2) < 0){
            detailBuilder(getPlayerName() + " reach-in foul");
            return -1;
        }
        else{
            if((pct -= steal * 0.2) < 0){
                detailBuilder(getPlayerName() + " stole the ball!");
                return 1;
            }
            else return 0;
        }
    }

    //random generators
    private int getRandomOff(){
        return ran.nextInt(2) + 1;
    }

    public double getPct(){
        return Math.random()*100;
    }
}
