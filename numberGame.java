package game;

import java.util.Random;
import java.util.Scanner;

public class numberGame {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("welcome to this game-->");
        System.out.println("Are you ready" +
                "\n\t1.Yes" +
                "\n\t2.No");

        int x;
        System.out.println("Select 1 to start game.");
        System.out.println("Select 2 to quit game.");
        int y = scanner.nextInt();
        if (y==1)
        x = scanner.nextInt();



        switch (x){
            default:
                System.out.println("You have entered an invalid number");
                break;
            case 1:
                Random random= new Random();
                int y = random.nextInt( 10)+1;
                int i;
                for (i = 0; i <5 ; i++) {
                    System.out.print("Enter a number between 1 to 10: ");
                    int k = scanner.nextInt();
                    if(k==y){
                        System.out.println("Congratulations you have won");
                        System.out.println("You took "+ i+1 + " guesses");
                        break;
                    }else if (k<y){
                        System.out.println("Guess is lower\nTry again");
                    }
                    else
                        System.out.println("Guess is higher \nTry again");
                }
                if(i==5){
                    System.out.println("Better luck next time\nThe number was "+y);
                }
                break;
            case 2:
                System.out.println("Have a nice day");
                break;

        }
    }
}
