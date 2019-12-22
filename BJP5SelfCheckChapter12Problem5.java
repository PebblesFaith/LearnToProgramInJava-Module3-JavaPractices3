/* For each call to the following method, indicate what console output is produced
   for Chapter 5, Self Check, problem 5 onto page number, 826 from my "Building Java
   Programs, A Back to Basics Approach 5e" textbook for my online course "Learn to
   Program in Java" dated on December 21, 2019.

   I had completed, the Chapter 5, Self Check, problem 5 “mystery3” based on the best possible textbook
   instructions posted onto “GitHub” website, as the correct answer key dated on December 21, 2019.

   Completed by Sarai Hannah Ajai
*/
public class BJP5SelfCheckChapter12Problem5 {
    public static void main(String[] args) {
        mystery3(0);
        System.out.println();
        mystery3(1);
        System.out.println();
        mystery3(2);
        System.out.println();
        mystery3(4);
        System.out.println();
        mystery3(5);
        System.out.println();
    }
    public static void mystery3(int n) {
        if (n <= 0) {
            System.out.print("*");
        } else if (n % 2 == 0) {
            System.out.print("(");
            mystery3(n - 1);
            System.out.print(")");
        } else {
            System.out.print("[");
            mystery3(n - 1);
            System.out.print("]");
        }
    }
}
