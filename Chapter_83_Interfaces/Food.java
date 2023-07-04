public class Food extends Goods{
    protected double calories;

    public Food(String des, double prc, double cal){
        super(des, prc);
        this.calories = cal;
    }

    public String toString(){
        return super.toString() + calories + " calories";
    }
}
