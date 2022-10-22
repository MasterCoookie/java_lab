/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.jktab.Controllers;

import java.util.ArrayList;
import java.util.List;
import pl.polsl.jktab.Models.Listing;
import pl.polsl.jktab.Models.ListingAccessException;
import pl.polsl.jktab.Models.Tab;
import pl.polsl.jktab.Views.ListingView;
import pl.polsl.jktab.Views.TabView;

/**
 *
 * @author JK
 */
public class TabController {
    private Tab model;
    private TabView view;
    
    /**
     * 2 argument constructor, puts together MVC elements
     * @param _model Tab model
     * @param _view Tab view
     */
    public TabController(Tab _model, TabView _view) {
        this.model = _model;
        this.view = _view;
    }
    
    /**
     * Method used to start the Tab app.
     * It works in an loop and runs different methods based on user input recieved form view
     */
    public void startup() {
        List<Listing> listings = this.model.getListings();
        while(true) {
            if(this.view.isInsert()) {

                this.model.addListing(ListingView.createListing(this.model.getUsername(), this.model.getContact()));
          
            } else {
                this.view.printListings(this.model.getListings());
                int index = this.view.listingIndex();
                //TODO - check out of scope
                String price = String.valueOf(listings.get(index).getPrice());
                ListingView.printDetails(listings.get(index).getTitle(), listings.get(index).getDesc(),
                        price, listings.get(index).isNegotiable(), listings.get(index).getAuthorUname(), listings.get(index).getAuthorContact());
                
                if(this.view.requestDelete()) {
                    try {
                        this.model.removeListing(index, this.model.getUsername());
                    } catch(ListingAccessException e) {
                        System.out.println(e.getMessage());
                    }
                }
                
            }
        }
    }
    
    /**
     * If incorrect (different than 2) number of args was passed, requests the arguments using view methods
     * Otherwise it loads them from array
     * @param args list of  arguments, passed from Main method
     * @see pl.polsl.jktab.Jktab
     */
    public void handleUserArgs(String[] args) {        
        if(args.length == 2) {
            this.model.setUsername(args[0]);
            this.model.setContact(args[1]);
        } else {
            this.model.setUsername(this.view.requestUsername());
            this.model.setContact(this.view.requestContact());
        }
    }
    
}
