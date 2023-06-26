
public class Holiday extends Card{
    
    public Holiday(String r){
        recipient = r;
    }
    
    public void greeting(){
        System.out.println("Dear " + recipient + ",");
        System.out.println("Happy Holidays!");
    }
}
