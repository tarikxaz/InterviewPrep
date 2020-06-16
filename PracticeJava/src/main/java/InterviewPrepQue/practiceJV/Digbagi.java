package InterviewPrepQue.practiceJV;

import java.util.HashMap;

public class Digbagi {
    public static void main(String[] args) {

    String st1 = "java class";
    String st2 = "class practice";

    String result = st1+" "+st2;

        //System.out.println(result);

        String [] res = result.split(" ");

        HashMap hp = new HashMap();

        for(int i=0;i<res.length;i++){
            hp.put(res[i],i);
        }
        System.out.println(hp.keySet());



//        for (String name:res){
//            System.out.println(result);
//        }
//        System.out.println(Arrays.toString(res));
//        try {
//            for (int i = 0; i <= res.length; i++) {
//                if (res[i] != res[i + 1]) {
//                    System.out.println(res[i+1]);
//                } else i++;
//            }
//        } catch (Exception e){
//            //System.out.println();
        //}

}
}