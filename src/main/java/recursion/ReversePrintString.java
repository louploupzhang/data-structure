package recursion;

public class ReversePrintString {
    public static void f(int n, String s) {
        if (n == s.length()) return;
        f(n + 1, s);
        System.out.println(s.charAt(n));
    }

    public static void main(String[] args) {
        f(0, "bonjour");
    }
}
