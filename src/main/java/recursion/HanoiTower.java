package recursion;

import java.util.LinkedList;

public class HanoiTower {
    static LinkedList<Integer> a = new LinkedList<>();
    static LinkedList<Integer> b = new LinkedList<>();
    static LinkedList<Integer> c = new LinkedList<>();

    static void init(int n) {
        for (int i = n; i >= 1; i--) {
            a.addLast(i);
        }
    }

    //n: plates
    //a: original pos
    //b: temp pos
    //c: target pos
    static void move(int n, LinkedList<Integer> a, LinkedList<Integer> b, LinkedList<Integer> c) {
        if (n == 0) return;
        move(n - 1, a, c, b); //Move the n-1 tower from a to b, c is used as a temp pos
        c.addLast(a.removeLast()); //Move from a to c
        print();
        move(n - 1, b, a, c); //Move the n-1 tower from b to c, a is used as a temp pos
    }

    public static void main(String[] args) {
        init(3);
        print();
        move(3, a, b, c);
    }

    private static void print() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("---------------------------");
    }
}
