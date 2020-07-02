/* Task 1 */
package week4quiz1;

import java.util.Scanner;

public class Week4Quiz1 
{

    public static void main(String[] args) 
    {
       Scanner scan = new Scanner(System.in);
       double retailPrice, profit;
       System.out.println("Enter the retail price  of a circuit board: ");
       retailPrice = scan.nextDouble();
       
       profit = retailPrice * 0.4;
       System.out.println("The result of profit: $" + profit);
      } 
}

/* Task 2 */
package week4quiz1;
import java.util.Scanner;

public class TestAverage 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        
        int firstScore, secondScore, thirdScore, averageScore;
        System.out.println("Enter the first score: ");
        firstScore = scan.nextInt();
        
        System.out.println("Enter the second score: ");
        secondScore = scan.nextInt();
       
        System.out.println("Enter the third score: ");
        thirdScore = scan.nextInt();
        
        averageScore = (firstScore + secondScore + thirdScore)/3;
        
        System.out.println("The first score is: " + firstScore);
        System.out.println("The second is: " + secondScore);
        System.out.println("The third is:" + thirdScore);
        System.out.println("The average score is: " + averageScore);
    }
}

/* Task 3 */
package week4quiz1;
public class StarPattern 
{
    public static void main(String[] args) 
    {
        System.out.println("   *");
        System.out.println("  ***");
        System.out.println(" *****");
        System.out.println("*******");
        System.out.println(" *****");
        System.out.println("  ***");
        System.out.println("   *");
    }
}

/* Task 4 */
package week4quiz1;
import java.util.Scanner;
public class MilesperGallon 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        double miles, gallons, milesPerGallon;
        System.out.println("Enter the number of miles: ");
        miles = scan.nextDouble();
        
        System.out.println("Enter the number of gallons: ");
        gallons = scan.nextDouble();
        
        milesPerGallon = miles/gallons;
        System.out.println("The car's miles-per-gallon is: " + milesPerGallon);
    }
}

/* Task 5 */
package week4quiz1;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
public class MilesperGallon 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        double miles, gallons, milesPerGallon;
        String fileName;

        System.out.println("Enter the file name which save your information: ");
        fileName = scan.nextLine();
        
        try
        {
        // Print class
            PrintWriter p = new PrintWriter(fileName);
            System.out.println("Enter the number of miles: ");
            miles = scan.nextDouble();
            p.print("The number of miles driven is: " + miles);
          
            System.out.println("Enter the number of gallons: ");
            gallons = scan.nextDouble();
            p.print(" And gallons used is: " + gallons);

            milesPerGallon = miles/gallons;
            
            p.println(" And your result is: " + milesPerGallon);
            
            p.close();
            System.out.println("The car's miles-per-gallon is: " + milesPerGallon);
            System.out.println("and file has been written to.");
        }
        catch(FileNotFoundException ex)
        {
            System.out.println("The error is " + ex);
        }
    }
}

/* Task 6 */
package quiz4part2;
import java.util.Scanner;
public class Quiz4Part2 
{

    public static void main(String[] args) 
    {
       inputBirthday();
    }
    
    public static void inputBirthday()
    {
        Scanner scan = new Scanner(System.in);
        int day, year;
        String nameOfMonth;
        
        System.out.print("On what day of the month were you born? ");
        day = scan.nextInt();
        scan.nextLine();
        
        System.out.print("What is the name of the month in which you were born? ");
        nameOfMonth = scan.nextLine();
        
        System.out.print("During what year were you born? ");
        year = scan.nextInt();
        
        System.out.print("You were born on " + nameOfMonth + " " + day + ", " + year + ". ");
        System.out.println("You're mighty old!");
    } 
}

/* Task 7 */
package quiz4part2;

public class Question2 
{
    public static void main(String[] args) 
    {
       int speed = 20;
       int time = 10;
       canculateDistance(speed, time);
    }
    
    public static void canculateDistance(int speed, int time) 
    {
       int distance = speed * time;
       System.out.println("The contents of the distance: " + distance);
    }
}

/* Task 8 */ 
package quiz4part2;
import javax.swing.JOptionPane;

public class question3 
{
    public static void main(String[] args) 
    {
       JOptionPane();
    }
    
    public static void JOptionPane() 
    {
        String input;
        int first, second, third, sum;
        
        input = JOptionPane.showInputDialog("Enter the first number: ");
        first = Integer.parseInt(input);
        
        input = JOptionPane.showInputDialog("Enter the second number: ");
        second = Integer.parseInt(input);
    
        input = JOptionPane.showInputDialog("Enter the third number: ");
        third = Integer.parseInt(input);
        
        sum = first + second + third;
        JOptionPane.showMessageDialog(null, "Sum of three numbers: " + sum);
    }
}

/* Task 9 */
package quiz4part2;

public class question4 
{
    public static void main(String[] args) 
    {
       int i =0;
       while(i++ < 10)
       {
           System.out.println("Value is: " + i);
       }
    }
}

/* Task 10 */
package quiz4part2;

public class question5 
{
    public static void main(String[] args) 
    {
       double a = 2;
       double b = a;
       a = b*4;
       b = a / 3.14;
       a = b - 8;
       char c = 'K';
       c = 66; //Unicode of B equal 66
       System.out.println("Value of a: " + a);
       System.out.println("Value of b: " + b);
       System.out.println("Value of c: " + c);
    }
}

