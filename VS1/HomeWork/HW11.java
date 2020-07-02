/* Task 1 */
import java.util.ArrayList;

public class MainClass 
{
    public static void main(String[] args)
    {
        System.out.println("Test for list1!");
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        for(int i = 0; i < list1.size(); i++)
            System.out.println("#" + (i+1) + ": " + list1.get(i));
        
        System.out.println("Test for list2!");
        ArrayList<String> list2 = new ArrayList<String>(20);
        list2.add("number1");
        list2.add("nunber2");
        list2.add("number3");
        for(int i = 0; i < list2.size(); i++)
            System.out.println("#" + (i+1) + ": " + list2.get(i));
        
        System.out.println("Test for list3!");
        ArrayList<Integer> list3 = new ArrayList<Integer>(list1);
        list3.add(4);
        list3.add(5);
        list3.add(6);
        for(int i = 0; i < list3.size(); i++)
            System.out.println("#" + (i+1) + ": " + list3.get(i));
    }
}

/* Task 2 */
import java.util.ArrayList;

public class Person 
{
    ArrayList<String> children = new ArrayList<String>();
    public String personTest()
    {
        return "Henry VIII";
    }
    public String getFather()
    {
        return "Henry VII";
    }
    public String getMother()
    {
        return "Elizabeth of York";
    }
    public void showMaternal()
    {
        System.out.println("Person's name? " + personTest());
        System.out.println("Maternal Line:");
        System.out.println("\t" + personTest());
        System.out.println("\t\t" + getMother());
    }
    public void showPaternal()
    {
        System.out.println("Paternal Line:");
        System.out.println("\t" + personTest());
        System.out.println("\t\t" + getFather());
    }
    public void getChildren()
    {
        children.add("Mary I");
        children.add("Elizabeth I");
        children.add("Edward VI");
    }
    public void showChildren()
    {
        System.out.println("Children:");
        System.out.println("\t" + children.get(0));
        System.out.println("\t" + children.get(1));
        System.out.println("\t" + children.get(2));
        
    }
}
package week9homework7;

public class Main 
{
    public static void main(String[] args)
    {
        Person p = new Person();
        p.showMaternal();
        p.showPaternal();
        p.getChildren();
        p.showChildren();
    }
}

