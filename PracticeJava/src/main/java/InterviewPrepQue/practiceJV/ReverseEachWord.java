package InterviewPrepQue.practiceJV;

public class ReverseEachWord {
    public static void main(String[] args) {
        String name = "java practice";
        String [] splittedName = name.split(" ");

        for(int i = 0; i<=splittedName.length-1; i++){
            char[] charredName = splittedName[i].toCharArray();
            for (int j = charredName.length-1; j>=0; j--){
                System.out.print(charredName[j]);
            }
            System.out.print(" ");
        }


    }
}
