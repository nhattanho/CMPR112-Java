/* Task 1 */
package week15_part2;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Toppings  extends JFrame
{  
       private JCheckBox chkcheese, chkButter, chkPeachJelly, chkButterJam;
       private JLabel lblTotal;
       
       public Toppings ()
       {
           super("Toppings App");
           setBounds(200,200,300,200);
           JPanel panel = new JPanel();
           
           panel.setLayout(new GridLayout(5,50));
           
           panel.add(chkcheese = new JCheckBox("Cheese"));
           panel.add(chkButter = new JCheckBox("Butter"));
           panel.add(chkPeachJelly = new JCheckBox("Peach Jelly"));
           panel.add(chkButterJam = new JCheckBox("Butter Jam"));
           
           panel.add(lblTotal = new JLabel(""));
           
           add(panel, BorderLayout.CENTER);
           setVisible(true);
           
           chkcheese.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    double cheese = 0.75;
                    if(chkcheese.isSelected())
                    {
                       JOptionPane.showMessageDialog(null, "Toppings selected " + chkcheese.getText());
                       lblTotal.setText("Total is $ " + cheese);
                    }
                }
                
            });
           
           chkButter.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    double butter = 0.9;
                    double cheese = 0.75;
                    double total = cheese + butter;
                    if(chkButter.isSelected() && chkButter.isSelected())
                    {
                       JOptionPane.showMessageDialog(null, "Toppings selected " + chkButter.getText() + " " + chkcheese.getText());
                       lblTotal.setText("Total is $ " + total);
                    }
                    else if (chkButter.isSelected())
                    {
                        JOptionPane.showMessageDialog(null, "Toppings selected " + chkButter.getText());
                        lblTotal.setText("Total is $ " + butter);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Please choose Toppings!");
                    }
                }
                
            });
           
           chkButterJam.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    double butterJam = 0.75;
                    if(chkButterJam.isSelected())
                    {
                       JOptionPane.showMessageDialog(null, "Toppings selected " + chkButterJam.getText());
                       lblTotal.setText("Total is $ " + butterJam);
                    }
                }
                
            });
           
           chkPeachJelly.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    double peachJelly = 0.8;
                    if(chkPeachJelly.isSelected())
                    {
                       JOptionPane.showMessageDialog(null, "Toppings selected " + chkPeachJelly.getText());
                       lblTotal.setText("Total is $ " + peachJelly);
                    }
                }
                
            });
       }
}

package week15_part2;
import javax.swing.JFrame;
public class CallTopping extends JFrame
{
    public static void main(String[] args)
    {
        JFrame frame = new Toppings();
        frame.pack();
        frame.setVisible(true);
    }
}

/* Task 2 */
package week15_part2;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
public class CustomerApp extends javax.swing.JFrame {
    /**
     * Creates new form CustomerApp
     */
    public CustomerApp() {
        initComponents();
        JOptionPane.showMessageDialog(null, "Welcome to my app");
        ButtonGroup btn = new ButtonGroup();
        btn.add(rdoMale);
        btn.add(rdoFemale);
       
        Toppings frame = new Toppings();
        frame.pack();
        frame.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        chkSmokePreferences = new javax.swing.JCheckBox();
        rdoMale = new javax.swing.JRadioButton();
        rdoFemale = new javax.swing.JRadioButton();
        btnSubmit = new javax.swing.JButton();
        txtLastname = new javax.swing.JTextField();
        txtFirstname = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Lastname");

        jLabel2.setText("Firstname");

        chkSmokePreferences.setText("Do you smoke?");

        rdoMale.setText("Male");

        rdoFemale.setText("Female");

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkSmokePreferences)
                            .addComponent(rdoFemale)
                            .addComponent(rdoMale))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtLastname, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtLastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chkSmokePreferences)
                        .addGap(18, 18, 18)
                        .addComponent(rdoMale)
                        .addGap(18, 18, 18)
                        .addComponent(rdoFemale))
                    .addComponent(btnSubmit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Here is your confimation: " + txtLastname.getText() + " , " + txtFirstname.getText() + " ; " + 
                                        rdoMale.getText() + " , " + rdoFemale.getText());
    }                                         
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CustomerApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnSubmit;
    private javax.swing.JCheckBox chkSmokePreferences;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton rdoFemale;
    private javax.swing.JRadioButton rdoMale;
    private javax.swing.JTextField txtFirstname;
    private javax.swing.JTextField txtLastname;
    // End of variables declaration                   
}

