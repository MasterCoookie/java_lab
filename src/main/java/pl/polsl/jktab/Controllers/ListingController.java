/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.jktab.Controllers;

import pl.polsl.jktab.Models.Listing;
import pl.polsl.jktab.Views.ListingView;

/**
 *
 * @author JK
 */
public class ListingController {
    private Listing model;
    private ListingView view;

    public ListingController(Listing model, ListingView view) {
        this.model = model;
        this.view = view;
    }
    
}
