package fpp.lesson2hw;

public class Prog5 {
    void main() {
        int[] test = {2, 21, 3, 45, 0, 12, 18, 6, 3, 1, 0, 22};
        secondMain(test);
    }

    public  static  void  secondMain(int[] arrayOfInts){
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int x : arrayOfInts) {
            if (x < firstMin) {
                secondMin = firstMin;
                firstMin = x;
            } else if (x < secondMin && x != firstMin){
                secondMin = x;
            }
        }

        IO.println("Second Min: " + secondMin);
    }
}
