import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        //System.out.println("Hello world!");

        Scanner scanner = new Scanner(System.in);
        String playerA = "";
        String playerB = "";
        String nextLine = "";
        boolean done = false;

        do {
            System.out.println("Player A Enter your move [R P S]: ");
            playerA = scanner.nextLine();
            System.out.println("Player B Enter your move [R P S]: ");
            playerB = scanner.nextLine();

            if (playerA.equals("R") || playerA.equals("r")) {
                if (playerB.equals("R"))
                {
                    System.out.println("Rock vs Rock, it is a Tie!");
                }
                else if (playerB.equals("P") || playerB.equals("p"))
                {
                    System.out.println("Paper beats rock so Player B Wins!");
                }
                else {
                    System.out.println("Rock breaks scissors, so player A Wins!");
                }
            }
            else if (playerA.equals("P") || playerA.equals("p"))
            {
                if (playerB.equals("R") || playerB.equals("r")) {
                    System.out.println("Paper beats Rock, so Player A Wins!");
                } else if (playerB.equals("P") || playerB.equals("p")) {
                    System.out.println("Paper vs Paver, it is a Tie!");
                } else {
                    System.out.println("Scissors cuts paper, so Player B Wins!");
                }
            }
            else if (playerA.equals("S") || playerA.equals("s"))
            {
                if (playerB.equals("R") || playerB.equals("r"))
                {
                    System.out.println("Rock breaks scissors, so Player A Wins!");
                }
                else if (playerB.equals("P") || playerB.equals("p"))
                {
                    System.out.println("Scissors cuts paper, so Player A Wins!");
                }
                else
                {
                    System.out.println("Scissors vs scissors, it is a Tie!");
                }
            }
            else
            {
                System.out.print("Please enter a Valid input and try again!");
                nextLine = scanner.nextLine();
                done = true;
            }

            System.out.println("Would you like to play again? [Y/N]: ");
            nextLine = scanner.nextLine();
            done = true;
        }
    while (done);
    scanner.close();
    }
}