package assignments.strings;

public class CheckPalindrome {

    static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        s = s.toLowerCase();


        while (i < j) {

            if (s.charAt(i) != s.charAt(j))
                return false;

            i++;
            j--;

        }
        return true;
    }

    public static void main(String[] args) {

        String abc = "abbaa";
        boolean res = isPalindrome(abc);
        System.out.println(res);

    }
}
