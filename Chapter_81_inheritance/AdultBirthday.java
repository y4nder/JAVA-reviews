public class AdultBirthday extends Birthday{
    public AdultBirthday(String name, int age){
        super(name, age);
    }
    public void greeting(){
        super.greeting();
        System.out.println("duol na sa kamatayon!");
    }
}
