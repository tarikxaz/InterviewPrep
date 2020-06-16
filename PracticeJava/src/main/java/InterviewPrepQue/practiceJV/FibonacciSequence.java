package InterviewPrepQue.practiceJV;

import java.util.Scanner;

public class FibonacciSequence {

    public static void main(String[] args) {
        System.out.println("sequence numbering: ");
        int sequence = new Scanner(System.in).nextInt();
        int current =1;
        int last = 0;
        System.out.print(last+ " ");
        System.out.print(current+ " ");


        int lastlast;
        for(int i = 2; i<sequence; i++){
            lastlast = last;
            last = current;
            current = lastlast+last;
            System.out.print(current + "  ");
        }

    }
}
