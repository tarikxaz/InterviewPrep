package InterviewPrepQue.practiceJV;

import org.junit.Assert;

public class TestKeypad {

    public static void main(String[] args) {
        //unit testing

        Keypad keypad=new Keypad();
        int additionResult=keypad.addition(15,25);

        Assert.assertEquals(additionResult, 40);
        System.out.println("addition passed");

        int subResult=keypad.subtraction(500, 400);
        Assert.assertEquals(subResult, 100);
        System.out.println("subtarction passed");



    }


}
