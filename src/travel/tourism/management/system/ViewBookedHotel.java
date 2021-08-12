
package travel.tourism.management.system;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;


public class ViewBookedHotel extends JFrame implements ActionListener{
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23;

    JButton b3;
    ViewBookedHotel(String username){
        l1=new JLabel("VIEW BOOKED HOTEL DETAILS");
        l1.setBounds(80,0,400,30);
        l1.setFont(new Font("Tahoma",Font.PLAIN,25));
        add(l1);
        
        l2=new JLabel("Username:");
        l2.setBounds(10,40,160,30);
        l2.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(l2);
        
        l13=new JLabel();
        l13.setBounds(180,40,180,30);
        l13.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(l13);
        
        l3=new JLabel("Name:");
        l3.setBounds(10,80,160,30);
        l3.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(l3);
        
        l14=new JLabel();
        l14.setBounds(180,80,180,30);
        l14.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(l14);
        
        l4=new JLabel("Number of Persons:");
        l4.setBounds(10,120,160,30);
        l4.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(l4);
        
        l15=new JLabel();
        l15.setBounds(180,120,180,30);
        l15.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(l15);
        
        l5=new JLabel("Number of Days:");
        l5.setBounds(10,160,160,30);
        l5.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(l5);

        l16=new JLabel();
        l16.setBounds(180,160,180,30);
        l16.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(l16);
        
        l6=new JLabel("AC/Non-AC");
        l6.setBounds(10,200,160,30);
        l6.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(l6);
        
        l17=new JLabel();
        l17.setBounds(180,200,180,30);
        l17.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(l17);

        l7=new JLabel("Food Included(Yes/No):");
        l7.setBounds(10,240,160,30);
        l7.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(l7);
        
        l19=new JLabel();
        l19.setBounds(180,240,180,30);
        l19.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(l19);
        
        l8=new JLabel("ID:");
        l8.setBounds(10,280,160,30);
        l8.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(l8);
        
        l20=new JLabel();
        l20.setBounds(180,280,180,30);
        l20.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(l20);
        
        l9=new JLabel("Number:");
        l9.setBounds(10,320,160,30);
        l9.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(l9);
        
        l21=new JLabel();
        l21.setBounds(180,320,180,30);
        l21.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(l21);
        
        l10=new JLabel("Phone:");
        l10.setBounds(10,360,160,30);
        l10.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(l10);
        
        l22=new JLabel();
        l22.setBounds(180,360,180,30);
        l22.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(l22);
        
        l11=new JLabel("Cost:");
        l11.setBounds(10,400,160,30);
        l11.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(l11);
        
        l23=new JLabel();
        l23.setBounds(180,400,180,30);
        l23.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(l23);
        
        
       
        
        ImageIcon img1=new ImageIcon(ClassLoader.getSystemResource("travel/tourism/management/system/icons/bookedDetails.jpg"));
        Image img2=img1.getImage().getScaledInstance(450, 435, Image.SCALE_DEFAULT);
        ImageIcon img3=new ImageIcon(img2);
        l12=new JLabel(img3);
        l12.setBounds(390,40,450,435);
        add(l12);
        try{
            ResultSet rs;
            Conn c=new Conn();
            String str="select * from hotelbook where username='"+username+"'";
            rs=c.s.executeQuery(str);
            while(rs.next()){
                l13.setText(rs.getString("username"));
                l14.setText(rs.getString("hotel"));
                l15.setText(rs.getString("persons"));
                l16.setText(rs.getString("days"));
                l17.setText(rs.getString("ac"));
                l19.setText(rs.getString("food"));
                l20.setText(rs.getString("id"));
                l21.setText(rs.getString("number"));
                l22.setText(rs.getString("phone"));
                l23.setText("BDT "+rs.getString("cost"));
            }
        }catch(Exception e){}
       
        b3=new JButton("Back");
        b3.setBounds(150,450,120,30);
        b3.setBackground(Color.black);
        b3.setForeground(Color.white);
        b3.addActionListener(this);
        add(b3);
        
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setBounds(410,150,870,530);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b3){
            this.setVisible(false);
        } 
    }
    public static void main(String[] args) {
        new ViewBookedHotel("");
    }
}
