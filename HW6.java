/* 1. Turn to page 434 and complete Q18 */
package week7homework6_nhat_ho;
import java.util.Scanner;

public class Week7Homework6_Nhat_Ho 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int i = 0, lengthMax = 0, numLines;
        System.out.print("How many lines do you want? ");
        numLines = scan.nextInt();
        scan.nextLine();
        
        String[] lines = new String[numLines]; 
        while(i<numLines)
        {
            lines[i] = scan.nextLine();
            if(lengthMax < lines[i].length())
                lengthMax = lines[i].length();
            i++;
        }
        topBottomLine(lengthMax);
        printContent(lines, numLines, lengthMax);
        topBottomLine(lengthMax);
    }
    public static void topBottomLine (int length) 
    {
        System.out.print("+"); 
        for (int i = 0; i <= length + 1; i++)
            System.out.print("-");
        System.out.println("+");    
    }
    public static void printContent (String lines[],int numLines, int lengthMax) 
    {
        String line;
        int spaces;
        //System.out.println(lengthMax);
        for(int i = 0; i < numLines; i++)
        {
            line = "| " + lines[i] ;
            System.out.print(line);
            spaces = lengthMax - lines[i].length();
            while(spaces-- > 0)
                System.out.print(" ");
            System.out.println(" |");
        }
    }
}

/* 2. Turn to page 435 and complete Q21 */
package week7homework6_nhat_ho;
import java.io.File;
import java.util.Scanner;

public class question2 
{
        public static void main(String[] args) 
    {
        String fileName;
        Scanner scan = new Scanner(System.in);
        do
        {
            System.out.print("Please enter the file name: ");
            fileName = scan.nextLine();
            File f = new File(fileName);
            if(!f.exists())
            {
                System.out.println("You have to enter the file name existing on the system, try again!");
                continue;
            }
            System.out.println("You got exactly file name!");
            break;
        }while(true);
    }
}

/* 3. Turn to page 436 and complete Q4 */
package week7homework6_nhat_ho;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class question3 
{
    public static void main(String[] args) 
           throws FileNotFoundException  
    {
        
        Scanner scan = new Scanner(new File("coins.txt"));
        countCoins(scan);
    }
    
    public static void countCoins(Scanner scan)      
    {
        int numCoins;
        double sum = 0;
        String typeCoins;
        while(scan.hasNext())
        {
            numCoins = scan.nextInt();
            typeCoins = scan.next();
            switch(typeCoins.toLowerCase())
            {
                case "pennies":
                    sum += numCoins * 1;
                    break;
                case "nickels":
                    sum += numCoins * 5;
                    break;
                case "dimes":
                    sum += numCoins * 10;
                    break;
                case "quaters":
                    sum += numCoins * 25;
                    break;
            }
        }
        sum /= 100;
        System.out.println("Total money: $" + sum);
    }
}

