import java.lang.Math;   

public class Player{
    private String playerName;

    //skill ratings for scoring
    private boolean hasBall;
    private int midRange;
    private int threePoint;

    //skill ratings for defending
    private int block;
    private int steal;
    private int rebound;


    public Player(String name, int mid, int three){
        playerName = name;
        midRange = mid;
        threePoint = three;
        block = 60;
        steal = 60;
        rebound = 60;
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
    
    //simple algorithm for calculating scoring method
    public boolean shootMidrange(){
        double pct = Math.random()*100;
        if((pct -= midRange) < 0) return true;
        else return false;
    }
    
    public boolean shootThreePoint(){
        double pct = Math.random()*100;
        if((pct -= threePoint) < 0) return true;
        else return false;
    }

    //simple algorithm for caluclating defense methods
    public boolean blockShot(){
        double pct = Math.random()*100;
        if((pct -= (block * 20 / 100)) < 0) return true;
        else return false;
    }

    public boolean reboundBall(){
        double pct = Math.random()*100;
        if((pct -= (block * 60 / 100)) < 0) return true;
        else return false;
    }
    

    //displayers
    public void showPlayerDetail(){
        System.out.println("Jersey no." + getPlayerName());
        System.out.println("Midrange Shot = " + getMidRange() );
        System.out.println("Three Point Shot = " + getThreePoint() );
    }
}