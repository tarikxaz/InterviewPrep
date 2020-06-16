package InterviewPrepQue.practiceJV;

public class DuplicateCharacter {

    public static void main(String[] args) {
        int count =0;
        String gname = "Ghiash kollkollol";
        String name = gname.toLowerCase();
        char[] charredletters = name.toCharArray();
        for(int i = 0; i< charredletters.length; i++){
            for (int j = i+1; j <charredletters.length; j++){
                if (charredletters[i] == charredletters[j]){
                    System.out.print(charredletters[j]);
//                    count++;
//                    break;
                }
            }
        }
    }
}
