public class newCave {
    public static int enterCave(int cave){
        if(cave == 1){
            return 1;
        }
        else{
            return cave + enterCave(cave - 1);
        }
    }    
    
    public static void main(String[] args){
        System.out.println(enterCave(2));
    }
}
