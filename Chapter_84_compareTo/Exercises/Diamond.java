class Diamond implements Comparable<Diamond>{
    private String stockNumber;

    private double carot;       /* size of the diamond */
    private String clarity;  /* clarity grade of the diamond */
    private char color;      /* color grade D-Z */
    private String cut;      /* name of the cut */

    String getStock()   { return stockNumber; }
    double getCarot()   { return carot; }
    String getClarity() { return clarity; }
    char   getColor()   { return color; }
    String getCut()     { return cut; }

    public Diamond( String s, double car, String clar, char col, String ct ){
        stockNumber = s;  
        carot = car; 
        clarity = clar; 
        color = col; 
        cut = ct;  
    }

    public String toString(){
        return "caret: " + carot + ", clarity: " + clarity + ", color: " + color + ", cut: " + cut + ", " + stockNumber;
    }

    public int compareTo( Diamond other ) {
        int newCar = (int) (getCarot()*10);
        int newOther = (int) (other.getCarot()*10);

        if(newCar != newOther){
            return newOther - newCar;
        }
        else if(getClarity().equals(other.getClarity()) == false){
            return compareQuality(getClarity()) - (compareQuality(other.getClarity()));
        }
        else{
            return getColor() - other.getColor();
        }

    }

    private int compareQuality(String code){
        if(code.equals("FL")) return 1; 
        else if( code.equals("IF")) return 2;
        else if( code.equals("VVS1")) return 3;
        else if( code.equals("VVS2")) return 4;
        else if( code.equals("VS1")) return 5;
        else if( code.equals("VS2")) return 6;
        else if( code.equals("SI1")) return 7;
        else if( code.equals("SI2")) return 8;
        else if( code.equals("I1")) return 9;
        else if( code.equals("I2")) return 10;
        else return 11;
    }
}