package org.launchcode.java.demos.lsn1datatypes;
import java.util.Scanner;

public class HelloMethods {

    public static void main(String[] args) {
        Scanner bananaCat = new Scanner(System.in);
        System.out.println("Hey dude whats your name?");
        String myName = bananaCat.nextLine();
        System.out.println("Hello, " + myName + "!");

    }

}