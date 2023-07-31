/*
    this class creates a 1 v 1 game for TWO players
    Defense will be added
    First to 11 points wins.
    both take turns after a basket is made
*/
import java.util.Random;

public class OneVOne {
    Random ran = new Random();
    private int scoreP1;
    private int scoreP2;
    private int MAX;
    private Player p1;
    private Player p2;

    public OneVOne(Player p1, Player p2){
        scoreP1 = 0; 
        scoreP2 = 0;
        MAX = 21;
        this.p1 = p1;
        this.p2 = p2;
    }

    public void startOneVOne(){
        p1.giveBall(true);
        while(scoreP1 < MAX && scoreP2 < MAX){
            while(p1.hasTheBall()){
                if(scoreP1 >= MAX) break;
                int score = newChooseActionOffense(p1, p2);
                scoreP1 += score;
                if(score != 0) System.out.println("\n    current score -- " + scoreP1 + ":" + scoreP2 +"\n");
            }
    
            while(p2.hasTheBall()){
                if(scoreP1 >= MAX) break;
                int score = newChooseActionOffense(p2, p1);
                scoreP2 += score;
                if(score!=0) System.out.println("\n    current score -- " + scoreP1 + ":" + scoreP2 +"\n");
            }
            
        }
        if(scoreP1 > scoreP2) System.out.println(p1.getPlayerName() + " WON!");
        else System.out.println(p2.getPlayerName() + " WON!");

        System.out.println("SCORES -> " + scoreP1 + " : " + scoreP2);
    }

    private int newChooseActionOffense(Player p1, Player p2){
        switch(getRandomIntForShot()){
            case 1: //midrange shot
                System.out.println(p1.getPlayerName() + " attempts a midrange shot ");
                if(chooseActionDefense(p2, p1)){
                    if(tryRebound(p2, p1)){
                        swapPossession(p1, p2);
                        return 0;
                    }
                    else return 0; 
                }
                else{
                    if(p1.shootMidrange()) {
                        System.out.println(p1.getPlayerName() + "'s midrange shot went in. +2 pt");
                        swapPossession(p1, p2);
                        return 2;
                    }
                    else {
                        System.out.println(p1.getPlayerName() + " missed. +0 pt");
                        if(tryRebound(p2, p1)){
                            swapPossession(p1, p2);
                            return 0;
                        }
                        else return 0;
                    }
                }

            case 2: //three point shot
                System.out.println(p1.getPlayerName() + " attempts a three-point shot ");
                if(chooseActionDefense(p2, p1)){ 
                    if(tryRebound(p2, p1)){
                        swapPossession(p1, p2);
                        return 0;
                    }
                    else return 0;
                }
                else{                    
                    if(p1.shootThreePoint()){ 
                        System.out.println(p1.getPlayerName() + "'s three-point shot went in. +3 pt");
                        swapPossession(p1, p2);
                        return 3;
                    }
                    else{ 
                        System.out.println(p1.getPlayerName() + " missed. + 0 pt");
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


    private boolean chooseActionDefense(Player p2, Player p1){
        switch(getRandomIntForDef()){
            case 1: //block shot
                if(p2.blockShot()){
                    System.out.println(p2.getPlayerName() + " blocked the shot");
                    return true;
                }
                else return false;
            case 2: return false;
        }
        return false;
    }

    private boolean tryRebound(Player p1, Player p2){
        if(p1.reboundBall()){
            System.out.println(p1.getPlayerName() + " rebounds the ball");
            swapPossession(p1, p2);
            return true;
        }
        else{
            System.out.println(p2.getPlayerName() + " got the ball back");
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
}
