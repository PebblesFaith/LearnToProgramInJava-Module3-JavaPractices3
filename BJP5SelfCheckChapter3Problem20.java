/* Evaluate the following expressions for Chapter 3, Self Check, problem 20 onto page number, 193 - 194
   from my "Building Java Programs, A Back to Basics Approach 5e" textbook for my online course
   "Learn to Program in Java" dated on December 16, 2019.

   I had completed, the Chapter 3, Self Check, problem 20 “stringExpressions2” based on the best possible textbook
   instructions posted onto “GitHub” website, as the correct answer key dated on December 16, 2019.

   Completed by Sarai Hannah Ajai
*/

public class BJP5SelfCheckChapter3Problem20 {
    public static void main(String[] args) {
        String str1 = "Q.E.D.";
        String str2 = "Arcturan Megadonkey";
        String str3 = "Sirius Cybernetic Corporation";

        System.out.println("a. str1.length() = " + str1.length());

        System.out.println("b. str2.length() = " + str2.length());

        System.out.println("c. str1.toLowerCase() = " + str1.toLowerCase());

        System.out.println("d. str2.toUpperCase() = " + str2.toUpperCase());

        System.out.println("e. str1.substring(2, 4) = " + str1.substring(2, 4));

        System.out.println("f. str2.substring(10, 14) = " + str2.substring(10, 14));

        System.out.println("g. str1.indexOf(\"D\") = " + str1.indexOf("D"));

        System.out.println("h. str1.indexOf(\".\") = " + str1.indexOf("."));

        System.out.println("i. str2.indexOf(\"donkey\") = " + str2.indexOf("donkey"));

        System.out.println("j. str3.indexOf(\"X\") = " + str3.indexOf("X "));

        System.out.println("k. str2 + str3.charAt(17) = " + str2 + str3.charAt(17));

        System.out.println("l. str3.substring(9, str3.indexOf(\"e\")) = " + str3.substring(9, str3.indexOf("e")));

        System.out.println("m. str3.substring(7, 12) = " + str3.substring(7, 12));

        System.out.println("n. str2.toLowerCase().substring(9, 13) + str3.substring(18, str3.length() - 7) = " + str2.toLowerCase().substring(9, 13) + " " +  str3.substring(18, str3.length() - 7));

    }
}