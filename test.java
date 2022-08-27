// test shit here. import things below this and the next line. (line 3)



public class test {
    public static void main(String[] args) {
        System.out.println("Hello World!\nJava is a piece of shit language."); /** println, not printIn you fucking retard. that's a lowercase L. */
        testFuck(1, 2);
    }

    public static String addFraction(int numerator, int denominator) {
        int gcd = 1;

        int numerator2 = 1;
        int denominator2 = 2;

        for (int i = 1; i <= numerator && i <= denominator; ++i) {
            if(numerator % i == 0 && denominator % i == 0) {
                gcd = i;
            }
        }
        int lcm = (numerator * denominator) / gcd;
        System.out.println(lcm);
        return "3";
    }

    public static void testFuck(int numerator, int denominator) {
        int gcd = 1;

        int numerator1 = 1;
        int denominator2 = 2;

        for (int i = 1; i <= denominator && i <= denominator2; ++i) {
            if(denominator % i == 0 && denominator2 % i == 0) {
                gcd = i;
            }
        }
        int lcd = (numerator * denominator) / gcd;

        int finalNumerator1 = numerator * denominator2;
        int finalNumerator2 = numerator1 * denominator;

        int addedNumerators = finalNumerator1 + finalNumerator2;

        System.out.println(addedNumerators + "/" + lcd);
    }
}