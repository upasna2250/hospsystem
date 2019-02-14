
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
import javax.swing.JPasswordField;
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
public class Admin_deletedoc extends JFrame implements ActionListener  {
    
     JFrame f;
    JPanel p1,p6;
    JTabbedPane t;
   JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16;
   JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11;
    JComboBox c1,c2,c3;
    JButton b1,b2;
    JPasswordField p;
 
    Admin_deletedoc(){
         f=new JFrame();
        p1=new JPanel();
        p1.setLayout(null);
        
       p6=new JPanel();
         p6.setBounds(0,50,1350, 80);
         p6.setBackground(Color.blue);
         p6.setLayout(null);
         
        
         b1=new JButton("Search");
         b1.setBounds(400, 150, 80, 50);
       
         b2=new JButton("Delete");
         b2.setBounds(1050, 350, 80, 50);
         
           b1.addActionListener(this);
           b2.addActionListener(this);
            
         
         p1.add(b1);
         p1.add(b2);
         
         l1=new JLabel("Delete Doctor");
        l1.setBounds(100,50,300, 60);
        l1.setFont(new Font("a",Font.ITALIC,30 ));
        l1.setForeground(Color.white);
        l2=new JLabel("Doctor Id");
        l2.setBounds(100,150,300, 30);
        l3=new JLabel("First Name");
        l3.setBounds(100,210,300, 30);
        l4=new JLabel("Last Name");
        l4.setBounds(500,210,300, 30);
        l5=new JLabel("Age");
        l5.setBounds(100,270,300, 30);
        l6=new JLabel("specilization");
        l6.setBounds(500,270,300, 30);
        l7=new JLabel("Blood Group");
        l7.setBounds(100,330,300, 30);
        l8=new JLabel("Gender");
        l8.setBounds(500,330,300, 30);
        l9=new JLabel("Address");
        l9.setBounds(100,390,300, 30);
        l10=new JLabel("City");
        l10.setBounds(100,450,300, 30);
        l11=new JLabel("Phone No.");
        l11.setBounds(500,450,300, 30);
        l12=new JLabel("Meritial Status");
        l12.setBounds(100,510,300, 30);
         l13=new JLabel("Joining date");
        l13.setBounds(500,510,300, 30);
        l14=new JLabel("Leaving date");
        l14.setBounds(100,570,300, 30);
        l15=new JLabel("User Name");
        l15.setBounds(900,210,300, 30);
        l16=new JLabel("Password");
        l16.setBounds(900,270,300, 30);
        
        
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
        t1.setText("DId-000");
        t2=new JTextField();
        t2.setBounds(200, 210, 150, 30);
        t3=new JTextField();
        t3.setBounds(600, 210, 150, 30);
        t4=new JTextField();
        t4.setBounds(200, 270, 150, 30);
       t5=new JTextField();
        t5.setBounds(600, 270, 150, 30);
        t6=new JTextField();
        t6.setBounds(200, 390, 550, 30);
        t7=new JTextField();
        t7.setBounds(200, 450, 150, 30);
        t8=new JTextField();
        t8.setBounds(600, 450, 150, 30);
        t9=new JTextField();
        t9.setBounds(600, 510, 150, 30);
        t10=new JTextField();
        t10.setBounds(200, 570, 150, 30);
        t11=new JTextField();
        t11.setBounds(1000, 210, 150, 30);
        p=new JPasswordField();
       p.setBounds(1000, 270, 150, 30);
        
        
 



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
        p1.add(t10);
        p1.add(t11);
        p1.add(p);
    
        
 
        
        
               
        String s2[]={"Select","A+", "A-","B+","B-","AB+","AB-","O+","O-"};
         c1= new JComboBox(s2);
        c1.setBounds(200, 330, 150, 30);
        String s3[]={"Select","Male", "Female"};
         c2= new JComboBox(s3);
        c2.setBounds(600, 330, 150, 30);
         String s4[]={"Select","Single", "Married"};
         c3= new JComboBox(s4);
        c3.setBounds(200, 510, 150, 30);
         
        
        p1.add(c1);
        p1.add(c2);
        p1.add(c3);
      
        
        
        
        
        
        
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
            try {
                 Connection con = Db.getConnection();
                 PreparedStatement ps = con.prepareStatement("select fname,lname,age,sp,bg,gender,address,city,ph,ms,jd,ld,uname,pass from addd where did=?");
                ps.setString(1, t1.getText());
                ResultSet rs = ps.executeQuery();
                //rs.setString(1, t1.getText());
                
                if (rs.next()) {
                    t2.setText(rs.getString("fname"));
                    t3.setText(rs.getString("lname"));
                    t4.setText(rs.getString("age"));
                    t5.setText(rs.getString("sp"));
                    c1.setSelectedItem(rs.getString("bg"));
                    c2.setSelectedItem(rs.getString("gender"));
                   
                    
                    t6.setText(rs.getString("address"));
                    
                    t7.setText(rs.getString("city"));
                    
                    t8.setText(rs.getString("ph"));
                     c3.setSelectedItem(rs.getString("ms"));
                    t9.setText( rs.getString("jd"));
                    t10.setText(rs.getString("ld"));
                    t11.setText(rs.getString("uname"));
                    p.setText( rs.getString("pass"));
                    
                    
                    
                }
                else{
                    JOptionPane.showMessageDialog(f,"Record not found!");
                    t2.setText("");
                    t3.setText("");
                    t4.setText("");
                    
                    c1.setSelectedItem("Select");
                    c2.setSelectedItem("Select");
                    
                    t5.setText("");
                    t6.setText("");
                    t7.setText("");
                    c3.setSelectedItem("Select");
                    t8.setText("");
                    t9.setText("");
                    t10.setText("");
                    p.setText("");
                    
                    
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Admin_deleter.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Admin_deleter.class.getName()).log(Level.SEVERE, null, ex);
            }
                
        }
        if(e.getSource()==b2)
        {
            
            
     int d=JOptionPane.showConfirmDialog(null,"Are You Sure To Delete!","WARNING",JOptionPane.YES_NO_OPTION);
            
            if(d==JOptionPane.YES_OPTION)
            {
            try {
              
                
                Connection con = Db.getConnection();
                PreparedStatement ps=con.prepareStatement("delete from addd where did=?");
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
                    c3.setSelectedItem("Select");
                    t9.setText("");
                    t10.setText("");
                    t11.setText("");
                    p.setText("");
                    
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
        
    }
   
}
   
