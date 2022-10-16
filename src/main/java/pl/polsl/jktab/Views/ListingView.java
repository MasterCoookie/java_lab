/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.jktab.Views;

import java.util.Scanner;
import pl.polsl.jktab.Models.Listing;

/**
 *
 * @author SuperStudent
 */
public class ListingView {
    public static void printShort(String title, String price, boolean negotiable) {
        System.out.print(title);
        System.out.print(" | ");
        System.out.print(price);
        System.out.print("$ ");
        if(negotiable) {
            System.out.println(" Negotiable");
        }
    }
    
    public static void printDetails(String title, String details, String price, boolean negotiable) {
        System.out.println(title);
        System.out.print("Descryption: ");
        System.out.println(details);
        System.out.print("Listed for ");
        System.out.print(price);
        if(negotiable) {
            System.out.println(", Negotiable");
        }
    }
    
    public static Listing createListing() {
        System.out.println("Insert title");
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        System.out.println("Insert price");
        float price = Float.parseFloat(sc.nextLine());
        System.out.println("Insert descryption");
        String details = sc.nextLine();
        System.out.println("Is the price negotiable?");
        boolean negotiable = sc.nextLine().equals("Y");
        return new Listing(title, price, details, negotiable);
    }
}
