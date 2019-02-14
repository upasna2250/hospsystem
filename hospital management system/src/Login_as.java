/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author Crack
 */
public class Login_as extends JFrame  implements ActionListener{
     JFrame f;
    JLabel l1,l2,bg;
    JButton b1,b2,b3;
    JPanel p,p1;
    Login_as()
    {
        f=new JFrame();
        p=new JPanel();
        p.setBounds(0, 30, 1370, 100);
         p.setBackground(new Color(0, 150, 255, 123));
      
        
         p1=new JPanel();
        p1.setBounds(0, 200, 250, 60);
         p1.setBackground(new Color(255, 255, 255, 150));
        l1=new JLabel("Hospital Management System");
        l1.setBounds(350, 50, 700, 60);
        l1.setFont(new Font("a",Font.ITALIC,50 ));
        l1.setForeground(Color.white);
        
        l2=new JLabel("Login as");
        l2.setBounds(115, 200, 150, 50);
          l2.setFont(new Font("a",Font.ITALIC,32 ));
          l2.setForeground(new Color(0, 150, 255));
          
        b1=new JButton("Admin");
        b1.setBounds(380, 350, 130, 40);
        b1.setForeground(new Color(0, 150, 255));
        b1.addActionListener(this);
        b2=new JButton("Receptionist");
        b2.setBounds(580, 350, 130, 40);
        b2.setForeground(new Color(0, 150, 255));
        b2.addActionListener(this);
        b3=new JButton("Doctor");
        b3.setBounds(780, 350, 130, 40);
        b3.setForeground(new Color(0, 150, 255));
        b3.addActionListener(this);
        
        
        JLabel dl = new JLabel(new ImageIcon("src/Images/i1.PNG"));
          dl.setBounds(780, 200, 130, 150);
          JLabel dr = new JLabel(new ImageIcon("src/Images/i2.PNG"));
          dr.setBounds(580, 200, 130, 150);
          JLabel da = new JLabel(new ImageIcon("src/Images/i3.PNG"));
          da.setBounds(380, 200, 130, 150);
        bg=new JLabel(new ImageIcon("src/Images/7.jpg"));
        f.add(bg);
        bg.setLayout(null);
        
        bg.add(dl);
        bg.add(dr);
        bg.add(da);
        bg.add(l1);
        bg.add(l2);
        bg.add(b1);
        bg.add(b2);
        bg.add(b3);
        bg.add(p);
        bg.add(p1);
        
        
        
        
        f.setSize(1350, 700);

     //  f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            new Admin_login();
            f.setVisible(false);
        }
         if(e.getSource()==b2)
        {
            new Recep_login();
            f.setVisible(false);
        }
          if(e.getSource()==b3)
        {
            new Doct_login();
            f.dispose();
        }
    }
    public static void main(String[] args) {

           new Login_as();
    }
   
    
}
