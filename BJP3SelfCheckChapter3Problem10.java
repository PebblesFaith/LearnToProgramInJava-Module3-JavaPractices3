/* Write a Method Call, printStrings that accepts a String and a number of repetitions, as parameters and prints
   that String given a number of times in the following program for Self Check, problem 10 onto page number, 191
   from my "Building Java Programs, A Back to Basics Approach 5e" textbook" for my online course "Learn to Program
   in Java" dated on December 9, 2019.
I had completed, the Self Check, problem 10 “printStings” based on the best possible textbook
   instructions posted onto “GitHub” website, as the correct answer key dated on December 9, 2019.

   Completed by Sarai Hannah Ajai

 */

public class BJP3SelfCheckChapter3Problem10 {
    public static void main(String[] args) {

        printStrings("abc", 5);
    }
    public static void printStrings(String alphabets,  int five) {
        for (int i = 1; i <= five; i++) {
            System.out.print(alphabets + " ");
        }
    }
}
