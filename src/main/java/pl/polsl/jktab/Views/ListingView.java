/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.jktab.Views;

import java.util.Scanner;
import pl.polsl.jktab.Models.Listing;

/**
 *
 * @author JK
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
    
    public static void printDetails(String title, String details, String price, boolean negotiable, String username, String contact) {
        System.out.println(title);
        System.out.print("\nDescryption: ");
        System.out.println(details);
        System.out.print("Listed for ");
        System.out.print(price);
        if(negotiable) {
            System.out.println(", Negotiable");
        }
        System.out.print("\nListed by ");
        System.out.print(username);
        System.out.print(" - ");
        System.out.println(contact);
    }
    
    public static Listing createListing(String authorUname, String authorContact) {
        System.out.println("Insert title");
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        System.out.println("Insert price");
        float price = Float.parseFloat(sc.nextLine());
        System.out.println("Insert descryption");
        String details = sc.nextLine();
        System.out.println("Is the price negotiable?");
        boolean negotiable = sc.nextLine().equals("Y");
        return new Listing(title, price, details, negotiable, authorUname, authorContact);
    }
}
