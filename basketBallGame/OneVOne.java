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
            scoreP1 += chooseAction(p1, getRandomInt());
            System.out.println("    current score -- " + scoreP1 + ":" + scoreP2 +"\n");
            if(scoreP1 >= MAX) break;
            scoreP2 += chooseAction(p2, getRandomInt());
            System.out.println("    current score -- " + scoreP1 + ":" + scoreP2 +"\n");
            if(scoreP2 >= MAX) break;
        }
        if(scoreP1 > scoreP2) System.out.println(p1.getPlayerName() + " WON!");
        else System.out.println(p2.getPlayerName() + " WON!");

        System.out.println("SCORES -> " + scoreP1 + " : " + scoreP2);
    }

    private int chooseAction(Player p, int num){
        if(num == 1){
            System.out.print(p.getPlayerName() + "'s midrange shot ");
            if(p.shootMidrange()) {
                System.out.print("went in. +1 pt\n\n");
                return 1;
            }
            else {
                System.out.print("missed. +0 pt\n\n");
                return 0;
            }
        }
        if(num == 2){
            System.out.print(p.getPlayerName() + "'s three point shot ");
            if(p.shootThreePoint()){ 
                System.out.print("went in. +2 pt\n\n");
                return 2;
            }
            else{ 
                System.out.print("missed. + 0 pt\n\n");
                return 0; 
            }
        }
        return 0;
    }

    private int getRandomInt(){
        return ran.nextInt(2) + 1;
    }
}
