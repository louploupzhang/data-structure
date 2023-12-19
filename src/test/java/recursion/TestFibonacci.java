package recursion;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TestFibonacci {
    @Test
    public void test1(){
        Assertions.assertEquals(1, Fibonacci.fibonacci(2));
        Assertions.assertEquals(2, Fibonacci.fibonacci(3));
        Assertions.assertEquals(3, Fibonacci.fibonacci(4));
        Assertions.assertEquals(5, Fibonacci.fibonacci(5));
        Assertions.assertEquals(8, Fibonacci.fibonacci(6));
        Assertions.assertEquals(13, Fibonacci.fibonacci(7));
        Assertions.assertEquals(21, Fibonacci.fibonacci(8));
        Assertions.assertEquals(34, Fibonacci.fibonacci(9));
        Assertions.assertEquals(55, Fibonacci.fibonacci(10));
        Assertions.assertEquals(89, Fibonacci.fibonacci(11));
        Assertions.assertEquals(144, Fibonacci.fibonacci(12));
        Assertions.assertEquals(233, Fibonacci.fibonacci(13));
    }
}
