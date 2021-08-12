
package travel.tourism.management.system;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class Loading extends JFrame implements Runnable{
    JProgressBar p;
    Thread t;
    String username;
    Loading(String username){
        this.username=username;
        JLabel l1=new JLabel("Travel and Tourism Application");
        l1.setFont(new Font("default",Font.BOLD,23));
        l1.setBounds(65,20,380,50);
        l1.setForeground(Color.blue);
        add(l1);
        
        p =new JProgressBar();
        p.setBounds(115,100,250,25);
        p.setStringPainted(true);
        add(p);
        
        JLabel l2=new JLabel("Please Wait...");
        l2.setFont(new Font("default",Font.BOLD,16));
        l2.setBounds(190,130,150,25);
        l2.setForeground(Color.red);
        add(l2);
         
        
        setUndecorated(true);
        getContentPane().setBackground(Color.white);
        setBounds(430,180,500,300);
        setLayout(null);
        setVisible(true);
        t=new Thread(this);
        t.start();
    }
    public void run() {
        try{
            for(int a=1;a < 101; a++){
                int m=p.getMaximum();
                int n=p.getValue();
                if(n<m){
                    p.setValue(p.getValue() + 1);
                }else{
                    a=101; 
                }
                 Thread.sleep(30);
            }
        }catch(Exception e){}
        setVisible(false);
        new Dashboard(username).setVisible(true);
    }
    public static void main(String[] args) {
        new Loading("");
    }
}
