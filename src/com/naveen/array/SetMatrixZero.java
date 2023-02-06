package com.naveen.array;

import java.util.HashMap;
import java.util.Map;

public class SetMatrixZero {

    public static void main(String[] args) {
        int matrix[][] = {{1,1,1}, {1,0,1}, {1,1,1}};
        setMatrixZero(matrix);
    }

    private static void setMatrixZero(int[][] matrix) {

        Map<Integer, Integer> storeIndex = new HashMap<>();

        for(int i=0; i<matrix.length; i++)
        {
            for(int j=0; j<matrix[0].length; j++)
            {
                if(matrix[i][j] == 0)
                    storeIndex.put(i,j);
            }
        }

        for (int i=0; i<matrix.length; i++)
        {
            for (int j=0; j<matrix[0].length; j++)
            {
                if(storeIndex.containsKey(i))
                    matrix[i][j] = 0;
                if(storeIndex.containsValue(j))
                    matrix[i][j] = 0;
            }
        }

        for(int i=0; i<matrix.length; i++)
        {
            for (int j = 0; j < matrix[0].length; j++)
            {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

    }

}