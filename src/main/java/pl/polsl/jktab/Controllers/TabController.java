/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.jktab.Controllers;

import java.util.ArrayList;
import java.util.List;
import pl.polsl.jktab.Models.Listing;
import pl.polsl.jktab.Models.Tab;
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
        while(true) {
            if(this.view.isInsert()) {
            Listing listing = new Listing("Test", 12.34f, "adfdasfas", true);
            Listing listing2 = new Listing("Test2", 999.34f, "fffdasff", false);

            List<Listing> listings = new ArrayList<Listing>();
            listings.add(listing);
            listings.add(listing2);
            
        
            this.model.setListings(listings);
        
            this.view.printListings(listings);
          
            } else {
                this.view.printListings(this.model.getListings());
            }
        }
        
    }
    
}
