package CSE1321LFINALJUANFERREIRA;
import java.util.Scanner;
public class QuestionA {
    public static void main(String[] args){
     Scanner scan = new Scanner(System.in);

     System.out.println("[Incremental Clicker]");

     float clickRate = 1f;
     float points = 0;
     String userInput;
     boolean exit = false;

     do {
         System.out.println("Your click rate is "+clickRate+" point per click, with "+points+" points");
         do {
             userInput = scan.nextLine();
             if (userInput.equals("")) {
                 points += clickRate;
                 System.out.println("You earned "+clickRate+" point(s)! Click again?");  //added the (s) for clickRates over 1.0
             }
         } while (!userInput.equals("m"));

         if(points>=10) {
             System.out.print("* You have " + points + " points, what will you do?\n" +
                     "1) Increase click rate by 0.1 (cost 10 points)\n" +
                     "2) Go back to clicking\n" +
                     "3) Quit\n" +
                     "Choice: ");
             int menuInput = scan.nextInt();
             scan.nextLine();

             switch (menuInput) {
                 case 1:
                     points -= 10;
                     clickRate += 0.1f;
                     break;
                 case 2:
                     break;
                 case 3:
                     exit = true;
                     break;
             }
         } else{
             System.out.print("* You have " + points + " points, what will you do?\n" +
                     "1) Go back to clicking\n" +
                     "2) Quit\n" +
                     "Choice: ");
             int menuInput = scan.nextInt();
             scan.nextLine();

             switch (menuInput) {
                 case 1:
                     break;
                 case 2:
                     exit = true;
                     break;
             }

         }
     }while(!exit);
    System.out.println("Game Over, you earned a total of " +points+ " points"); //added a final score for user satisfaction! seeing a big number before leaving your idle clicker game is satisfactory

    }
}
