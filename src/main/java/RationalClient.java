public class RationalClient {

  public static void main(String[] args) {
    Rational r = new Rational(4, 8);
    // Start with an unsimplified Rational, 4/8
    System.out.println(r);

    r.simplify();

    // Now our Rational has been simplified to 2/4!
    System.out.println(r);

    // Example showing the function to check if a Rational is improper
    Rational improper = new Rational(3, 2);
    System.out.println(improper.isImproper());

    // Add more code here to test your methods as you go!
  }
}
