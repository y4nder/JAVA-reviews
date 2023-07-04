public class Goods {
    protected String description;
    protected double price;

    public Goods(String des, double prc){
        this.description = des;
        this.price = prc;
    }
    
    public String toString(){
        return  "item " + description + " price: " + price;
    }
}
