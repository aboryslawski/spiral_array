package com.ecksdee.organised;
public class GivenArray {
    public static int[][] UsersArray() {
        //this class only contains an array to be processed
        int g = 73;
        int h = 8;
        int[][] twoD_arr = new int[g][h];
            for (int i = 0; i < g; i++) {
                    for (int j = 0; j < h; j++) {
                        twoD_arr[i][j] = (2*i^2+3*j) + 10;
                    }
            }
        return twoD_arr;
    }
}