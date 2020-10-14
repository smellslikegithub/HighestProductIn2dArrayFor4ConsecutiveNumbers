package com.company;

public class MaxProductFinder {
    private final int[][] myArray;
    private int result;
    private int maxProduct;

    public MaxProductFinder(int[][] myArray) {
        this.myArray = myArray;
        result = 0;
        maxProduct = 0;
    }

    public int findMaxmimumProduct() {
        int size = myArray.length;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ((j - 3) >= 0)
                    calculateMaximumProductHorizontal(i, j);

                if ((i - 3) >= 0)
                    calculateMaximumProductVertical(i, j);

                if ((i - 3) >= 0 && (j - 3) >= 0)
                    calculateMaxProductDiagonalBottomRightToTopLeft(i, j);

                if ((i - 3) >= 0 && (j - 1) <= 0)
                    calculateMaxProductDiagonalBottomLeftToTopRight(i, j);
            }
        }
        return maxProduct;
    }

    public void calculateMaxProductDiagonalBottomLeftToTopRight(int i, int j) {
        result = myArray[i][j] * myArray[i - 1][j + 1] *
                myArray[i - 2][j + 2] * myArray[i - 3][j + 3];

        if (maxProduct < result)
            maxProduct = result;
    }

    public void calculateMaxProductDiagonalBottomRightToTopLeft(int i, int j) {
        result = myArray[i][j] * myArray[i - 1][j - 1] *
                myArray[i - 2][j - 2] * myArray[i - 3][j - 3];

        if (maxProduct < result)
            maxProduct = result;
    }

    public void calculateMaximumProductVertical(int i, int j) {
        result = myArray[i][j] * myArray[i - 1][j] *
                myArray[i - 2][j] * myArray[i - 3][j];

        if (maxProduct < result)
            maxProduct = result;
    }

    public void calculateMaximumProductHorizontal(int i, int j) {
        result = myArray[i][j] * myArray[i][j - 1] *
                myArray[i][j - 2] * myArray[i][j - 3];
        if (maxProduct < result)
            maxProduct = result;
    }

}
