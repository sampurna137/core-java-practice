package assignments.strings;

import java.util.Arrays;

public class CheckAnagram {
    static boolean isAnagram(String s, String t) {
        s = s.trim();
        t = t.trim();

        if (s.length() != t.length())
            return false;

        s = s.toLowerCase();
        t = t.toLowerCase();

        char sArray[] = s.toCharArray();
        char tArray[] = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        System.out.println(sArray);
        System.out.println(tArray);

        for (int i =0; i< s.length()-1; i++){
            if (sArray[i] != tArray[i])
                return  false;
        }

        return true;

    }


    public static void main(String[] args) {
        String s = "anagram ";
        String t = "nagaram";
        boolean res = isAnagram(s, t);
        System.out.println(res);
    }
}
