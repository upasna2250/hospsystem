
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
public class Recep_addp extends JFrame implements ActionListener {
    
     JFrame f;
    JPanel p1,p6;
    JTabbedPane t;
   JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,ld;
   JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9;
    JComboBox c1,c2,c3,c4,c5;
    JButton b1;
 
    Recep_addp(){
         f=new JFrame();
        p1=new JPanel();
        
        p1.setLayout(null);
        
       p6=new JPanel();
         p6.setBounds(0,50,1350, 80);
         p6.setBackground(Color.blue);
         p6.setLayout(null);
        
         
         
         
         
         
         b1=new JButton("Add");
         b1.setBounds(1050, 350, 80, 50);
       b1.addActionListener(this);  
         
         
         
         
         
     
         p1.add(b1);
         
         
         l1=new JLabel("Add Patient");
        l1.setBounds(100,50,300, 60);
        l1.setFont(new Font("a",Font.ITALIC,30 ));
        l1.setForeground(Color.white);
        l2=new JLabel("Patient Id");
        l2.setBounds(100,150,300, 30);
        l3=new JLabel("Date");
        l3.setBounds(500,150,300, 30);
        ld=new JLabel("dd/mm/yyyy");
        ld.setBounds(650,135,300, 15);
        ld.setFont(new Font("a",Font.ITALIC,10 ));
        l4=new JLabel("First Name");
        l4.setBounds(100,210,300, 30);
        l5=new JLabel("Last Name");
        l5.setBounds(500,210,300, 30);
        l6=new JLabel("Age");
        l6.setBounds(100,270,300, 30);
        l7=new JLabel("Gender");
        l7.setBounds(500,270,300, 30);
        l8=new JLabel("Meritial Status");
        l8.setBounds(100,330,300, 30);
        l9=new JLabel("Phone No.");
        l9.setBounds(500,330,300, 30);
        l10=new JLabel("Address");
        l10.setBounds(100,390,300, 30);
        l11=new JLabel("City");
        l11.setBounds(100,450,300, 30);
        l12=new JLabel("State");
        l12.setBounds(500,450,300, 30);
         l13=new JLabel("Patient Type");
        l13.setBounds(900,150,300, 30);
        l14=new JLabel("(For Indoor Patient Only)");
        l14.setBounds(900,180,300, 30);
        l15=new JLabel("Ward No.");
        l15.setBounds(900,210,300, 30);
        l16=new JLabel("Bed No.");
        l16.setBounds(900,260,300, 30);
        
        
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
         p1.add(ld);
         
        
        
        
        t1=new JTextField();
        t1.setBounds(200, 150, 150, 30);
        t1.setText("PId-0001");
        t2=new JTextField();
        t2.setBounds(600, 150, 150, 30);
    //    LocalDate d=LocalDate.now();
      //  String n= d.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
      //  t2.setText(n);
      //  t2.setEditable(false);
        t3=new JTextField();
        t3.setBounds(200, 210, 150, 30);
        t4=new JTextField();
        t4.setBounds(600, 210, 150, 30);
       t5=new JTextField();
        t5.setBounds(200, 270, 150, 30);
        t6=new JTextField();
        t6.setBounds(600, 330, 150, 30);
        t7=new JTextField();
        t7.setBounds(200, 390, 550, 30);
        t8=new JTextField();
        t8.setBounds(600, 450, 150, 30);
        t9=new JTextField();
        t9.setBounds(200, 450, 150, 30);
        
        
 



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
        c1.setBounds(600, 270, 150, 30);
        String s2[]={"Select","Single", "Married"};
         c2= new JComboBox(s2);
        c2.setBounds(200, 330, 150, 30);
        String s3[]={"Select","Indoor", "Outdoor"};
         c3= new JComboBox(s3);
        c3.setBounds(1000, 150, 150, 30);
         String s4[]={"0","1","2","3","4","5","6","7","8","9","10"};
         c4= new JComboBox(s4);
        c4.setBounds(1000, 210, 150, 30);
         String s5[]={"0","1","2"};
         c5= new JComboBox( s5);
        c5.setBounds(1000, 260, 150, 30);
        
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
            String s1 = (String) c1.getSelectedItem();
            String s2 = (String) c2.getSelectedItem();
            String s3 = (String) c3.getSelectedItem();
            String s4= (String) c4.getSelectedItem();
             String s5=(String) c5.getSelectedItem();
            try {
                Connection con = Db.getConnection();
                PreparedStatement ps = con.prepareStatement("insert into addp(pid,date,fname,lname,age,gender,ms,ph,address,city,state,pt,wn,bn)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                ps.setString(1, t1.getText());
                ps.setString(2, t2.getText());
                ps.setString(3, t3.getText());
                ps.setString(4, t4.getText());
                ps.setString(5, t5.getText());
                ps.setString(6, s1);
                ps.setString(7, s2);
                ps.setString(8, t6.getText());
                ps.setString(9, t7.getText());
                ps.setString(10, t8.getText());
                ps.setString(11, t9.getText());
                ps.setString(12, s3);
                ps.setString(13, s4);
                ps.setString(14, s5);
                
                int i = ps.executeUpdate();
               if (i > 0) {
                JOptionPane.showMessageDialog(f,"Added Successfully!");
                
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
                Logger.getLogger(Admin_addp.class.getName()).log(Level.SEVERE, null, ex);
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(f,"Patient Id Already Exist !");
                Logger.getLogger(Admin_addp.class.getName()).log(Level.SEVERE, null, ex);
                
            }
              
            
            

        }
        }
    
    
    
   
}

