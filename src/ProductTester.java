/** I hereby declare upon my word of honor that I have neither given nor
 * received unauthorized help on this work.
 * -Collin Johnson
 * 
 * @author Collin Johnson
 * @version 2/20/2017
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

class ProductTester {

   public static void main(String args[]) throws FileNotFoundException {
       Scanner in = new Scanner(System.in);
       boolean continueRunning = true;
       String userInput;
       String name;
       int quant;
       double price;
       String UPC;
       String expireDate;
       ArrayList<FoodProduct> list = new ArrayList<FoodProduct>();
       
       System.out.print("running"); //chekcing to see where program is getting stuck
       
       File inventory = new File("C:\\Program Files\\Java\\inventory.txt");
       Scanner inputFile = new Scanner(inventory);
       name = inputFile.nextLine();
       quant = in.nextInt();
       price = in.nextDouble();
       UPC = in.nextLine();
       expireDate = in.nextLine();
       FoodProduct inventoryItem = new FoodProduct(name, quant, price, UPC, expireDate);
       list.add(inventoryItem);
                     
       System.out.println("Welcome to the Foods B Us Inventory Management System.");
       System.out.println("The inventory file inventory.txt has been successfully imported.");
       System.out.println("");
       while(continueRunning == true) {           
           System.out.println("Please Choose an option from the following menu: ");
           System.out.println(" U: Upload product information for a delivery");
           System.out.println(" P: Print current inventory sorted by name");
           System.out.println(" E: Lisst the current inventory sorted by expiration date");
           System.out.println(" S: Search for an item by product name");
           System.out.println(" D: Decrement the quantity for a specific item");
           System.out.println(" R: Remove/discontinue an item");
           System.out.println(" Q: Quit the System");
           System.out.print("Enter Choice: ");
           
           userInput = in.nextLine().toLowerCase(); 
           if(userInput.equals("q")) { //quit
                continueRunning = false;
                System.exit(0);
            }else if(userInput.equals("u")) { //upload product info
                System.out.print("Enter Product Name: ");
                name = in.nextLine();
                System.out.print("Enter Product Quantity: ");
                quant = in.nextInt();
                System.out.print("Enter Product Price: ");
                price = in.nextDouble();
                System.out.print("Enter Product UPC: ");
                UPC = in.nextLine();
                System.out.print("Enter Expire Date: ");
                expireDate = in.nextLine();
                System.out.print("");
                FoodProduct newItem = new FoodProduct(name, quant, price, UPC, expireDate);
                list.add(newItem);
                                           
            }else if(userInput.equals("p")) { //print inventory sorted by name
                for(int i=0; i < list.size(); i++) {
                    System.out.println((list.get(i)).getName());
                }
            }else if(userInput.equals("e")) { //print inventory sorted by exp. date
            
            }else if(userInput.equals("s")) { //search for an item by name
            
            }else if(userInput.equals("d")) { //decrement quantity 
            
            }else if(userInput.equals("r")) { //remove/discontinue item
            
            }
                    
       }
       
        
       
       
       
    }
}