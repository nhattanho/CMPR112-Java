/* Task 1 */
package week7chapter6;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class question1 
{
    public static void main(String[] args) 
    {
        try
        {
            File f = new File("D:\\message.txt");
            FileWriter fw = new FileWriter(f, true);
            BufferedWriter bw = new BufferedWriter(fw);
            
            if(f.exists())
            {
                bw.write("Testing,");
                bw.write("\r\n");
                bw.write("1, 2, 3.");
                bw.write("\r\n\r\n");
                bw.write("This is my output file.");
                bw.close();
                System.out.println("Written into the message.txt file");
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
    }
}

/* Task 2 */
package week7chapter6;

import java.io.File;
import java.util.Scanner;

public class question2 
{
    public static void main(String[] args) 
    {
        String fileName;
        Scanner scan = new Scanner(System.in);
        do
        {
            System.out.print("Please enter the file name: ");
            fileName = scan.nextLine();
            File f = new File(fileName);
            if(!f.exists())
            {
                System.out.println("You have to enter the file name existing on the system, try again!");
                continue;
            }
            System.out.println("You got exactly file name!");
            break;
        }while(true);
    }
}

/* Task 3 */
package week7chapter6;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JFrameClass  extends JFrame{
     public static void main(String[] args)
    {
         //JFrame class allows the program to build something GUI
        JFrame frame = new JFrameClass();
        //allow the frime to utilize spaces
        frame.pack();
        frame.setTitle("IO Processing");
        frame.setVisible(true);
     
    }
     //construct our projects
     private JTextField txtLastname, txtFirstname, txtAddress, txtCity, txtState;
     private JLabel lblLastname, lblFirstname, lblAddress, lblCity, lblState;
     private JButton btnSubmit;
     private JButton btnClear;
    
     // intialize the objects by placing them on the frame
     public JFrameClass()
     {
         JPanel p = new JPanel();
         
         p.add(lblLastname = new JLabel("Lastname"));
                                // 20 = width
         p.add(txtLastname = new JTextField(10));
         
         p.add(lblFirstname = new JLabel("Firstname"));
                                // 20 = width
         p.add(txtFirstname = new JTextField(10));
         
         p.add(lblAddress = new JLabel("Address"));
         p.add(txtAddress = new JTextField(10));
         
         p.add(lblCity = new JLabel("Clty"));
         p.add(txtCity = new JTextField(10));
         
         p.add(lblState = new JLabel("State"));
         p.add(txtState = new JTextField(2));
         
         p.add(btnSubmit = new JButton ("Submit"));
         p.add(btnClear = new JButton ("Clear"));
         //position the frame
         add(p,BorderLayout.EAST);
                          //places the ears
                          //to the button control
         btnSubmit.addActionListener(new ActionListener()
         
         {
             
            public void actionPerformed(ActionEvent e)
            {
                 //what is the action?
                 
                 try
                 {
                    File f = new File("D:\\Confirm.txt");
                    FileWriter fw = new FileWriter(f,true);
                    BufferedWriter bw = new BufferedWriter(fw);
                    bw.write(txtLastname.getText() + " " + txtFirstname.getText() + " " + txtAddress.getText() + " " + txtCity.getText() + " " + txtState.getText());
                    bw.newLine();
                    bw.close();
                    JOptionPane.showMessageDialog(null,"Confirm");
                 }
                catch(Exception ex)
               {
                    JOptionPane.showMessageDialog(null,"Error " + ex);
                }
            }
         });
         btnClear.addActionListener(new ActionListener()
         {
             public void actionPerformed(ActionEvent e)
             {
                 txtLastname.setText("");
                 txtFirstname.setText("");
                 txtCity.setText("");
                 txtState.setText("");
             }
         });
     }
}

/* Task 4 */
package week7chapter6;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JFrameClass  extends JFrame{
     public static void main(String[] args)
    {
         //JFrame class allows the program to build something GUI
        JFrame frame = new JFrameClass();
        //allow the frime to utilize spaces
        frame.pack();
        frame.setTitle("IO Processing");
        frame.setVisible(true);
     
    }
     //construct our projects
     private JTextField txtLastname, txtFirstname, txtAddress, txtCity, txtState;
     private JLabel lblLastname, lblFirstname, lblAddress, lblCity, lblState;
     private JButton btnSubmit;
     private JButton btnClear, btnRead;
    
     // intialize the objects by placing them on the frame
     public JFrameClass()
     {
         JPanel p = new JPanel();
         
         p.add(lblLastname = new JLabel("Lastname"));
                                // 20 = width
         p.add(txtLastname = new JTextField(10));
         
         p.add(lblFirstname = new JLabel("Firstname"));
                                // 20 = width
         p.add(txtFirstname = new JTextField(10));
         
         p.add(lblAddress = new JLabel("Address"));
         p.add(txtAddress = new JTextField(10));
         
         p.add(lblCity = new JLabel("Clty"));
         p.add(txtCity = new JTextField(10));
         
         p.add(lblState = new JLabel("State"));
         p.add(txtState = new JTextField(2));
         
         p.add(btnSubmit = new JButton ("Submit"));
         p.add(btnClear = new JButton ("Clear"));
         p.add(btnRead = new JButton ("Read"));
         //position the frame
         add(p,BorderLayout.EAST);
                          //places the ears
                          //to the button control
         btnSubmit.addActionListener(new ActionListener()
         
         {
             
            public void actionPerformed(ActionEvent e)
            {
                 //what is the action?
                 
                 try
                 {
                    File f = new File("D:\\Confirm.txt");
                    FileWriter fw = new FileWriter(f,true);
                    BufferedWriter bw = new BufferedWriter(fw);
                    bw.write(txtLastname.getText() + " " + txtFirstname.getText() + " " + txtAddress.getText() + " " + txtCity.getText() + " " + txtState.getText());
                    bw.newLine();
                    bw.close();
                    JOptionPane.showMessageDialog(null,"Confirm");
                 }
                catch(Exception ex)
               {
                    JOptionPane.showMessageDialog(null,"Error " + ex);
                }
            }
         });
         btnRead.addActionListener(new ActionListener()
         {
             public void actionPerformed(ActionEvent e)
             {
                 try{
                     File f = new File("D:\\Confirm.txt");
                     FileReader fr = new FileReader(f);
                     BufferedReader br = new BufferedReader(fr);
                     
                     String read;
                     while((read=br.readLine()) !=null)
                             {
                                 JOptionPane.showMessageDialog(null, read);
                                 
                             }
                     JOptionPane.showMessageDialog(null, br);
                     
                 }
                 catch(Exception ex)
                 {
                     JOptionPane.showMessageDialog(null, ex);
                 }
             }
         });
         btnClear.addActionListener(new ActionListener()
         {
             public void actionPerformed(ActionEvent e)
             {
                 txtLastname.setText("");
                 txtFirstname.setText("");
                 txtCity.setText("");
                 txtState.setText("");
             }
         });
     }
}
