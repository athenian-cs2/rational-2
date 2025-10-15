public class Rational {
  // instance variables: every Rational object will have its own copy
  // of these variables
  public int numerator;
  public int denominator;

  /**
   * Constructor: the special method that will actually create a new Rational object Constructors
   * are always public Constructors have the same name as the class Constructors have no return type
   */
  public Rational(int a, int b) {
    numerator = a;
    denominator = b;
  }

  // *****
  // In the last assignment, we had a RationalUtil class that let us manipulate Rational numbers.
  // Today, instead, we'll be adding functionality to the Rational class itself!
  // *****

  // Example function. This simplifies the Rational itself, instead of producing a separate Rational.
  public void simplify() {
    // Find the greatest common factor of the numerator and denominator.
    // Note: if it is 1, the Rational is already simplified and the below
    // have no effect.
    int commonFactor = gcf(numerator, denominator);
    numerator /= commonFactor;
    denominator /= commonFactor;
  }

  // Another example. Returns whether or not the numerator is greater than or equal
  // to the denominator, making the Rational "improper".
  public boolean isImproper() {
    return (this.numerator >= this.denominator);
  }

  // Returns whether or not the Rational is currently simplified
  // or not
  // Example:
  // Rational r = new Rational(6,12);
  // System.out.println(r.isSimplified()) // false
  public boolean isSimplified() {
    // YOUR CODE HERE
    return false;
  }

  // Calculates the double value of our Rational
  // Example:
  // Rational r = new Rational(3,4);
  // System.out.println(r.calculateDecimalValue()) // 0.75
  public double calculateDecimalValue() {
    // YOUR CODE HERE
    return 0.0;
  }

  // Returns the Rational we get from raising the rational number to an integer power.
  // NOTE: unlike previous methods, this one returns a new Rational.
  // Example:
  // Rational r = new Rational(2,5);
  // System.out.println(r.pow(2)) // 4/25
  public Rational pow(int exponent) {
    // YOUR CODE HERE
    return null;
  }

  // Checks to see if either the numerator or denominator match a given number
  // Example:
  // Rational r = new Rational(3,4);
  // System.out.println(r.contains(3)) // true
  public boolean contains(int x) {
    // YOUR CODE HERE
    return false;
  }

  // Increments the current value of our Rational (increases the value
  // of the current Rational by 1/1)
  // Example:
  // Rational r = new Rational(3, 5);
  // r.increment(); // r is now 8/5
  public void increment() {
    // YOUR CODE HERE
  }

  // Decrements the current value of our Rational (decreases the value
  // of the current Rational by 1/1)
  // Example:
  // Rational r = new Rational(6, 5);
  // r.decrement(); // r is now 1/5
  public void decrement() {
    // YOUR CODE HERE
  }

  // Given an int input representing the new denominator, changes the
  // current Rational to an equivalent fraction with that new denominator
  // You can assume that the numerator will always end up as a whole number
  // Rational r = new Rational(3, 8);
  // r.changeToEquivalentFraction(64); // r is now 24/64 (which is equivalent to 3/8)
  public void changeToEquivalentFraction(int newDenominator) {
    // YOUR CODE HERE
  }

  // Returns whether or not the Rational is a negative number
  // Example:
  // Rational r = new Rational(-3,4);
  // System.out.println(r.isNegative()) // true
  public boolean isNegative() {
    return false; // YOUR CODE HERE
  }

  // Calculates the reciprocal of a Rational number.
  // The reciprocal of 3/4 is 4/3, the reciprocal of 1/2 is 2/1
  // Example:
  // Rational r = new Rational(5,2);
  // System.out.println(r.reciprocal()) // 2/5
  public Rational reciprocal() {
    return null; // YOUR CODE HERE
  }

  // Checks whether the current Rational is the exactly the same as other
  // Example:
  // Rational r = new Rational(2,5);
  // Rational s = new Rational(2,4);
  // System.out.println(r.equals(s)) // false
  public boolean equals(Rational other) {
    return false; // YOUR CODE HERE
  }

  // Rounds the current Rational to the nearest whole number value
  // Example:
  // Rational r = new Rational(3, 2);
  // r.round(); // r is now 2/1
  public void round() {
    // YOUR CODE HERE
  }

  // Finds the greatest common factor between a and b
  // To find the greatest common factor,
  public static int gcf(int a, int b) {
    int maxNum = 1;
    for (int i = 1; i <= a; i++) {
      if (a % i == 0 && b % i == 0) {
        maxNum = i;
      }
    }
    return maxNum;
  }

  // This returns a string representation of a Rational (e.g. "1/2")
  // This method has already been written for you
  @Override
  public String toString() {
    return this.numerator + "/" + this.denominator;
  }
}
