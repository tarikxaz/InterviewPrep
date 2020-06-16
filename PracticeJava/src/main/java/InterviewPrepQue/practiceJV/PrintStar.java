package InterviewPrepQue.practiceJV;

public class PrintStar {
    public static void main(String[] args) {
        int noOfRows = 6;
        for (int i= 1; i <=noOfRows; i++){
            System.out.println();
            for (int j =1; j<=noOfRows-i; j++ ){
                System.out.print(" ");
            }
            for (int k =1; k<=i; k++ ){
                System.out.print("* ");
            }
        }

        for (int i= noOfRows; i>0; i--){
            System.out.println();
            for (int j =1; j<=noOfRows-i; j++ ){
                System.out.print(" ");
            }
            for (int k =1; k<=i; k++ ){
                System.out.print("* ");
            }
        }
    }
}

