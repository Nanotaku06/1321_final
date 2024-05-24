package CSE1321LFINALJUANFERREIRA;

import java.util.Scanner;
public class QuestionB {
    public static boolean is_Palindrome(char[] originalSentence, int arraySize){

        char[] newSentence = new char[arraySize];
        for(int i = 0; i< arraySize; i++){
            newSentence[arraySize-(i+1)] = originalSentence[i];
        }
        for(int i = 0; i< arraySize; i++){
            if(!(newSentence[i] == originalSentence[i])) return false; //brackets not needed as it is only a one line if. return keyword stops the entire function, so no more conditionals are needed either
        }
        return true;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("[Sentence Checker]");
        System.out.print("What sentence shall we check? ");
        char[] userSentence = scan.nextLine().toCharArray();

        if(is_Palindrome(userSentence, userSentence.length))System.out.println("Indeed it IS a palindrome!");
        else System.out.println("Sadly, it is not a palindrome");

    }
}
