package binarySearch;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTests {
    @Test
    @DisplayName("binarySearchBasic FOUND")
    public void test1() {
        int[] a = {7, 13, 21, 30, 38, 44, 52, 53};
        assertEquals(0, BinarySearch.binarySearchBasic(a, 7));
        assertEquals(1, BinarySearch.binarySearchBasic(a, 13));
        assertEquals(2, BinarySearch.binarySearchBasic(a, 21));
        assertEquals(3, BinarySearch.binarySearchBasic(a, 30));
        assertEquals(4, BinarySearch.binarySearchBasic(a, 38));
        assertEquals(5, BinarySearch.binarySearchBasic(a, 44));
        assertEquals(6, BinarySearch.binarySearchBasic(a, 52));
        assertEquals(7, BinarySearch.binarySearchBasic(a, 53));
    }

    @Test
    @DisplayName("binarySearchBasic NOTFOUND")
    public void test2() {
        int[] a = {7, 13, 21, 30, 38, 44, 52, 53};
        assertEquals(-1, BinarySearch.binarySearchBasic(a, 0));
    }

    @Test
    @DisplayName("binarySearchAlternative")
    public void test3() {
        int[] a = {7, 13, 21, 30, 38, 44, 52, 53};
        assertEquals(0, BinarySearch.binarySearchAlternative(a, 7));
        assertEquals(1, BinarySearch.binarySearchAlternative(a, 13));
        assertEquals(2, BinarySearch.binarySearchAlternative(a, 21));
        assertEquals(3, BinarySearch.binarySearchAlternative(a, 30));
        assertEquals(4, BinarySearch.binarySearchAlternative(a, 38));
        assertEquals(5, BinarySearch.binarySearchAlternative(a, 44));
        assertEquals(6, BinarySearch.binarySearchAlternative(a, 52));
        assertEquals(7, BinarySearch.binarySearchAlternative(a, 53));

        assertEquals(-1, BinarySearch.binarySearchAlternative(a, 0));
        assertEquals(-1, BinarySearch.binarySearchAlternative(a, 33));
        assertEquals(-1, BinarySearch.binarySearchAlternative(a, 99));
    }

    @Test
    @DisplayName("binarySearchBalanced")
    public void test4() {
        int[] a = {7, 13, 21, 30, 38, 44, 52, 53};
        assertEquals(0, BinarySearch.binarySearchBalanced(a, 7));
        assertEquals(1, BinarySearch.binarySearchBalanced(a, 13));
        assertEquals(2, BinarySearch.binarySearchBalanced(a, 21));
        assertEquals(3, BinarySearch.binarySearchBalanced(a, 30));
        assertEquals(4, BinarySearch.binarySearchBalanced(a, 38));
        assertEquals(5, BinarySearch.binarySearchBalanced(a, 44));
        assertEquals(6, BinarySearch.binarySearchBalanced(a, 52));
        assertEquals(7, BinarySearch.binarySearchBalanced(a, 53));

        assertEquals(-1, BinarySearch.binarySearchBalanced(a, 0));
        assertEquals(-1, BinarySearch.binarySearchBalanced(a, 33));
        assertEquals(-1, BinarySearch.binarySearchBalanced(a, 99));
    }

    @Test
    @DisplayName("binarySearchJava")
    public void test5() {
        int[] a = {2, 5, 8};
        int target = 4;
        int i = Arrays.binarySearch(a, target);
        System.out.println(i);
        if (i < 0) {
            int insertIndex = Math.abs(i + 1);
            int[] b = new int[a.length + 1];
            System.arraycopy(a, 0, b, 0, insertIndex);
            b[insertIndex] = target;
            System.arraycopy(a, insertIndex, b, insertIndex + 1, a.length - insertIndex);
            System.out.println(Arrays.toString(b));
        }
    }

    @Test
    @DisplayName("binarySearchLeftmost")
    public void test6() {
        int[] a = {1, 2, 4, 4, 4, 5, 6, 7};
        assertEquals(0, BinarySearch.binarySearchLeftmost1(a, 1));
        assertEquals(1, BinarySearch.binarySearchLeftmost1(a, 2));
        assertEquals(2, BinarySearch.binarySearchLeftmost1(a, 4));
        assertEquals(5, BinarySearch.binarySearchLeftmost1(a, 5));
        assertEquals(6, BinarySearch.binarySearchLeftmost1(a, 6));
        assertEquals(7, BinarySearch.binarySearchLeftmost1(a, 7));

        assertEquals(-1, BinarySearch.binarySearchLeftmost1(a, 0));
        assertEquals(-1, BinarySearch.binarySearchLeftmost1(a, 3));
        assertEquals(-1, BinarySearch.binarySearchLeftmost1(a, 99));
    }

    @Test
    @DisplayName("binarySearchRightmost")
    public void test7() {
        int[] a = {1, 2, 4, 4, 4, 5, 6, 7};
        assertEquals(0, BinarySearch.binarySearchRightmost1(a, 1));
        assertEquals(1, BinarySearch.binarySearchRightmost1(a, 2));
        assertEquals(4, BinarySearch.binarySearchRightmost1(a, 4));
        assertEquals(5, BinarySearch.binarySearchRightmost1(a, 5));
        assertEquals(6, BinarySearch.binarySearchRightmost1(a, 6));
        assertEquals(7, BinarySearch.binarySearchRightmost1(a, 7));

        assertEquals(-1, BinarySearch.binarySearchRightmost1(a, 0));
        assertEquals(-1, BinarySearch.binarySearchRightmost1(a, 3));
        assertEquals(-1, BinarySearch.binarySearchRightmost1(a, 99));
    }

    @Test
    @DisplayName("binarySearchRecursion")
    public void test8(){
        int[] a = {7,13,21,33,38,44,52,53};
        assertEquals(0, recursion.BinarySearch.search(a,7));
        assertEquals(1, recursion.BinarySearch.search(a,13));
        assertEquals(2, recursion.BinarySearch.search(a,21));
        assertEquals(3, recursion.BinarySearch.search(a,33));
        assertEquals(4, recursion.BinarySearch.search(a,38));
        assertEquals(5, recursion.BinarySearch.search(a,44));
        assertEquals(6, recursion.BinarySearch.search(a,52));
        assertEquals(7, recursion.BinarySearch.search(a,53));

        assertEquals(-1, recursion.BinarySearch.search(a,0));
        assertEquals(-1, recursion.BinarySearch.search(a,15));
        assertEquals(-1, recursion.BinarySearch.search(a,99));
    }
}
