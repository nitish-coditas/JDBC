/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.management.system;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.*;

public class Login extends JFrame implements ActionListener {
    JLabel l1,l2;
    JTextField t1;
    JPasswordField t2;
    JButton b1,b2;
    
    
    Login(){
        
        l1=new JLabel("Username");
        l1.setBounds(40, 50,100,30);
        add(l1);
        l2=new JLabel("Password");
        l2.setBounds(40, 100,100,30);
        add(l2);
        
        t1=new JTextField();
        t1.setBounds(180, 50, 150, 30);
        add(t1);
        
        t2=new JPasswordField();
        t2.setBounds(180, 100, 150, 30);
        add(t2);
        
        b1=new JButton("Login");
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);
        b1.setBounds(40, 150, 120, 30);
       
        add(b1);
          b1.addActionListener(this);
        b2=new JButton("Cancel");
        b2.setBackground(Color.WHITE);
        b2.setForeground(Color.BLACK);
        b2.setBounds(220, 150, 120, 30);
         add(b2);
        b2.addActionListener(this);
       
        ImageIcon i2=new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/second.jpg"));
        Image i3=i2.getImage().getScaledInstance(200, 200,Image.SCALE_DEFAULT);
        ImageIcon i4=new ImageIcon(i3);
    JLabel l3=new JLabel(i4);
    l3.setBounds(400, 20, 200, 200);
    add(l3);
    getContentPane().setBackground(Color.WHITE);
   
        
        
        setLayout(null);
        setBounds(20,300,600,400);
        setVisible(true);
         this.setLocationRelativeTo(null);
        
    }
    public void actionPerformed(ActionEvent ae )
    {
        if(ae.getSource()==b1)
        {
          String username=t1.getText();
          String password=t2.getText();
          Conn c =new Conn();
          String str="select * from login where username='"+username+"' and  password ='"+password+"'";
          try{
         ResultSet rs= c.s.executeQuery(str);
         if(rs.next()){
             new HotelManagementSystem().setVisible(true);
         this.setVisible(false);
        }
         else{
             JOptionPane.showMessageDialog(null,"Wrong input");
             this.setVisible(false);
         }}
          catch(Exception e){
              
          }}
        else if(ae.getSource()==b2)
        {
            System.exit(0);
        }
    }
    public static void main(String[]args)
    {
        new Login();
    }
    
}
