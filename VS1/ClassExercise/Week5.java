/* Task 1 */
package week5chapter04;
import java.util.Scanner;

public class question1 
{
     public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        String letter;
        
        System.out.println("What color do you want? ");
        letter = scan.nextLine();
        
        switch(letter)
        {
            case "B": case "b":
                System.out.println("You have chosen Blue.");
                break;
            case "G": case "g":
                System.out.println("You have chosen Green.");
                break;
            case "R": case "r":
                System.out.println("You have chosen Red.");
                break;
            default:
                System.out.println("Unknow color: " + letter);
                break;
        }
    }
}

/* Task 2 */
package week5chapter04;
import java.util.Scanner;

public class question2 
{
     public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        char letter;
        int hours, extra;
        double totalCharge = 0;
        
        do
        {
            System.out.println("Enter your package (A B or C): ");
            letter = scan.next().charAt(0);        
        
            System.out.println("Enter your number of hours that were used: ");
            hours = scan.nextInt();
            switch (letter)
            {
                case 'A':
                    if(hours > 10)
                    {
                        extra = hours - 10;
                        totalCharge = 9.95 + extra*2;
                    }
                    else 
                    {
                        totalCharge = 9.95;
                    }
                    break;
                case 'B':
                    if(hours > 20)
                    {
                        extra = hours - 20;
                        totalCharge = 13.95 + extra;
                    }
                    else 
                    {
                        totalCharge = 13.95;
                    }
                    break;
                case 'C':
                    totalCharge = 19.95;
                    break;
                default:
                    System.out.println("You are not enter (A B or C)! Try again!");
                    break;
            }
        }while((letter != 'A')&&(letter != 'B')&&(letter != 'C'));
        
        System.out.println("the total charge is: $" + totalCharge);
    }
}

/* Task 3 */
package week5chapter04;
import java.util.Scanner;

public class question3 
{
     public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        int books, points = 0;
        System.out.println("Enter your number of books: ");
        books = scan.nextInt();
        
        switch (books)
        {
            case 0:
                points = 0;
                break;
            case 1:
                points = 5;
                break;
            case 2:
                points = 15;
                break;
            case 3:
                points = 30;
                break;
            default:
                if(books >= 4)
                    points = 60;
                break;
        }
        
        System.out.println("Your number of points awarded: " + points);
    }
}
