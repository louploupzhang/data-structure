package recursion;

public class Sum_StackOverFlow {
    //f(n) = f(n-1) + n
    public static long sum(long n) {
        if (n == 1) return 1;
        return sum(n - 1) + n;
    }

    public static void main(String[] args) {
//        System.out.println(sum(15000));
        long n = 1000000000;
        long sum = 0;
        for (long i = n; i >= 1; i--) {
            sum += i;
        }
        System.out.println(sum);
    }
}
