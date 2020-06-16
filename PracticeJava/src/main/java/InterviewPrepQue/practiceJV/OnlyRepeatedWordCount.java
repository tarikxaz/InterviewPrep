package InterviewPrepQue.practiceJV;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class OnlyRepeatedWordCount {
    public static void main(String[] args) {
        String name = new Scanner(System.in).nextLine();
        String words[] = name.split(" ");

        Map<String, Integer> hMap = new HashMap<>();
        for(String word: words){
            if (hMap.containsKey(word)){
                hMap.put(word, hMap.get(word)+1);
            }
            else {
                hMap.put(word, 1);

            }
        }

        Set<String> wordsInString = hMap.keySet();
        for (String word : wordsInString){
            if(hMap.get(word)>1){
                System.out.println(word+ ": "+ hMap.get(word));
            }
        }
    }
}
