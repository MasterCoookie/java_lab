/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.jktab.Controllers;

import java.util.ArrayList;
import java.util.List;
import pl.polsl.jktab.Models.Listing;
import pl.polsl.jktab.Models.Tab;
import pl.polsl.jktab.Views.ListingView;
import pl.polsl.jktab.Views.TabView;

/**
 *
 * @author SuperStudent
 */
public class TabController {
    private Tab model;
    private TabView view;
    
    public TabController(Tab _model, TabView _view) {
        this.model = _model;
        this.view = _view;
    }
    
    public void startup() {
        List<Listing> listings = this.model.getListings();
        while(true) {
            if(this.view.isInsert()) {

                this.model.addListing(ListingView.createListing());
          
            } else {
//                List<Listing> listings = this.model.getListings();
                this.view.printListings(this.model.getListings());
                int index = this.view.listingIndex();
                //TODO - check out of scope
                String price = String.valueOf(listings.get(index).getPrice());
                ListingView.printDetails(listings.get(index).getTitle(), listings.get(index).getDesc(), price, listings.get(index).isNegotiable());
            }
        }
    }
    
    public void handleUserArgs(String[] args) {
        int numberOfParams = args.length;
        
        if(args.length == 2) {
            this.model.setUsername(args[0]);
            this.model.setContact(args[1]);
        } else {
            this.model.setUsername(this.view.requestUsername());
            this.model.setContact(this.view.requestContact());
        }
    }
    
}
