/* Task 1 */
package week10chapter8;

public class Pet 
{
    String name;
    String animal;
    int age;
    public void setName(String newName)
    {
        name = newName;
    }
    public void setAnimal(String newAnimal)
    {
        animal = newAnimal;
    }
    public void setAge(int newAge)
    {
        age = newAge;
    }
    
    public String getName()
    {
        return name;
    }
    public String getAnimal()
    {
        return animal;
    }
    public int getAge()
    {
        return age;
    }
}
------------------------------------------------------------------------------------------------------------------------------------------
package week10chapter8;

public class GetPetInfo 
{
    public static void main(String[] args)
    {
        Pet p1 = new Pet();
        
        // get the date into the object
        p1.name = "suzy";
        p1.animal = "Dog";
        p1.age = 5;
        
        Pet p2 = new Pet();
        p2.setName("meow");
        p2.setAnimal("Cat");
        p2.setAge(10);
        // output the data 
        System.out.println("Animal Info: " + p1.name + " " + p1.animal + " " + p1.age);
        System.out.println("Animal Info: " + p2.name + " " + p2.animal + " " + p2.age);
    }
}

/* Task 2 */
package week10chapter8;

public class MyClass 
{
    private int x;
    private double y;
    public double MyClass(int a, double b)
    {
        x = a;
        y = b;
        return (x+y);
    }
}
package week10chapter8;

public class MyClassMain 
{
    public static void main(String[] args)
    {
        MyClass m = new MyClass();
        m.MyClass(0,0);
        
        System.out.println("Calling the number " + m.MyClass(35,35.0));
    }
}

/* Task 3 */
package week10chapter8;

public class C1 
{
    public int total(int value1, int value2, int value3)
    {
        return (value1 + value2 + value3);
    }
}
package week10chapter8;

public class C2 
{
    public static void main(String[] args)
    {
        C1 var = new C1();
        var.total(0,0,0);
        System.out.println("The total is " + var.total(1,2,3));
    }
}

/* Task 4 */
package week10chapter8;

public class RetailItem
{
    String description;
    int unitsOnHand;
    double price;

    public void RetailItem(String newDescription, int newUnits, double newPrice)
    {
        description = newDescription;
        unitsOnHand = newUnits;
        price = newPrice;
    }
    public void ShowInfo()
    {
        System.out.println("The description is: " + description);
        System.out.println("The unitsOnHand is: " + unitsOnHand);
        System.out.println("The price is: " + price);
    }
}
package week10chapter8;

public class task3 
{
    public static void main(String[] args)
    {
        RetailItem[] Item = new RetailItem[3];
        for(int i = 0; i < 3; i++)
        {
            Item[i] = new RetailItem();
        }
        Item[0].RetailItem("Jacket", 12, 59.95);
        Item[1].RetailItem("Designer Jeans", 40, 34.95);
        Item[2].RetailItem("Shirt", 20, 24.95);       
        
        for(int i = 0; i < 3; i++)
        {
            System.out.println("Information of Item#" + (i+1));
            Item[i].ShowInfo();
        }
    }
}

/* Task 5 */
package week10chapter8;

public class Rooms 
{
    // setting the 2 variables
    double length, width;
    
    // creating our methods
    public void setLength(double len)
    {
        length = len;
    }
    public void setWidth(double w)
    {
        width = w;
    }
    public double getLength()
    {
        return length;
    }
    public double getWidth()
    {
        return width;
    }
    public double getArea()
    {
        return length * width;
    }
}
package week10chapter8;

import java.util.Scanner;

public class RoomAreas 
{
    public static void main(String[] args)
    {
        double number, totalArea;
        Scanner scan = new Scanner(System.in);

        // Calling the Rectangle class and passing it to the kitchen variable
        Rooms kitchen = new Rooms();

        System.out.print("What is the kitchens length? ");
        number = scan.nextDouble();
        kitchen.setLength(number);
        
        System.out.print("What is the kitchens width? ");
        number = scan.nextDouble();
        kitchen.setWidth(number);
        
        totalArea = kitchen.getArea();
        
        System.out.println("The kitchens length is " + kitchen.getLength());
        
       System.out.println("The kitchens width is " + kitchen.getWidth());
       
       System.out.print("The kitchens total area is ");
       System.out.printf("%.2f\n",totalArea);
        
    }
}

