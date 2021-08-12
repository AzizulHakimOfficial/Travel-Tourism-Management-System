
package travel.tourism.management.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;

public class ForgetPassword extends JFrame implements ActionListener{
    JLabel l1,l2,l3,l4,l5,l6,l7;
    JTextField f1,f2,f3,f4,f5;
    JButton b1,b3,b2;
    ForgetPassword(){
        
        l1=new JLabel("Username");
        l1.setBounds(30,10,120,30);
        l1.setFont(new Font("Tahoma",Font.BOLD,13));
        add(l1);
        
        f1=new JTextField();
        f1.setBounds(170,11,180,25);
        add(f1);
        
        l2=new JLabel("Name");
        l2.setBounds(30,50,120,30);
        l2.setFont(new Font("Tahoma",Font.BOLD,13));
        add(l2);
        
        f2=new JTextField();
        f2.setBounds(170,51,180,25);
        add(f2);
        
        l3=new JLabel("Security question");
        l3.setBounds(30,90,140,30);
        l3.setFont(new Font("Tahoma",Font.BOLD,13));
        add(l3);
        
        f3=new JTextField();
        f3.setBounds(170,91,200,25);
        add(f3);
        
        l4=new JLabel("Answer");
        l4.setBounds(30,130,120,30);
        l4.setFont(new Font("Tahoma",Font.BOLD,13));
        add(l4);
        
        f4=new JTextField();
        f4.setBounds(170,132,180,25);
        add(f4);
        
        l5=new JLabel("Password");
        l5.setBounds(30,170,120,30);
        l5.setFont(new Font("Tahoma",Font.BOLD,13));
        add(l5);
        
         f5=new JTextField();
        f5.setBounds(170,172,180,25);
        add(f5);
        
        
       ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("travel/tourism/management/system/icons/forgotpassword.jpg"));
       Image i2=i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
       ImageIcon i3=new ImageIcon(i2);
       l6=new JLabel(i3);
       l6.setBounds(500,30,200,200);
       add(l6);
       
       b1=new JButton("Back");
       b1.setBounds(210,240,100,30);
       b1.setBackground(Color.black);
       b1.setForeground(Color.white);
       b1.addActionListener(this);
       add(b1);
       
       b2=new JButton("Search");
       b2.setBounds(360,11,90,25);
       b2.setBackground(Color.GRAY);
       b2.setForeground(Color.white);
       b2.addActionListener(this);
       add(b2);
       
       b3=new JButton("Retrieve");
       b3.setBounds(360,132,90,25);
       b3.setBackground(Color.GRAY);
       b3.setForeground(Color.white);
       b3.addActionListener(this);
       add(b3);
        
      getContentPane().setBackground(Color.white);
      setBounds(350,150,750,350);
    setLayout(null);
    setVisible(true);
    }
    public void actionPerformed(ActionEvent ae ){
       if(ae.getSource()==b1){
           this.setVisible(false);
           new Login().setVisible(true);
       }else if(ae.getSource()==b2){
           String usernam=f1.getText();
           Conn c=new Conn();
           ResultSet rs;
           try{
               String str="select * from account where username='"+usernam+"'";
               rs=c.s.executeQuery(str);
               if(rs.next()){
                   f2.setText(rs.getString("name"));
                   f3.setText(rs.getString("security"));
               }else{
                   JOptionPane.showMessageDialog(null, "UserName Does Not Exist");
               }
           }catch(Exception e){}
       }else if(ae.getSource()==b3){
           String usernam=f1.getText();
           String ans=f4.getText();
           
           Conn c=new Conn();
           ResultSet rs1;
           try{
               String str1="select * from account where username='"+usernam+"' and answer='"+ans+"'";
               rs1=c.s.executeQuery(str1);
               if(rs1.next()){
                   f5.setText(rs1.getString("password"));
               }else{
                   JOptionPane.showMessageDialog(null,"Entered Wrong Answer");
               }
           }catch(Exception e){}
       }
   }
    public static void main(String[] args) {
        new ForgetPassword();
    }
}
