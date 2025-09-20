// import java.awt.*;
// import java.sql.*;
// import javax.swing.*;


// public class MiniStatement extends JFrame{
//      //String pinnumber;
//     MiniStatement(String pinnumber){
//     //this.pinnumber = pinnumber;
         
//     setTitle("Mini Statement");
//          setLayout(null);

//          JLabel mini = new JLabel();
//          mini.setBounds(20,140,400,200);
//          add(mini);

//          JLabel bank = new JLabel("Indian Bank");
//          bank.setBounds(150,20,100,20);
//          add(bank);

//           JLabel card = new JLabel("");
//          card.setBounds(20,80,300,20);
//          add(card);

//          JLabel balance = new JLabel();
//          balance.setBounds(20,400,300,20);
//          add(balance);

//          try{
//             Conn conn = new Conn();
//             ResultSet rs = conn.s.executeQuery("Select * from login where pin = '"+pinnumber+"'");
//             while(rs.next()){
//                 card.setText("card Number : "+rs.getString("cardnumber").substring(0,4)+ "XXXXXXXX"+rs.getString("cardnumber").substring(12) );
//             }
//          }
//          catch(Exception e){
//             System.out.println(e);
//          }

//        try{
//             Conn conn = new Conn();
//             int bal =0;

//             ResultSet rs = conn.s.executeQuery("Select * from bank where pin = '"+pinnumber+"'");
//             while(rs.next()){
//                mini.setText(  mini.getText()+"<html>"+rs.getString("date")+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+ rs.getString("type")+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+ rs.getString("amount")+"<br><br><html>");
//                 if(rs.getString("type").equals("Deposit")){
//                         bal += Integer.parseInt(rs.getString("amount"));
//                     }
//                     else{
//                         bal -= Integer.parseInt(rs.getString("amount"));
//                     }
//             }
//             balance.setText("Your Current account balance is Rs "+bal);
//          }
//          catch(Exception e){
//             System.out.println(e);
//          }
       

//         setSize(400,600);
//         setLocation(20,20);
//         getContentPane().setBackground(Color.WHITE);
//        // setUndecorated(true);
//         setVisible(true);
//     }
//     public static void main(String[] args) {
//         new MiniStatement("");
//     }
// }
import java.awt.*;
import java.sql.*;
import javax.swing.*;

public class MiniStatement extends JFrame {
    
    MiniStatement(String pinnumber) {
        setTitle("Mini Statement");
        setLayout(null);

        JLabel bank = new JLabel("Indian Bank");
        bank.setBounds(150, 20, 200, 20);
        add(bank);

        JLabel card = new JLabel("");
        card.setBounds(20, 60, 350, 20);
        add(card);

        JLabel balance = new JLabel();
        balance.setBounds(20, 500, 350, 20);
        add(balance);

        // ✅ JTextArea for statements
        JTextArea mini = new JTextArea();
        mini.setEditable(false);
        mini.setFont(new Font("Monospaced", Font.PLAIN, 12));

        // ✅ Put it inside a JScrollPane
        JScrollPane scrollPane = new JScrollPane(mini);
        scrollPane.setBounds(20, 100, 350, 380);
        add(scrollPane);

        try {
            Conn conn = new Conn();
            ResultSet rs = conn.s.executeQuery("Select * from login where pin = '" + pinnumber + "'");
            while (rs.next()) {
                String cardNumber = rs.getString("cardnumber");
                card.setText("Card Number: " 
                    + cardNumber.substring(0, 4) + "XXXXXXXX" + cardNumber.substring(12));
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            Conn conn = new Conn();
            int bal = 0;

            ResultSet rs = conn.s.executeQuery("Select * from bank where pin = '" + pinnumber + "'");
            while (rs.next()) {
                mini.append(rs.getString("date") + "   " 
                          + rs.getString("type") + "   " 
                          + rs.getString("amount") + "\n");

                if (rs.getString("type").equals("Deposit")) {
                    bal += Integer.parseInt(rs.getString("amount"));
                } else {
                    bal -= Integer.parseInt(rs.getString("amount"));
                }
            }
            balance.setText("Your Current Account Balance is Rs " + bal);
        } catch (Exception e) {
            System.out.println(e);
        }

        setSize(400, 600);
        setLocation(20, 20);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MiniStatement("1234"); // test with dummy pin
    }
}
