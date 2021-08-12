
package travel.tourism.management.system;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;


public class BookPackage extends JFrame implements ActionListener{
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14;
    JTextField t1;
    Choice c1;
    JButton b1,b2,b3;
    BookPackage(String username){
        l1=new JLabel("BOOK PACKAGE");
        l1.setBounds(100,0,250,30);
        l1.setFont(new Font("Tahoma",Font.PLAIN,25));
        add(l1);
        
        l2=new JLabel("Username:");
        l2.setBounds(20,50,120,30);
        l2.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(l2);
        
        l9=new JLabel();
        l9.setBounds(170,50,180,30);
        l9.setFont(new Font("Tahoma",Font.PLAIN,13));
        add(l9);
        
        l3=new JLabel("Select Package:");
        l3.setBounds(20,90,120,30);
        l3.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(l3);
        
        c1=new Choice();
        c1.add("GOLD PACKAGE");
        c1.add("SILVER PACKAGE");
        c1.add("BRONZE PACKAGE");
        c1.setBounds(170,95,180,30);
        add(c1);
        
        l4=new JLabel("Total Persons:");
        l4.setBounds(20,130,120,30);
        l4.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(l4);
        
        t1=new JTextField("1");
        t1.setBounds(170,135,180,25);
        t1.setFont(new Font("Tahoma",Font.PLAIN,13));
        add(t1);
        
        l5=new JLabel("ID:");
        l5.setBounds(20,170,120,30);
        l5.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(l5);
        
        l10=new JLabel();
        l10.setBounds(170,170,180,30);
        l10.setFont(new Font("Tahoma",Font.PLAIN,13));
        add(l10);
        
        l6=new JLabel("Number:");
        l6.setBounds(20,210,120,30);
        l6.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(l6);
        
         l11=new JLabel();
        l11.setBounds(170,210,180,30);
        l11.setFont(new Font("Tahoma",Font.PLAIN,13));
        add(l11);
        
        l7=new JLabel("Phone:");
        l7.setBounds(20,250,120,30);
        l7.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(l7);
        
        l12=new JLabel();
        l12.setBounds(170,250,180,30);
        l12.setFont(new Font("Tahoma",Font.PLAIN,13));
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
        
        ImageIcon img1=new ImageIcon(ClassLoader.getSystemResource("travel/tourism/management/system/icons/bookpackage.jpg"));
        Image img2=img1.getImage().getScaledInstance(450, 300, Image.SCALE_DEFAULT);
        ImageIcon img3=new ImageIcon(img2);
        l14=new JLabel(img3);
        l14.setBounds(390,25,450,300);
        add(l14);
        try{
            ResultSet rs;
            Conn c=new Conn();
            String str="select * from personaldetails where username='"+username+"'";
            rs=c.s.executeQuery(str);
            while(rs.next()){
                l9.setText(rs.getString("username"));
                l10.setText(rs.getString("id"));
                l11.setText(rs.getString("number"));
                l12.setText(rs.getString("phone"));
            }
        }catch(Exception e){}
        
        b1=new JButton("Check Price");
        b1.setBounds(40,360,120,30);
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        add(b1);
        
        b2=new JButton("Book Package");
        b2.setBounds(180,360,120,30);
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        add(b2);
        
        b3=new JButton("Back");
        b3.setBounds(320,360,120,30);
        b3.setBackground(Color.black);
        b3.setForeground(Color.white);
        b3.addActionListener(this);
        add(b3);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setBounds(410,150,870,450);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
             int cost=0;
             if(c1.getSelectedItem()=="GOLD PACKAGE"){
                 cost= 15000* Integer.parseInt(t1.getText());
                 l13.setText(Integer.toString(cost));
             }else if(c1.getSelectedItem()=="SILVER PACKAGE"){
                 cost= 30000* Integer.parseInt(t1.getText());
                 l13.setText(Integer.toString(cost));
             }else if(c1.getSelectedItem()=="BRONZE PACKAGE"){
                 cost= 42000* Integer.parseInt(t1.getText());
                 l13.setText(Integer.toString(cost));
             }
        }else if(ae.getSource()==b2){
            String usernam=l9.getText();
            String packg=c1.getSelectedItem();
            String person=t1.getText();
            String id=l10.getText();
            String number=l11.getText();
            String phone =l12.getText();
            String price =l13.getText();
            try{
            Conn c=new Conn();
           String str1="insert into bookpackage values('"+usernam+"','"+packg+"','"+person+"','"+id+"','"+number+"','"+phone+"','"+price+"')";
            c.s.executeUpdate(str1);
            JOptionPane.showMessageDialog(null, "Package booked Successfully");
            this.setVisible(false);
        }catch(Exception e){}
        }else if(ae.getSource()==b3){
            this.setVisible(false);
        } 
    }
    public static void main(String[] args) {
        new BookPackage("");
    }
}
