import java.util.Random;
public class Player {
    private static Random ran = new Random();
    private String playerName;
    private String detailedActions;
    //offense

    //defense
    private int steal;
    private boolean hasBall;

    

    public Player(String name){
        playerName = name;
        steal = 60; 
        hasBall = false;
        detailedActions = "";
    }

    //setters
        public void setPlayerName(String name){ playerName = name; }

        public void setSteal(int stl){ steal = stl;}
        public void setHasBall(boolean ball){ hasBall = ball; }

    //getters
        public String getPlayerName(){ return playerName; }
        public int getStealRt(){ return steal; }
        public boolean getHasBall(){ return hasBall; }

    //displayers
        private void detailAdd(String message){ detailedActions += "\n" + message; }
        public void showActions(){ System.out.println(detailedActions); }
    
    //steal 
    public boolean stealBall(Player p2){
        double pct = Math.random()*100;
        if((pct -= steal * 0.6) < 0){
            detailAdd(getPlayerName() + " stole the ball!");
            swapPossession();
            return true;
        }
        if((pct -= steal * 0.3) < 0){
            detailAdd(getPlayerName() + " fouled " + p2.getPlayerName());
            return false;
        }
        else {
            detailAdd("failed to steal");
            return false;
        }
    }

    private void swapPossession(){
        setHasBall(false);
    }

    //random generators
    private int getRandomOff(){
        return ran.nextInt(2) + 1;
    }
}
