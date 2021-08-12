
package travel.tourism.management.system;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class BookHotel extends JFrame implements ActionListener{
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17;
    JTextField t1,t2;
    Choice c1,c2,c3;
    JButton b1,b2,b3;
    BookHotel(String username){
        l1=new JLabel("BOOK HOTEL");
        l1.setBounds(100,0,250,30);
        l1.setFont(new Font("Tahoma",Font.PLAIN,25));
        add(l1);
        
        l2=new JLabel("Username:");
        l2.setBounds(20,40,120,30);
        l2.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(l2);
        l13=new JLabel();
        l13.setBounds(170,40,180,30);
        l13.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(l13);
        
        l3=new JLabel("Select Hotel:");
        l3.setBounds(20,80,120,30);
        l3.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(l3);
        
        c1=new Choice();
        c1.setBounds(170,83,180,30);
        try{
            Conn c=new Conn();
            ResultSet rs=c.s.executeQuery("select * from hotel");
            while(rs.next()){
                c1.add(rs.getString("name"));
            }
        }catch(Exception e){}
        add(c1);
        
        l4=new JLabel("Total Persons:");
        l4.setBounds(20,120,120,30);
        l4.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(l4);
        t1=new JTextField();
        t1.setBounds(170,124,180,25);
        t1.setFont(new Font("Tahoma",Font.PLAIN,13));
        add(t1);
        
        l5=new JLabel("No. of Days:");
        l5.setBounds(20,160,120,30);
        l5.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(l5);
        t2=new JTextField();
        t2.setBounds(170,164,180,25);
        t2.setFont(new Font("Tahoma",Font.PLAIN,13));
        add(t2);
        
        l6=new JLabel("AC/Non-AC");
        l6.setBounds(20,200,120,30);
        l6.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(l6);
        c2=new Choice();
        c2.setBounds(170,204,180,30);
        c2.add("AC");
        c2.add("Non-AC");
        add(c2);
        
        l7=new JLabel("Food Included:");
        l7.setBounds(20,240,120,30);
        l7.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(l7);
        c3=new Choice();
        c3.setBounds(170,244,180,30);
        c3.add("Yes");
        c3.add("No");
        add(c3);
        
        l8=new JLabel("ID:");
        l8.setBounds(20,280,120,30);
        l8.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(l8);
        l14=new JLabel();
        l14.setBounds(170,280,180,30);
        l14.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(l14);
        
        l9=new JLabel("Number:");
        l9.setBounds(20,320,120,30);
        l9.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(l9);
        l15=new JLabel();
        l15.setBounds(170,320,180,30);
        l15.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(l15);
        
        l10=new JLabel("Phone:");
        l10.setBounds(20,360,120,30);
        l10.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(l10);
        l16=new JLabel();
        l16.setBounds(170,360,180,30);
        l16.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(l16);
        
        l11=new JLabel("Total Price:");
        l11.setBounds(20,400,120,30);
        l11.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(l11);
        l17=new JLabel();
        l17.setBounds(170,400,180,30);
        l17.setFont(new Font("Tahoma",Font.PLAIN,15));
        l17.setForeground(Color.red);
        add(l17);
        
        ImageIcon img1=new ImageIcon(ClassLoader.getSystemResource("travel/tourism/management/system/icons/book.jpg"));
        Image img2=img1.getImage().getScaledInstance(460, 350, Image.SCALE_DEFAULT);
        ImageIcon img3=new ImageIcon(img2);
        l12=new JLabel(img3);
        l12.setBounds(380,50,460,350);
        add(l12);
        
        try{
            ResultSet rs;
            Conn c=new Conn();
            String str="select * from personaldetails where username='"+username+"'";
            rs=c.s.executeQuery(str);
            while(rs.next()){
                l13.setText(rs.getString("username"));
                l14.setText(rs.getString("id"));
                l15.setText(rs.getString("number"));
                l16.setText(rs.getString("phone"));
            }
        }catch(Exception e){}
        
        b1=new JButton("Check Price");
        b1.setBounds(40,450,120,30);
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        add(b1);
        
        b2=new JButton("Book Hotel");
        b2.setBounds(180,450,120,30);
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        add(b2);
        
        b3=new JButton("Back");
        b3.setBounds(320,450,120,30);
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
        if(ae.getSource()==b1){
            try{
                Conn c=new Conn();
                ResultSet rs=c.s.executeQuery("select * from hotel where name='"+c1.getSelectedItem()+"'");
                while(rs.next()){
                    int cost=Integer.parseInt(rs.getString("cost_per_day"));
                    int food=Integer.parseInt(rs.getString("food_charges"));
                    int ac=Integer.parseInt(rs.getString("ac_charges"));
                    
                    int persons=Integer.parseInt(t1.getText());
                    int days=Integer.parseInt(t2.getText());
                    
                    String acprice=c2.getSelectedItem();
                    String foodprice=c3.getSelectedItem();
                    if(persons*days>0){
                        int total=0;
                        total+=acprice.equals("AC") ? ac : 0;
                        total+=foodprice.equals("Yes") ? food : 0;
                        total+=cost;
                        total=total*persons*days;
                        l17.setText(""+total);
                    }else{
                        l17.setText("Please Enter a Valid Number.");
                    }
                }
            }catch(Exception e){                
            }
        }else if(ae.getSource()==b2){
            try{
                Conn c=new Conn();
                String str="insert into hotelbook values ('"+l13.getText()+"','"+c1.getSelectedItem()+"','"+t1.getText()+"','"+t2.getText()+"','"+c2.getSelectedItem()+"','"+c3.getSelectedItem()+"','"+l14.getText()+"','"+l15.getText()+"','"+l16.getText()+"','"+l17.getText()+"')";
                c.s.executeUpdate(str);
                JOptionPane.showMessageDialog(null, "Hotel Booked Successfully.");
                this.setVisible(false);
            }catch(Exception e){System.out.println(e);}
        }
        else if(ae.getSource()==b3){
            this.setVisible(false);
        }
    }
    public static void main(String[] args) {
        new BookHotel("");
    }
}
