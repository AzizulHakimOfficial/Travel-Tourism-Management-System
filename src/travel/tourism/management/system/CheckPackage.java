
package travel.tourism.management.system;

import java.awt.*;
import javax.swing.*;

public class CheckPackage extends JFrame{
    CheckPackage(){
        JTabbedPane pane=new JTabbedPane();
        String[] package1= new String[] {"GOLD PACKAGE","6 Days and 7 Nights","Airport Assistance","Half Day City Tour","Daily Buffet","Welcome Drinks on Arrival","Full Day 3 Island Cruise","English Speaking Guide","BOOK NOW","SUMMER SPECIAL","BDT 15000/-","package1.jpg"};
        String[] package2= new String[] {"SILVER PACKAGE","5 Days and 6 Nights","Toll Free and Enreance Free Ticket","Meet and Greet at airport","Welcome Drinks on Arrival","Night Safari","Full Day 3 Island Cruise","Cruise With Dinner","BOOK NOW","WINTER SPECIAL","BDT 30000/-","package2.jpg"};
        String[] package3= new String[] {"BRONZE PACKAGE","6 Days and 5 Nights","Return Airfare","Free Clubbing,Riding & Others","Welcome Drinks on Arrival","Daily Buffet","Stay in 5 Star Hotel","BBQ Dinner","BOOK NOW","WINTER SPECIAL","BDT 42000/-","package3.jpg"};

        JPanel p1= CreatePackage(package1);
        pane.addTab("Package 1",null,p1);
        JPanel p2= CreatePackage(package2);
        pane.addTab("Package 2",null,p2);
        JPanel p3= CreatePackage(package3);
        pane.addTab("Package 3",null,p3);
        add(pane,BorderLayout.CENTER);
        
        setBounds(420,150,840,500);
    }
    
    public JPanel CreatePackage(String[] pack){
        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.white);
        
        JLabel l1=new JLabel(pack[0]);
        l1.setBounds(50,5,300,30);
        l1.setFont(new Font("Tahoma",Font.PLAIN,25));
       p1.add(l1);
       
       JLabel l2=new JLabel(pack[1]);
        l2.setBounds(30,50,300,30);
        l2.setFont(new Font("Tahoma",Font.PLAIN,18));
        l2.setForeground(Color.red);
       p1.add(l2);
       
       JLabel l3=new JLabel(pack[2]);
       l3.setBounds(30,90,300,30);
       l3.setFont(new Font("Tahoma",Font.PLAIN,18));
        l3.setForeground(Color.blue);
       p1.add(l3);
       
       JLabel l4=new JLabel(pack[3]);
        l4.setBounds(30,130,300,30);
        l4.setFont(new Font("Tahoma",Font.PLAIN,18));
        l4.setForeground(Color.red);
       p1.add(l4);
        
       JLabel l5=new JLabel(pack[4]);
        l5.setBounds(30,170,300,30);
        l5.setFont(new Font("Tahoma",Font.PLAIN,18));
        l5.setForeground(Color.blue);
       p1.add(l5);
       
       JLabel l6=new JLabel(pack[5]);
        l6.setBounds(30,210,300,30);
        l6.setFont(new Font("Tahoma",Font.PLAIN,18));
        l6.setForeground(Color.red);
       p1.add(l6);
       
       JLabel l7=new JLabel(pack[6]);
        l7.setBounds(30,250,300,30);
        l7.setFont(new Font("Tahoma",Font.PLAIN,18));
        l7.setForeground(Color.blue);
       p1.add(l7);
       
       JLabel l8=new JLabel(pack[7]);
        l8.setBounds(30,290,300,30);
        l8.setFont(new Font("Tahoma",Font.PLAIN,18));
        l8.setForeground(Color.red);
       p1.add(l8);
       
       JLabel l9=new JLabel(pack[8]);
        l9.setBounds(30,350,300,30);
        l9.setFont(new Font("Tahoma",Font.PLAIN,22));
        l9.setForeground(Color.blue);
       p1.add(l9);
       
       JLabel l10=new JLabel(pack[9]);
        l10.setBounds(290,380,300,30);
        l10.setFont(new Font("Tahoma",Font.PLAIN,25));
        l10.setForeground(Color.red);
       p1.add(l10);
       JLabel l11=new JLabel(pack[10]);
        l11.setBounds(650,380,200,30);
        l11.setFont(new Font("Tahoma",Font.PLAIN,25));
        l11.setForeground(Color.red);
       p1.add(l11);
       
       ImageIcon img1=new ImageIcon(ClassLoader.getSystemResource("travel/tourism/management/system/icons/"+pack[11]));
       Image img2=img1.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
       ImageIcon img3=new ImageIcon(img2);
       JLabel l12=new JLabel(img3);
       l12.setBounds(310,10,500,300);
       p1.add(l12);
       
        return p1;
    }
    public static void main(String[] args) {
        new CheckPackage().setVisible(true);
    }
}
