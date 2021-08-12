
package travel.tourism.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Dashboard extends JFrame implements ActionListener{
    String username;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15;
    Dashboard(String username){
        this.username=username;
        JPanel p1=new JPanel();
        p1.setBounds(0,0,1920,60);
        p1.setBackground(new Color(0,0,102));
        p1.setLayout(null);
        add(p1);
        
        JPanel p2=new JPanel();
        p2.setBounds(0,60,300,1000);
        p2.setBackground(new Color(0,0,102));
        p2.setLayout(null);
        add(p2);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("travel/tourism/management/system/icons/home.jpg"));
        Image i2=i1.getImage().getScaledInstance(1100,650,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l1=new JLabel(i3);
        l1.setBounds(300,60,1100,650);
        add(l1);
        
         ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("travel/tourism/management/system/icons/dashboard.jpg"));
        Image i5=i4.getImage().getScaledInstance(30,30,Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        JLabel l2=new JLabel(i6);
        l2.setBounds(20,15,30,30);
        p1.add(l2);
        
        JLabel l4=new JLabel("Travel and Tourism Management System");
        l4.setBounds(160,15,800,50);
        l4.setFont(new Font("default",Font.BOLD,40));
        l4.setForeground(Color.white);
        l1.add(l4);
        
        
        JLabel l3=new JLabel("Dashboard");
        l3.setBounds(55,15,150,30);
        l3.setFont(new Font("default",Font.BOLD,22));
        l3.setForeground(Color.white);
        p1.add(l3);
        
        b1=new JButton("Add Personal Details");
        b1.setBounds(0,0,300,40);
        b1.setBackground(new Color(0,0,102));
        b1.setForeground(Color.white);
        b1.setFont(new Font("Tahoma",Font.PLAIN,16));
        b1.addActionListener(this);
        p2.add(b1);
        
        b2=new JButton("Update Personal Details");
        b2.setBounds(0,40,300,40);
        b2.setBackground(new Color(0,0,102));
        b2.setForeground(Color.white);
        b2.setFont(new Font("Tahoma",Font.PLAIN,16));
        b2.addActionListener(this);
        p2.add(b2);
        
        b3=new JButton("View Details");
        b3.setBounds(0,80,300,40);
        b3.setBackground(new Color(0,0,102));
        b3.setForeground(Color.white);
        b3.setFont(new Font("Tahoma",Font.PLAIN,16));
        b3.addActionListener(this);
        p2.add(b3);
        
        b4=new JButton("Delete Personal Details");
        b4.setBounds(0,120,300,40);
        b4.setBackground(new Color(0,0,102));
        b4.setForeground(Color.white);
        b4.setFont(new Font("Tahoma",Font.PLAIN,16));
        b4.addActionListener(this);
        p2.add(b4);
        
        b5=new JButton("Check Package");
        b5.setBounds(0,160,300,40);
        b5.setBackground(new Color(0,0,102));
        b5.setForeground(Color.white);
        b5.setFont(new Font("Tahoma",Font.PLAIN,16));
        b5.addActionListener(this);
        p2.add(b5);
        b6=new JButton("Book Package");
        b6.setBounds(0,200,300,40);
        b6.setBackground(new Color(0,0,102));
        b6.setForeground(Color.white);
        b6.setFont(new Font("Tahoma",Font.PLAIN,16));
        b6.addActionListener(this);
        p2.add(b6);
        b7=new JButton("View Booked Package");
        b7.setBounds(0,240,300,40);
        b7.setBackground(new Color(0,0,102));
        b7.setForeground(Color.white);
        b7.setFont(new Font("Tahoma",Font.PLAIN,16));
        b7.addActionListener(this);
        p2.add(b7);
        b8=new JButton("View Hotels");
        b8.setBounds(0,280,300,40);
        b8.setBackground(new Color(0,0,102));
        b8.setForeground(Color.white);
        b8.setFont(new Font("Tahoma",Font.PLAIN,16));
        b8.addActionListener(this);
        p2.add(b8);
        b9=new JButton("Book Hotel");
        b9.setBounds(0,320,300,40);
        b9.setBackground(new Color(0,0,102));
        b9.setForeground(Color.white);
        b9.setFont(new Font("Tahoma",Font.PLAIN,16));
        b9.addActionListener(this);
        p2.add(b9);
        b10=new JButton("View Booked Hotel");
        b10.setBounds(0,360,300,40);
        b10.setBackground(new Color(0,0,102));
        b10.setForeground(Color.white);
        b10.setFont(new Font("Tahoma",Font.PLAIN,16));
        b10.addActionListener(this);
        p2.add(b10);
        b11=new JButton("Destination");
        b11.setBounds(0,400,300,40);
        b11.setBackground(new Color(0,0,102));
        b11.setForeground(Color.white);
        b11.setFont(new Font("Tahoma",Font.PLAIN,16));
        b11.addActionListener(this);
        p2.add(b11);
        b13=new JButton("Notepad");
        b13.setBounds(0,440,300,40);
        b13.setBackground(new Color(0,0,102));
        b13.setForeground(Color.white);
        b13.setFont(new Font("Tahoma",Font.PLAIN,16));
        b13.addActionListener(this);
        p2.add(b13);
        b14=new JButton("Calculator");
        b14.setBounds(0,480,300,40);
        b14.setBackground(new Color(0,0,102));
        b14.setForeground(Color.white);
        b14.setFont(new Font("Tahoma",Font.PLAIN,16));
        b14.addActionListener(this);
        p2.add(b14);
        /*b15=new JButton("About");
        b15.setBounds(0,520,300,40);
        b15.setBackground(new Color(0,0,102));
        b15.setForeground(Color.white);
        b15.setFont(new Font("Tahoma",Font.PLAIN,16));
        b15.addActionListener(this);
        p2.add(b15);*/
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            new AddPersonalDetails(username).setVisible(true);
        }else if(ae.getSource()==b2){
            new UpdatePersonalDetails(username).setVisible(true);
        }else if(ae.getSource()==b3){
            new ViewDetails(username).setVisible(true);
        }else if(ae.getSource()==b4){
            new DeletePersonalDetails(username).setVisible(true);
        }else if(ae.getSource()==b5){
            new CheckPackage().setVisible(true);
        }else if(ae.getSource()==b6){
            new BookPackage(username).setVisible(true);
        }else if(ae.getSource()==b7){
           new ViewBookedPackage(username).setVisible(true);
        }else if(ae.getSource()==b8){
            new CheckHotel().setVisible(true);
        }else if(ae.getSource()==b9){
            new BookHotel(username).setVisible(true);
        }else if(ae.getSource()==b10){
            new ViewBookedHotel(username).setVisible(true);
        }else if(ae.getSource()==b11){
            new Destinations().setVisible(true);
        }else if(ae.getSource()==b13){
            try{
                Runtime.getRuntime().exec("notepad.exe");
        }catch(Exception e){}
        }else if(ae.getSource()==b14){
            try{
                Runtime.getRuntime().exec("calc.exe");
        }catch(Exception e){}
        }/*else if(ae.getSource()==b15){
            
        }*/
    }
    public static void main(String[] args) {
        new Dashboard("");
    }
}
