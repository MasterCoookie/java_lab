/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.jktab.Models;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SuperStudent
 */
public class Tab {
    private List<Listing> listings = new ArrayList<Listing>();
    private String username;
    private String contact;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getUsername() {
        return username;
    }

    public String getContact() {
        return contact;
    }

    public Tab() {
        this.deserializeListings();
    }

    public List<Listing> getListings() {
        return listings;
    }

    public void setListings(List<Listing> listings) {
        this.listings = listings;
    }
    
    public void addListing(Listing listing) {
        this.listings.add(listing);
        this.serializeListings();
    }
    
    public void removeListing(int index, String username)
    throws ListingAccessException {
        
    }
    
    private void serializeListings() {
        try {
            FileOutputStream outputStream = new FileOutputStream("listings_list");
        
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

            objectOutputStream.writeObject(this.listings);
            objectOutputStream.close();
            outputStream.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
    
    private void deserializeListings(){
        try {
            FileInputStream inputStream = new FileInputStream("listings_list");
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);

            this.listings = (ArrayList) objectInputStream.readObject();

            objectInputStream.close();
            inputStream.close();
        } catch (IOException | ClassNotFoundException ioe) {
          ioe.printStackTrace();
          this.listings = new ArrayList<Listing>();
        }
    }
}

class ListingAccessException extends Exception {
    public ListingAccessException(String msg) {
        super(msg);
    }
}
