/* Write a method call writeNums that takes an integer n as a parameter and pring to the console
   the first n integers starting with 1 in sequential order, separated by commas for Chapter 5,
   Exercises, problem 2 onto page number, 831 from my "Building Java Programs, A Back to Basics
   Approach 5e" textbook for my online course "Learn to Program in Java" dated on December 21, 2019.

   I had completed, the Chapter 5, Exercises, problem 2 “writeNums” based on the best possible textbook
   instructions posted onto “GitHub” website, as the correct answer key dated on December 21, 2019.

   Completed by Sarai Hannah Ajai
*/
public class BJP5ExerciseChapter12Problem2 {
    public static void main(String[] args) {
        writeNums(5);
        System.out.println();
        writeNums(12);
    }
    public static void writeNums(int n) {
        if (n == 0){
            throw new IllegalArgumentException();
        }
        else if (n == 1) {
            System.out.print(n);
        } else {
            writeNums(n-1);
            System.out.print(", " + n);
        }
    }
}
