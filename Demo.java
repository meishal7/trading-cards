/** 
* TITLE: Demo.java 
* AUTHOR: Elena Mudrakova   
* COURSE: CS 112 Intro to CS II - Java  
* MODULE: 1 
* PROJECT: Lab 03_Cards
* LAST MODIFIED: 08/29/2020
* DESCRIPTION: 
* 
*
* ALGORITHM: 
* declare TradingCard[] cards
* declare Scanner obj
* declare  String name, rarity, enType, cardClass
*          int userChoice=0, count = 0, hitPoints
*          double price, avgPrice
*          boolean golden
* declare while() loop
*   display user prompt
*   declare switch()
*   switch(userChoice) case 1 => display user prompt for Pokemon obj obj, take input, 
*   create Pokemon obj, store it in array 
*   switch(userChoice) case 2 => display user prompt for HearthStone obj, take input, 
*   create HearthStone obj, store it in array 
* after while() print an array
* 
* PACKAGES INCLUDED
* import java.util.Scanner for user input
* import java.text.NumberFormat; //fornmatting price
* 
* 
* 
*/   
package L03_Cards;
import java.util.Scanner; //for user input
import java.text.NumberFormat; //fornmatting price


public class Demo {
    /**
     * Calculates avg price of cards in array
     */
    public static double findAvgPrice(TradingCard[] cards){

        int avgPrice = 0;
        double totalPrice = 0;
        int count = 0;
        for(int i =0; i<cards.length; i++){
            if(cards[i] != null){
                count++;
                totalPrice += cards[i].getPrice();

            }
            
            avgPrice = (int)totalPrice / count;
        }
        // Use a class called NumberFormat
        // to format a number (mPrice) as currency
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        System.out.println("Avg price is " + currency.format(avgPrice));
        return avgPrice;

    }
    
    
    public static void main(String[] args) {
        /*********************** DECLARATION AND INITIALIZATION **********************/
        TradingCard[] cards = new TradingCard[10];
        Scanner sc = new Scanner(System.in);
        
        String name, rarity, enType, cardClass;
        int userChoice=0, count = 0, hitPoints;
        double price, avgPrice = 0;
        boolean golden;
        

        while(userChoice != 3){
            //User prompt
            System.out.println("\n*********************** Welcome to Card Center ************************");
            System.out.println("Choose the option below:");
            System.out.println("\n1. Enter a Pokemon Card.");
            System.out.println("2. Enter a Hearthstone Card.");
            System.out.println("3. Exit");

            //Another prompt and take user input
            userChoice = sc.nextInt();
            switch(userChoice){
                case 1: 
                System.out.print("Enter card name: ");
                sc.nextLine();
                name = sc.nextLine();
                System.out.print("Enter card price: ");
                price = sc.nextDouble();
                System.out.print("Enter card rarity: ");
                sc.nextLine();
                rarity = sc.nextLine();
                System.out.print("Enter Pokemon energy type: ");
                
                enType = sc.nextLine();
                System.out.print("How many hit points? ");
                hitPoints = sc.nextInt();
                 // Create a Pokemon obj, put into array
                 cards[count++] = new Pokemon(name, price, rarity, enType, hitPoints);
                break;
                
                case 2: 
                System.out.print("Enter card name: ");
                sc.nextLine();
                name = sc.nextLine();
                System.out.print("Enter card price: ");
                price = sc.nextDouble();
                System.out.print("Enter card rarity: ");
                sc.nextLine();
                rarity = sc.nextLine();
                System.out.print("Enter card class: ");
                cardClass = sc.next();
                System.out.print("Is it golden card? Type \"true\" or \"false\": ");
                golden = sc.nextBoolean();
                //Create EnergyDrink object, put in array
                cards[count++] = new HearthStone(name, price, rarity, cardClass, golden );
                break;
            }
        }

        //Print an array
        System.out.println("**************************** Cards ***********************");
        for(int i=0; i<cards.length; i++){
            
            if (cards[i] != null){
                System.out.println(cards[i]);
            }
        }
        
        Demo.findAvgPrice(cards);
    }
}