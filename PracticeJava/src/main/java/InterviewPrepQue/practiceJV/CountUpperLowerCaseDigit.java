package InterviewPrepQue.practiceJV;

import java.util.Scanner;

public class CountUpperLowerCaseDigit {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            String st = input.nextLine();
            st = st.replace(" ", "");
            int totalChar = st.length();
            int upperCaseLetters = 0;
            int lowerCaseLetter = 0;
            int digit=0;
            int others = 0;

            for (int i =0; i<st.length(); i++){
                if(Character.isUpperCase(st.charAt(i))){
                    upperCaseLetters++;
                }
                else if (Character.isLowerCase(st.charAt(i))){
                    lowerCaseLetter++;
                }
                else if (Character.isDigit(st.charAt(i))){
                    digit++;
                } else {
                    others++;
                }
            }
            System.out.println("Total number of character is:  "+ totalChar);
            System.out.println("Total number of Uppercase Letter is:  "+ upperCaseLetters);
            System.out.println("Total number of lowercase letter is: "+ lowerCaseLetter);
            System.out.println("Total number of digit is: "+digit);
            System.out.println("others are: "+ others);
        }

    }