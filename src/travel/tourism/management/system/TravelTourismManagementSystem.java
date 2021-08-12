
package travel.tourism.management.system;

import java.awt.Image;
import javax.swing.*;

public class TravelTourismManagementSystem extends JFrame implements Runnable{
    Thread t1;

    TravelTourismManagementSystem(){
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("travel/tourism/management/system/icons/splash.jpg"));
        Image i2=i1.getImage().getScaledInstance(850,450,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l1=new JLabel(i3);
        l1.setBounds(0,0,850,450);
        add(l1);
        
        setUndecorated(true);
        setLayout(null);
        
        setVisible(true);
       int x=1;
       for(int i=1;i<=450;i+=6,x+=5){
           this.setLocation(680-(x+i)/2,350-(i/2));
           this.setSize(x+i, i);
           try{
               Thread.sleep(20);
           }catch(Exception e){}
       }
       setVisible(true);
       
        t1=new Thread(this);
        t1.start();
    }
    public void run(){
        try{
            Thread.sleep(2000);
            this.setVisible(false);
            new Login().setVisible(true);
        }catch(Exception e){}
    }
    public static void main(String[] args) {
       new TravelTourismManagementSystem();
    }
    
}
