package leetcode.twopointers;

public class Palindrome {
    public static void main(String args[]){
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }



    public static boolean isPalindrome(String s) {

        int i = 0;
        int j = s.length() - 1;
        while (i < j) {

            Character start = s.charAt(i);
            Character end = s.charAt(j);

            if (!Character.isLetterOrDigit(start)) {
                i++;
                continue;
            }

            if (!Character.isLetterOrDigit(end)) {
                j--;
                continue;
            }

            if (Character.toLowerCase(start) != Character.toLowerCase(end)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }

}
