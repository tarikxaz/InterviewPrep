package InterviewPrepQue.practiceJV;

import java.util.Arrays;

public class checkAnagram {
    public static void main(String[] args) {
        String name1 = "Hitlar Women";
        String name2 = "Mother in law";
        String name1l = name1.toLowerCase().replaceAll(" ", "");
        String name2l = name2.toLowerCase().replaceAll(" ", "");

        char[] nameA = name1l.toCharArray();
        char[] nameB = name2l.toCharArray();

        Arrays.sort(nameA);
        Arrays.sort(nameB);

        System.out.println(nameA);
        System.out.println(nameB);

        System.out.println(Arrays.equals(nameA, nameB));
    }


}
