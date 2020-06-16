package InterviewPrepQue.practiceJV;

public class DuplicateSeqCharWithNoOfDuplication {

    public static void main(String[] args) {
        String letters="aabbaab";
        int count=1;
        letters=letters.replace(" ","");
        char [] characters=letters.toCharArray();
        for (int j=0;j<characters.length;j++){
            if (j==characters.length-1){
                System.out.print(characters[j] + "" + count);
                break;
            }
            if(characters[j]==characters[j+1]){
                count++;
            }
            if (characters[j]!=characters[j+1]) {
                System.out.print(characters[j] + "" + count);
                count = 1;
            }
        }
    }
}
