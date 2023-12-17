package recursion;

public class InsertionSort {
    public static void sort(int[] a) {
        insertion(a, 1); //low should be 1 because the first element is considered as sorted
    }

    private static void insertion(int[] a, int low) {
        if (low == a.length) return;

        int t = a[low];
        int i = low - 1; //Border pointer's index for the sorted part

        //Find the 1st element that < t
        while (i >= 0 && a[i] > t) { //Check i>=0 in order to jump out of the loop when it moves to a[0]
            a[i + 1] = a[i]; //Make space for the insertion
            i--;
        }
        //Insertion position found
        a[i + 1] = t;

        insertion(a, low + 1);
    }
}
