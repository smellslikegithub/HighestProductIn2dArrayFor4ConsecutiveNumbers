package com.company;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class UtilsForParsingTest {

    @Test
    public void getFileContentTestHappyCase() throws FileNotFoundException {
        //Given
        String fileName = "input.txt";
        int[] expectedOutput = // we are checking for the first row only
                {8, 2, 22, 97, 38, 15, 0, 40, 0, 75, 4, 5, 7, 78, 52, 12, 50, 77, 91, 8};

        //When
        int[][] result = UtilsForParsing.retrieveData(fileName);
        //Then
        assertArrayEquals(expectedOutput, result[0]);


    }

}