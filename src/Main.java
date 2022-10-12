import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        ThreadLocalRandom rand = ThreadLocalRandom.current();
        Scanner in = new Scanner(System.in);
        while (true) {
            int dies1 = rand.nextInt(1, 7);
            int dies2 = rand.nextInt(1, 7);
            final int firstSum = dies1 + dies2;
            System.out.printf("%d + %d = %d %n", dies1, dies2, firstSum);


            if (firstSum == 7 || firstSum == 11) {
                System.out.println("You win.");
                return;
            }
            if (firstSum == 2 || firstSum == 3 || firstSum == 12) {
                System.out.println("You lose.");
                return;
            }

            int newSum = 0;
            while (newSum != firstSum && newSum != 7) {
                dies1 = rand.nextInt(1, 7);
                dies2 = rand.nextInt(1, 7);
                newSum = dies1 + dies2;
                System.out.printf("%d + %d = %d %n", dies1, dies2, newSum);
            }

            if (newSum == firstSum) {
                System.out.println("You win.");
            } else {
                System.out.println("You lose.");
            }
            System.out.print("If you would not like to play again, type quit");
            String myMove = in.nextLine();
            if(myMove.equals("quit")) {
                break;
            }
            }
        }
    }
