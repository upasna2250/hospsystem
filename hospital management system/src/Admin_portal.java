/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import sun.swing.ImageIconUIResource;
import javax.swing.border.Border;
/**
 *
 * @author Crack
 */
public class Admin_portal extends JFrame implements ActionListener {
    
    JFrame f;
    JPanel p1,p2;
    JLabel l1,l2,l3;
    JButton b1,b2,b3,b4,b5,b6,b7;
    Admin_portal()
    {
        f=new JFrame();
        p1=new JPanel();
         p1.setBounds(0, 50, 1350, 80);
         p1.setBackground(Color.blue);
         p2=new JPanel();
        p2.setBounds(30, 200, 300, 430);
         p2.setBackground(Color.blue);
         l1=new JLabel("Admin Portal");
        l1.setBounds(200, 60, 300, 60);
        l1.setFont(new Font("a",Font.ROMAN_BASELINE,40 ));
        l1.setForeground(Color.white);
          l2=new JLabel("WELCOME to");
        l2.setBounds(80, 320, 300, 60);
        l2.setFont(new Font("a",Font.TYPE1_FONT,30 ));
        l2.setForeground(Color.white);
         l3=new JLabel("Admin Portal");
        l3.setBounds(80, 380, 300, 60);
        l3.setFont(new Font("a",Font.ROMAN_BASELINE,30 ));
        l3.setForeground(Color.white);
        b1=new JButton("Logout");
        b1.setBounds(1170, 70, 100, 40);
        b1.setFont(new Font("a",Font.ROMAN_BASELINE,20 ));
        b1.setForeground(Color.blue);
        b1.addActionListener(this);
        b2=new JButton("Patient Details");
        b2.setBounds(350, 200, 250, 200);
        b2.setFont(new Font("a",Font.TYPE1_FONT,30 ));
        b2.setBackground(Color.WHITE);
       b2.setForeground(Color.blue);
       
        b2.addActionListener(this);
        b3=new JButton("Receptionist");
       
        b3.setBounds(630, 200, 250, 200);
        b3.setFont(new Font("a",Font.TYPE1_FONT,30 ));
         b3.setBackground(Color.WHITE);
       b3.setForeground(Color.blue);
        b3.addActionListener(this);
        b4=new JButton("Doctor Details");
        b4.setBounds(910, 200, 270, 200);
        b4.setFont(new Font("a",Font.TYPE1_FONT,30 ));
         b4.setBackground(Color.WHITE);
       b4.setForeground(Color.blue);
        b4.addActionListener(this);
         b5=new JButton("Appointments");
        b5.setBounds(350, 430, 250, 200);
        b5.setFont(new Font("a",Font.TYPE1_FONT,30 ));
         b5.setBackground(Color.WHITE);
       b5.setForeground(Color.blue);
        b5.addActionListener(this);
         b6=new JButton("Indoor Patient");
        b6.setBounds(630, 430, 250, 200);
        b6.setFont(new Font("a",Font.TYPE1_FONT,30 ));
         b6.setBackground(Color.WHITE);
       b6.setForeground(Color.blue);
        b6.addActionListener(this); 
        b7=new JButton("Outdoor Patient");
        b7.setBounds(910, 430, 270, 200);
        b7.setFont(new Font("a",Font.TYPE1_FONT,30 ));
         b7.setBackground(Color.WHITE);
       b7.setForeground(Color.blue);
        b7.addActionListener(this);
        
        
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(p1);
        f.add(p2);
        
        f.setSize(1350, 700);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
 
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            new Login_as();
            f.dispose();
        }
        if(e.getSource()==b2)
        {
            new Admin_tabbed();
            f.dispose();
        }
         if(e.getSource()==b3)
        {
            new Admin_recep_tabbed();
            f.dispose();
        }
          if(e.getSource()==b4)
        {
            new Admin_doct_tabbed();
            f.dispose();
        }
          if(e.getSource()==b5)
        {
            new Admin_appointments();
            f.dispose();
        }
          if(e.getSource()==b6)
        {
            new Admin_indoor();
            f.dispose();
        }
          if(e.getSource()==b7)
        {
            new Admin_outdoor();
            f.dispose();
        }
    }
   
    
   
}
