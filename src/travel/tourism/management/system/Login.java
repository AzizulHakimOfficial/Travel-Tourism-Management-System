
package travel.tourism.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class Login extends JFrame implements ActionListener{
    String usernam;
     JLabel l1,l2,l3,l4,l5;
     JTextField t1;
     JPasswordField f1;
     JButton b1,b2,b3;
   Login(){
       ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("travel/tourism/management/system/icons/login.png"));
       l1=new JLabel(i1);
       l1.setBounds(50,0,200,300);
       add(l1);
       
       l2=new JLabel("Username:");
       l2.setBounds(320,20,100,30);
       l2.setFont(new Font("Tahoma",Font.PLAIN,18));
       add(l2);
       
       t1=new JTextField();
       t1.setBounds(320,50,180,30);
       add(t1);
       
       l2=new JLabel("Password:");
       l2.setBounds(320,90,100,30);
       l2.setFont(new Font("Tahoma",Font.PLAIN,18));
       add(l2);
       
       f1=new JPasswordField();
       f1.setBounds(320,120,180,30);
       add(f1);
       
       b1=new JButton("Login");
       b1.setBounds(320,170,80,30);
       b1.setBackground(Color.black);
       b1.setForeground(Color.white);
       b1.addActionListener(this);
       add(b1);
       
       b2=new JButton("Sign Up");
       b2.setBounds(420,170,80,30);
       b2.setBackground(Color.black);
       b2.setForeground(Color.white);
       b2.addActionListener(this);
       add(b2);
       
       b3=new JButton("Forget Password");
       b3.setBounds(340,210,140,30);
       b3.setBackground(Color.black);
       b3.setForeground(Color.white);
       b3.addActionListener(this);
       add(b3);
       
       
    getContentPane().setBackground(Color.white);
    setBounds(380,150,610,330);
    setLayout(null);
    setVisible(true);
   }
   public void actionPerformed(ActionEvent ae){
       if(ae.getSource()==b1){
           ResultSet rs;
           usernam=t1.getText();
           String pass=f1.getText();
           Conn c=new Conn();
           try{
               String str="select * from account where username='"+usernam+"' and password='"+pass+"'";
               rs=c.s.executeQuery(str);
               if(rs.next()){
                   this.setVisible(false);
                    new Loading(usernam).setVisible(true);
               }else{
                   JOptionPane.showMessageDialog(null, "Wrong username or Password");
               }
           }catch(Exception e){}
           
       }else if(ae.getSource()==b2){
           this.setVisible(false);
           new SignUp().setVisible(true);
       } else if(ae.getSource()==b3){
           this.setVisible(false);
           new ForgetPassword().setVisible(true);
       }
   }    
    public static void main(String[] args) {
        new Login();
    }
}
