
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
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
public class Doct_login extends JFrame implements ActionListener{
     JFrame f;
    JLabel l1,l2,l3,l4,l5,l6,bg;
    JButton b,b1 ;
    JTextField t;
    JPasswordField p;
    JPanel p1,p2;
    private static String nu;
    private static String np;
    Doct_login()
    {
            f=new JFrame();
        p1=new JPanel();
         p1.setBounds(0, 30, 1370, 100);
         p1.setBackground(new Color(0, 150, 255, 123));
         
        p2=new JPanel();
        p2.setBounds(500, 200, 370, 430);
        p2.setBackground(new Color(255, 255, 255, 150));
        p2.setLayout(null);
        
        
        l5=new JLabel("Hospital Management System");
        l5.setBounds(350, 50, 700, 60);
        l5.setFont(new Font("a",Font.ITALIC,50 ));
        l5.setForeground(Color.white);
       
        
        
        
        l3=new JLabel("Login Here");
        l3.setBounds(550, 220, 400, 50);
        l3.setFont(new Font("a",Font.ITALIC,40 ));
        l3.setForeground(new Color(0, 150, 255));
        l4=new JLabel("Doctor Login Panel");
        l4.setBounds(550, 260, 400, 50);
        l4.setFont(new Font("a",Font.ITALIC,20 ));
        l4.setForeground(new Color(0, 150, 255));
        t=new JTextField();
        t.setBounds(600, 380, 200, 30);
        p=new JPasswordField();
        p.setBounds(600, 440, 200, 30);
        b=new JButton("Login");
        b.setBounds(720, 490, 120, 40);
        b.setBackground(new Color(0, 150, 255));
        b.setFont(new Font("a",Font.ITALIC,20 ));
        b.setForeground(Color.white);
        b.addActionListener(this);
       
        
        l1=new JLabel(new ImageIcon("src/Images/l1.PNG"));
        l1.setBounds(540, 368, 50, 50);
        l2=new JLabel(new ImageIcon("src/Images/l2.PNG"));
        l2.setBounds(540, 428, 50, 50);
       
         bg=new JLabel(new ImageIcon("src/Images/1.jpg"));
        f.add(bg);
        bg.setLayout(null);
        
        
        
        b1=new JButton("Back");
        b1.setBounds(20, 170, 80, 40);
       b1.setBackground(new Color(0, 150, 255));
       b1.setFont(new Font("a",Font.ITALIC,20 ));
       b1.setForeground(Color.white);
        b1.addActionListener(this);
       
        
        bg.add(l1);
       bg.add(l2);
       bg.add(l3);
       bg.add(l4);
       bg.add(l5);
       bg.add(t);
       bg.add(p);
        bg.add(b);
        bg.add(b1);
        bg.add(p1);
        bg.add(p2);
        f.setSize(1350, 700);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            new Login_as();
            f.setVisible(false);
        }
         if(e.getSource()==b){
            try {
                String em= t.getText();
                String pas=p.getText();
                 nu=em;
                 np=pas;
                
                Connection con = Db.getConnection();
                PreparedStatement ps = con.prepareStatement("select uname, pass from addd");
                ResultSet rs = ps.executeQuery(); // executeQuery return type= ResultSet
                
                while (rs.next())
                {
                    String  email = rs.getString("uname");
                    String  pass = rs.getString("pass");
                    if((em.equals(email))&&(pas.equals(pass)))
                    {
                      new Doct_portal();
                        f.setVisible(false);
                    }
                    else
                    {
                       // System.exit(0);
                       JOptionPane.showMessageDialog(f,"Wrong ID and Password !");
                    }                       
                }
            } catch (Exception ex) {
                
            }
        }
    }
      public static String un(){
        return nu;
        
    }
    public static String up(){
        return np;
        
    }
    
   
}
