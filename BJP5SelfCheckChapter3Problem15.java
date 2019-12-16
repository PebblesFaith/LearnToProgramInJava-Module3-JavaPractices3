/* Evaluate the following expressions for Chapter 3, Self Check, problem 15 onto page number, 192
   from my "Building Java Programs, A Back to Basics Approach 5e" textbook for my online course
   "Learn to Program in Java" dated on December 15, 2019.

   I had completed, the Chapter 3, Self Check, problem 15 “mathExpressions2” based on the best possible textbook
   instructions posted onto “GitHub” website, as the correct answer key dated on December 15, 2019.

   Completed by Sarai Hannah Ajai
*/

public class BJP5SelfCheckChapter3Problem15 {
    public static void main(String[] args) {
        double grade = 2.7;
        grade = Math.round(grade);
        System.out.println("a = " + grade);
        System.out.println();

        grade = Math.round(grade);
        System.out.println("b = " + grade);
        System.out.println();

        double min = Math.min(grade, Math.floor(2.9));
        System.out.println("c = " + min);
        System.out.println();

        double x = Math.pow(2, 4);
        System.out.println("d = " + x);
        System.out.println();

        x = Math.sqrt(64);
        System.out.println("e = " + x);
        System.out.println();

        int count = 25;
        double f = Math.sqrt(count);
        System.out.println("f = " + count);
        System.out.println();

        count = (int) Math.sqrt(count);
        System.out.println("g = " + count);
        System.out.println();

        int a = Math.abs(Math.min(-1, -3));
        System.out.println("h = " + a);
        System.out.println();

    }
}
