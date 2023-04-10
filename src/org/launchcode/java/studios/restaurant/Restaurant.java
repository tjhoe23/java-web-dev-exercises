package org.launchcode.java.studios.restaurant;

import org.w3c.dom.ls.LSOutput;

public class Restaurant {
    public static void main(String[] args) {
//String name, String description, double price, String category, Boolean isNew
        MenuItem item1 = new MenuItem("Cheese Bread Sticks", "Baked bread with cheese", 11.0, "appetizer", true);
        MenuItem item2 = new MenuItem("Pesto Meat Balls", "Fried Cheese filled meat balls with pesto sauce", 18.0, "appetizer", true);
        MenuItem item3 = new MenuItem("Baked Rigatoni", "Spicy Italian Sausage in mozzarella and ricotta", 24.0, "main", true);
        MenuItem item4 = new MenuItem("Margherita Pizza", "Fresh mozzarella and basil on our authentic pizza sauce", 29.0, "main", true);
        MenuItem item5 = new MenuItem("Tiramisu", "Rich layers of espresso, cocoa, and mascarpone", 17.0, "dessert", true);
        MenuItem item6 = new MenuItem("Tiramisu", "Rich layers of espresso, cocoa, and mascarpone", 17.0, "dessert", true);

        Menu menu = new Menu();

        menu.addItem(item1);
        menu.addItem(item2);
        menu.addItem(item3);
        menu.addItem(item4);
        menu.addItem(item5);

        System.out.println(menu);
//        System.out.println(item1);
//        menu.removeItem(item4);
//        System.out.println(menu);

    }
}

