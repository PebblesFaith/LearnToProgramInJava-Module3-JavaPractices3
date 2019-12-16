/* Write a method called isVowel that accepts a character as input and return true, if that character is
   a vowel (a, e, i, o, u) and, for extra challenge, make your method case-insensitive for Chapter 5,
   Self Check, problem 15 onto page number, 381 from my "Building Java Programs, A Back to Basics
   Approach 5e" textbook for my online course "Learn to Program in Java" dated on December 14, 2019.

   I had completed, the Chapter 5, Self Check, problem 15 “isVowel” based on the best possible textbook
   instructions posted onto “GitHub” website, as the correct answer key dated on December 14, 2019.

   Completed by Sarai Hannah Ajai
*/

import java.util.*;

public class BJP5SelfCheckChapter5Problem15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter one vowel letter (a, e, i, o, or u)  ");
            String vowelLetter = input.nextLine();

        boolean letter = isVowel(vowelLetter);

        System.out.println(letter);
    }
    public static boolean isVowel(String letter) {

        if (letter.equals("a") || letter.equals("A") ) {
            return true;
        } else if (letter.equals("e") || letter.equals("E")) {
            return true;
        } else if (letter.equals("i") || letter.equals("I") ) {
            return true;
        } else if (letter.equals("o") || letter.equals("O")) {
            return true;
        } else if (letter.equals("u") || letter.equals("U") ) {
            return true;
        } else {
            return false;
        }
    }
}
