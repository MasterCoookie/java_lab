/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.jktab.Views;

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
}
