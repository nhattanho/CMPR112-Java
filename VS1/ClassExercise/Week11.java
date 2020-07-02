/* Task 1 */
/*Continuing from the Class1, Class2 and Class3 create a Class4,
with a Scanner class and ask the user to input the Address, City,
State with Zip code and from the Class3 inherit Class1 where it
will also inherit Class2 because Class1 extends to Class2*/

package week11chapter9;

import java.util.Scanner;

public class Class1 extends Class2
{
    public void CallClass1()
    {
        System.out.println("Calling class1");
    }

    public String InputNames()
    {
        String lastName, firstName;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the lastname: ");
        lastName = scan.nextLine();
        
        System.out.println("Enter the firstname: ");
        firstName = scan.nextLine();
        
        return lastName + ", " + firstName; 
    }
}
package week11chapter9;

import java.util.Scanner;

public class Class2 extends Class4
{
    public void CallClass2()
    {
        System.out.println("Calling class2");
    }
    
    public int InputAge()
    {
        int age;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the age: ");
        age = scan.nextInt();
        return age;
    }
}

package week11chapter9;

public class Class3 
{
    public static void main(String[] args)
    {
        Class1 c1 = new Class1();
        c1.CallClass1();
        c1.CallClass2();
        
        Class2 c2 = new Class2();
        
        System.out.println("Full name " + c1.InputNames() + "\n" + "age " + c1.InputAge() + "\n" +  "Address " +  c2.InputAddressCityState() + "\n" + "Zipcode " + c2.zip());
        
    }
}

package week11chapter9;
import java.util.Scanner;

public class Class4
{
    public String InputAddressCityState()
    {
        Scanner scan = new Scanner(System.in);
        String address, city, state;
    
        System.out.println("Enter the address: ");
        address = scan.nextLine();
        
        System.out.println("Enter the city: ");
        city = scan.nextLine();
        
        System.out.println("Enter the state: ");
        state = scan.nextLine();
        
        return address + " " + city + " " + state;
    }
    
    public int zip()
    {
        int zip;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the zipcode: ");
        zip = scan.nextInt();
        return zip;
    }
}

/* Task 2 */
package week11chapter9;

public class Firstname extends Lastname
{
    public void callFirstName()
    {
        System.out.println("This is call for enter first name");
    }
}
package week11chapter9;

import java.util.Scanner;

public class Middlename 
{
    public String setMiddleName()
    {
        Scanner scan = new Scanner(System.in);
        String last;
        System.out.print("Enter your middle name: ");
        last = scan.nextLine();
        return last;
    }
}
package week11chapter9;

import java.util.Scanner;

public class Lastname 
{
    public String setLastName()
    {
        Scanner scan = new Scanner(System.in);
        String last;
        System.out.print("Enter your last name: ");
        last = scan.nextLine();
        return last;
    }
    
    public String setFirstName()
    {
        Scanner scan = new Scanner(System.in);
        String first;
        System.out.print("Enter your first name: ");
        first = scan.nextLine();
        return first;
    }
}
package week11chapter9;
import javax.swing.JOptionPane;

public class GetAllNames 
{
     public static void main(String[] args)
    {
        String lastName, middleName, firstName;
        String result;
        Firstname first = new Firstname();
        firstName = first.setFirstName();
        lastName = first.setLastName();
    
        Middlename middle = new Middlename();
        middleName = middle.setMiddleName();
        
        result = "Lastname is " + lastName + "\n" +
                "Firstname is " + firstName + "\n" +
                "Middlename is " + middleName;
        
        JOptionPane.showMessageDialog(null, result);
    }
}

/* Task 3 */
package week11chapter9;

public class Dog 
{
    protected String name;
    //--------------------------------------------------------------------------
    // Constructor -- store name
    //--------------------------------------------------------------------------
    public Dog(String name)
    {
        this.name = name;
    }
    //--------------------------------------------------------------------------
    // Returns the dog's name
    //--------------------------------------------------------------------------
    public String getName()
    {
        return name;
    }
    //--------------------------------------------------------------------------
    // Returns a string with the dog's comments
    //--------------------------------------------------------------------------
    public String speak()
    {
        return "Woof";
    }
}
package week11chapter9;

public class Labrador extends Dog
{
    private String color; //black, yellow, or chocolate?
    private int breedWeight = 75;
    
    public Labrador(String name) 
    {
        super(name);
    }
    public String Labrador(String color)
    {
        this.color = color;
        return this.color;
    }
    
    //--------------------------------------------------------------------------
    // Big bank -- overrides speak method in Dog
    //--------------------------------------------------------------------------
    public String speak()
    {
        return "WOOF";
    }
    //--------------------------------------------------------------------------
    // Returns weight
    //--------------------------------------------------------------------------
    public int avgBreedWeight()
    {
        return breedWeight;
    }
}
package week11chapter9;

public class Yorkshire extends Dog
{
    public Yorkshire(String name)
    {
        super(name);
    }
    //--------------------------------------------------------------------------
    // Small bark -- override speak method in Dog
    //--------------------------------------------------------------------------
    public String speak()
    {
        return "woof";
    }
}
package week11chapter9;

public class DogTest 
{
    public static void main(String[] args)
    {
        Dog dog = new Dog("Spike");
        System.out.println(dog.getName() + " says " + dog.speak());
    }
}

/* Task 4 */
package week11chapter9;

public class Mammal 
{
    public class Mammal extends SeaCreature 
    {
        public void method1()
        {
            System.out.println("warm-blooded");
        }
    }
}
package week11chapter9;

public class SeaCreature 
{
    public void method1()
    {
        System.out.println("creature 1");
    }
    
    public void method2()
    {
        System.out.println("creature 2");
    }
    
    public String toString()
    {
        return "ocean-dwelling";
    }
}

package week11chapter9;

public class Whale extends Mammal
{
    public void method1()
    {
        System.out.println("spout");
    }
    public String toString()
    {
        return "BIG!";
    }
}
package week11chapter9;

public class Squid extends SeaCreature
{
    public void method2()
    {
        System.out.println("tentacles");
    }
    
    public String toString()
    {
        return "squid";
    }
}
package week11chapter9;

public class Main_method 
{
    public static void main(String[] args)
    {
        System.out.println("\nCall SeaCreature");
        SeaCreature sea = new SeaCreature();
        sea.method2();
        sea.method1();
        System.out.println(sea.toString());
        
        System.out.println("\nCall Squid");
        Squid squid = new Squid();
        squid.method1();
        squid.method2();
        System.out.println(squid.toString());
        
        System.out.println("\nCall Whale");
        Whale whale = new Whale();
        whale.method1();
        whale.method2();
        System.out.println(whale.toString());
        
        System.out.println("\nCall Mammal");
        Mammal mammal = new Mammal();
        mammal.method1();
        mammal.method2();
        System.out.println(mammal.toString());         
    }
}
