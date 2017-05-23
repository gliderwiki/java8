package quiz;

/**
 * @Author : yion
 * @Date : 2017. 3. 23.
 * @Description : A palindrome is a word that reads the same backward or forward.
 * Write a function that checks if a given word is a palindrome. Character case should be ignored.
 * For example, isPalindrome("Deleveled") should return true as character case should be ignored,
 * resulting in "deleveled", which is a palindrome since it reads the same backward and forward.
 */
public class Palindrom {
    public static void main(String[] args) {
        System.out.println("Palindrom : " + Palindrom.isPalindrom("Deleveled"));
    }

    private static boolean isPalindrom(String word) {
        if (word == null) {
            throw new UnsupportedOperationException("Can't create palindrom!");
        }

        String result = "";
        for (int i = word.length()-1; i >= 0; i--) {
            char charword = word.charAt(i);

            result += charword;
        }

        System.out.println("result : " + result);

        if (result.equalsIgnoreCase(word)) {
            return true;
        } else {
            return false;
        }

    }
}
