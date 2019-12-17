/* Evaluate the following expressions for Chapter 3, Self Check, problem 19 onto page number, 193
   from my "Building Java Programs, A Back to Basics Approach 5e" textbook for my online course
   "Learn to Program in Java" dated on December 16, 2019.

   I had completed, the Chapter 3, Self Check, problem 19 “stringExpression” based on the best possible textbook
   instructions posted onto “GitHub” website, as the correct answer key dated on December 16, 2019.

   Completed by Sarai Hannah Ajai
*/

public class BJP5SelfCheckChapter3Problem19 {
    public static void main(String[] args) {
        String str1 = "Frodo Baggins";
        String str2 = "Gandalf the GRAY";

        System.out.println("a. str1.length() = " + str1.length());
        System.out.println();

        System.out.println("b. str1.charAt(7) = " + str1.charAt(7));
        System.out.println();

        System.out.println("c. str2.charAt(0) = " + str2.charAt(0));
        System.out.println();

        System.out.println("d. str1.indexOf(\"o\") = " + str1.indexOf("o"));
        System.out.println();

        System.out.println("e. str2.toUpperCase() = " + str2.toUpperCase());
        System.out.println();

        System.out.println("f. =str1.toLowerCase().indexOf(\"B\") " + str1.toLowerCase().indexOf("B"));
        System.out.println();

        System.out.println("g. str1.substring(4) = " + str1.substring(4));
        System.out.println();

        System.out.println("h. str2.substring(3, 14) = " + str2.substring(3, 14));
        System.out.println();

        System.out.println("i. str2.replace(\"a\", \"oo\") = " + str2.replace("a", "oo"));
        System.out.println();

        System.out.println("j. str2.replace(\"gray\", \"white\") = " + str2.replace("gray", "white"));
        System.out.println();

        System.out.println("k. \"str1\".replace(\"r\", \"range\") = " + "str1".replace("r", "range"));
        System.out.println();


    }
}
