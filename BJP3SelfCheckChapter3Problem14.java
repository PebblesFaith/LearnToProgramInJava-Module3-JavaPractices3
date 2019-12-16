/* What output is produced by the following program for Chapter 3, Self Check, problem 14 onto page number, 192
   from my "Building Java Programs, A Back to Basics Approach 5e" textbook for my online course "Learn to
   Program in Java" dated on December 14, 2019.

   I had completed, the Chapter 3, Self Check, problem 14 “MysteryReturn” based on the best possible textbook
   instructions posted onto “GitHub” website, as the correct answer key dated on December 14, 2019.

   Completed by Sarai Hannah Ajai
*/

public class BJP3SelfCheckChapter3Problem14 {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int z = 3;
        z = mystery(x, z, y);
        System.out.println(x + " " + y + " " + z);
        x = mystery(z, z, x);
        System.out.println(x + " " + y + " " + z);
        x = mystery(y, y, z);
        System.out.println(x + " " + y + " " + z);
    }
    public static int mystery(int z, int x, int y) {
        z--;
        x = 2 * y + z;
        y = x - 1;
        System.out.println(y + " " + z);
        return x;
    }
}
