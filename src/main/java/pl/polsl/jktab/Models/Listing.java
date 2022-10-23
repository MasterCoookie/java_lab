/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.jktab.Models;

import java.io.Serializable;

/**
 * Class that represents a single listing, or entry created in a notice board (Tab),
 * it inherites form Serializable, so that list of its instances can be saved to a file easly 
 * @author JK
 * @version f1.0
 */
public class Listing implements Serializable {
    private String title;
    private float price;
    private String desc;
    private boolean negotiable;
    private String authorUname;
    private String authorContact;
    
    /**
     * 6-argument constructor, used when creating a new Listing
     * @param title listing title
     * @param price asked price
     * @param desc detailed, longer listing descryption
     * @param negotiable if true, it means that price can be negotiated
     * @param authorUname name of listing author
     * @param authorContact contact info provided by author
     */
    public Listing(String title, float price, String desc, boolean negotiable, String authorUname, String authorContact) {
        this.title = title;
        this.price = price;
        this.desc = desc;
        this.negotiable = negotiable;
        this.authorUname = authorUname;
        this.authorContact = authorContact;
    }

    public String getAuthorUname() {
        return authorUname;
    }

    public String getAuthorContact() {
        return authorContact;
    }

    public void setAuthorUname(String authorUname) {
        this.authorUname = authorUname;
    }

    public void setAuthorContact(String authorContact) {
        this.authorContact = authorContact;
    }
    
    public String getTitle() {
        return title;
    }

    public float getPrice() {
        return price;
    }

    public String getDesc() {
        return desc;
    }

    public boolean isNegotiable() {
        return negotiable;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setNegotiable(boolean negotiable) {
        this.negotiable = negotiable;
    }
}
