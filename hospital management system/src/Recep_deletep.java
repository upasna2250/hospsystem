
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
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
public class Recep_deletep extends JFrame implements ActionListener {
    
     JFrame f;
    JPanel p1,p6;
    JTabbedPane t;
   JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16;
   JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9;
    JComboBox c1,c2,c3,c4,c5;
    JButton b1,b2;
  
 
    Recep_deletep(){
        
         f=new JFrame();
        p1=new JPanel();
        p1.setLayout(null);
         

        
       p6=new JPanel();
         p6.setBounds(0,50,1350, 80);
         p6.setBackground(Color.blue);
        p6.setLayout(null);
         
         
         
         
        
         b1=new JButton("Delete");
         b1.setBounds(1050, 400, 80, 50);
       b1.addActionListener(this);
       b2=new JButton("Search");
         b2.setBounds(400, 150, 80, 40);
       b2.addActionListener(this);
         
         
         
         
         
         p1.add(b1);
        p1.add(b2);
                 
         
         
         l1=new JLabel("Delete Patient");
        l1.setBounds(100,50,300, 60);
        l1.setFont(new Font("a",Font.ITALIC,30 ));
        l1.setForeground(Color.white);
        l2=new JLabel("Enter Patient Id");
        l2.setBounds(100,150,300, 30);
        l3=new JLabel("Date");
        l3.setBounds(100,210,300, 30);
        l4=new JLabel("First Name");
        l4.setBounds(100,270,300, 30);
        l5=new JLabel("Last Name");
        l5.setBounds(500,270,300, 30);
        l6=new JLabel("Age");
        l6.setBounds(100,330,300, 30);
        l7=new JLabel("Gender");
        l7.setBounds(500,330,300, 30);
        l8=new JLabel("Meritial Status");
        l8.setBounds(100,390,300, 30);
        l9=new JLabel("Phone No.");
        l9.setBounds(500,390,300, 30);
        l10=new JLabel("Address");
        l10.setBounds(100,450,300, 30);
        l11=new JLabel("City");
        l11.setBounds(100,520,300, 30);
        l12=new JLabel("State");
        l12.setBounds(500,520,300, 30);
         l13=new JLabel("Patient Type");
        l13.setBounds(900,210,300, 30);
        l14=new JLabel("(For Indoor Patient Only)");
        l14.setBounds(900,250,300, 30);
        l15=new JLabel("Ward No.");
        l15.setBounds(900,280,300, 30);
        l16=new JLabel("Bed No.");
        l16.setBounds(900,330,300, 30);
        
        
        p1.add(l1);
         p1.add(l2);
         p1.add(l3);
         p1.add(l4);
         p1.add(l5);
         p1.add(l6);
         p1.add(l7);
         p1.add(l8);
         p1.add(l9);
         p1.add(l10);
         p1.add(l11);
         p1.add(l12);
         p1.add(l13);
         p1.add(l14);
         p1.add(l15);
         p1.add(l16);
         
        
        
        
        t1=new JTextField();
        t1.setBounds(200, 150, 150, 30);
        t1.setText("PId-000");
        t2=new JTextField();
        t2.setBounds(200, 210, 150, 30);
        t3=new JTextField();
        t3.setBounds(200, 270, 150, 30);
        t4=new JTextField();
        t4.setBounds(600, 270, 150, 30);
       t5=new JTextField();
        t5.setBounds(200, 330, 150, 30);
        t6=new JTextField();
        t6.setBounds(600, 390, 150, 30);
        t7=new JTextField();
        t7.setBounds(200, 450, 550, 30);
        t8=new JTextField();
        t8.setBounds(600, 520, 150, 30);
        t9=new JTextField();
        t9.setBounds(200, 520, 150, 30);
        
        
 



        p1.add(t1);
        p1.add(t2);
        p1.add(t3);
        p1.add(t4);
        p1.add(t5);
        p1.add(t6);
        p1.add(t7);
        p1.add(t8);
        p1.add(t8);
        p1.add(t9);
    
        
 
        
        
        String s1[]={"Select","Male", "Female"};
         c1= new JComboBox(s1);
        c1.setBounds(600, 330, 150, 30);
        String s2[]={"Select","Single", "Married"};
         c2= new JComboBox(s2);
        c2.setBounds(200, 390, 150, 30);
        String s3[]={"Select","Indoor", "Outdoor"};
         c3= new JComboBox(s3);
        c3.setBounds(1000, 210, 150, 30);
         String s4[]={"0","1","2","3","4","5","6","7","8","9","10"};
         c4= new JComboBox(s4);
        c4.setBounds(1000, 280, 150, 30);
         String s5[]={"0","1","2"};
         c5= new JComboBox( s5);
        c5.setBounds(1000, 330, 150, 30);
        
        p1.add(c1);
        p1.add(c2);
        p1.add(c3);
        p1.add(c4);
        p1.add(c5);
        
        
              
        
        
      
        
        
        p1.add(p6);
        f.add(p1);
        
        
        
        
        f.setSize(1350, 700);
        
        
       // f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    public void actionPerformed(ActionEvent e)
    {
        
        if(e.getSource()==b1)
        {
            
            
     int d=JOptionPane.showConfirmDialog(null,"Are You Sure To Delete!","WARNING",JOptionPane.YES_NO_OPTION);
            
            if(d==JOptionPane.YES_OPTION)
            {
            try {
              
                
                 Connection con = Db.getConnection();
                 PreparedStatement ps=con.prepareStatement("delete from addp where pid=?");
                ps.setString(1, t1.getText());
                                
                int i = ps.executeUpdate();
                if (i > 0) {
                    
                     t2.setText("");
                            t3.setText("");
                            t4.setText("");
                            t5.setText("");
                            c1.setSelectedItem("Select");
                            c2.setSelectedItem("Select");
                            t6.setText("");
                            t7.setText("");
                            t8.setText("");
                            t9.setText("");
                           c3.setSelectedItem("Select");
                          c4.setSelectedItem("0");
                            c5.setSelectedItem("0");
                            JOptionPane.showMessageDialog(f,"Deleted Successfully!");
                }
               
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Admin_deletep.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Admin_deletep.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            if(d==JOptionPane.NO_OPTION)
            {
                remove(d);
            }
            
        }
        if(e.getSource()==b2)
        {
            try {
                Connection con = Db.getConnection();
                PreparedStatement ps=con.prepareStatement("Select date,fname,lname,age,gender,ms,ph,address,city,state,pt,wn,bn from addp where pid=?");
                        ps.setString(1, t1.getText());
                        ResultSet rs = ps.executeQuery();
                        //rs.setString(1, t1.getText());
                        
                        if (rs.next()) {
                            t2.setText(rs.getString("date"));
                            t3.setText(rs.getString("fname"));
                            t4.setText(rs.getString("lname"));
                            t5.setText(rs.getString("age"));
                            c1.setSelectedItem(rs.getString("gender"));
                            c2.setSelectedItem(rs.getString("ms"));
                            t6.setText(rs.getString("ph"));
                            t7.setText(rs.getString("address"));
                            t8.setText(rs.getString("city"));
                            t9.setText( rs.getString("state"));
                           c3.setSelectedItem(rs.getString("pt"));
                          c4.setSelectedItem(rs.getString("wn"));
                            c5.setSelectedItem(rs.getString("bn"));
                        }
                        else{
                            JOptionPane.showMessageDialog(f,"Record not found!");
                            t2.setText("");
                            t3.setText("");
                            t4.setText("");
                            t5.setText("");
                            c1.setSelectedItem("Select");
                            c2.setSelectedItem("Select");
                            t6.setText("");
                            t7.setText("");
                            t8.setText("");
                            t9.setText("");
                           c3.setSelectedItem("Select");
                          c4.setSelectedItem("0");
                            c5.setSelectedItem("0");
                        }
            } catch (ClassNotFoundException ex) {
                
                Logger.getLogger(Admin_deletep.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Admin_deletep.class.getName()).log(Level.SEVERE, null, ex);
            }




        }
              
            
            

        }
   
        }

    


