package org.launchcode.java.studios.restaurant;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

public class Menu {

    private Date lastUpdated = new Date();
    private ArrayList<MenuItem> menuItems = new ArrayList<>();

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    @Override
    public String toString() {
        StringBuilder appetizer = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("appetizer")) {
                appetizer.append("\n" + item.toString());
            }
        }
        StringBuilder main = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("main")) {
                main.append("\n" + item.toString());
            }
        }
        StringBuilder dessert = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("dessert")) {
                dessert.append("\n" + item.toString());
            }
        }
        return "TONY'S ITALIA MENU\n" +
                "\nAPPETIZERS\n" + appetizer.toString() + "\n" +
                "\nMAIN COURSES\n" + main.toString() + "\n" +
                "\nDESSERTS\n" + dessert.toString() + "\n";
    }

    void addItem(MenuItem item) {
        menuItems.add(item);
        lastUpdated = new Date();
    }

    void removeItem(MenuItem item) {
        menuItems.remove(item);
        lastUpdated = new Date();
    }
}

