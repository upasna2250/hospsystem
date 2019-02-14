
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Crack
 */
public class Admin_doct_tabbed extends JFrame implements ActionListener{
     JFrame f;
    JPanel p1,p2,p3,p4,p5,p6;
    JTabbedPane t;
         JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
    
    Admin_doct_tabbed()
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
        t.add("Add Doctor",p1);
        t.add("Delete Doctor",p2);
        t.add("Update Doctor",p3);
        t.add("Search Doctor",p4);
        t.add("view Doctor",p5);
        
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
       
  
       
        Admin_adddoc n18=new Admin_adddoc();
        p1.add(n18.p1);
        n18.p6.add(b1);
       n18.p6.add(b2);
        n18.f.dispose();
       
        
       Admin_deletedoc n19=new Admin_deletedoc();
        p2.add(n19.p1);
        n19.p6.add(b3);
       n19.p6.add(b4);
        n19.f.dispose();
        
        
        
        Admin_updatedoc n20=new Admin_updatedoc();
        p3.add(n20.p1);
        n20.p6.add(b5);
       n20.p6.add(b6);
        n20.f.dispose();
        
        
        
         Admin_searchdoc n21=new Admin_searchdoc();
        p4.add(n21.p1);
        n21.p6.add(b7);
       n21.p6.add(b8);
        n21.f.dispose();
         
        
       Admin_viewdoc n22=new Admin_viewdoc();
        p5.add(n22.p1);
        p5.add(n22.p2);
        n22.p6.add(b9);
       n22.p6.add(b10);
        n22.f.dispose();
        
        
        f.setSize(1350, 700);
       // f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
     }
     public void actionPerformed(ActionEvent e)
    {
       
        if(e.getSource()==b1)
        {
       
           new Admin_portal();

            f.dispose();
    
        }
         if(e.getSource()==b2)
        {
            new Login_as();
            f.dispose();
           }
         if(e.getSource()==b3)
        {
       
           new Admin_portal();

            f.dispose();
    
        }
         if(e.getSource()==b4)
        {
            new Login_as();
            f.dispose();
           }
 if(e.getSource()==b5)
        {
       
           new Admin_portal();

            f.dispose();
    
        }
         if(e.getSource()==b6)
        {
            new Login_as();
            f.dispose();
           }
 if(e.getSource()==b7)
        {
       
           new Admin_portal();

            f.dispose();
    
        }
         if(e.getSource()==b8)
        {
            new Login_as();
            f.dispose();
           }
 if(e.getSource()==b9)
        {
       
           new Admin_portal();

            f.dispose();
    
        }
         if(e.getSource()==b10)
        {
            new Login_as();
            f.dispose();
           }
 
    }
  
   
    
}
