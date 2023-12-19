package recursion;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Fibonacci {
    //Classic
    public static int f(int n, int[] cache) {
        /*if (n == 0) return 0;
        if (n == 1) return 1;*/
        if (cache[n] != -1) { //The current data is already in the cache
            return cache[n];
        }
        int x = f(n - 1, cache);
        int y = f(n - 2, cache);
        cache[n] = x + y; //[0, 1, ?, -1, -1] fill the cache
        return cache[n];
    }

    //Memorization
    public static int fibonacci(int n) {
        int[] cache = new int[n + 1];
        //Initialize the cache with values -1
        Arrays.fill(cache, -1); //[-1, -1, -1, -1, -1]
        cache[0] = 0;
        cache[1] = 1; //[0, 1, -1, -1, -1]
        return f(n, cache);
    }

    public static void main(String[] args) {
        /*int f = f(8);
        System.out.println(f);*/
    }
}
