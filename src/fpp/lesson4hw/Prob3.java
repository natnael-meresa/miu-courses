package fpp.lesson4hw;

public class Prob3 {
    public boolean isPalindrome(int x) {
        int tmp = x;
        int cnt =  0;
        while (tmp > 0) {
            cnt += 1;
            tmp = tmp / 10;
        }
        return isPalindromeLocal(x, 1, cnt);
    }


    private boolean isPalindromeLocal(int x, int lst, int mst){
        if (lst > mst) {
            return true;
        }

        int tmp = x;
        int cnt = 0;
        int lstNum = -1;
        int mstNum = -2;
        while (cnt < mst) {
            int num = tmp % 10;
            tmp /= 10;
            cnt += 1;

            if (cnt == lst) {
                lstNum = num;
            }
            if (cnt == mst) {
                mstNum = num;
            }
        }

        return (lstNum == mstNum) && isPalindromeLocal(x, lst + 1, mst - 1);
    }

    void main() {
        System.out.println(isPalindrome(223322));
    }

}
