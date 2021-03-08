
package hotel.management.system;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
public class HotelManagementSystem extends JFrame implements ActionListener{
    
HotelManagementSystem()
{
   // initComponents();
   
    setBounds(300,300,1100,565);
   // setSize(400,400);
    
    ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/first.jpg"));
    JLabel l1=new JLabel(i1);
    l1.setBounds(0,0, 1100, 565);
    add(l1);
    setLayout(null);
    setVisible(true);
     this.setLocationRelativeTo(null);
      JLabel l2=new JLabel("HOTEL MANAGEMENT SYSTEM");
    l2.setBounds(20,430, 700, 70);
    l2.setBackground(Color.RED);
    l2.setFont(new Font("serif",Font.PLAIN,40));
    l1.add(l2);
    JButton b1=new JButton("Start");
    b1.setBackground(Color.WHITE);
    b1.setForeground(Color.BLACK);
    b1.setBounds(820,420,100,40);
    b1.addActionListener(this);
    l1.add(b1);
    
    while(true){
        l2.setVisible(false);
        try{
            Thread.sleep(500);
            
        }
        catch(Exception e)
                {
                    
                }
        l2.setVisible(true);
        try{
            Thread.sleep(500);
            
        }
        catch(Exception e){}
    }
}
public void actionPerformed(ActionEvent ae)
{
   new  Login().setVisible(true);
   this.setVisible(false);
}
    
    public static void main(String[] args) {
      new  HotelManagementSystem ();
    }
    
}
