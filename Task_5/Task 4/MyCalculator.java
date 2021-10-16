/*
 Name:Chinmoy Datta Priom
   ID: 2012020311
 Section:G
 */

package chinmoydatta;
import java.math.BigInteger;

public class MyCalculator implements AdvancedArithmetic{

    @Override
    public int divisorofSum(int n) {

        int num = 0;
        System.out.println("Divisor of " + n + " are: ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                num = num + i;

                System.out.print(i+ " ");
            }
        }
        return num;

    }

    @Override
    public BigInteger findFactorial(int n) {

        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        return factorial;
    }
}
