
package travel.tourism.management.system;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class UpdatePersonalDetails extends JFrame implements ActionListener{
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
    JButton b1,b2;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9;
    UpdatePersonalDetails(String username){
        
        l1=new JLabel("UPDATE CUSTOMER FORM");
        l1.setBounds(80,15,350,25);
        l1.setFont(new Font("tahoma",Font.PLAIN,25));
        add(l1);
        
        l11=new JLabel("Username");
        l11.setBounds(35,70,170,25);
        add(l11);
        
        t7=new JTextField();
        t7.setBounds(240,72,140,25);
        add(t7);
        
        l2=new JLabel("ID");
        l2.setBounds(35,112,170,25);
        add(l2);
        
        t8=new JTextField();
        t8.setBounds(240,110,140,25);
        add(t8);
        
        l3=new JLabel("Number");
        l3.setBounds(35,152,170,25);
        add(l3);
        
        t1=new JTextField();
        t1.setBounds(240,150,140,25);
        add(t1);
        
        l4=new JLabel("Name");
        l4.setBounds(35,192,170,25);
        add(l4);
        
        t2=new JTextField();
        t2.setBounds(240,190,140,25);
        add(t2);
        
        l5=new JLabel("Gender");
        l5.setBounds(35,232,170,25);
        add(l5);
        t9=new JTextField();
        t9.setBounds(240,230,140,25);
        add(t9);
        
        l6=new JLabel("Country");
        l6.setBounds(35,272,170,25);
        add(l6);
        
        t3=new JTextField();
        t3.setBounds(240,270,140,25);
        add(t3);
        
        l7=new JLabel("Permanent Address");
        l7.setBounds(35,312,170,25);
        add(l7);
        
        t4=new JTextField();
        t4.setBounds(240,310,140,25);
        add(t4);
            
            
        l8=new JLabel("Phone");
        l8.setBounds(35,352,170,25);
        add(l8);
        
        t5=new JTextField();
        t5.setBounds(240,350,140,25);
        add(t5);
        
        l9=new JLabel("Email");
        l9.setBounds(35,392,170,25);
        add(l9);
        
        t6=new JTextField();
        t6.setBounds(240,390,140,25);
        add(t6);
        
        b1=new JButton("Update");
        b1.setBounds(130,430,100,35);
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        add(b1);
        
        b2=new JButton("Cancel");
        b2.setBounds(280,430,100,35);
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        add(b2);
        
        
        ImageIcon img1=new ImageIcon(ClassLoader.getSystemResource("travel/tourism/management/system/icons/update.png"));
        Image img2=img1.getImage().getScaledInstance(300, 470, Image.SCALE_DEFAULT);
        ImageIcon img3=new ImageIcon(img2);
        l10=new JLabel(img3);
        l10.setBounds(410,0,300,470);
        add(l10);
        
        Conn c=new Conn();
        try{
            ResultSet rs;
            String str2="select * from personaldetails where username='"+username+"'";
            rs=c.s.executeQuery(str2);
            while(rs.next()){
                t7.setText(rs.getString("username"));
                t8.setText(rs.getString("id"));
                t1.setText(rs.getString("number"));
                t2.setText(rs.getString("name"));
                t3.setText(rs.getString("country"));
                t4.setText(rs.getString("permanentaddress"));
                t5.setText(rs.getString("phone"));
                t6.setText(rs.getString("email"));
                t9.setText(rs.getString("gender"));
            }
        }catch(Exception e){}
        
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setBounds(465,150,760,535);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            String id=t8.getText();
            String number=t1.getText();
            String name=t2.getText();
            String gender=t9.getText();
            String country=t3.getText();
            String address=t4.getText();
            String phone=t5.getText();
            String email=t6.getText();
            String username=t7.getText();
            Conn c1=new Conn();
            try{
                String str="update personaldetails set id='"+id+"',number='"+number+"',name='"+name+"',gender='"+gender+"',country='"+country+"',permanentaddress='"+address+"',phone='"+phone+"',email='"+email+"',username='"+username+"' where username='"+username+"'";
                c1.s.executeUpdate(str);
                JOptionPane.showMessageDialog(null, "Personal Details Updated Successfully.");
                this.setVisible(false);
            }catch(Exception e){}
        }else if(ae.getSource()==b2){
            this.setVisible(false);
        }
    }
    
    public static void main(String[] args) {
        new UpdatePersonalDetails("");
    }
}
