package InterviewPrepQue.practiceJV;

public class FindingPrimeNumbers {

    public static void main(String[] args) {

        int number;
        boolean prime;
        for (number=2; number < 100; number++){
            prime = true;
            int i = 2;
            while (i <= number/2){
                if (number%i == 0){
                    prime  = false;
                    break;
                }
                i++;
            }
            if (prime)
                System.out.println(number);
        }
    }
}
