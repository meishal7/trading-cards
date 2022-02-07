/** 
* TITLE: Pokemon.java 
* AUTHOR: Elena Mudrakova   
* COURSE: CS 112 Intro to CS II - Java  
* MODULE: 1 
* PROJECT: Lab 03_Cards
* LAST MODIFIED: 08/29/2020
* DESCRIPTION: this program defines the derived class Pokemon 
*
* ALGORITHM: 
* declare instance vars energyType, hitPoints
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

public class Pokemon extends TradingCard {
    
    /**************************** INSTANCE VARS ***************************/
    protected String energyType;
    protected int hitPoints;
    
    

    /**************************** CONSTRUCTORS ***************************/
    
    /**
     * No arguments constructor
     */
    public Pokemon(){ }
     /**
     * Four arguments constructor, name, level
     */
    public Pokemon(String name, double price, String rarity, String energyType, int hitPOints){
        super(name, price, rarity);
        setEnergyType(energyType);
        setHitPoints(hitPoints);
    }

    /**************************** GETTERS AND SETTERS ***************************/
    
    /**
     * Sets the energy type
     * @param energyType for set
     */
    public void setEnergyType(String energyType){
        this.energyType = energyType;
    }
    /**
     * 
     * @return energyType
     */
    public String getEnergyType(){
        return energyType;
    }
    /**
     * Sets hit points
     * @param hitPoints for set
     */
    public void setHitPoints(int hitPoints){
        this.hitPoints = hitPoints;
    }
    /**
     * @return hitPoints
     */
    public int getHitPoints(){
        return hitPoints;
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
        
        return ("Pokemon [ Name = " + name + ", Price = " + currency.format(price) 
                + ", Rarity = " + rarity 
                + ", Energy Type = " + energyType
                + ", Hit Points = " + hitPoints + " ]");
    }
    /**
     * Tests for equality of two objects. To be equal
     * objects must have the same energyType, hitPoints
     * @return returns true if the objects are equal
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pokemon that = (Pokemon) o;
        return rarity.equals(that.rarity) &&
               Integer.compare(hitPoints, that.hitPoints) == 0;
    }

    /**
     * Returns hash code value for the obj
     * 
     */
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), energyType, hitPoints);
    }
    
}