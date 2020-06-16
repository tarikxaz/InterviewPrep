package InterviewPrepQue.practiceJV;

public class ForPractice {
    public static void main(String[] args) {
        String name = "Testing java skills";
        String[] splittedName = name.split(" ");

        for (int i = 0; i<= splittedName.length-1; i++){
            char[] splittedWord = splittedName[i].toCharArray();
            for (int j = splittedWord.length-1; j>=0; j--){
                System.out.print(splittedWord[j]);
            }System.out.print(" ");
        }

    }
}
