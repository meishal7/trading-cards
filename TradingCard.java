/** 
* TITLE: TradingCard.java 
* AUTHOR: Elena Mudrakova   
* COURSE: CS 112 Intro to CS II - Java  
* MODULE: 1 
* PROJECT: Lab 03_Cards
* LAST MODIFIED: 08/29/2020
* DESCRIPTION: this program defines the abstract class TradingCards 
*
* ALGORITHM: 
* declare instance vars name, rarity, price
* declare setters and getters for vars
* declare equals() method
* declare toString() method
* declare hashCode() method
* 
* PACKAGES INCLUDED
* import java.util.Objects for hashCode()
* 
* 
*/   
package L03_Cards;
import java.util.Objects;
import java.lang.*;

public abstract class TradingCard {
    
    /**************************** INSTANCE VARS ***************************/
    protected String name;
    protected String rarity;
    protected double price;
    

    /**************************** CONSTRUCTORS ***************************/
    
    /**
     * No arguments constructor
     */
    public TradingCard(){ }
     /**
     * Three arguments constructor, name, level
     */
    public TradingCard(String name, double price, String rarity){
        setName(name);
        setRarity(rarity);
        setPrice(price);
    }

    /**************************** GETTERS AND SETTERS ***************************/
    
    /**
     * Sets the name
     * @param name name for set
     */
    public void setName(String name){
        this.name = name;
    }
    /**
     * 
     * @return name
     */
    public String getName(){
        return name;
    }
    /**
     * Sets the rarity
     * @param rarity for set
     */
    public void setRarity(String rarity){
        this.rarity = rarity;
    }
    /**
     * @return rarity
     */
    public String getRarity(){
        return rarity;
    }
    
    /**
     * Sets price
     * @param price price for set, double, min = 1.00
     */
    public void setPrice(double price){
        this.price = price;
    }
    /**
     * @return price
     */
    public double getPrice(){
        return price;
    }
    
    /************************************ EQUALS() toSTRING() hashCODE() **************************************/
    /**
     * Prints out the object data
     */
    public String toString()
    {
        return ("Card: " + name + " rarity" + rarity + price);
    }
    /**
     * Tests for equality of two objects. To be equal
     * objects must have the same name, rarity, price
     * @return returns true if the objects are equal
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TradingCard that = (TradingCard) o;
        return Double.compare(that.price, price) == 0 &&
                name.equals(that.name) &&
                rarity.equals(that.rarity);
    }

    /**
     * Returns hash code value for the obj
     * 
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, rarity, price);
    }
    
}