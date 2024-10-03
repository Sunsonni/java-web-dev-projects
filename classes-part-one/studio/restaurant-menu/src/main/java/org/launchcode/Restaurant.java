package org.launchcode;

public class Restaurant {
    public static void main (String[] arg) {
        Integer nextId = 0;
        //creating categories
        Category appetizer = new Category("Appetizer", "A food or drink that stimulates the appetite. Served before a meal.");
        Category mainCourse = new Category("Main Course", "The largest or most important part of a meal.");
        Category dessert = new Category("Dessert", "A sweet course eaten at the end of a meal");

        //creating menu items
        MenuItem jjamppong = new MenuItem(nextId,"Jjamppong", "Spicy Seafood Noodle Soup", 13.95, mainCourse, false);
        nextId++;
        MenuItem jajangbap = new MenuItem(nextId,"Jajang Bap", "Rice with Black Soybean Sauce", 14.95, mainCourse, false);
        nextId++;
        MenuItem japchaeRice = new MenuItem(nextId,"Japchae Rice", "Stir-fried Glass Noodle with Sauce and Rice", 14.95, mainCourse, true);
        nextId++;
        MenuItem wings = new MenuItem(nextId,"Hong Kong Wings in Spicy Sauce", "Fried Chicken Wings in Spicy Sauce", 16.35, appetizer, false);
        nextId++;

        //creating menu and adding items
        Menu paikMenu = new Menu();
        paikMenu.addMenuItem(jjamppong);
        paikMenu.addMenuItem(jajangbap);
        paikMenu.addMenuItem(japchaeRice);
        paikMenu.addMenuItem(wings);

        System.out.println(paikMenu.toString());

        //testing if error pops up
        paikMenu.addMenuItem(jjamppong);

        paikMenu.deleteMenuItem(wings);

        System.out.println(paikMenu.toString());



    }
}
