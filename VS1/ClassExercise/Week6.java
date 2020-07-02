/* Task 1 */
package classroomweek6;
import java.util.Random;
import java.util.Scanner;

public class ClassRoomWeek6 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int userGuess, computerGuess, count=1;
        System.out.println("This program has you, the user, choose a number between 1 and 10.\n"
                            + "Then I, the computer, will try my best to guess it.");
        System.out.print("Enter user guess: ");
        userGuess = scan.nextInt();
        if(userGuess > 10 || userGuess < 1)
        {
            System.out.println("Cannot go over 10");
            System.exit(0);
        }
        scan.nextLine();
        
        computerGuess = rand.nextInt(10) + 1;
        while(userGuess != computerGuess)
        {
            System.out.println("Is it " + computerGuess + "? (y/n) n");
            computerGuess = rand.nextInt(10) + 1;
            count++;    
        }
        System.out.println("Is it " + computerGuess + "? (y/n) y");
        System.out.println("I got your number of " + userGuess + " correct in " + count + " guesses.");
    } 
}

/* Task 2 */
package classroomweek6;
import java.util.Random;
import java.util.Scanner;

public class question5 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int user, computer;
        String ans;
        String win = "You defeats Computer, you win!";
        String lose = "Computer defeats you, you lose!";
        do
        {
            System.out.print("\nOptions:");
            System.out.print("\n1 rock (defeats scissors) \n2 paper (defeats rock) \n3 scissors (defeat paper)\n\n");
            System.out.print("Enter your decision[1-3]: \n");
            user = scan.nextInt();
            if(user < 1 || user > 3)
            {
                System.out.println("You have to choose one of these above selection!");
                System.exit(0);
            }
            printDecision(user, 1);
            
            computer = rand.nextInt(3) + 1;
            printDecision(computer, 0);
            
            if(user == computer)
            {
                System.out.println("The game is tie");
            }
            else
            {
                if(user == 1)
                {
                    if(computer == 2)
                        System.out.println(lose);
                    else if (computer == 3)
                        System.out.println(win);
                }
                else if(user == 2)
                {
                    if(computer == 1)
                        System.out.println(win);
                    else if (computer == 3)
                        System.out.println(lose);
                }
                else if (user == 3)
                {
                    if(computer == 2)
                        System.out.println(win);
                    else if (computer == 1) {
                    } else {
                        System.out.println(lose);
                    }
                }
            }  
            scan.nextLine();
            System.out.print("Do you want to contine? (y/n) ");
            ans = scan.nextLine();
        }while(ans.equals("y") || ans.equals("Y"));
    }
    
    public static void printDecision(int decision, int type)
    {
        switch(decision)
        {
            case 1:
                if(type == 1)
                    System.out.println("Your choosen is rock");
                else
                    System.out.println("Computer's choosen is rock\n");
                break;
            case 2:
                if(type == 1)
                    System.out.println("Your choosen is paper");
                else
                    System.out.println("Computer's choosen is paper\n");
                break;
            case 3:
                if(type == 1)
                    System.out.println("Your choosen is scissors");
                else
                    System.out.println("Computer's choosen is scissors\n");
                break;
        }
    }
}
