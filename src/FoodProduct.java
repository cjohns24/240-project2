/*
 * I hereby decalre upon my word of honor that I have neither
 * given nor received unauthorized help on this work.
 * -Collin Johnson
 */

/**
 *
 * @author Collin Johnson
 * @version 2/23/2017
 */
public class FoodProduct extends Product{
    private String UPC;
    private String expireDate;
    
    public FoodProduct(String name, int quantity, double price, String UPC, String expireDate){
        super(name, quantity, price);
        this.UPC = UPC;
        this.expireDate = expireDate;
    }
    public void setUPC(String aUPC) {
        UPC = aUPC;
    }
    public void setExpireDate(String aExpireDate) {
        expireDate = aExpireDate;
    }
    public String getExpireDate() {
        return expireDate;
    }
    public String getUPC() {
        return UPC;
    }
}
