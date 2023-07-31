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
        MAX = 11;
        this.p1 = p1;
        this.p2 = p2;
    }

    public void startOneVOne(){    
        while(scoreP1 < MAX && scoreP2 < MAX){
            scoreP1 += chooseAction(p1, p2, getRandomIntForShot());
            System.out.println("    current score -- " + scoreP1 + ":" + scoreP2 +"\n");
            if(scoreP1 >= MAX) break;
            scoreP2 += chooseAction(p2, p1, getRandomIntForShot());
            System.out.println("    current score -- " + scoreP1 + ":" + scoreP2 +"\n");
            if(scoreP2 >= MAX) break;
        }
        if(scoreP1 > scoreP2) System.out.println(p1.getPlayerName() + " WON!");
        else System.out.println(p2.getPlayerName() + " WON!");

        System.out.println("SCORES -> " + scoreP1 + " : " + scoreP2);
    }

    public void newOneVOne(){
        p1.giveBall(true);
        while(scoreP1 < MAX && scoreP2 < MAX){
            while(p1.hasTheBall()){
                scoreP1 += chooseAction(p1, p2, getRandomIntForShot());
                System.out.println("    current score -- " + scoreP1 + ":" + scoreP2 +"\n");
                if(scoreP1 >= MAX) break;
            }
    
            while(p2.hasTheBall()){
                scoreP2 += chooseAction(p2, p1, getRandomIntForShot());
                System.out.println("    current score -- " + scoreP1 + ":" + scoreP2 +"\n");
                if(scoreP1 >= MAX) break;
            }
        }
        if(scoreP1 > scoreP2) System.out.println(p1.getPlayerName() + " WON!");
        else System.out.println(p2.getPlayerName() + " WON!");

        System.out.println("SCORES -> " + scoreP1 + " : " + scoreP2);
    }

    private int chooseAction(Player p1, Player p2, int num){
        if(num == 1){
            System.out.print(p1.getPlayerName() + "'s midrange shot ");
            if(p2.blockShot()){
                System.out.print("was BLOCKED.\n");
                if(p2.reboundBall()){
                    System.out.println(p2.getPlayerName() + " rebounds the ball");
                    p1.giveBall(false);
                    p2.giveBall(true);
                }
                else System.out.println(p1.getPlayerName() + " got the ball back");
            }
            else{
                if(p1.shootMidrange()) {
                    System.out.print("went in. +1 pt\n");
                    p1.giveBall(false);
                    p2.giveBall(true);
                    return 1;
                }
                else {
                    System.out.print("missed. +0 pt\n");
                    if(p2.reboundBall()){
                        System.out.println(p2.getPlayerName() + " rebounds the ball");
                        p1.giveBall(false);
                        p2.giveBall(true);
                    }
                    else System.out.println(p1.getPlayerName() + " got the ball back");
                    return 0;
                }
            }
        }
        if(num == 2){
            System.out.print(p1.getPlayerName() + "'s three point shot ");
            if(p2.blockShot()){
                System.out.print("was BLOCKED.\n");
                if(p2.reboundBall()){
                    System.out.println(p2.getPlayerName() + " rebounds the ball");
                    p1.giveBall(false);
                    p2.giveBall(true);
                }
                else System.out.println(p1.getPlayerName() + " got the ball back");
                
            }
            else{
                if(p1.shootThreePoint()){ 
                    System.out.print("went in. +2 pt\n");
                    p1.giveBall(false);
                    p2.giveBall(true);
                    return 2;
                }
                else{ 
                    System.out.print("missed. + 0 pt\n");
                    if(p2.reboundBall()){
                        System.out.println(p2.getPlayerName() + " rebounds the ball");
                        p1.giveBall(false);
                        p2.giveBall(true);
                    }
                    else System.out.println(p1.getPlayerName() + " got the ball back");
                    return 0; 
                }
            }
        }
        return 0;
    }

    private int getRandomIntForShot(){
        return ran.nextInt(2) + 1;
    }
}
