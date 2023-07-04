public class Book extends Goods implements Taxable{
    protected String author;
    
    public Book(String des, double prc, String aut){
        super(des, prc);
        this.author = aut;
    }

    public String toString(){
        return super.toString() + " author: " + author;
    }

    public double calculateTax(){
        return price = taxRate;
    }
}
