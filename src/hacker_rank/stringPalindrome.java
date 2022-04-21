package hacker_rank;

public class stringPalindrome {

    public static void main(String[] args) {
        String word = "abba";

        isPalindromeSBuilder(word);
        System.out.println(isPalindrome(word));
    }

    private static void isPalindromeSBuilder(String word) {
        StringBuilder rev = new StringBuilder(word).reverse();

        if (word.equals(rev.toString())) {
            System.out.println("is a palindrome");
        } else {
            System.out.println("is not a palindrome");
        }
    }

    private static boolean isPalindrome(String word) {
        int stringLength = word.length()-1;
        char[] stringArray = word.toCharArray();

        for (int i=0;i<word.length();i++) {
            if (stringArray[i] != stringArray[stringLength]) {
                return false;
            }
            stringLength--;
        }
        return true;
    }
}
