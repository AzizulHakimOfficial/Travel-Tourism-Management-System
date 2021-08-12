
package travel.tourism.management.system;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;


public class ViewBookedPackage extends JFrame implements ActionListener{
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16;

    JButton b3;
    ViewBookedPackage(String username){
        l1=new JLabel("VIEW BOOKED DETAILS");
        l1.setBounds(80,0,300,30);
        l1.setFont(new Font("Tahoma",Font.PLAIN,25));
        add(l1);
        
        l2=new JLabel("Username:");
        l2.setBounds(20,50,120,30);
        l2.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(l2);
        
        l9=new JLabel();
        l9.setBounds(170,50,180,30);
        l9.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(l9);
        
        l3=new JLabel("Select Package:");
        l3.setBounds(20,90,120,30);
        l3.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(l3);
        
        l15=new JLabel();
        l15.setBounds(170,90,180,30);
        l15.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(l15);
        
        l4=new JLabel("Total Persons:");
        l4.setBounds(20,130,120,30);
        l4.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(l4);
        
        l16=new JLabel();
        l16.setBounds(170,130,180,30);
        l16.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(l16);
        
        l5=new JLabel("ID:");
        l5.setBounds(20,170,120,30);
        l5.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(l5);
        
        l10=new JLabel();
        l10.setBounds(170,170,180,30);
        l10.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(l10);
        
        l6=new JLabel("Number:");
        l6.setBounds(20,210,120,30);
        l6.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(l6);
        
         l11=new JLabel();
        l11.setBounds(170,210,180,30);
        l11.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(l11);
        
        l7=new JLabel("Phone:");
        l7.setBounds(20,250,120,30);
        l7.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(l7);
        
        l12=new JLabel();
        l12.setBounds(170,250,180,30);
        l12.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(l12);
        
        l8=new JLabel("Total Price:");
        l8.setBounds(20,290,120,30);
        l8.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(l8);
        
        l13=new JLabel();
        l13.setBounds(170,290,180,30);
        l13.setFont(new Font("Tahoma",Font.PLAIN,15));
        l13.setForeground(Color.red);
        add(l13);
        
        ImageIcon img1=new ImageIcon(ClassLoader.getSystemResource("travel/tourism/management/system/icons/bookedDetails.jpg"));
        Image img2=img1.getImage().getScaledInstance(450, 350, Image.SCALE_DEFAULT);
        ImageIcon img3=new ImageIcon(img2);
        l14=new JLabel(img3);
        l14.setBounds(390,25,450,350);
        add(l14);
        try{
            ResultSet rs;
            Conn c=new Conn();
            String str="select * from bookpackage where username='"+username+"'";
            rs=c.s.executeQuery(str);
            while(rs.next()){
                l9.setText(rs.getString("username"));
                l15.setText(rs.getString("package"));
                l16.setText(rs.getString("person"));
                l10.setText(rs.getString("id"));
                l11.setText(rs.getString("number"));
                l12.setText(rs.getString("phone"));
                l13.setText("BDT "+rs.getString("price"));
            }
        }catch(Exception e){}
       
        b3=new JButton("Back");
        b3.setBounds(150,360,120,30);
        b3.setBackground(Color.black);
        b3.setForeground(Color.white);
        b3.addActionListener(this);
        add(b3);
        
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setBounds(410,150,870,450);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b3){
            this.setVisible(false);
        } 
    }
    public static void main(String[] args) {
        new ViewBookedPackage("");
    }
}
