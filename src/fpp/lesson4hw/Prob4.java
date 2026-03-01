package fpp.lesson4hw;

public class Prob4 {
    void main(){
        int[] arr =  {5, -3, 6, 1, 9, 4 , 100};
        System.out.println(getMax(arr));
    }

    public  int getMax(int[] arr) {
        return getMaxLocal(arr, 0);
    }

    private int getMaxLocal(int[] arr, int indx) {
        if (arr == null || arr.length == 0) {
            throw new RuntimeException();
        }


        if (arr.length-1 == indx){
            return arr[indx];
        }

        return Math.max(getMaxLocal(arr, indx + 1), arr[indx]);
    }
}
