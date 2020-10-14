package com.company;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        int[][] myArray = UtilsForParsing.retrieveData("input.txt");

        MaxProductFinder m = new MaxProductFinder(myArray);
        System.out.print(m.findMaxmimumProduct());
    }
}
