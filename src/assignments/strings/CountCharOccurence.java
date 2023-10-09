package assignments.strings;

public class CountCharOccurence {

    static int countChar(char c, String s) {
        s = s.toLowerCase();
        int counter = 0;
        for (int i = 0; i< s.length() -1; i++) {
            if (s.charAt(i) == c)
                counter++;

        }


        return counter;
    }

    public static void main(String[] args) {
        char c = 'e';
        String str = "InterviewBit";
        int count = countChar(c, str);
        System.out.println(count);
    }
}
