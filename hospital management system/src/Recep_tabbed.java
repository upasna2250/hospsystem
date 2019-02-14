
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.event.ChangeEvent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Crack
 */
public class Recep_tabbed extends JFrame implements ActionListener {
    JFrame f;
    JPanel p1,p2,p3,p4,p5;
    JTabbedPane t;
     JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
    
    Recep_tabbed()
    {
        f=new JFrame();
        p1=new JPanel();
        p1.setLayout(null);
        p2=new JPanel();
        p2.setLayout(null);
        p3=new JPanel();
        p3.setLayout(null);
        p4=new JPanel();
        p4.setLayout(null);
        p5=new JPanel();
        p5.setLayout(null);
        t=new JTabbedPane();
        t.setBounds(0, 0, 1350, 700);
        t.add("Add Patient",p1);
        t.add("Delete Patient",p2);
        t.add("Update Patient",p3);
        t.add("Search Patient",p4);
        t.add("View Patient",p5);
       f.add(t);
       
       
       b1=new JButton("Home");
         b1.setBounds(1100, 25, 80, 30);
         b1.addActionListener(this);
        b2=new JButton("logout");
         b2.setBounds(1200, 25, 80, 30);
         b2.addActionListener(this);
          b3=new JButton("Home");
         b3.setBounds(1100, 25, 80, 30);
         b3.addActionListener(this);
        b4=new JButton("logout");
         b4.setBounds(1200, 25, 80, 30);
         b4.addActionListener(this);
          b5=new JButton("Home");
         b5.setBounds(1100, 25, 80, 30);
         b5.addActionListener(this);
        b6=new JButton("logout");
         b6.setBounds(1200, 25, 80, 30);
         b6.addActionListener(this);
          b7=new JButton("Home");
         b7.setBounds(1100, 25, 80, 30);
         b7.addActionListener(this);
        b8=new JButton("logout");
         b8.setBounds(1200, 25, 80, 30);
         b8.addActionListener(this);
          b9=new JButton("Home");
         b9.setBounds(1100, 25, 80, 30);
         b9.addActionListener(this);
        b10=new JButton("logout");
         b10.setBounds(1200,25, 80, 30);
         b10.addActionListener(this);
       
  
     
         Recep_addp n29=new Recep_addp();
        p1.add(n29.p1);
       n29.p6.add(b1);
       n29.p6.add(b2);
        n29.f.dispose();
        
        
        Recep_deletep n7=new Recep_deletep();
        p2.add(n7.p1);
       n7.p6.add(b3);
       n7.p6.add(b4);
        n7.f.dispose();
        
        
        Recep_updatep n8=new Recep_updatep();
        p3.add(n8.p1);
         n8.p6.add(b5);
       n8.p6.add(b6);
        n8.f.dispose();
        
        
        Recep_searchp n9=new Recep_searchp();
        p4.add(n9.p1);
        n9.p6.add(b7);
       n9.p6.add(b8);
        n9.f.dispose();
   
        
        Recep_viewp n10=new Recep_viewp();
        p5.add(n10.p1);
        p5.add(n10.p2);
        n10.p6.add(b9);
       n10.p6.add(b10);
        n10.f.dispose(); 
   
        
        f.setSize(1350, 700);
       // f.setLayout(null);
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
       
           new Recep_portal();

            f.dispose();
    
        }
         if(e.getSource()==b4)
        {
            new Login_as();
            f.dispose();
           }
 if(e.getSource()==b5)
        {
       
           new Recep_portal();

            f.dispose();
    
        }
         if(e.getSource()==b6)
        {
            new Login_as();
            f.dispose();
           }
 if(e.getSource()==b7)
        {
       
           new Recep_portal();

            f.dispose();
    
        }
         if(e.getSource()==b8)
        {
            new Login_as();
            f.dispose();
           }
 if(e.getSource()==b9)
        {
       
           new Recep_portal();

            f.dispose();
    
        }
         if(e.getSource()==b10)
        {
            new Login_as();
            f.dispose();
           }
 
    }
   
  
   
}

