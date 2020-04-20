package com.ecksdee.organised;
import java.util.ArrayList;
import java.util.List;
public class SpiralArray {
    public static List<Integer> spiral() {
        //this class processes the array
        int[][] ArrayInQuestion = GivenArray.UsersArray();
        int x = ArrayInQuestion[0].length;
        int y = ArrayInQuestion.length;
        //int d = 0;
        int f = 1;
       // int h = 2;
        List<Integer> list = new ArrayList<>();
        int k = list.size();
        //this is the first iteration only on the x axis
        for (int z: ArrayInQuestion[0]){
               list.add(z);
        }
        //this loop executes until list's elements count equals array's number of elemends
        while(true){
                for (int newDown = f; newDown < y - (f-1); newDown++) {
                    if (CheckNumberOfElements(list.size(),x, y)) break;
                list.add(ArrayInQuestion[newDown][x - f]);
            }
                for (int left = x - (f+1); left >= (f-1); left--) {
                    if (CheckNumberOfElements(list.size(),x, y)) break;
                list.add(ArrayInQuestion[y - f][left]);
            }
            for (int up = y - (f+1); up >= f; up--) {
                if (CheckNumberOfElements(list.size(),x, y)) break;
                list.add(ArrayInQuestion[up][f-1]);
            }
            for (int newRight = f; newRight <= x - (f+1); newRight++) {
                if (CheckNumberOfElements(list.size(),x, y)) break;
                list.add(ArrayInQuestion[f][newRight]);
            }
            if (CheckNumberOfElements(list.size(),x, y)) break;
            //d++;
            f++;
            //h++;
        }
    return list;
    }
    public static boolean CheckNumberOfElements(int size, int x, int y){
        return size >= x * y;
    }

}