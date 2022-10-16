/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.jktab.Models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SuperStudent
 */
public class Tab {
    private List<Listing> listings = new ArrayList<Listing>();

    public List<Listing> getListings() {
        return listings;
    }

    public void setListings(List<Listing> listings) {
        this.listings = listings;
    }
    
}
