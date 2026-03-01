package fpp.lesson4hw;

import java.util.Arrays;

public class Porb2 {
    void main(){
        int[] arr = {1, 3, 5, 7, 9, 13};
        System.out.println("Original Array : " + Arrays.toString(arr));
        reverseIntArr(arr);
        System.out.println("Reversed Array : " + Arrays.toString(arr));
    }

    public void reverseIntArr(int[] arr) {
         reverseIntArrLocal(arr, 0, arr.length-1);
    }

    private void reverseIntArrLocal(int[] arr, int lft, int rgt) {
        if (lft > rgt) {
            return;
        }

        int tmp = arr[lft];
        arr[lft] = arr[rgt];
        arr[rgt] = tmp;

        reverseIntArrLocal(arr, lft +1, rgt - 1);
    }
}
