package org.launchcode.java.studios.restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private String restaurantName;
    private ArrayList<MenuItem> forSale;
    private Date updated;

    public Menu(String restaurantName) {
        this.restaurantName = restaurantName;
        this.updated = new Date();
        this.forSale = new ArrayList<>();
    }

    public boolean addItem(String itemName, String itemDescription, String category, Double price) {
        MenuItem newAddition = new MenuItem(itemName, itemDescription, category, price);
        if (forSale.contains(newAddition)) {
            return false;
        }
        forSale.add(newAddition);
        return true;
    }

    public boolean removeItem(String itemName) {
        for (MenuItem item : forSale) {
            if (item.toString().contains(itemName)) {
                forSale.remove(item);
                return true;
            }
        }
        return false;
    }

    public void printMenu() {
        this.toString();
    }

    public void printCategory(String category) {
        String response = "";
        for (MenuItem item : forSale) {
            if (item.toString().contains("(" + category + ")")) {
                response += item.toString();
            }
        }
    }

    public String printItem(String itemName, String description, String category) {
        MenuItem selection = new MenuItem(itemName, description, category, 0.00);
        for (MenuItem item : forSale) {
            if (item.equals(selection)) {
                return item.toString();
            }
        }
        return "That item was not found";
    }

    public Date getUpdated() {
        return updated;
    }

    @Override
    public String toString() {

        String response = "Appetizers: ";
        for (MenuItem item : forSale) {
            if (item.toString().contains("(Appetizer)")) {
                response += item.toString() + "/n";
            }
        }

        response += "Main Courses: ";
        for (MenuItem item : forSale) {
            if (item.toString().contains("(Main Course)")) {
                response += item.toString() + "/n";
            }
        }

        response += "Desserts: ";
        for (MenuItem item : forSale) {
            if (item.toString().contains("(Dessert)")) {
                response += item.toString() + "/n";
            }
        }

        return response;
    }
}
