import java.lang.Math;   

public class Player{
    private String playerName;
    private int totalPoints;
    private boolean hasBall;

    //skill ratings for scoring
    private int midRange;
    private int threePoint;

    //skill ratings for defending
    private int block;
    private int steal;
    private int rebound;


    public Player(String name, int mid, int three){
        playerName = name;
        totalPoints = 0;
        midRange = mid;
        threePoint = three;
        block = 60;
        steal = 60;
        rebound = 60;
        hasBall = false;
    }

    public Player(String name){
        playerName = name;
        totalPoints = 0;
        midRange = 60;
        threePoint = 60;
        block = 60;
        steal = 60;
        hasBall = false;
    }

    //setters
    public void setMidRange(int mid){ midRange = mid; }
    public void setThreePoint(int three){ threePoint = three; }
    public void setBlock(int bl){ block = bl; }
    public void setRebound(int reb){ rebound = reb; }
    public void giveBall(boolean x){ hasBall = x; }
    
    //getters
    public String getPlayerName(){ return playerName; }
    public int getMidRange(){ return midRange; }
    public int getThreePoint(){ return threePoint; }
    public int getBlock(){ return block; }
    public int getRebound() { return rebound; }
    public boolean hasTheBall(){ return hasBall; }
    public int getTotalPoints(){ return totalPoints; }
    
    //simple algorithm for calculating scoring method
    public boolean shootMidrange(){
        double pct = Math.random()*100;
        if((pct -= midRange) < 0) {
            totalPoints += 2;
            return true;
        }
        else return false;
    }
    
    public boolean shootThreePoint(){
        double pct = Math.random()*100;
        if((pct -= threePoint) < 0) {
            totalPoints += 3;
            return true;
        }
        else return false;
    }

    //simple algorithm for caluclating defense methods
    public boolean reboundBall(){
        double pct = Math.random()*100;
        if((pct -= (rebound * 0.6)) < 0) return true;
        else return false;
    }

    public boolean blockShot(){
        double pct = Math.random()*100;
        if((pct -= (block * 0.2)) < 0) return true;
        else return false;
    }
    
    public boolean stealBall(){
        double pct = Math.random()*100;
        if((pct -= (steal * 0.12)) < 0) return true;
        else return false;
    }
    

    //displayers
    public void showPlayerDetail(){
        System.out.println("Player Name." + getPlayerName());
        System.out.println("Midrange Shot = " + getMidRange() );
        System.out.println("Three Point Shot = " + getThreePoint() );
    }

    public void showTotalPoints(){
        System.out.println("total Points of " + getPlayerName() + " :" + getTotalPoints() );
    }
}