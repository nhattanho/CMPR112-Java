/* Task 2 */
package week3chapter3methods;
import java.util.*;

public class TestScoreAndGrade 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int firstScore, secondScore, thirdScore;
        int average;
        String grade="";
 
        System.out.println("Enter the your score with range is [0,100] ");
        
        System.out.println("Enter the first score: ");
        firstScore = scan.nextInt();
        scan.nextLine();
        
        System.out.println("Enter the second score: ");
        secondScore = scan.nextInt();
        scan.nextLine();
        
        System.out.println("Enter the third score: ");
        thirdScore = scan.nextInt();
        scan.nextLine();
        
        average = (firstScore + secondScore + thirdScore)/3;
        
        if(average > 100 )
            System.out.println("Your score can not greater than 100!");
        else
        {
            if (average >= 90 && average <= 100)
                grade = "A";
            else if (average >= 80 && average <= 89)
                grade = "B";
            else if (average >= 70 && average <= 79)
                grade = "C";
            else if (average >= 60 && average <= 69)
                grade = "D";
            else if (average< 60)
                grade = "F";
            System.out.println("Your average score is " + average + " and you get " + grade); 
        }
    }
}

