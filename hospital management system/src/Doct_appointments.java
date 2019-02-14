
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Crack
 */
public class Doct_appointments extends JFrame implements ActionListener {
     JFrame f;
    JPanel p1,p2,p6;
    JButton b1,b2,b3,b4;
    JLabel l1,l2,ld;
    JTable t1;
    JScrollPane sp;
    JTextField tf;
    DefaultTableModel m;  
    
    Doct_appointments(){
        f=new JFrame();
        p1=new JPanel();
        p1.setBounds(0,0,1350, 150);
        p1.setLayout(null);
         
         p2=new JPanel();
         p2.setBounds(0,150,1350, 350);
          p2.setLayout(null);

        
       p6=new JPanel();
         p6.setBounds(0,50,1350, 80);
         p6.setBackground(Color.blue);
        
         
         
         
         
         b1=new JButton("Home");
         b1.setBounds(1100, 70, 80, 30);
         b1.addActionListener(this);
         b2=new JButton("logout");
         b2.setBounds(1200, 70, 80, 30);
         b2.addActionListener(this);
       b3=new JButton("Search");
         b3.setBounds(400, 150, 80, 30);
         b3.addActionListener(this);
        b4=new JButton("Clear");
         b4.setBounds(500, 150, 80, 30);
         b4.addActionListener(this);
      
       
         p1.add(b1);
         p1.add(b2);
         p2.add(b3);
          p2.add(b4);   
         
         
          l1=new JLabel("Appointments");
        l1.setBounds(100,50,300, 60);
        l1.setFont(new Font("a",Font.ITALIC,30 ));
        l1.setForeground(Color.white);
        l2=new JLabel("Enter Date");
        l2.setBounds(100,150,100, 30);
        ld=new JLabel("dd/mm/yyyy");
        ld.setBounds(250,135,100, 15);
        ld.setFont(new Font("a",Font.ITALIC,10 ));
        
        
         p1.add(l1);
         p2.add(l2);
         p1.add(ld);
         
         tf=new JTextField();
         tf.setBounds(200, 150, 150, 30);
         
         
         p2.add(tf);
         
      m = new DefaultTableModel(new String[]{"Date","Patient id","First Name","Last name","age","gender","Merital Status","Phone No.","Address","city","State","Patient type","Ward No.","Bed No."},0);
       
                 t1=new JTable(m);
        sp = new JScrollPane(t1);
       sp.setBounds(30, 200, 1275, 500);   
         p2.add(sp,BorderLayout.CENTER);
         
      
            p1.add(p6);
            f.add(p1);
        f.add(p2);
        
        
        
        
        f.setSize(1350, 700);
         
        
      
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
    
    
     public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            new Doct_portal();
            f.dispose();
            
        }
        if(e.getSource()==b2)
        {
            new Login_as();
            f.dispose();
            
        }
        if(e.getSource()==b3)
        {
              try {
           
  
             Connection con = Db.getConnection();
             PreparedStatement ps=con.prepareStatement("Select * from addp where date=?");
                ps.setString(1, tf.getText());        
                ResultSet rs = ps.executeQuery();
                        
                        while (rs.next()){
                            
                            String date= rs.getString("date");
                            String pid= rs.getString("pid");
                            String fname= rs.getString("fname");
                            String lname= rs.getString("lname");
                            String age= rs.getString("age");
                            String gender= rs.getString("gender");
                            String ms= rs.getString("ms");
                            String ph= rs.getString("ph");
                            String address= rs.getString("address");
                            String city= rs.getString("city");
                            String state= rs.getString("state");
                            String pt= rs.getString("pt");
                            String wn= rs.getString("wn");
                            String bn= rs.getString("bn");
                            
                            m.addRow(new Object[]{date,pid,fname,lname,age,gender,ms,ph,address,city,state,pt,wn,bn});
                        
                      
                            
                       t1.setAutoCreateRowSorter(true);
       
      
       }
                        }               
                        
                         catch (Exception ex) {
             Logger.getLogger(Recep_viewp.class.getName()).log(Level.SEVERE, null, ex);
         }
              if(e.getSource()==b4)
              {
                 t1.removeAll();
              }
                        
         
         
        }
    }
   
}



