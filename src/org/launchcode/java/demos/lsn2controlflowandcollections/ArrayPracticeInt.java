package org.launchcode.java.demos.lsn2controlflowandcollections;

public class ArrayPracticeInt {

    public static void main(String[] args) {
        int[] integerArray = {1, 1, 2, 3, 5, 8};
        System.out.println("Odd Numbers: ");
        for (int i = 0; i < integerArray.length; i++) {
            if (integerArray[i] % 2 != 0) {
                System.out.println(integerArray[i]);
            }
        }
    }
}