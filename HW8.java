 /* Task 1 */
package week10hw8;

public class RetailItem 
{
    String description;
    int unitsOnHand;
    double price;
    
    public RetailItem()
    {
        description = "";
        unitsOnHand = 0;
        price = 0;
    }
    public RetailItem(String newDescription, int newUnits, double newPrice)
    {
         description = newDescription;
         unitsOnHand = newUnits;
         price = newPrice;
    } 
    public void setDescription(String newDescription)
    {
        description = newDescription;
    }
    public void setUnits(int newUnitsOnHand)
    {
        unitsOnHand = newUnitsOnHand;
    }
    public void setPrice(double newPrice)
    {
        price = newPrice;
    }
    public String getDescription()
    {
        return description;
    }
    public int getUnits()
    {
        return unitsOnHand;
    }
    public double getPrice()
    {
        return price;
    }
    public void showInfo()
    {
        System.out.println("Description: " + getDescription());
        System.out.println("Units on Hand: " + getUnits());
        System.out.println("Price: " + getPrice());
    }
}
package week10hw8;

public class Week10hw8 
{
    public static void main(String[] args) 
    {
       RetailItem item1 = new RetailItem("Jacket", 12, 59.95);
       RetailItem item2 = new RetailItem("Designer Jeans", 40, 34.95);
       RetailItem item3 = new RetailItem(); 
       item3.setDescription("Shirt");
       item3.setUnits(20);
       item3.setPrice(24.95);
       
       System.out.println("Item#1:");
       item1.showInfo();
       System.out.println("Item#2:");
       item2.showInfo();
       System.out.println("Item#3:");
       item3.showInfo();
    }
}

/* Task 2 */
package week10hw8;
import java.util.*;
import javax.swing.JOptionPane;

public class EX2 
{
    private Formatter x;
    
    // Creating a method to open the file
    public void OpenFile()
    {
        try
        {
            x = new Formatter("Example.txt");
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "For some reason the file has not been created" + ex);
        }
    }
    
    // Creating a method to open the file
    public void addRecords()
    {
        // Adding three string with %s
        // 1 is the first string, Jason is the second string and so on
        x.format("%s%s%s", "1", " Jason"," Sim");
    }
    public void closeFile()
    {
        x.close();
    }
}
package week10hw8;
import javax.swing.JOptionPane;

public class EX3 
{
    public static void main(String[] args)
    {
        EX2 F = new EX2();
        F.OpenFile();
        F.addRecords();
        F.closeFile();
        JOptionPane.showMessageDialog(null, "File Written into");
    }
}

/* Task 3 */
package week10hw8;
import java.io.File;
import java.util.*;
import javax.swing.JOptionPane;

public class EX4 
{
    private Scanner x;
    public void openFile()
    {
        try
        {
            x = new Scanner(new File("Example.txt"));
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,"Could not find file " + ex);
        }
    }
    // Method to read the file
    public void readFile()
    {
        while(x.hasNext())
        {
            String a = x.next();
            String b = x.next();
            String c = x.next();
            System.out.printf("%s %s %s \n", a,b,c);
        }
    }
    public void closeFile()
    {
        x.close();
    }
}
package week10hw8;
import javax.swing.JOptionPane;

public class EX5 
{
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        EX4 r = new EX4();
        r.openFile();
        r.readFile();
        r.closeFile();
        
        JOptionPane.showMessageDialog(null, "Here are the results");
    }
}

