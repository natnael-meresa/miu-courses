package fpp.lesson2hw;

public class Prog4 {
    void  main(){
        System.out.println("System Input: " + 5);
        System.out.println("Series 1 Sum: " + calculateNTermsOfSeries1(5));
        System.out.println("Series 2 Sum: " + calculateNTermsOfSeries2(5));
    }

    double calculateNTermsOfSeries1(int n) {
        // 0, 1, 2, 3, 4
        // 1, 3, 5, 7, 9, 11, 13
        boolean addition = true;
        int i = 1;
        double res = 0.0;
        while(n > 0) {

            if (addition) res += ((double) 1 /i);
            else res -= ((double) 1 / i);

            addition = !(addition);
            i += 2;
            n--;
        }

        return res;
    }


    double calculateNTermsOfSeries2(int n) {
        // 2, 4, 8, 16, 32 (2 ** i)
        boolean addition = true;
        double res = 0.0;
        int i = 1;
        while(i <= n) {
            double cur = ((double) i / Math.pow(2, i));
            if (addition) res += cur;
            else res -= cur;

            addition = !(addition);
            i++;
        }

        return res;
    }
}
