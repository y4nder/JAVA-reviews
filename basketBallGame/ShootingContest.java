public class ShootingContest {
    private int max;
    private Player players[];
    private int counter;

    public ShootingContest(){
        max = 3;
        players = new Player[max];
        counter = 0;
    }

    public boolean add(Player p){
        if(counter > max) return false;
        counter++;
        players[counter - 1] = p;
        return true;
    }

    public void startContest(int num){
        if(counter < 2) {
            System.out.println("Need more players");
            return;
        }

        int i = 0;
        int made = 0;
        int max = 0;
        Player winner = players[0];

        while(i < counter){
            for(int j = 0; j < num; j++){
                if(players[i].shootThreePoint()) made++;
            }
            System.out.println(players[i].getPlayerName() + " made " + made + " baskest out of " + num);
            if(made > max){ 
                max = made;
                winner = players[i];
            }
            made = 0;
            i++;
        }

        System.out.println("The winner of the contest is " + winner.getPlayerName() + " with " + max + " made baskets!");
    }

    public void showAllContestants(){
        System.out.println("Showing all contestants");
        for(int i = 0; i < counter; i++){
            System.out.println(players[i].getPlayerName());
        }
    }
}
