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
    /**
     * 
     * @param aUPC updates UPC to value contained in .txt file
     */
    public void setUPC(String aUPC) {
        UPC = aUPC;
    }
    /**
     * 
     * @param aExpireDate sets expireDate to value contained in .txt file
     */
    public void setExpireDate(String aExpireDate) {
        expireDate = aExpireDate;
    }
    /**
     * 
     * @return the string containing product expiration date
     */
    public String getExpireDate() {
        return expireDate;
    }
    /**
     * 
     * @return the int containing product UPC
     */
    public String getUPC() {
        return UPC;
    }
}
