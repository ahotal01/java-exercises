package org.launchcode.java.studios.restaurant;

import java.util.Objects;

public class MenuItem {
    private String itemName;
    private String description;
    private String category;
    private Double price;
    private boolean isNew;

    public MenuItem(String itemName, String description, String category, Double price) {
        this.itemName = itemName;
        this.description = description;
        this.category = category;
        this.price = price;
        this.isNew = true;
    }

    public boolean newItem() {
        return isNew;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return itemName.equals(menuItem.itemName) &&
                description.equals(menuItem.description) &&
                category.equals(menuItem.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemName, description, category);
    }

    @Override
    public String toString() {
        String response = " ";
        String priceString = price.toString();
        if (isNew) {
            response += "New! /n";
        }
        response += "(" + category + ") " + itemName + ": " + description + "/n Price: " + priceString;
        return response;
    }
}
