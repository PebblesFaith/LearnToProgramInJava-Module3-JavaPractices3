/* Evaluate the following expressions for Chapter 3, Self Check, problem 13 onto page number, 191
   from my "Building Java Programs, A Back to Basics Approach 5e" textbook for my online course
   "Learn to Program in Java" dated on December 15, 2019.

   I had completed, the Chapter 3, Self Check, problem 13 “mathExpressions” based on the best possible textbook
   instructions posted onto “GitHub” website, as the correct answer key dated on December 15, 2019.

   Completed by Sarai Hannah Ajai
*/


public class BJP5SelfCheckChapter3Problem13 {
    public static void main(String[] args) {
        double a = Math.abs(-1.6);
        System.out.println("a = " + a);
        System.out.println();

        double b = Math.abs(2 + -4);
        System.out.println("b = " + b);
        System.out.println();

        double c = Math.pow(6, 2);
        System.out.println("c = " + c);
        System.out.println();

        double d = Math.pow(5 / 2, 6);
        System.out.println("d = " + d);
        System.out.println();

        double e = Math.ceil(9.1);
        System.out.println("e = " + e);
        System.out.println();

        double f = Math.ceil(115.8);
        System.out.println("f = " + f);
        System.out.println();

        double g = Math.max(7, 4);
        System.out.println("g = " + g);
        System.out.println();

        double h = Math.min(8, 3 + 2);
        System.out.println("h = " + h);
        System.out.println();

        double i = Math.min(-2, -5);
        System.out.println("i = " + i);
        System.out.println();

        double j = Math.sqrt(64);
        System.out.println("j = " + j);
        System.out.println();

        double k = Math.sqrt(76 + 45);
        System.out.println("k = " + k);
        System.out.println();

        double l = 100 + Math.log10(100);
        System.out.println("l = " + l);
        System.out.println();

        double m = 13 + Math.abs(7) - Math.pow(2, 3) + 5;
        System.out.println("m = " + m);
        System.out.println();

        double n = Math.sqrt(16) * Math.max(Math.abs(-5), Math.abs(-3));
        System.out.println("n = " + n);
        System.out.println();

        double o = 7 - 2 + Math.log10(1000) + Math.log(Math.pow(Math.E, 5));
        System.out.println("o = " + o);
        System.out.println();

        double p = Math.max(18 - 5, Math.ceil(4.6 * 3));
        System.out.println("p = " + p);
        System.out.println();
    }
}
