import java.util.Random;
public class PlayerV2 {
    private static Random ran = new Random();
    private String playerName;
    private String detailedActions;
    private int score;

    //offense
    private int midRange;
    private int threePoint;

    //defense
    private int steal;
    private boolean hasBall;
    private int rebound;

    public PlayerV2(String name){
        playerName = name;
        midRange = 60;
        threePoint = 60;
        steal = 60; 
        rebound = 60;
        hasBall = false;
        detailedActions = "";
        score =  0;
    }

    //setters
        public void setPlayerName(String name){ playerName = name; }

        public void setMidRange(int mid){ midRange = mid; }
        public void setThreePoint(int three){ threePoint = three; }

        public void setSteal(int stl){ steal = stl;}
        public void setRebound(int reb){ rebound = reb; }

        public void setHasBall(boolean ball){ hasBall = ball; }
        public void setScore(int num){ score = num; }
        public void addScore(int num){ score += num; }
        public void resetDetail(){ detailedActions = ""; }

    //getters
        public String getPlayerName(){ return playerName; }
        public int getStealRt(){ return steal; }
        public boolean getHasBall(){ return hasBall; }
        public String getActionDetails(){ return detailedActions; }
        public int getScore(){ return score; }

    //displayers
        private void detailBuilder(String message){ detailedActions += message; }
        public void showActions(){ System.out.println(detailedActions); }
        public void showScore(){ System.out.println(score); }
    
    //offense 
    public int chooseOffense(PlayerV2 p2){
        resetDetail();
        switch(getRandomOff()){
            case 1: return chooseShot(p2);
            case 2: 
                detailBuilder(getPlayerName() + " dunks +2");
                gainPossession(p2);
                return 2;
        }
        return 0;
    }

    private int chooseShot(PlayerV2 p2){
        switch(getRandomShot()){
            case 1: 
                detailBuilder(getPlayerName() + " attempts a midrange shot\n");
                return midrangeShot(p2);
            case 2:
                detailBuilder(getPlayerName() + " attempts a three-point shot\n");
                return threePoint(p2);
        }
        return 0;
    }

    //midrange shot
    private int midrangeShot(PlayerV2 p2){
        if((getPct() - midRange) < 0){
            detailBuilder(getPlayerName() + " midrange shot went in");
            gainPossession(p2);
            return 2;
        }
        else {
            detailBuilder(getPlayerName() + " missed.\n");
            reboundBall(p2);
            return 0;
        }
    }

    private int threePoint(PlayerV2 p2){
        if((getPct() - threePoint) < 0){
            detailBuilder(getPlayerName() + " three-point shot went in");
            gainPossession(p2);
            return 3;
        }
        else {
            detailBuilder(getPlayerName() + " missed.\n");
            reboundBall(p2);
            return 0;
        }
    }

    //rebound
    private void reboundBall(PlayerV2 p2){
        if((getPct() - rebound) < 0){
            detailBuilder(getPlayerName() + " got the ball back");
            return;
        }
        else{
            detailBuilder(p2.getPlayerName() + " rebounded the ball");
            gainPossession(p2);
            return;
        }
    }

    //steal 
    public boolean stealBall(PlayerV2 p2){
        resetDetail();
        double pct = getPct();
        if( (pct -= (steal * 0.5) * 0.2) < 0){
            detailBuilder(getPlayerName() + " reach-in foul");
            return true;
        }
        else{
            if((pct -= steal * 0.2) < 0){
                detailBuilder(getPlayerName() + " stole the ball!");
                gainPossessionDef(p2);
                return true;
            }
            else return false;
        }
    }

    //possession methods
    private void gainPossessionDef(PlayerV2 p2){
        setHasBall(true);
        p2.setHasBall(false);
    }

    private void gainPossession(PlayerV2 p2){   
        setHasBall(false);
        p2.setHasBall(true);
    }
    //random generators
    private int getRandomOff(){
        return ran.nextInt(2) + 1;
    }

    private int getRandomShot(){
        return ran.nextInt(2) + 1;
    }

    public double getPct(){
        return Math.random()*100;
    }
}
