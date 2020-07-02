/* Task 1 */
package final_part2;
import java.util.Scanner;
public class Final_part2 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your last name: ");
        String lastName = scan.nextLine();
        
        System.out.print("Enter your first name: ");
        String firstName = scan.nextLine();
        
        System.out.print("Enter your age: ");
        int age = scan.nextInt();
        
        System.out.println("The full name of the students is " + lastName + " and " + firstName + " and the age is " + age + " input.");
    }  
}

/* Task 2 */
package final_part2;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
public class Final_part2 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your last name: ");
        String lastName = scan.nextLine();
        
        System.out.print("Enter your first name: ");
        String firstName = scan.nextLine();
        
        System.out.print("Enter your age: ");
        int age = scan.nextInt();
        String information = "The full name of the students is " + lastName + " and " + firstName + " and the age is " + age + " input.";
        System.out.println(information);
         try
        {
            File f = new File("confirmation .txt");
            FileWriter fw = new FileWriter(f, true);
            BufferedWriter bw = new BufferedWriter (fw);
            //conditional 
            if(f.exists())
            {
                bw.write(information);
                bw.close();

                System.out.println("created file and written too");
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
    }  
}

/* Task 3 */
package final_part2;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class finalPart2_ex3 
{
    public static void main(String[] args)
    {
        String header = "Name           ID Number        Department        Position";
        String    one = "Susan Meyers   47899            Accounting        Vice President";
        String    two = "Mark Jones     39119            IT                Programmer";
        String  three = "Joy Rogers     81774            Manufacturing     Engineer";
        try
        {
            File f = new File("employees.txt");
            FileWriter fw = new FileWriter(f, true);
            BufferedWriter bw = new BufferedWriter (fw);
            //conditional 
            if(f.exists())
            {
                bw.write(header);
                bw.write("\r\n");
                bw.write(one);
                bw.write("\r\n");
                bw.write(two);
                bw.write("\r\n");
                bw.write(three);
                bw.write("\r\n");
                bw.close();

                System.out.println("Created file and written too!");
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
    }
}

/* Task 4 */
package final_part2;
public class finalpart2_ex4 
{
   public static void main(String[] args)
    {
        int [] array = new int[10];
        for(int i = 0; i < array.length; i++)
        {
            array[i] = (i+1);
        }
        System.out.println("The lucky number 7 is: " + array[6]);
    } 
}

/* Task 5 */
package final_part2;
public class finalpart2_ex5 
{
    public static void main(String[] args) 
    {
        // Initialize the 2-D
        int[][] array = new int[2][10];  
        for(int row = 0; row < array.length; row++)
        {
            for(int column = 0; column < array[row].length; column++)
            {
                array[row][column] = 10*row + 1 + column;
            }
        }
        // Retrieve all number
        for(int row = 0; row < array.length; row++)
        {
            for(int column = 0; column < array[row].length; column++)
            {
                System.out.println("The number array[" + row + "][" + column + "] is:" + array[row][column]);
            }
        }
        
        // Retrieve the number 12
        System.out.println("The number 12 in 2-D is: " + array[1][1]);
    } 
} 

/* Task 6 */
package final_part2;
import java.util.Scanner;
public class finalpart2_ex6 
{
    String lastName;
    String firstName;
    String information;
    int age; 
    
    void getInformation()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your last name: ");
        lastName = scan.nextLine();
        
        System.out.print("Enter your first name: ");
        firstName = scan.nextLine();
        
        System.out.print("Enter your age: ");
        age = scan.nextInt();
    }
    
    void showInformation()
    {
        information = "The full name of the students is " + lastName + " and " + firstName + " and the age is " + age + " input.";
        System.out.println(information);
    }
}

package final_part2;
public class finalMain_ex6 
{
    public static void main(String[] args) 
    {
        finalpart2_ex6 info = new finalpart2_ex6();
        info.getInformation();
        info.showInformation();
    }
}

/* Task 7 */

/* Task 8 */

/* Task 9 */

/* Task 10 */

/* Task 11 */
