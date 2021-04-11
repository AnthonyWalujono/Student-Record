/**
  * A class that calcualtes harmonic equation using loop and recursion.
  * @author Anthony Walujono
  * @version 1.0
*/
public class Harmonic {

  /**
    * Calculates recursive using while loop
    * @param n numbers that user input
    * @return iterativeSum which is a double
  */
  public static double calcIterativeHarmonic(int n) {
    double iterativeSum = 0.0;
    if (n == 1) {
      return 1.0;
    }
    else {
      while (n >= 1) {
        System.out.print(1.0/n + " ");
        iterativeSum += 1.0/n;
        n--;
      }
    }
        return iterativeSum;
  }

  /**
    * Calculates recursive using recursion
    * @param n numbers that user input
    * @return recursiveSum which is a double
  */
  public static double calcRecursiveHarmonic(int n) {
    double recursiveSum = 0.0;
    if (n >= 1) {
      System.out.print(1.0/n + " ");
      recursiveSum = 1.0/n + calcRecursiveHarmonic(n-1);
    }
    return recursiveSum;
  }

  /**
    * Asks for once, creating an Harmonic object
    * to calculate recursive numbers using Harmonic's
    * calcIterativeHarmonic() and calcRecursiveHarmonic().
    * @param args command-line arguments
    * @see Harmonic#calcIterativeHarmonic()
    * @see Harmonic#calcRecursiveHarmonic()
    */

  public static void main(String[] args) {
    Harmonic h1 = new Harmonic();
    System.out.println(h1.calcIterativeHarmonic(20));
    System.out.println();
    System.out.println(h1.calcRecursiveHarmonic(20));
  }

}
