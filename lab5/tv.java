package lab5;

public class tv {

    private String stockNum;
    private char screenType;
    private double price;
    private String make; 

    public tv() {}

    public tv(String stockNum, String make, char screenType, double price) {
        this.stockNum = stockNum;
        this.screenType = screenType;
        this.price = price;
        this.make = make; 
    }

    public double taxFees(double tax) {
        return this.price * (tax / 100);
    }

    public String getStockNum() {
        return stockNum;
    }

    public char getScreenType() {
        return screenType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
