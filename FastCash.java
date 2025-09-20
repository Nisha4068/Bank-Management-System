import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener{
    JButton deposit, withdrawl,fastcash,ministatement,pinchange,balanceenquiry,exit;
    String pinnumber;
    FastCash(String pinnumber){
        this.pinnumber= pinnumber;
        
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(700,700,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,700,700);
        add(image);
        image.setLayout(null);

        //label for the text

        JLabel text = new JLabel("SELECT WITHDRAWL AMOUNT");
        text.setBounds(140,240,500,35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,16));
        image.add(text);

        //button for the deposit

        deposit = new JButton("Rs 100");
        deposit.setBounds(130,320,100,25);
        deposit.addActionListener(this);
        image.add(deposit);

        //for cash withdrawl

        withdrawl = new JButton(" Rs 500");
        withdrawl.setBounds(270,320,130,25);
        withdrawl.addActionListener(this);
        image.add(withdrawl);

        //for fast cash 

        fastcash = new JButton("Rs 1000");
        fastcash.setBounds(130,350,100,25);
        fastcash.addActionListener(this);
        image.add(fastcash);

        //for the mini statement

        ministatement = new JButton("Rs 2000");
        ministatement.setBounds(270,350,130,24);
        ministatement.addActionListener(this);
        image.add(ministatement);

        //for the pin change

        pinchange = new JButton("Rs 5000");
        pinchange.setBounds(130,380,101,23);
        pinchange.addActionListener(this);
        image.add(pinchange);

        //for the balance enquiry

        balanceenquiry = new JButton("Rs 10000");
        balanceenquiry.setBounds(270,380,130,23);
        balanceenquiry.addActionListener(this);
        image.add(balanceenquiry);

        //for the exit

        exit = new JButton("BACK");
        exit.setBounds(300,410,100,23);
        exit.addActionListener(this);
        image.add(exit);
        

        setSize(700,700);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
    }
   
   // @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()== exit){
             setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        }
        else {
            String amount = ((JButton)ae.getSource()).getText().substring(3);
            Conn c = new Conn();
            try{
                 ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pinnumber+"'");
                 int balance =0;
                 while (rs.next()){
                    if(rs.getString("type").equals("Deposit")){
                        balance += Integer.parseInt(rs.getString("amount"));
                    }
                    else{
                        balance -= Integer.parseInt(rs.getString("amount"));
                    }
                 }
                 if(ae.getSource()!=exit && balance < Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null, "Insufficient Balance");
                    return;
                 }
                 Date date = new Date();
                 String query = "insert into bank values('"+pinnumber+"','"+date+"','withdrawl','"+amount+"')";
                 c.s.executeUpdate(query);
                 JOptionPane.showMessageDialog(null,"Rs "+ amount +" Debited Successfully");
                 setVisible(false);
                 new Transactions(pinnumber).setVisible(true);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
      
    }
    

    public static void main(String[] args) {
        new FastCash("");
    }
}
