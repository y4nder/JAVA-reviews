public class Toy extends Goods implements Taxable{
    protected int minimumAge;

    public Toy(String des, double prc, int age){
        super(des, prc);
        this.minimumAge = age;
    }

    public String toString(){
        return super.toString() + " minimum age: " + minimumAge;
    }

    public double calculateTax(){
        return price = taxRate;
    }
}
