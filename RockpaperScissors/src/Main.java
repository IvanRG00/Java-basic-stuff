import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String[] bot = {"r", "p", "s"};
            String botchoice = bot[new Random().nextInt(bot.length)];
            System.out.println("Enter your choice (r,p or s)");
            String move;
            while (true) {
                move = scanner.nextLine();
                if (move.equals("r") || move.equals("p") || move.equals("s"))
                    break;
                System.out.println("Use the correct letters");
            }
            System.out.println("Bot's choice is: " + botchoice);
            if (move.equals(botchoice)) {
                System.out.println("It's a tie");
            } else if (move.equals("r")) {
                if (botchoice.equals("p")) {
                    System.out.println("You lose");
                } else if (botchoice.equals("s")) {
                    System.out.println("You win");
                }
            } else if (move.equals("s")) {
                if (botchoice.equals("r")) {
                    System.out.println("You lose");
                } else if (botchoice.equals("p")) {
                    System.out.println("You win");
                }
            } else if (move.equals("p")) {
                if (botchoice.equals("s")) {
                    System.out.println("You lose");
                } else if (botchoice.equals("r")) {
                    System.out.println("You win");
                }
            }
            System.out.println("Try again? y/n ");
            String tryagain = scanner.nextLine();
            if (!tryagain.equals("y")) {
                break;
            }
        }


    }
}


