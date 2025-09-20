import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Transactions extends JFrame implements ActionListener{
    JButton deposit, withdrawl,fastcash,ministatement,pinchange,balanceenquiry,exit;
    String pinnumber;
    Transactions(String pinnumber){
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

        JLabel text = new JLabel("please select your Transactions");
        text.setBounds(140,240,500,35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,16));
        image.add(text);

        //button for the deposit

        deposit = new JButton("Deposit");
        deposit.setBounds(130,320,100,25);
        deposit.addActionListener(this);
        image.add(deposit);

        //for cash withdrawl

        withdrawl = new JButton(" Cash withdrawl");
        withdrawl.setBounds(270,320,130,25);
        withdrawl.addActionListener(this);
        image.add(withdrawl);

        //for fast cash 

        fastcash = new JButton("Fast Cash");
        fastcash.setBounds(130,350,100,25);
        fastcash.addActionListener(this);
        image.add(fastcash);

        //for the mini statement

        ministatement = new JButton("Mini Statement");
        ministatement.setBounds(270,350,130,24);
        ministatement.addActionListener(this);
        image.add(ministatement);

        //for the pin change

        pinchange = new JButton("Pin Change");
        pinchange.setBounds(130,380,101,23);
        pinchange.addActionListener(this);
        image.add(pinchange);

        //for the balance enquiry

        balanceenquiry = new JButton("Balance Enquiry");
        balanceenquiry.setBounds(270,380,130,23);
        balanceenquiry.addActionListener(this);
        image.add(balanceenquiry);

        //for the exit

        exit = new JButton("Exit");
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
            System.exit(0);
        }
        else if(ae.getSource()== deposit){
            setVisible(false);
            new Deposit(pinnumber).setVisible(true);
        }
        else if(ae.getSource() == withdrawl){
             System.out.println("Withdraw button clicked");
          setVisible(false);
            new Withdrawl(pinnumber).setVisible(true);
        }
        else if(ae.getSource()== fastcash){
            setVisible(false);
            new FastCash(pinnumber).setVisible(true);
        }
        else if(ae.getSource()== pinchange){
            setVisible(false);
            new PinChange(pinnumber).setVisible(true);
        }
         else if(ae.getSource()== balanceenquiry){
            setVisible(false);
            new BalanceEnquiry(pinnumber).setVisible(true);
        }
        else if(ae.getSource()== ministatement){
            //setVisible(false);
            new MiniStatement(pinnumber).setVisible(true);
        }
    }
     public static void main(String[] args) {
        new Transactions("");
    }
}
