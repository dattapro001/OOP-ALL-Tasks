/*
 Name: Chinmoy Datta Priom
   ID:2012020311
 Section:G
 */

package chinmoydatta;
import java.util.Scanner;

public class Main {
     public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        MyCalculator myCalculator = new MyCalculator();

        System.out.print("Enter any Number from 1-100 for calculate Sum: ");
        int num = in.nextInt();

        System.out.print("Enter any number from 1-50 for calculate Factorial: ");
        int f = in.nextInt();

        System.out.println("\nSum of Divisor is: " + myCalculator.divisorofSum(num));
        System.out.println("\nFactorial is: " + myCalculator.findFactorial(f));

    }
}