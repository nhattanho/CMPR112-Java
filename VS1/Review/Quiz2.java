/* Task 1 */
package quiz2;
public class Quiz2 
{
    public static void main(String[] args) 
    {
        int arr[] = new int[10];
        int sum = 0;
        double average;
        // Initialize the array 
        for(int i = 0; i< 10; i++)
        {
            arr[i] = i+1;
        }
        
        // Calculate the sum 
        System.out.println("The elements of array are: ");
        for(int i = 0; i< 10; i++)
        {
            System.out.print(arr[i] + " ");
            sum += arr[i];
        }
        average = (sum*1.0)/arr.length;
        
        System.out.println("\nThe sum of array through numbers 1-10: " + sum);
        System.out.print("The average is: ");
        System.out.printf("%.2f\n", average);
    }   
}

/* Task 2 */
package quiz2;
public class number2
{
    public static void main(String[] args) 
    {
        int arr[][] = new int[2][5];
        // Initialize the 2-D array from 1-10
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                if (i == 1)
                    arr[i][j] = j + 1 + arr[i].length;
                else
                    arr[i][j] = j+1;    
            }
        }
        // List the array
        System.out.println("The elements of array are: ");
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                 System.out.print(arr[i][j] + " ");  
            }
        }
        System.out.println("\nOutput the number one: " + arr[0][0]);
        
        System.out.println("Output the number ten: " + arr[1][4]);
    }
}

/* Task 3 */
package quiz2;
public class number3 
{
    public static void main(String[] args) 
    {
        int nums = 'J' -'A';
        char arr[] = new char[nums+1];
        for (char c = 'A'; c <= 'J'; c++) 
        {
            arr[c - 'A'] = c;
        }
        System.out.print("The letters from A-J: ");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

/* Task 4 */
package quiz2;

public class number3 
{
    public static void main(String[] args) 
    {
        int nums = 'T' - 'A';
        char arr[][] = new char[2][nums/2 +1];
        char first = 'A';
        // Initialize the 2-D array
        for (int i = 0; i < arr.length; i++) 
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                arr[i][j] = first;
                first++;
            }
        }
        System.out.print("The letters from A-T: ");
        for (int i = 0; i < arr.length; i++) 
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
        }
        System.out.println();
    }
}

/* Task 5 */
package quiz2;
public class Holiday 
{
    private String name;
    private int day;
    private String month;
    public void setName(String newName)
    {
        name = newName;
    }
    public void setDay(int newDay)
    {
        day = newDay;
    }
    public void setMonth(String newMonth)
    {
        month = newMonth;
    }
    public void showInfo()
    {
        System.out.println("Holiday is " + name + " on " + month + " " + day);
    }
}

package quiz2;
public class getHoliday 
{
    public static void main(String[] args) 
    {
        Holiday Thanksgiving = new Holiday();
        Thanksgiving.setName("Thanksgiving");
        Thanksgiving.setDay(22);
        Thanksgiving.setMonth("November");
        Thanksgiving.showInfo();
    }
}

/* Task 6 */
package quiz2;
public class Movie 
{
    private String title;
    private String studio;
    private String rating;
    public void setTitle(String newTitle)
    {
        title = newTitle;
    }
    public void setStudio(String newStudio)
    {
        studio = newStudio;
    }
    public void setRating(String newRating)
    {
        rating = newRating;
    }
    public void showInfo()
    {
        System.out.println("Movie has title is " + title + " of " + studio + " and rating is " + rating);
    }
}
package quiz2;

public class getMovie 
{
     public static void main(String[] args) 
    {
        Movie movie = new Movie();
        movie.setTitle("Fast and Furious");
        movie.setStudio("America");
        movie.setRating("PG-13");
        movie.showInfo();
    }
}

/* Task 7 */
package quiz2week13;
import java.util.Scanner;

public class a extends b
{
    public int getNumber1()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number1: ");
        return scan.nextInt();
    }
}
package quiz2week13;

import java.util.Scanner;

public class b 
{
    public int getNumber2()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number2: ");
        return scan.nextInt();
    }
}
package quiz2week13;

public class c extends a
{
    public static void main(String[] args) 
    {
      a test = new a();
      int number1 = test.getNumber1();
      int number2 = test.getNumber2();
      System.out.println("The number 1 is " + number1);
      System.out.println("The number 2 is " + number2);
      System.out.println("The sum is " + (number1+number2));
      System.out.print("The average is ");
      double average = (number1+number2)/2.0;
      System.out.printf("%.2f\n",average);
    }  
}

/* Task 8 */
package quiz2week13;
import java.util.Scanner;
public class d extends e
{
    public String getLast()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter last name: ");
        return scan.nextLine();
    }
}

package quiz2week13;
import java.util.Scanner;
public class e
{
       public String getFirst()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter first name: ");
        return scan.nextLine();
    }
}

package quiz2week13;
public class f 
{
    public static void main(String[] args) 
    {
        d name = new d();
        String last = name.getLast();
        String first = name.getFirst();
        String fullName = first + " " + last;
        System.out.println("The full name is " + fullName);
    }
}

/* Task 9 */
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class number3 
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        ArrayList<Integer> ages = new ArrayList<Integer>();
        for(int i = 0; i < 3; i++)
        {
            // Age should be from 1 - 100
            ages.add(rand.nextInt(100) + 1);
        }
        for(int i = 0; i < 3; i++)
        {
            System.out.println("The age " + (i+1) + " is " + ages.get(i));
        }
        System.out.println("The initial size of the list: " + ages.size());
    }
}

/* Task 10 */
import java.util.ArrayList;
public class number4 
{
    public static void main (String[] args)
    {
        Random rand = new Random();
        ArrayList<String> names = new ArrayList<String>();
        names.add("Athony");
        names.add("Michel");
        names.add("Robert");
        for(int i = 0; i < names.size(); i++)
        {
            System.out.println("The name #" + (i+1) + " is " + names.get(i));
        }        
    }
}

