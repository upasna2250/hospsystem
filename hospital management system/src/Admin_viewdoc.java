
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
import javax.swing.JTabbedPane;
import javax.swing.JTable;
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
public class Admin_viewdoc extends JFrame {
     JFrame f;
    JPanel p1,p2,p6;
    JLabel l1;
    JTable t1;
    JScrollPane sp1;
    
    
    Admin_viewdoc(){
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
         p6.setLayout(null);
         
         
         
          l1=new JLabel("View Doctor");
        l1.setBounds(100,50,300, 60);
        l1.setFont(new Font("a",Font.ITALIC,30 ));
        l1.setForeground(Color.white);
        
         p1.add(l1);
                DefaultTableModel m= new DefaultTableModel(new String[]{"Doctor id","First Name","Last name","Age","Specilization","Blood Group","gender","Address","city","Phone No.","Merital Status","Joining Date","Leaving Date","User Name","Password"},0);
         try {
           
  
             Connection con = Db.getConnection();
             PreparedStatement ps=con.prepareStatement("Select * from addd");
                        ResultSet rs = ps.executeQuery();
                        while (rs.next()){
                            
                            String did= rs.getString("did");
                            String fname= rs.getString("fname");
                            String lname= rs.getString("lname");
                            String age= rs.getString("age");
                            String sp= rs.getString("sp");
                             String bg= rs.getString("bg");
                            String gender= rs.getString("gender");
                            String address= rs.getString("address");
                            String city= rs.getString("city");
                            String ph= rs.getString("ph");
                            String ms= rs.getString("ms");
                            String jd= rs.getString("jd");
                            String ld= rs.getString("ld");
                            String uname= rs.getString("uname");
                            String pass= rs.getString("pass");
                            
                            m.addRow(new Object[]{did,fname,lname,age,sp,bg,gender,address,city,ph,ms,jd,ld,uname,pass});
                        
                       t1=new JTable(m);
                            
                       t1.setAutoCreateRowSorter(true);
       
        sp1 = new JScrollPane(t1);
       sp1.setBounds(30, 150, 1275, 500);
       }
                        }               
                        
                         catch (Exception ex) {
             Logger.getLogger(Admin_viewp.class.getName()).log(Level.SEVERE, null, ex);
         }
                        
         
         
         
         
         p2.add(sp1,BorderLayout.CENTER);
      
            p1.add(p6);
            f.add(p1);
        f.add(p2);
        
        
        
        
        f.setSize(1350, 700);
         
        
      
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
    
   
}


