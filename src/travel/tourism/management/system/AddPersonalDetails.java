
package travel.tourism.management.system;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class AddPersonalDetails extends JFrame implements ActionListener{
    String username;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
    JButton b1,b2;
    JRadioButton r1,r2;
    JComboBox c1;
    JTextField t1,t2,t3,t4,t5,t6,t7;
    ButtonGroup bt1;
    AddPersonalDetails(String username){
    
        l1=new JLabel("NEW CUSTOMER FORM");
        l1.setBounds(80,15,270,25);
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
        
        String str1[]={"Nid Card","Passport","Driving License"};
        c1=new JComboBox(str1);
        c1.setBounds(240,110,140,25);
        c1.setBackground(Color.white);
        add(c1);
        
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
        bt1=new ButtonGroup();
        r1=new JRadioButton("Male");
        r1.setBounds(240,230,60,25);
        r1.setBackground(Color.white);
        add(r1);
        
        r2=new JRadioButton("Female");
        r2.setBounds(310,230,70,25);
        r2.setBackground(Color.white);
        add(r2);
        
        bt1.add(r1);
        bt1.add(r2);
        
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
        
        b1=new JButton("Add");
        b1.setBounds(130,440,100,35);
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        add(b1);
        
        b2=new JButton("Cancel");
        b2.setBounds(280,440,100,35);
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        add(b2);
        
        
        ImageIcon img1=new ImageIcon(ClassLoader.getSystemResource("travel/tourism/management/system/icons/newcustomer.jpg"));
        Image img2=img1.getImage().getScaledInstance(300, 470, Image.SCALE_DEFAULT);
        ImageIcon img3=new ImageIcon(img2);
        l10=new JLabel(img3);
        l10.setBounds(410,10,300,400);
        add(l10);
        Conn c=new Conn();
        try{
            ResultSet rs;
            String str2="select * from account where username='"+username+"'";
            rs=c.s.executeQuery(str2);
            while(rs.next()){
                t7.setText(rs.getString("username"));
                t2.setText(rs.getString("name"));
            }
        }catch(Exception e){}
        
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setBounds(465,150,760,535);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            String usernam=t7.getText();
            String id=(String)c1.getSelectedItem();
            String number=t1.getText();
            String name=t2.getText();
            String gender=null;
            if(r1.isSelected()){
                gender="Male";
            }else if(r2.isSelected()){
                gender="Female";
            }
            String country=t3.getText();
            String address=t4.getText();
            String phone=t5.getText();
            String email=t6.getText();
            Conn c1=new Conn();
            try{
                String str="insert into personaldetails values('"+id+"','"+number+"','"+name+"','"+gender+"','"+country+"','"+address+"','"+phone+"','"+email+"','"+usernam+"')";
                c1.s.executeUpdate(str);
                JOptionPane.showMessageDialog(null, "Personal Details Added Successfully.");
                this.setVisible(false);
            }catch(Exception e){}
        }else if(ae.getSource()==b2){
            this.setVisible(false);
        }
    }
    
    public static void main(String[] args) {
        new AddPersonalDetails("");
    }
}
