/* What output is produced by the following program for Self Check, problem 7 onto page number, 189 to 190 from my
   "Building Java Programs, A Back to Basics Approach 5e" textbook" for my online course "Learn to Program
   in Java" dated on December 6, 2019.

   I had completed, the Self Check, problem 7 “MysteryWho” based on the best possible textbook
   instructions posted onto “GitHub” website, as the correct answer key dated on December 6, 2019.

   Completed by Sarai Hannah Ajai
 */

public class BJP3SelfCheckChapter3Problem7 {
    public static void main(String[] args) {
        String whom = "her";
        String who = "him";
        String it = "who";
        String he = "it";
        String she = "whom";

        sentence(he, she, it);
        sentence(she, he, who);
        sentence(who, she, who);
        sentence(it, "stu", "boo");
        sentence(it, whom, who);
    }

    public static void sentence(String she, String who, String whom) {
        System.out.println(who + " and " + whom + " like " + she);
    }
}
