public class YouthBirthday extends Birthday{
    public YouthBirthday(String name, int age){
        super(name, age);
    }
    public void greeting(){
        super.greeting();
        System.out.println("how you have grown!!\n");
    }
}
