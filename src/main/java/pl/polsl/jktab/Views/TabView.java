/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.jktab.Views;

import java.util.List;
import java.util.Scanner;
import pl.polsl.jktab.Models.Listing;

/**
 *
 * @author JK
 */
public class TabView {
    /**
     * Console scanner as private field,
     * as it is used in different methods that utilize console readings
     */
    private Scanner sc = new Scanner(System.in);
    
    /**
     * Prints out entire arrayList of lisitngs,
     * uses Listing view static method
     * @see pl.polsl.jktab.Controllers.TabController
     * @param listings arrayList of Listing instaces to be printed
     */
    public static void printListings(List<Listing> listings) {
        for(int i = 0; i < listings.size(); ++i) {
            System.out.print((i + 1) + ". ");
            String price = String.valueOf(listings.get(i).getPrice());
            ListingView.printShort(listings.get(i).getTitle(), price, listings.get(i).isNegotiable());
        }
    }
    
    /**
     * Asks user if he wants create insert new listing
     * If char other than I is inputted returns false
     * @return bool that decides if insert option should be launched later on in controller
     */
    public boolean isInsert() {
        System.out.println("\nWelcome to TAB, Insert \"L\" to see avilable listings or \"I\" to insert your own");
        String input = this.sc.nextLine();
        return input.equals("I");
    }
    
    /**
     * Asks user to input listing number, used to select which details to print out
     * @return user input <strong>as int</strong>, decremented as its used as list index
     */
    public int listingIndex() {
        System.out.println("\nTo get more listing details, insert listing number");
        int input = Integer.parseInt(this.sc.nextLine());
        //TODO - exceptions
        return input - 1;
    }
    
    /**
     * Asks user to input his username, used if the username wasnt provided correctly in args
     * @see pl.polsl.jktab.Controllers.TabController
     * @return user input string
     */
    public String requestUsername() {
        System.out.println("\nInvalid number of arguments, please specify your username");
        return this.sc.nextLine();
    }
    
    /**
     * Asks user to input his contact info, used if the contact wasnt provided correctly in args
     * @see pl.polsl.jktab.Controllers.TabController
     * @return user input string
     */
    public String requestContact() {
        System.out.println("\nInvalid number of arguments, please specify your contact method");
        return this.sc.nextLine();
    }
    
    /**
     * Asks user if he wants to delete displayed listing
     * If char other than D is inputted returns false
     * @return bool used to decide if listing should be deleted
     */
    public boolean requestDelete() {
        System.out.println("If you wish to delete this listing, insert \"D\"");
        String input = this.sc.nextLine();
        return input.equals("D");
    }
}
