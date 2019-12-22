/* For each call to the following method, indicate what console output is produced
   for Chapter 5, Self Check, problem 3 onto page number, 825 from my "Building Java
   Programs, A Back to Basics Approach 5e" textbook for my online course "Learn to
   Program in Java" dated on December 21, 2019.

   I had completed, the Chapter 5, Self Check, problem 3 “mystery1” based on the best possible textbook
   instructions posted onto “GitHub” website, as the correct answer key dated on December 21, 2019.

   Completed by Sarai Hannah Ajai
*/
public class BJP5SelfCheckChapter12Problem3 {
    public static void main(String[] args) {
        mystery1(1);
        System.out.println();
        mystery1(2);
        System.out.println();
        mystery1(3);
        System.out.println();
        mystery1(4);
        System.out.println();
        mystery1(16);
        System.out.println();
        mystery1(30);
        System.out.println();
        mystery1(100);
        System.out.println();
    }
    public static void mystery1(int n) {
        if (n <= 1) {
            System.out.print(n);
        } else {
            mystery1(n / 2);
            System.out.print(", " + n);
        }
    }
}
