package fpp.lesson4hw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Prob4Test {
    Prob4 prob4 = new Prob4();
    @Test
    void getMax() {
        int[] arr1 = {1, 3, 4, 5, 6};
        int[] arr2 = {6, 99, 100, 1, 0};
        int[] arr3 = {6, 99, -100, 1, -1};
        assertEquals(6, prob4.getMax(arr1));
        assertEquals(100, prob4.getMax(arr2));
        assertEquals(99, prob4.getMax(arr3));
    }
}