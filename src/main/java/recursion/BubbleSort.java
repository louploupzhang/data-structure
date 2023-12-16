package recursion;

import java.util.Arrays;

public class BubbleSort {
    public static void sort(int[] a) {
        bubble(a, a.length - 1);
    }

    //j: right bound of unsorted area
    private static void bubble(int[] a, int j) {
        if (j == 0) return;
        int x=0; //flag to isolate unordered & ordered parts
        for (int i = 0; i < j; i++) {
            if (a[i] > a[i + 1]) {
                int t = a[i];
                a[i] = a[i + 1];
                a[i + 1] = t;
                x = i;
            }
        }
        bubble(a, x);
    }

    public static void main(String[] args) {
        int[] a = {6, 5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(a));
        sort(a);
        System.out.println(Arrays.toString(a));
    }
}
