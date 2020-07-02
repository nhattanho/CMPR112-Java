/* Task 1 */
import java.util.ArrayList;
public class week12Hw 
{
    public static void main(String[] args)
    {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Toyota");
        arr.add("Bwm");
        arr.add("Ferrari");
        for(int i = 0; i < arr.size(); i++)
        {
            System.out.println("The #" + (i+1) + " car is " + arr.get(i));      
        }
    }
}

/* Task 2 */
import java.util.ArrayList;
import java.util.Scanner;
public class number2 
{
    public static void main(String[] args)
    {
        ArrayList arr = new ArrayList();
        Scanner scan = new Scanner(System.in);
        String lastName, middleName, firstName;
        int age;
        System.out.print("Please enter your last name: ");
        lastName = scan.nextLine();
        System.out.print("Please enter your middle name: ");
        middleName = scan.nextLine();
        System.out.print("Please enter your first name: ");
        firstName = scan.nextLine();
        System.out.print("Please enter your age: ");
        age = scan.nextInt();
        arr.add(lastName);
        arr.add(middleName);
        arr.add(firstName);
        arr.add(age);
        String output;
        System.out.println("Your are " + arr.get(0) + ", " + arr.get(2) + " " + arr.get(1));
        System.out.println("Your age is " + arr.get(3)); 
    }
}

/* Task 3 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class number3 
{
    public static void main(String[] args)
    {
        ArrayList arr = new ArrayList();
        Scanner scan = new Scanner(System.in);
        String lastName, middleName, firstName;
        int age;
        System.out.print("Please enter your last name: ");
        lastName = scan.nextLine();
        System.out.print("Please enter your middle name: ");
        middleName = scan.nextLine();
        System.out.print("Please enter your first name: ");
        firstName = scan.nextLine();
        System.out.print("Please enter your age: ");
        age = scan.nextInt();
        arr.add(lastName);
        arr.add(middleName);
        arr.add(firstName);
        arr.add(age);
        String output = "Your are " + arr.get(0) + ", " + arr.get(2) + " " + arr.get(1) +
                       "\r\nYour age is " + arr.get(3);
        System.out.println(output);
        try 
        {
           File file = new File("./myfile.txt"); 
           if (!file.exists()) 
           {
	     file.createNewFile();
	   }
           FileWriter fw = new FileWriter(file);
           BufferedWriter bw = new BufferedWriter(fw);
           bw.write(output);
           bw.close();
           System.out.println("You have done to write to file!");
        }
        catch(IOException ex)
        {
            System.out.println("Error in closing the BufferedWriter "+ex);
        }
    }
}
