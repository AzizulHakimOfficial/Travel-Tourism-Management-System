
package travel.tourism.management.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;

public class SignUp extends JFrame implements ActionListener{
    JLabel l1,l2,l3,l4,l5,l6;
    JTextField f1,f2,f3,f4;
    JButton b1,b2;
    Choice c1;
    SignUp(){
        
        l1=new JLabel("Username");
        l1.setBounds(30,10,120,30);
        l1.setFont(new Font("Tahoma",Font.BOLD,15));
        add(l1);
        
        f1=new JTextField();
        f1.setBounds(170,11,180,25);
        add(f1);
        
        l2=new JLabel("Name");
        l2.setBounds(30,50,120,30);
        l2.setFont(new Font("Tahoma",Font.BOLD,15));
        add(l2);
        
        f2=new JTextField();
        f2.setBounds(170,51,180,25);
        add(f2);
        
        l3=new JLabel("Password");
        l3.setBounds(30,90,120,30);
        l3.setFont(new Font("Tahoma",Font.BOLD,15));
        add(l3);
        f3=new JTextField();
        f3.setBounds(170,91,180,25);
        add(f3);
        
        l4=new JLabel("Security Option");
        l4.setBounds(30,130,120,30);
        l4.setFont(new Font("Tahoma",Font.BOLD,15));
        add(l4);
        
        c1=new Choice();
        c1.add("What is your favourite Place?");
        c1.add("What is Your Pet name?");
        c1.add("Your lucky number?");
        c1.setBounds(170,131,180,30);
        add(c1);
        
        l5=new JLabel("Answer");
        l5.setBounds(30,170,120,30);
        l5.setFont(new Font("Tahoma",Font.BOLD,15));
        add(l5);
        f4=new JTextField();
        f4.setBounds(170,172,180,25);
        add(f4);
        
       ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("travel/tourism/management/system/icons/signup.png"));
       l6=new JLabel(i1);
       l6.setBounds(360,10,200,200);
       add(l6);
       
       b1=new JButton("Create");
       b1.setBounds(170,220,80,30);
       b1.setBackground(Color.black);
       b1.setForeground(Color.white);
       b1.addActionListener(this);
       add(b1);
       
       b2=new JButton("Back");
       b2.setBounds(270,220,80,30);
       b2.setBackground(Color.black);
       b2.setForeground(Color.white);
       b2.addActionListener(this);
       add(b2);
        
      getContentPane().setBackground(Color.white);
      setBounds(380,150,610,330);
    setLayout(null);
    setVisible(true);
    }
    public void actionPerformed(ActionEvent ae ){
       if(ae.getSource() ==b1){
           String usernam=f1.getText();
           String nam=f2.getText();
           String pass=f3.getText();
           String secu=c1.getSelectedItem();
           String ans=f4.getText();
           
           try{
               Conn c=new Conn();
               String str1="insert into account values ('"+usernam+"','"+nam+"','"+pass+"','"+secu+"','"+ans+"')";
               c.s.executeUpdate(str1);
               JOptionPane.showMessageDialog(null, "Sign Up Successfully");
               this.setVisible(false);
               new Login().setVisible(true);
           }catch(Exception e){
           }
       }else if(ae.getSource() ==b2){
           this.setVisible(false);
           new Login().setVisible(true);
       } 
   }
    public static void main(String[] args) {
        new SignUp();
    }
}
