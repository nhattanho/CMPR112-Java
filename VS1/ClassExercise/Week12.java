/* Task 1 */
import java.util.ArrayList;
import java.util.Scanner;

public class Task1 
{
    public static void main(String[] args)
    {
       Scanner scan = new Scanner(System.in);
       System.out.print("Please enter the string: ");
       String line = scan.nextLine();
       ArrayList<String> arr = new ArrayList<String>(); 
       arr.add(line);
       double average = averageVowels(arr);
       System.out.print("The average of vowels is ");
       System.out.printf("%.2f\n", average);
    }
    
    public static double averageVowels(ArrayList<String> arr)
    {        
        String line = arr.get(0);
        if(line.length() > 0)
        {
            double count = 0;
            char character;
            for(int i = 0; i < line.length(); i++)
            {
                character = Character.toLowerCase(line.charAt(i));      
                if(character == 'u'
                  || character == 'e'
                  || character == 'o'
                  || character == 'a'
                  || character == 'i')
                {
                    count++;
                }
            }
            return count/line.length();
        }
        else
            return 0;
    }
}

/* Task 2 */
import java.util.ArrayList;
import java.util.Scanner;

public class Task2 
{
    public static void main(String[] args)
    {
       Scanner scan = new Scanner(System.in);
       ArrayList<String> arr = new ArrayList<String>();
       String line;
       while(true)
       {
        System.out.print("Please enter the string member: ");
        line = scan.nextLine();
        if (line.equals(""))
            break;
        else
            arr.add(line);
       }
       System.out.println("The list before swapping: ");
       showList(arr);
       swapPairs(arr);
       System.out.println("The list after swapping: ");
       showList(arr);
    }
    public static void swapPairs(ArrayList<String> arr)
    {
        String temp;
        for(int i = 0; i < arr.size() && i+2 <= arr.size(); i=i+2)
       {
          temp = arr.get(i);
          arr.set(i, arr.get(i+1));
          arr.set(i+1, temp); 
       }
    }
    public static void showList(ArrayList<String> arr)
    {
        for(int i = 0; i < arr.size(); i++)
       {
           System.out.print(arr.get(i) + " ");
       }
        System.out.print("\n");
    }
}

