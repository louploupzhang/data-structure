package sort;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

import java.util.Arrays;

import static recursion.InsertionSort.sort;

public class InsertionSort {
    @Test
    @DisplayName("Recursive insertion sort")
    public void test1() {
        int[] expected = {1, 2, 3, 4, 5};
        int[] a1 = {5, 4, 3, 2, 1};
        sort(a1);
        Assertions.assertArrayEquals(expected, a1);

        int[] a2 = {4, 5, 3, 2, 1};
        sort(a2);
        Assertions.assertArrayEquals(expected, a2);

        int[] a3 = {3, 1, 4, 2, 5};
        sort(a3);
        Assertions.assertArrayEquals(expected, a3);

        int[] a4 = {1, 2, 3, 4, 5};
        sort(a4);
        Assertions.assertArrayEquals(expected, a4);
    }
}
