package fpp.lesson4hw;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Prob3Test {
    Prob3 prob3 = new Prob3();
    @Test
    void isPalindrome() {
        assertFalse(prob3.isPalindrome(1122));
        assertFalse(prob3.isPalindrome(123456));
        assertFalse(prob3.isPalindrome(2345));
        assertTrue(prob3.isPalindrome(112211));
        assertTrue(prob3.isPalindrome(11111));
        assertTrue(prob3.isPalindrome(1112222111));
        assertTrue(prob3.isPalindrome(99233299));
    }
}