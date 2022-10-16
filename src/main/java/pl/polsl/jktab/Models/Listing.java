/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.jktab.Models;

/**
 *
 * @author SuperStudent
 */
public class Listing {
    private String title;
    private float price;
    private String desc;
    private boolean negotiable;

    public Listing(String title, float price, String desc, boolean negotiable) {
        this.title = title;
        this.price = price;
        this.desc = desc;
        this.negotiable = negotiable;
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
