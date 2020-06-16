package InterviewPrepQue.practiceJV;

public class duplicateElements {

    public static void main(String[] args) {
        String names[] = {"Java", "JavaScript","Ruby", "C", "Python", "Java"};

        //Comapre each element:
        for(int i=0; i<names.length; i++){
            for (int j=i+1; j<names.length;j++){

                if(names[i].equals(names[j])){
                    System.out.println("duplicate element is:"+names[i]);
                }

            }

        }



    }





}
