public class testalpha {
    public static void main(String []args){
        String word1 = "ziggy";
        String word2 = "zigga";
        boolean flag = false;

        for(int i = 0;i < word1.length() && i < word2.length() ; i++){
            int x = word1.charAt(i);
            int y = word2.charAt(i);

            if(x != y){
                if(x < y){
                    System.out.println("1");
                    flag = true;
                    break;
                }
                else{
                    System.out.println("2");
                    flag = true;
                    break;
                }
            }
        }

        if(word1. length() == word2.length() && flag == false){
            System.out.println("0");
        }
        else if (flag == false){
            if(word1.length() < word2.length()){
                System.out.println("1");
            }
            else{
                System.out.println("2");
            }
        }

    }
}
