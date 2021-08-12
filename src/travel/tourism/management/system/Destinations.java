
package travel.tourism.management.system;

import java.awt.*;
import javax.swing.*;

public class Destinations extends JFrame implements Runnable{
    Thread t1;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
    JLabel[] l=new JLabel[]{l1,l2,l3,l4,l5,l6,l7,l8,l9,l10};
    ImageIcon img1,img2,img3,img4,img5,img6,img7,img8,img9,img10;
    ImageIcon[] img=new ImageIcon[]{img1,img2,img3,img4,img5,img6,img7,img8,img9,img10};
    ImageIcon im1,im2,im3,im4,im5,im6,im7,im8,im9,im10;
    ImageIcon[] im=new ImageIcon[]{im1,im2,im3,im4,im5,im6,im7,im8,im9,im10};
    Image i1,i2,i3,i4,i5,i6,i7,i8,i9,i10;
    Image[] imag=new Image[] {i1,i2,i3,i4,i5,i6,i7,i8,i9,i10};
    Destinations(){
       
       for(int i=1;i<10;i++){
       img[i]=new ImageIcon(ClassLoader.getSystemResource("travel/tourism/management/system/icons/dest"+i+".jpg"));
       imag[i]=img[i].getImage().getScaledInstance(600, 500, Image.SCALE_DEFAULT);
       im[i]=new ImageIcon(imag[i]);
       this.l[i]=new JLabel(im[i]);
       this.l[i].setBounds(0,0,600,500);
       add(this.l[i]);
       }
        
        setLayout(null);
        setBounds(550,150,600,500);
        setVisible(true);
        
        t1=new Thread(this);
        t1.start();
    }
    public void run(){
      
        for(int i=1;i<=10;i++){
            try{
                this.l[i].setVisible(true);
                Thread.sleep(2000);
                this.l[i].setVisible(false);
                
            }catch(Exception e){}
        }
        this.setVisible(false);
    }
    public static void main(String[] args) {
        new Destinations();
    }
}
