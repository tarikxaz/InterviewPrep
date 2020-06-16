package InterviewPrepQue.practiceJV;

public class ReverseString {

    public static void main(String[] args) {


        /* How do we reverse a String?
         * Diff btwn String and StringBuffer?
         * Do we have reverse function in String? no bc String is immutable
         */

        String s = "JavaPython";
        //1.using for loop:
        int len = s.length();
        String rev = "";

        for (int i = len - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }

        System.out.println(rev);

        //2.using StringBuffer class:
        StringBuffer sbf = new StringBuffer(s);
        System.out.println(sbf.reverse());



    }

    }
