/** 
* TITLE: HearthStone.java 
* AUTHOR: Elena Mudrakova   
* COURSE: CS 112 Intro to CS II - Java  
* MODULE: 1 
* PROJECT: Lab 03_Cards
* LAST MODIFIED: 08/29/2020
* DESCRIPTION: this program defines the derived class HearthStone 
*
* ALGORITHM: 
* declare instance vars cardClass, golden
* declare setters and getters for vars
* declare equals() method
* declare toString() method
* declare hashCode() method
* 
* PACKAGES INCLUDED
* import java.util.Objects for hashCode()
* import java.text.NumberFormat
* 
* 
*/   
package L03_Cards;
import java.text.NumberFormat; //fornmatting price
import java.util.Objects; //for hashCode();

public class HearthStone extends TradingCard {
    
    /**************************** INSTANCE VARS ***************************/
    protected String cardClass;
    protected boolean golden;
    
    

    /**************************** CONSTRUCTORS ***************************/
    
    /**
     * No arguments constructor
     */
    public HearthStone(){ }
     /**
     * Five arguments constructor, name, level
     */
    public HearthStone(String name, double price, String rarity, String cardClass, boolean golden){
        super(name, price, rarity);
        setCardClass(cardClass);
        setGolden(golden);
    }

    /**************************** GETTERS AND SETTERS ***************************/
    
    /**
     * Sets card class
     * @param cardClass card class for set
     */
    public void setCardClass(String cardClass){
        this.cardClass = cardClass;
    }
    /**
     * 
     * @return cardClass
     */
    public String getCardClass(){
        return cardClass;
    }
    /**
     * Sets golden
     * @param golden golden for set
     */
    public void setGolden(boolean golden){
        this.golden = golden;
    }
    /**
     * @return golden
     */
    public boolean getGolden(){
        return golden;
    }
    
    /************************************ EQUALS() toSTRING() hashCODE() **************************************/
    /**
     * Prints out the object data
     */
    public String toString()
    {
        // Use a class called NumberFormat
        // to format a number (mPrice) as currency
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        return ("HearthStone [ Name = " + name + ", Price = " + currency.format(price) 
                + ", Rarity = " + rarity 
                + ", Card Class = " + cardClass
                + ", Golden = " + golden
                + " ]");
    }
    /**
     * Tests for equality of two objects. To be equal
     * objects must have the same cardClass, golden
     * @return returns true if the objects are equal
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HearthStone that = (HearthStone) o;
        return cardClass.equals(that.cardClass) &&
               golden == that.golden;
               
    }

    /**
     * Returns hash code value for the obj
     * 
     */
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cardClass, golden);
    }
    
}