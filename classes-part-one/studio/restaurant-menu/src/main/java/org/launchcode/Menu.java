package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    public ArrayList< MenuItem> menuItems = new ArrayList<MenuItem>();
    public Date lastUpdated = new Date();

    public void addMenuItem (MenuItem item) {
        if(!(menuItems.contains(item))){
            menuItems.add(item);
            updateLastUpdated();
        } else {
            System.out.println("Menu Item already exists!");
        }
    }

    public void deleteMenuItem(MenuItem item){
        //checks if item is in arraylist
        if(menuItems.contains(item)){
            //gets index of item them item from array
            int itemIndex = menuItems.indexOf(item);
            MenuItem arrayItem = menuItems.get(itemIndex);
            //checks if it is the correct item then removes it.
            if(arrayItem.equals(item)) {
                menuItems.remove(item);
                updateLastUpdated();
            } else {
                System.out.println("An error occurred trying to remove item");
            }
        } else {
            System.out.println("Item does not exist in Menu.");
        }

    }

    public void updateLastUpdated(){
        this.lastUpdated = new Date();
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuItems=" + menuItems.toString() +
                ", lastUpdated=" + lastUpdated +
                '}';
    }
}
