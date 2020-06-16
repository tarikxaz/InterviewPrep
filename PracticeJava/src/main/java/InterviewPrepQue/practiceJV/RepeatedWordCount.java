package InterviewPrepQue.practiceJV;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RepeatedWordCount {
    public static void main(String[] args) {
        String input="The quick next brown fox jumped under the nearby tree. What the fox did next surprised the crowd. The silence was followed by the applause. Applause that lasted for minutes. The fox blushed under the tree";
        String[] words=input.toLowerCase().split(" ");

        Map<String, Integer> hMap = new HashMap<>();
        for (int i = 0; i<words.length; i++){
            if (hMap.containsKey(words[i])){
                hMap.put (words[i], hMap.get(words[i])+1);
            }
            else {
                hMap.put(words[i], 1);
            }
        }

        Set<String> wordsInString = hMap.keySet();
        for (String word : wordsInString){
//            if(hMap.get(word)>1){
                System.out.println(word+ ": "+ hMap.get(word));
//            }
        }

//        for(Map.Entry<String, Integer> entry: hMap.entrySet()) {
//                System.out.println(entry.getKey() + "" + entry.getValue());
//        }



//        int wrc=1;
//
//        for(int i=0;i<words.length;i++)
//        {
//            for(int j=i+1;j<words.length;j++)
//            {
//
//                if(words[i].equals(words[j]))
//                {
//                    wrc=wrc+1;
//                    words[j]="0";
//                }
//            }
//            if(words[i]!="0" )
//                System.out.println(words[i]+"--"+wrc);
//            wrc=1;
//
//        }
    }
}
