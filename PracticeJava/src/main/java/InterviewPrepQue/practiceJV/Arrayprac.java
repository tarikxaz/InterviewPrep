package InterviewPrepQue.practiceJV;

public class Arrayprac {
    public static void main(String[] args) {
        int total = 0;
        int[] a = {1, 10, 20, 40, 50, 60, 70, 80, 90};
        for (int i = 0; i < a.length; i++) {
            total = total + a[i];
        }
        if (total == 421) {
            System.out.println("good");
        } else {
            System.out.println("not good");
        }
        //System.out.println(a[i]);
        System.out.println(total);
    }




}
