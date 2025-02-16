/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controller;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 *
 * @author linweihong
 */
public class BillSplittingSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // add how many people to split
        int ppl_cnt = 2;
        
        
        Scanner scanner = new Scanner(System.in); // Create a Scanner object

        System.out.print("Enter the first dish: ");
        Double dish1_cost = Double.parseDouble(scanner.nextLine()); // Read user input as a string

        System.out.print("Enter the second dish: ");
        Double dish2_cost = Double.parseDouble(scanner.nextLine()); // Read user input as a string

        Double subTotal = dish1_cost + dish2_cost; // Read user input as a string
        System.out.println("Subtotal: " + subTotal);
        
        System.out.print("Enter the tax: ");
        Double tax = Double.parseDouble(scanner.nextLine()); // Read user input as a string
        
        Double ori_tax_rate = tax / subTotal;
        BigDecimal bd = new BigDecimal(ori_tax_rate);
        bd = bd.setScale(4, RoundingMode.HALF_UP); // Rounds to 4 decimal places
        double tax_rate = bd.doubleValue();
        
        Double dish1_tax = dish1_cost * tax_rate;
        Double dish2_tax = dish2_cost * tax_rate;
       
        
        System.out.print("Enter the tips: ");
        Double tips = Double.parseDouble(scanner.nextLine()); // Read user input as a string

        Double tips_per_person = tips / ppl_cnt;
        
        
        System.out.println("Dish 1 cost: " + dish1_cost + " + " + tips_per_person +"(tips)" + " + " + dish1_tax + "(tax) = " + (dish1_cost+tips_per_person+dish1_tax));
        System.out.println("Dish 2 cost: " + dish2_cost + " + " + tips_per_person +"(tips)" + " + " + dish2_tax + "(tax) = " + (dish2_cost+tips_per_person+dish2_tax));
        System.out.println("Tax Rate: " + tax_rate);
        
        System.out.println("Payment total: " + (dish1_cost+tips_per_person+dish1_tax+dish2_cost+tips_per_person+dish2_tax));
        

        scanner.close(); // Close the scanner to prevent resource leak
        
        
    }
    
}
