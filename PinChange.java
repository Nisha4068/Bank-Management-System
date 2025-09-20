import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PinChange extends JFrame implements ActionListener{
    JPasswordField pin, repin;
    JButton change , back;
    String pinnumber;
   PinChange(String pinnumber){
    this.pinnumber = pinnumber;
    setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(700,700,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,700,700);
        add(image);
        image.setLayout(null);

        //label for text
    
        JLabel text = new JLabel("CHANGE YOUR PIN");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD,16));
        text.setBounds(180,218,500,35);
        image.add(text);

        JLabel pintext = new JLabel(" NEW PIN :");
        pintext.setForeground(Color.WHITE);
        pintext.setFont(new Font("System", Font.BOLD,14));
        pintext.setBounds(123,260,180,22);
        image.add(pintext);

        pin = new JPasswordField();
        pin.setBounds(260,260,135,25);
        pin.setFont(new Font("Raleway", Font.BOLD,24));
        image.add(pin);


        JLabel repintext = new JLabel(" Re-Enter New PIN :");
        repintext.setForeground(Color.WHITE);
        repintext.setFont(new Font("System", Font.BOLD,14));
        repintext.setBounds(123,290,180,22);
        image.add(repintext);
    
        repin = new JPasswordField();
        repin.setBounds(260,290,135,25);
        repin.setFont(new Font("Raleway", Font.BOLD,24));
        image.add(repin);

        //button for change 
        change = new JButton("CHANGE");
        change.setBounds(265,374,125,25);
        change.addActionListener(this);
        image.add(change);

        //button for back 
        back= new JButton("BACK");
        back.setBounds(265,405,125,25);
        back.addActionListener(this);
        image.add(back);


        setSize(700,700);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);

}
  
    //@Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()== change){
            try{
               String npin = pin.getText();
                String rpin = repin.getText();

                if(!npin.equals(rpin)){
                    JOptionPane.showMessageDialog(null,"Entered PIN does not match");
                    return;
                }
                if(npin.equals("")){
                     JOptionPane.showMessageDialog(null,"PLease enter new PIN");
                    return;
                }
                if(rpin.equals("")){
                     JOptionPane.showMessageDialog(null,"PLease re-enter new  PIN");
                    return;
                }
                Conn conn = new Conn();
                String query1 = "update bank set pin = '"+rpin+"' where pin = '"+pinnumber+"'";
                String query2 = "update login set pin = '"+rpin+"' where pin = '"+pinnumber+"'";
                String query3 = "update signupthree set pin = '"+rpin+"' where pin = '"+pinnumber+"'";

                conn.s.executeUpdate(query1);
                conn.s.executeUpdate(query2);
                conn.s.executeUpdate(query3);

                JOptionPane.showMessageDialog(null," PIN changed successfully");
                 setVisible(false);
                 new Transactions(rpin).setVisible(true); 



            }catch(Exception e){
                System.out.println(e);
            }
        }
        else{
            setVisible(false);
            new Transactions(pinnumber).setVisible(true); 
        }
    }
      public static void main(String[] args) {
        new PinChange("").setVisible(true);

        
    }
}
