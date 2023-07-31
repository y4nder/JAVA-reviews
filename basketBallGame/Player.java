import java.lang.Math;   

public class Player{
    private String playerName;

    //skill ratings for scoring
    private int midRange;
    private int threePoint;

    public Player(String name, int mid, int three){
        playerName = name;
        midRange = mid;
        threePoint = three;
    }

    //setters
    public void setMidRange(int mid){ midRange = mid; }
    public void setThreePoint(int three){ threePoint = three; }
    
    //getters
    public String getPlayerName(){ return playerName; }
    public int getMidRange(){ return midRange; }
    public int getThreePoint(){ return threePoint; }
    
    //simple algorithm for calculating scoring method
    public boolean shootMidrange(){
        double pct = Math.random()*100;
        //System.out.printf("shot with %.02f pct, ", pct);
        if((pct -= midRange) < 0) return true;
        else return false;
    }
    
    public boolean shootThreePoint(){
        double pct = Math.random()*100;
        //System.out.printf("shot with %.02f pct, ", pct);
        if((pct -= threePoint) < 0) return true;
        else return false;
    }

    //displayers
    public void showPlayerDetail(){
        System.out.println("Jersey no." + getPlayerName());
        System.out.println("Midrange Shot = " + getMidRange() );
        System.out.println("Three Point Shot = " + getThreePoint() );
    }
}