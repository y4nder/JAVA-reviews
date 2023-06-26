public class Birthday extends Card{
    private int age;

    public Birthday(String r, int age){
        recipient = r;
        this.age = age;
    }

    public void greeting(){
        System.out.println("Dear " + recipient + ",");
        System.out.println("Happy " + age + "th Birthday!\n");
    }
}
