
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Crack
 */
public class Recep_portal extends JFrame implements ActionListener {
    
    JFrame f;
    JPanel p1;
    JLabel l1,bg;
    JButton b1,b2,b3,b4,b5;
    Recep_portal()
    {
        f=new JFrame();
        p1=new JPanel();
         p1.setBounds(0, 50, 550, 80);
         p1.setBackground(Color.blue);
          l1=new JLabel("Receptionist Portal");
        l1.setBounds(200, 60, 300, 60);
        l1.setFont(new Font("a",Font.ROMAN_BASELINE,30 ));
        l1.setForeground(Color.white);
         
        b1=new JButton("Profile");
        b1.setBounds(150, 200, 200, 50);
        b1.setFont(new Font("a",Font.ROMAN_BASELINE,15 ));
        b1.addActionListener(this);
        b2=new JButton("Paitent Details");
        b2.setBounds(150, 270, 200, 50);
        b2.setFont(new Font("a",Font.ROMAN_BASELINE,15 ));
        b2.addActionListener(this);
        b3=new JButton("Appointments");
        b3.setBounds(150, 340, 200, 50);
        b3.setFont(new Font("a",Font.ROMAN_BASELINE,15 ));
        b3.addActionListener(this);
        b4=new JButton("Change Password");
        b4.setBounds(150, 410, 200, 50);
        b4.setFont(new Font("a",Font.ROMAN_BASELINE,15 ));
        b4.addActionListener(this);
         b5=new JButton("Logout");
        b5.setBounds(200, 480, 100, 50);
        b5.setFont(new Font("a",Font.ROMAN_BASELINE,15 ));
        b5.addActionListener(this);
        
        bg=new JLabel(new ImageIcon("src/Images/r1.jpg"));
        f.add(bg);
        bg.setLayout(null);
         
        
        bg.add(l1);
        bg.add(b1);
        bg.add(b2);
        bg.add(b3);
        bg.add(b4);
        bg.add(b5);
        bg.add(p1);
        
        f.setSize(1350, 700);
        
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
 
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            new Recep_profile();
            f.dispose();
        }
        if(e.getSource()==b2)
        {
            new Recep_tabbed();
            f.dispose();
        }
         if(e.getSource()==b3)
        {
            new Recep_appointments();
            f.dispose();
        }
          if(e.getSource()==b4)
        {
            new Recep_changeps();
            f.dispose();
        }
          if(e.getSource()==b5)
        {
            new Login_as();
            f.dispose();
        }
        
    }
    
   
}
