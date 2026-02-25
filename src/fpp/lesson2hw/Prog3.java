package fpp.lesson2hw;

import java.util.Arrays;

public class Prog3 {
    void main() {
        String[] test = {"horse", "dog", "cat", "horse", "dog", "horse", "horse"};
        String[] result = RemoveDuplicates(test);
        IO.println("Original Array:  " + Arrays.toString(test));
        IO.print("Aray after duplicates are removed:    ");
        IO.println(Arrays.toString(result));
    }

    String[] RemoveDuplicates(String[] arr) {
        if (arr.length == 0) {
            return  null;
        }

        String[] newArr = new String[arr.length];
        int cnt = 1;
        newArr[0] = arr[0];
        for (String x: arr) {

            boolean found = false;
            for (int i = 0; i < cnt; i++) {
                if (newArr[i].equals(x)) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                newArr[cnt] = x;
                cnt += 1;
            }
        }

        return  Arrays.copyOf(newArr, cnt);
    }
}
