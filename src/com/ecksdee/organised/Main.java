package com.ecksdee.organised;
import java.util.Arrays;
import java.util.List;
//this class only prints arrays
public class Main {
    public static void main(String[] args) {
        int[][] InitialArray = GivenArray.UsersArray();
        // here is where we are calling a method that creates a two dimensional array
        //here below is where we are printing our array
        for (int i=0; i<InitialArray.length; i++) {
            //this for loop iterates over the Y axis
            for (int j = 0; j < InitialArray[0].length; j++){
                System.out.print(InitialArray[i][j] + " ");
            }
            System.out.println(" ");
        }
        List newList = SpiralArray.spiral();
        System.out.println(Arrays.toString(newList.toArray()));
    }
}