package InterviewPrepQue.practiceJV;

public class RemoveJunk {

    public static void main(String[] args) {

        String s= "你好吗 string  0123456789";
        String s1= "@#$%&* testing **&&%%$$ java";

        //Junk removal is process where unregognized letters/characters are removed when printed.
        // Regular Expression: [^a-zA-Z0-9].
        // ^ This sign means not including, which means anything that doesnt include regular expression will be removed.


        //Here I'm declaring which characters are to keep.
        s=s.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(s);

        s1=s1.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(s1);

    }
}
