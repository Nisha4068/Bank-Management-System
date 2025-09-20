import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;

import javax.swing.*;
import java.util.*;

public class Withdrawl extends JFrame implements ActionListener {
JTextField amount;
JButton withdraw, back;
String pinnumber;
    Withdrawl(String pinnumber){
        this.pinnumber = pinnumber;
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(700,700,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,700,700);
        add(image);

        //JLabel for text

        JLabel text = new JLabel("Enter the amount you want to withdraw");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Raleway",Font.BOLD,14));
        text.setBounds(130,250,400,20);
        image.add(text);

        //text field for amount
        amount = new JTextField();
        amount.setFont(new Font("Raleway",Font.BOLD,22));
        amount.setBounds(130,280,250,23);
        image.add(amount);

        //button for deposit

        withdraw = new JButton("withdraw");
        withdraw.setBounds(300,377,110,22);
        withdraw.addActionListener(this);
        image.add(withdraw);

        //button for back

        back = new JButton("Back");
        back.setBounds(300,403,110,22);
        back.addActionListener(this);
        image.add(back);


        setSize(700,700);
        setLocation(300,0);
        setVisible(true);

    }
    
   // @Override
    public void actionPerformed(ActionEvent ae) {
       if(ae.getSource()== withdraw){
         String number = amount.getText();
         Date date = new Date();
         if(number.equals("")){
            JOptionPane.showMessageDialog(null, "Please enter the amount you want to withdraw");
         }
         else{
             try {
            Conn conn = new Conn();
            String query  = "insert into bank values('"+pinnumber+"', '"+date+"','Withdrawl','"+number+"')";
            conn.s.executeUpdate(query);
             JOptionPane.showMessageDialog(null, "Rs " +number+"  Withdraw Successfully");
             setVisible(false);
             new Transactions(pinnumber).setVisible(true);
            } catch (SQLException e) {
                
                e.printStackTrace();
            }
             
         }
       }
       else if(ae.getSource()== back){
        setVisible(false);
        new Transactions(pinnumber).setVisible(true);
       }
    }

     public static void main(String[] args) {
        new Withdrawl("");
    }
}


