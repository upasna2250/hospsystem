
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Crack
 */
public class Recep_changeps extends JFrame implements ActionListener{
    JFrame f;
    JPanel p1,p6;
    JButton b1,b2,b3,b4;
    JLabel l1,l2,l3,l4;
   JPasswordField t1,t2,t3;
    
    Recep_changeps(){
        f=new JFrame();
        p1=new JPanel();
        p1.setBounds(0,0,1350, 150);
        p1.setLayout(null);
         
         
        
       p6=new JPanel();
         p6.setBounds(0,50,1350, 80);
         p6.setBackground(Color.blue);
        
         
         
         
         
         b1=new JButton("Home");
         b1.setBounds(1100, 70, 80, 30);
        b1.addActionListener(this);
         b2=new JButton("logout");
         b2.setBounds(1200, 70, 80, 30);
         b2.addActionListener(this);
       b3=new JButton("Change");
         b3.setBounds(350, 450, 80, 30);
         b3.addActionListener(this);
        b4=new JButton("Cancel");
         b4.setBounds(550, 450, 80, 30);
         b4.addActionListener(this);
      
       
         p1.add(b1);
         p1.add(b2);
         p1.add(b3);
          p1.add(b4);   
         
         
          l1=new JLabel("Change Password");
        l1.setBounds(100,50,300, 60);
        l1.setFont(new Font("a",Font.ITALIC,30 ));
        l1.setForeground(Color.white);
        l2=new JLabel("Enter Old Password");
        l2.setBounds(300,250,200, 30);
        l3=new JLabel("Enter New Password");
        l3.setBounds(300,310,200, 30);
        
        l4=new JLabel("Confirm New Password");
        l4.setBounds(300,370,200, 30);
        
        
         p1.add(l1);
         p1.add(l2);
         p1.add(l3);
         p1.add(l4);
         
         t1=new JPasswordField();
         t1.setBounds(500, 250, 200, 30);
         
         t2=new JPasswordField();
         t2.setBounds(500, 310, 200, 30);
         t3=new JPasswordField();
         t3.setBounds(500, 370, 200, 30);
         
         p1.add(t1);
         p1.add(t2);
         p1.add(t3);
         p1.add(p6);
        f.add(p1);
        
        
        
        
        
        f.setSize(1350, 700);
         
        
      
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
     public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            new Recep_portal();
            f.dispose();
            
        }
        if(e.getSource()==b2)
        {
            new Login_as();
            f.dispose();
            
        }
        if(e.getSource()==b3)
        {
            String em= Recep_login.un();
                String pas=Recep_login.up();
                String op=t1.getText();
                String np1=t2.getText();
                String np2=t3.getText();
                int d=JOptionPane.showConfirmDialog(null,"Are You Sure To Update Password!","WARNING",JOptionPane.YES_NO_OPTION);
            
            if(d==JOptionPane.YES_OPTION)
            {
                 if((pas.equals(op))&&(np1.equals(np2)))
                 {
                      
                         try {
                             Connection con = Db.getConnection();
                             PreparedStatement ps = con.prepareStatement("update addr set pass=? where uname=? AND pass=?");
                             ps.setString(1, t2.getText());
                             ps.setString(2, em);
                             ps.setString(3, op);
                       int i = ps.executeUpdate();
                if (i > 0) {
                    
                   
                            JOptionPane.showMessageDialog(f,"Updated Successfully!");
                            new Recep_login();
                            f.dispose();
                            
                    
                }
                    }
                          catch (ClassNotFoundException ex) {
                             Logger.getLogger(Doct_changeps.class.getName()).log(Level.SEVERE, null, ex);
                         } catch (SQLException ex) {
                             Logger.getLogger(Doct_changeps.class.getName()).log(Level.SEVERE, null, ex);
                         }
                     }
                 else{
                     JOptionPane.showMessageDialog(f,"Password does not match");
                 }
                
                 
        }
             if(d==JOptionPane.NO_OPTION)
            {
                remove(d);
            }
        }
         if(e.getSource()==b4)
        {
            new Recep_portal();
            f.dispose();
            
        }
    }
   
    
}
