package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();

        Comparator flavorComparator = new FlavorComparator();
        Comparator coneComparator = new ConeComparator();
        flavors.sort(flavorComparator);
        cones.sort(coneComparator);

        System.out.println("Flavors:");
        for(Flavor flavor : flavors) {
            System.out.println(flavor.getName());
        }
        System.out.println("------------------");
        System.out.println("Cones:");
        for(Cone cone : cones) {
            System.out.println(cone.getName() + " $" + cone.getCost());
        }

    }
}
