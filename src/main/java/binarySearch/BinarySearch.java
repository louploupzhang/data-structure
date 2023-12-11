package binarySearch;

public class BinarySearch {
    //Basic
    //  a: sorted array
    //  Time complexity: O(log(n))
    public static int binarySearchBasic(int[] a, int target) {
        int i = 0, j = a.length - 1;
        while (i <= j) {
            int m = (i + j) >>> 1;
            if (target < a[m]) {
                j = m - 1;
            } else if (a[m] < target) {
                i = m + 1;
            } else {
                return m;
            }
        }
        return -1;
    }

    //Alternative
    //  Closed at i, open at j (j is out of the array bound)
    public static int binarySearchAlternative(int[] a, int target) {
        int i = 0, j = a.length;      //1
        while (i < j) {     //2
            int m = (i + j) >>> 1;
            if (target < a[m]) {
                j = m;      //3
            } else if (a[m] < target) {
                i = m + 1;
            } else {
                return m;
            }
        }
        return -1;
    }

    //Balanced
    //  Time complexity: Θ(log(n))
    //  Has better performance on big data input
    public static int binarySearchBalanced(int[] a, int target) {
        int i = 0, j = a.length;
        while (1 < j - i) {
            int m = (i + j) >>> 1;
            if (target < a[m]) {
                j = m;
            } else {
                i = m;
            }
        }
        if (a[i] == target) {
            return i;
        } else {
            return -1;
        }
    }

    //Leftmost
    //  Applied for data that contains duplicates
    //  Return the leftmost index
    public static int binarySearchLeftmost1(int[] a, int target) {
        int i = 0, j = a.length - 1, candidate = -1;
        while (i <= j) {
            int m = (i + j) >>> 1;
            if (target < a[m]) {
                j = m - 1;
            } else if (a[m] < target) {
                i = m + 1;
            } else {
                candidate = m;
                j = m - 1;
            }
        }
        return candidate;
    }

    //  Return the leftmost index that >= target
    //  Application:    ranking = leftmost(target) + 1
    //                  predecessor = leftmost(target) - 1
    public static int binarySearchLeftmost2(int[] a, int target) {
        int i = 0, j = a.length - 1;
        while (i <= j) {
            int m = (i + j) >>> 1;
            if (target <= a[m]) {
                j = m - 1;
            } else {
                i = m + 1;
            }
        }
        return i;
    }

    //Rightmost
    //  Applied for data that contains duplicates
    //  Return the rightmost index
    public static int binarySearchRightmost1(int[] a, int target) {
        int i = 0, j = a.length - 1, candidate = -1;
        while (i <= j) {
            int m = (i + j) >>> 1;
            if (target < a[m]) {
                j = m - 1;
            } else if (a[m] < target) {
                i = m + 1;
            } else {
                candidate = m;
                i = m + 1;
            }
        }
        return candidate;
    }

    //  Return the rightmost index that <= target
    //  Application:    successor = rightmost(target) + 1
    public static int binarySearchRightmost2(int[] a, int target) {
        int i = 0, j = a.length - 1;
        while (i <= j) {
            int m = (i + j) >>> 1;
            if (target <= a[m]) {
                j = m - 1;
            } else {
                i = m + 1;
            }
        }
        return i - 1;
    }
}
