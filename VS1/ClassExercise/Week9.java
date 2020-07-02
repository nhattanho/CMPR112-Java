/* Task 1 */
package week9chapter7;

public class Week9chapter7 
{
    public static void main(String[] args) 
    {
       int [] names = new int[20];
       // Initial the value for array
       for(int i = 0; i < 20; i++)
           names[i] = i+1;
       
       // Print out the elements of the array
       for(int i = 0; i < 20; i++)
           System.out.println("number " + (i+1) + " is: " + names[i]);
    }  
}

/* Task 2 */
package week9chapter7;

public class Week9chapter7 
{
    public static void main(String[] args) 
    {
        int sum = 0;
       int [] names = new int[20];
       // Initial the value for array
       for(int i = 0; i < 20; i++)
           names[i] = i+1;
       
       // Print out the elements of the array
       for(int i = 0; i < 20; i++)
       {
           System.out.println("number " + (i+1) + " is: " + names[i]);
           sum += names[i];
       }
       System.out.println("The sum is: " + sum);
    }  
}

/* Task 3 */
package week9chapter7;

public class question3 
{
    public static void main(String[] args) 
    {
        String [] master = {"Einstein", "Newton", "Copemicus", "Kepler"};
        for(int i = 0; i < master.length; i++)
            System.out.println("This is " + master[i]);
    }
}

/* Task 4 */
package week9chapter7;

public class question4 
{
    public static void main(String[] args) 
    {
        int[] numbers = new int[]{20, 30, 25, 35, -16, 60, -100};
        //calculate sum of all array elements
        int sum = 0;
        double average = 0;
        for(int i=0; i < numbers.length ; i++)
            sum = sum + numbers[i];
        
        //calculate average value
        average = sum/(numbers.length * 1.0); // convert to double number
        System.out.print("Average value of the array elements is: "); 
        System.out.printf("Total is:%.2f\n", average); 
    }
}

/* Task 5 */
package week9chapter7;

public class question5 
{
    public static void main(String[] args) 
    {
        int numbers[][][] = {{ {10,20,30}, {40,50,60}, {70,80,90} }};
        System.out.println("The number: " + numbers[0][1][1]);
    }
}

/* Task 6 */
package week9chapter7;

public class question5 
{
    public static void main(String[] args) 
    {
        int numbers[][][] = {{ {10,20,30}, {40,50,60}, {70,80,90} }};
        for(int a = 0; a < numbers.length; a++)
        {
            for(int b = 0; b < numbers[a].length; b++)
            {
                for(int c = 0; c < numbers[a][b].length; c++)
                    System.out.println("The number: " + numbers[a][b][c]);
            }
        }
    }
}

/* Task 7 */
package week9chapter7;

public class question7 
{
    public static void main(String[] args) 
    {
        int numbers[][] = { {100, 200},{300, 400} };
        System.out.println("Retrieve number 300: " + numbers[1][0]);
    }
}

/* Task 8 */
package week9chapter7;

public class question7 
{
    public static void main(String[] args) 
    {
        int numbers[][] = { {100, 200},{300, 400} };
        for (int[] number : numbers) {
            for (int b = 0; b < number.length; b++) {
                System.out.println("the number is: " + number[b]);
            }
        }
    }
}
