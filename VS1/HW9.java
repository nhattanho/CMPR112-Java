/* Task 1 */
package week11hw9;

public class Employee 
{
    public int getHours()
    {
        return 80;
    }
    public double getSalary(){
        return 80000.0;
    }
    public int getVacationDays(){
        return 20;
    }
    public String getVacationForm(){
        return "red";
    } 
}
package week11hw9;

public class Marketer extends Employee
{
    public void advertise() 
    {
        System.out.println("Act now, while supplies last!");
    }
    @Override
    public double getSalary() 
    {
        return super.getSalary() + 10000;
    }
}
package week11hw9;
public class Week11hw9 
{
    public static void main(String[] args) 
    {
        System.out.println("Employee:");
        Employee edna =  new Employee();
        System.out.print("The hours: " + edna.getHours() + " and the salary: ");
        System.out.printf("$%.2f\n", edna.getSalary());
        
        System.out.println("Marketer:");
        Marketer stan =  new Marketer();
        stan.advertise();
        System.out.print("The hours: " + stan.getHours() + " and the salary: ");
        System.out.printf("$%.2f\n", stan.getSalary());
    }
}

/* Task 2 */
package week11hw9;
public class Player 
{
    String sport, name;
    int number;
    double salary;
    public void setSport(String whatSport)
    {
        sport = whatSport;
    }
    public void setName(String newName)
    {
        name = newName;
    }
    public void setNumber(int newNumber)
    {
        number = newNumber;
    }
    public void setSalary(double newSalary)
    {
        salary = newSalary;
    }
    public String getSport()
    {
        return sport;
    }
    public String getName()
    {
        return name;
    }
    public int getNumber()
    {
        return number;
    }
    public double getSalary()
    {
        return salary;
    }
}
package week11hw9;

public class Soccer extends Player
{
    public void showFavorite()
    {
        System.out.println("My favorite sport is soccer!");
    }
    public void showInfor()
    {
        System.out.println("Player have to kick the ball.");
    }    
}
package week11hw9;

public class CallPlayer 
{
    public static void main(String[] args)
    {
        Soccer davis = new Soccer();
        davis.setName("Beckham");
        davis.setSport("soccer");
        davis.setNumber(7);
        davis.setSalary(100000);
        davis.showFavorite();
        davis.showInfor();
        System.out.print("My favorite player is " + davis.getName());
        System.out.println(", he is a " + davis.getSport() + " player!");
        System.out.print("The number of his T-shirt is " + davis.getNumber());
        System.out.println(", and his salary is $" + davis.getSalary() + " per week.");
    }
}

/* Task 3 */
package week11hw9;

public class A 
{
    int i = 10;
}
package week11hw9;

public class B extends A
{
    int i = 20;
}
package week11hw9;

public class MainClass 
{
    public static void main(String[] args)
    {
        A a = new B();
        System.out.println(a.i);
    }
}

/* Task 4 */
package week11hw9;

public class A 
{
    {
        System.out.println(1);
    }
}
package week11hw9;

public class B extends A
{
    {
        System.out.println(2);
    }
}
package week11hw9;

public class C extends B
{
    {
        System.out.println(3);
    }
}
package week11hw9;

public class MainClass 
{
    public static void main(String[] args)
    {
        C c = new C();
    }
}

