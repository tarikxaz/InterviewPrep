package InterviewPrepQue.practiceJV;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharWithNoOfDuplication {
    public static void main(String[] args) {
        String letters="aaabbccccaad";
        //letters=letters.replace(" ","");
        char [] characters=letters.toCharArray();

        Map<Character,Integer> hMap=new HashMap<>();
        for (int i=0;i<characters.length;i++){
            if (hMap.containsKey(characters[i])){
                hMap.put(characters[i],hMap.get(characters[i])+1); }
            else {
                hMap.put(characters[i], 1); }
        }

        Set<Character> LettersInString = hMap.keySet();
        for (Character letter : LettersInString){
           //if(hMap.get(letter)>1){
            System.out.print(letter+""+ hMap.get(letter));
           }
        //}
//        for(Map.Entry<Character, Integer> entry : hMap.entrySet()) {
//            System.out.print(entry.getKey()+""+entry.getValue());
//        }
    }
}
