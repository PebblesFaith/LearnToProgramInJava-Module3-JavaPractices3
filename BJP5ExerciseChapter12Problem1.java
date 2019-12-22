/* Write a recursive method called starString that accepts an integer as a parameter and prints to
   the console a string of stars (asterisks) that is 2 to the nth power long for Chapter 5,
   Exercises, problem 1 onto page number, 831 from my "Building Java Programs, A Back to Basics
   Approach 5e" textbook for my online course "Learn to Program in Java" dated on December 21, 2019.

   I had completed, the Chapter 5, Exercises, problem 1 “starString” based on the best possible textbook
   instructions posted onto “GitHub” website, as the correct answer key dated on December 21, 2019.

   Completed by Sarai Hannah Ajai
*/
public class BJP5ExerciseChapter12Problem1 {
    public static void main(String[] args) {

        starString(0, 2);
        System.out.println("*");
        starString(1, 2);
        System.out.println("**");
        starString(2, 2);
        System.out.println("****");
        starString(3, 2);
        System.out.println("********");
        starString(4, 2);
        System.out.println("****************");
    }
    public static double starString(double a, double b) {
        if (a == 0) {
            return 1.0;
        } if (a == 0) {
            throw new IllegalArgumentException(
                    "It's impossible to raise 0 to the power of a negative number");
        } else {
            return Math.pow(a, b);
        }

    }
}
