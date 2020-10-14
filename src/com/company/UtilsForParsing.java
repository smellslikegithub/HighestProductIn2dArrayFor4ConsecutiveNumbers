package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class UtilsForParsing {
    private UtilsForParsing() {

    }

    public static int[][] retrieveData(String fileName) throws FileNotFoundException {

        Scanner sc = getFileContent(fileName);
        int rows = 20;
        int columns = 20;
        int[][] myArray = new int[rows][columns];
        while (sc.hasNextLine()) {
            for (int i = 0; i < myArray.length; i++) {
                String[] line = sc.nextLine().replaceAll("[\"\\\\n\"]", "").trim().split(" ");

                for (int j = 0; j < line.length; j++) {
                    myArray[i][j] = Integer.parseInt(line[j]);
                }
            }
        }
        return myArray;
    }
    public static Scanner getFileContent(String fileName) throws FileNotFoundException {
        return new Scanner(new BufferedReader(new FileReader(fileName)));
    }

}
