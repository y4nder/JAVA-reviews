public class Cave {
    public static int enterCave(int cave){
        int gold = 1;
        if( cave == gold ){
            gold = cave;
            return gold;
        }
        else 
            return enterCave(cave - 1);
    }    
    
    public static void main(String[] args){
        System.out.println(enterCave(5));
    }
}
