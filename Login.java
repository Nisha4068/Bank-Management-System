import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
import java.sql.*;

import javax.swing.*;
public class Login extends JFrame implements ActionListener{
    JButton login, clear, signup;
     JTextField cardTextField;
     JPasswordField PINTextField;
    Login(){
        setTitle("Automated Teller Machine");// it will show the title of the frame 
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        System.out.println("Image path: " + ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70,10,100,100);
        add(label);// if you want add some icons on the frame then you need to use add fuction

        //for the  text infront of the frame
        JLabel text = new JLabel("welcome to ATM");
        text.setFont(new Font("Osward",Font.BOLD,38));
        text.setBounds(200,40,400,40);
        add(text); 

        //for the text field name
        JLabel cardNo = new JLabel("Card No.");
        cardNo.setFont(new Font("Raleway",Font.BOLD,28));
        cardNo.setBounds(120,150,150,30);
        add(cardNo); 
          
         //for the text field to take the input from the user
        cardTextField = new JTextField();
        cardTextField.setBounds(300,150,230,30);
        cardTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(cardTextField);
        
        //for the pin field 
        JLabel PIN = new JLabel("PIN");
        PIN.setFont(new Font("Raleway",Font.BOLD,28));
        PIN.setBounds(120,220,250,30);
        add(PIN); 

        //for the pin field to take the input from the user
        PINTextField = new JPasswordField();
        PINTextField.setBounds(300,220,230,30);
        PINTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(PINTextField);
     
        //sign up button
        login = new JButton("Sign In");
        login.setBounds(300,300,100,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
 
        //clear button
        clear = new JButton("CLEAR");
        clear.setBounds(430,300,100,30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);

        //signup button
        signup = new JButton("Sign up");
        signup.setBounds(300,350,230,30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);

        getContentPane().setBackground(Color.WHITE);

        setSize(800,480);//function it will define the dimension of the frame
        setVisible(true);
        setLocation(350,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

     //@Override
    public void actionPerformed(ActionEvent ae) {
        
        if(ae.getSource() == login ){
         Conn conn = new Conn();
         String cardnumber = cardTextField.getText();
         String pinnumber = new String(PINTextField.getPassword()).trim();
         String query = "select * from login where cardnumber = '" + cardnumber + "' and pin = '" + pinnumber + "'";
         try{
          ResultSet rs = conn.s.executeQuery(query);
          if(rs.next()){
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
          }
          else{
            JOptionPane.showMessageDialog(null, "Incorrect card Number or Pin");
          }
         }catch(Exception e){
            System.out.println(e);
         }
        }
         else if(ae.getSource() == clear ){
            cardTextField.setText("");    
         PINTextField.setText("");
        }
        else if(ae.getSource() == signup ){
            setVisible(false);
            new SignupOne().setVisible(true);
        }
    }
    public static void main(String[] args) {
         new Login();
    }

   
}
//Jlabel is used for writing something on the frame or content