/* Task 1 */
package week9homework7;
import java.util.Scanner;
public class Week9Homework7 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int numbers = 0;
        int[] array;
        double percent = 0;
        System.out.print("How many number do you want? ");
        numbers = scan.nextInt();
        array = new int[numbers];
         for(int c = 0; c < numbers; c++)
         {
             System.out.print("Ener the number: ");
             array[c] = scan.nextInt();
         }
         showArray(array);
         System.out.print("\nWe are calling the percentEven method.....");
         percent = percentEven(array);
         System.out.println("\nThe percentage of the even number in your array: " + percent);
    }   
    
    public static void showArray(int array[])
    {
        System.out.print("Your array: ");
        for(int c = 0; c < array.length; c++)
         {
             System.out.print(array[c] + " ");
         }
    }
    
    public static double percentEven(int array[])
    {
        double count = 0, percent = 0;
        for(int i = 0; i< array.length; i++)
        {
            if(array[i]%2 == 0)
                count++;
        }
        percent = (count / array.length)*100; 
        return percent;
    }
}

/* Task 2 */
package week9homework7;

public class question2 
{
    public static void main(String[] args) 
    {
        int[] list1 = {1, 6, 2, 1, 4, 1, 2, 1, 8};
        int[] list2 = {1, 2, 1};
        System.out.println("For list1!");
        for(int i = 0; i < list1.length; i++)
            System.out.println("Number " + i + " is " + list1[i]);
        
        System.out.println("For list2!");
        for(int i = 0; i < list2.length; i++)
            System.out.println("Number " + i + " is " + list2[i]);
    }
}

/*Task 3 */
package week9homework7;
public class question3 
{
    public static void main(String[] args) 
    {
        int [][][] threeD = {{ {1, 2, 3}, {4, 5, 6}, {7, 8, 9} }};
        System.out.print("Retriece numbers: ");
        System.out.println(threeD[0][0][2] + ", " + threeD[0][1][2]
                        + ", " + threeD[0][2][2]);
    }
}

/* Task 4 */
package week9homework7;

public class question3 
{
    public static void main(String[] args) 
    {
        int [][][] threeD = {{ {1, 2, 3}, {4, 5, 6}, {7, 8, 9} }};
        for (int[][] threeD1 : threeD) 
        {
            for (int[] item : threeD1)
            {
                for (int c = 0; c < item.length; c++) 
                    System.out.println("number: " + item[c]);
            }
        }
    }
}

