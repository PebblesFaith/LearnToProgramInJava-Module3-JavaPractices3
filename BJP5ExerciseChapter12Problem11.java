/* Write a recursive method call repeat that accepts a string s and an integer n as a parameters
   that returns s concatenated together n times. For example ("hello", 3) returns
   "hellohellohello", and repeat ("ok", 1) returns "ok", and repeat ("bye", 0) returns "".
   String concatenation is an expensive operation, so for an added challenge try to solve
   this problem while performing fewer than n concatenations for Chapter 5, Exercises, problem 11
   onto page number, 833 from my "Building Java Programs, A Back to Basics Approach 5e" textbook
   for my online course "Learn to Program in Java" dated on December 21, 2019.

   I had completed, the Chapter 5, Exercises, problem 11 “repeat” based on the best possible textbook
   instructions posted onto “GitHub” website, as the correct answer key dated on December 21, 2019.

   Completed by Sarai Hannah Ajai
*/

public class BJP5ExerciseChapter12Problem11 {
    public static void main(String[] args) {

        String c = repeat("hi ho! ", 5);
        System.out.print(c);
        System.out.println();
    String i = repeat("Hello", 3);
        System.out.print(i);
        System.out.println();
    String a = repeat("this is fun", 1);
        System.out.print(a);
        System.out.println();
    String b = repeat("wow", 0);
        System.out.print(b);
        System.out.println();

}

    public static String repeat(String s, int n) {
        if (n == 1) {
            return s;
        }
        if (n < 0) {
            throw new IllegalArgumentException();

        } else if (n == 0) {
            return "";

        } else {
            return s + repeat(s, n - 1);
        }
    }
}