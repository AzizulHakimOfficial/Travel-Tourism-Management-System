
package travel.tourism.management.system;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class ViewDetails extends JFrame implements ActionListener{
    //String username;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,ld1,ld2,ld3,ld4,ld5,ld6,ld7,ld8,ld9;
    JButton b1,b2;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9;
    ViewDetails(String username){
       
        l1=new JLabel("Username:");
        l1.setBounds(25,15,90,45);
        l1.setFont(new Font("default",Font.BOLD,16));
        add(l1);
        
        l2=new JLabel("ID:");
        l2.setBounds(25,55,90,45);
        l2.setFont(new Font("default",Font.BOLD,16));
        add(l2);
        
        l3=new JLabel("Number:");
        l3.setBounds(25,95,90,45);
        l3.setFont(new Font("default",Font.BOLD,16));
        add(l3);
        
        l4=new JLabel("Name:");
        l4.setBounds(25,135,90,45);
        l4.setFont(new Font("default",Font.BOLD,16));
        add(l4);
        
        l5=new JLabel("Gender:");
        l5.setBounds(25,175,90,45);
        l5.setFont(new Font("default",Font.BOLD,16));
        add(l5);
        
        ld1=new JLabel();
        ld1.setBounds(130,15,180,45);
        ld1.setFont(new Font("default",Font.PLAIN,16));
        ld1.setBackground(Color.yellow);
        add(ld1);
        
        ld2=new JLabel();
        ld2.setBounds(130,55,150,45);
        ld2.setFont(new Font("default",Font.PLAIN,16));
        add(ld2);
        
        ld3=new JLabel();
        ld3.setBounds(130,95,150,45);
        ld3.setFont(new Font("default",Font.PLAIN,16));
        add(ld3);
        
        ld4=new JLabel();
        ld4.setBounds(130,135,150,45);
        ld4.setFont(new Font("default",Font.PLAIN,16));
        add(ld4);
        
        ld5=new JLabel();
        ld5.setBounds(130,175,150,45);
        ld5.setFont(new Font("default",Font.PLAIN,16));
        add(ld5);
        
        l6=new JLabel("Country:");
        l6.setBounds(380,15,90,45);
        l6.setFont(new Font("default",Font.BOLD,16));
        add(l6);
        
        l7=new JLabel("Address:");
        l7.setBounds(380,55,90,45);
        l7.setFont(new Font("default",Font.BOLD,16));
        add(l7);
        
        l8=new JLabel("Phone:");
        l8.setBounds(380,95,90,45);
        l8.setFont(new Font("default",Font.BOLD,16));
        add(l8);
        
        l9=new JLabel("Email:");
        l9.setBounds(380,135,90,45);
        l9.setFont(new Font("default",Font.BOLD,16));
        add(l9);
        
        ld6=new JLabel();
        ld6.setBounds(500,15,150,45);
        ld6.setFont(new Font("default",Font.PLAIN,16));
        ld6.setBackground(Color.yellow);
        add(ld6);
        
        ld7=new JLabel();
        ld7.setBounds(500,55,150,45);
        ld7.setFont(new Font("default",Font.PLAIN,16));
        add(ld7);
        
        ld8=new JLabel();
        ld8.setBounds(500,95,150,45);
        ld8.setFont(new Font("default",Font.PLAIN,16));
        add(ld8);
        
        ld9=new JLabel();
        ld9.setBounds(500,135,180,45);
        ld9.setFont(new Font("default",Font.PLAIN,16));
        add(ld9);
        
        b1=new JButton("Back");
        b1.setBounds(330,235,100,35);
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        add(b1);
        
        
        ImageIcon img1=new ImageIcon(ClassLoader.getSystemResource("travel/tourism/management/system/icons/viewall.jpg"));
        Image img2=img1.getImage().getScaledInstance(760, 270, Image.SCALE_DEFAULT);
        ImageIcon img3=new ImageIcon(img2);
        l10=new JLabel(img3);
        l10.setBounds(0,270,760,270);
        add(l10);
        
        Conn c=new Conn();
        try{
            ResultSet rs;
            String str2="select * from personaldetails where username='"+username+"'";
            rs=c.s.executeQuery(str2);
            while(rs.next()){
                ld1.setText(rs.getString("username"));
                ld2.setText(rs.getString("id"));
                ld3.setText(rs.getString("number"));
                ld4.setText(rs.getString("name"));
                ld5.setText(rs.getString("gender"));
                ld6.setText(rs.getString("country"));
                ld7.setText(rs.getString("permanentaddress"));
                ld8.setText(rs.getString("phone"));
                ld9.setText(rs.getString("email"));
            }
        }catch(Exception e){}
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setBounds(465,150,760,535);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
           this.setVisible(false);
        }
    }
    
    public static void main(String[] args) {
        new ViewDetails("");
    }
}
