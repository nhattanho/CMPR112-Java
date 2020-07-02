/* Task 1 */
package midterm_part2;
import java.util.Scanner;
public class Midterm_part2 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int x;
        do
        {
            System.out.print("Enter a number: ");
            x = keyboard.nextInt();
        }
        while(x > 0);
    }   
}

/* Task 2 */
package midterm_part2;
import java.util.Scanner;
public class question2 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String input;
        char sure = 't';
        while(sure != 'Y' && sure != 'N')
        {
            System.out.print("Are you sure you want to quit? ");
            input = keyboard.next();
            sure = input.charAt(0);
        }
    }
}

/* Task 3 */
package midterm_part2;
import java.util.Scanner;
public class question3 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int product = 0;
        while(product < 100)
        {
            System.out.print("Enter the number: ");
            product = scan.nextInt();
            product *= 10;
            System.out.println(product);
        } 
    }
}

/* Task 4 */
package midterm_part2;
import java.util.Scanner;

public class question4 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int number1, number2, sum;
        String input;
        char ans;
        do
        {
            System.out.print("Enter the number 1: ");
            number1 = scan.nextInt();
            System.out.print("Enter the number 2: ");
            number2 = scan.nextInt();
            sum = number1 + number2;
            System.out.println("The sum is " + sum);
            scan.nextLine();
            
            System.out.print("Do you want to continue?(y or n) ");
            input = scan.next();
            ans = input.charAt(0);
        }while(ans == 'Y' || ans == 'y' );
    }
}

/* Task 5 */
package midterm_part2;
import java.io.File;
import java.io.FileWriter;
public class question5 
{
    public static void main(String[] args) 
    {
        try
        {
            File f = new File("D:\\message.txt");
            FileWriter fw = new FileWriter(f, true);
            if(f.exists())
            {
                fw.write("\r\n");
                fw.write("This file has a great deal of");
                fw.write("\r\n");
                fw.write("text in it which needs to");
                fw.write("\r\n");
                fw.write("be processed.");
                fw.close();
                System.out.println("Written into the message.txt file");
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
    }
}

/* Task 6 */
package week4quiz1;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
public class question6 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        String lastName, firstName, address, city, state, zipCode;
        System.out.print("Enter your last name: ");
        lastName = scan.nextLine();
        
        System.out.print("Enter your first name: ");
        firstName = scan.nextLine();
        
        System.out.print("Enter your address: ");
        address = scan.nextLine();
        
        System.out.print("Enter your City: ");
        city = scan.nextLine();
        
        System.out.print("Enter your State: ");
        state = scan.nextLine();
        
        System.out.print("Enter your Zipcode: ");
        zipCode = scan.nextLine();
        
        try
        {
            File f = new File("D:\\message.txt");
            FileWriter fw = new FileWriter(f, true);
            if(f.exists())
            {
                fw.write("Last name: " + lastName + "\r\n");
                fw.write("\r\n");
                fw.write("First name: " + firstName + "\r\n");
                fw.write("\r\n");
                fw.write("Address: " + address + "\r\n");
                fw.write("\r\n");
                fw.write("City: " + city + "\r\n");
                fw.write("\r\n");
                fw.write("State: " + state + "\r\n");
                fw.write("\r\n");
                fw.write("Zipcode: " + zipCode + "\r\n");
                fw.close();
                System.out.println("Written into the message.txt file");
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
    }
}

/* Task 7 */
package midterm_nhatho;
import java.util.Scanner;
public class Midterm_NhatHo 
{
    public static void main(String[] args) 
    {
       Scanner scan = new Scanner(System.in);
       int numberChecks;
       double fees = 10;
       double rate = 0;
       System.out.print("Enter the number of checks for the month: ");
       numberChecks = scan.nextInt();
       
       if(numberChecks < 20)
           rate = 0.1;
       else if(numberChecks >=20 && numberChecks <= 39)
           rate = 0.08;
       else if(numberChecks >= 40 && numberChecks <= 59)
           rate = 0.06;
       else if(numberChecks >= 60)
           rate = 0.04;
       fees += rate * numberChecks;
       System.out.println("The fees for the month: $" + fees);
    }   
}

/* Task 8 */
package midterm_nhatho;
import java.util.Scanner;
public class task2 
{
   public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int ages, numAccidents;
        double charges = 500, surcharge = 0;
        
        System.out.print("Enter your ages: ");
        ages = scan.nextInt();
        while(true)
        {
            System.out.print("Enter the number of accidents: ");
            numAccidents = scan.nextInt();
            if(numAccidents < 0)
            {
                System.out.println("The number of accidents can not be less than 0, try again!: ");
                continue;
            }
            else
            {
                switch(numAccidents)
                {
                    case 0:
                        surcharge = 0;
                        break;
                    case 1:
                        surcharge = 50;
                        break;
                    case 2:
                        surcharge = 125;
                        break;
                    case 3:
                        surcharge = 225;
                        break;
                    case 4:
                        surcharge = 375;
                        break;
                    case 5:
                        surcharge = 575;    
                        break;
                    default:
                        surcharge = 0;
                        break;
                }
            }
            break;
        }
        if(ages < 25)
            surcharge += 100;
        charges += surcharge;
        System.out.println("The total insurance charge is: $" + charges);
    } 
}

/* Task 9 */
package midterm_nhatho;
import java.util.Scanner;
public class task3 
{
    public static void main(String[] args) 
    {
        int distanceMultiple;
        double weight = 0, charge = 0, distance = 0;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the weight of a package: ");
        weight = scan.nextDouble();
        
        System.out.print("What is distance: ");
        distance = scan.nextDouble();
        
        distanceMultiple = (int)distance / 500;
        if((distance % 500)!=0)
            distanceMultiple++;
        
        if(weight <= 2)
            charge = distanceMultiple * 1.1;
        else if(weight > 2 && weight <= 6)
            charge = distanceMultiple * 2.2;
        else if(weight > 6 && weight <= 10)
            charge = distanceMultiple * 3.7;
        else if(weight > 10)
            charge = distanceMultiple * 3.8;
        
        System.out.println("The shipping charge is: $" + charge);
        
    }
}

/* Task 10 */
package midterm_nhatho;
import java.util.Scanner;
public class task4 
{
     public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        String type;
        double distance, time;
        int speedAir = 1100, speedWater = 4900, speedSteel = 16400;
        System.out.print("Enter the distance that sound wave will travel(feet): ");
        distance = scan.nextDouble();
        scan.nextLine();
         
        while(true)
        {
            System.out.print("Enter enviroment: air, water, or steel: ");
            type = scan.nextLine();
            if(type.equalsIgnoreCase("air"))
                time = distance / speedAir;
            else if(type.equalsIgnoreCase("water"))
                time = distance / speedWater;
            else if(type.equalsIgnoreCase("steel"))
                time = distance / speedSteel;
            else
            {
                System.out.print("You have to enter one of three enviroment: air, water, or steel,");
                System.out.println(" try again!");
                continue;
            }
            break;
        }
        System.out.print("The amount of time it will take: ");
        System.out.printf("%.2f second\n", time);
    }
}
