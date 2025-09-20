import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener {
    
    
    JTextField Pan,aadhar;
    JRadioButton syes,sno,eyes,eno;
    JButton next;
    JComboBox religion, category,occupation,education,income;
    String formno;
    SignupTwo(String formno) {
        this.formno = formno;
        // Main panel for form
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.WHITE);
        panel.setPreferredSize(new Dimension(750, 900)); // tall enough to fit all fields

        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");

        

        // additional details title
        JLabel additionalDetails = new JLabel("Page 2 : Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290, 80, 400, 30);
        panel.add(additionalDetails);

        // Religion
        JLabel name = new JLabel("Religion :");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100, 140, 100, 30);
       panel.add(name);


        String valreligion[] = {"Hindu","Muslim","Sikh","Christian"};
        religion = new JComboBox(valreligion);
         religion.setBounds(300, 140, 400, 30);
         religion.setBackground(Color.WHITE);
        panel.add(religion);
   
        
       
        // category
        JLabel fname = new JLabel("Category:");
        fname.setFont(new Font("Raleway", Font.BOLD, 20));
        fname.setBounds(100, 190, 200, 30);
        panel.add(fname);

        String valcategory[] = {"General","OBC","SC","ST","OTHERS"};
        category = new JComboBox(valcategory);
        category.setFont(new Font("Raleway", Font.BOLD, 14));
        category.setBounds(300, 190, 400, 30);
        category.setBackground(Color.WHITE);
        panel.add(category);

        // Income
        JLabel dob = new JLabel("Income :");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100, 240, 200, 30);
        panel.add(dob);

        String incomecategory[] = {"NULL","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000"};
         income = new JComboBox(incomecategory);
         income.setFont(new Font("Raleway", Font.BOLD, 14));
         income.setBounds(300, 240, 400, 30);
         income.setBackground(Color.WHITE);
        panel.add( income);

        // Educational
        JLabel gender = new JLabel("Educational :");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100, 290, 200, 30);
        panel.add(gender);

        String educationValues[] = {"Non - Graduate","Graduate","Post-Graduate","Doctrate","Others"};
        education = new JComboBox(educationValues);
         education.setFont(new Font("Raleway", Font.BOLD, 14));
         education.setBounds(300, 290, 400, 30);
         education.setBackground(Color.WHITE);
        panel.add( education);
       
        // Occupation
        JLabel marital = new JLabel("Occupation :");
        marital.setFont(new Font("Raleway", Font.BOLD, 20));
        marital.setBounds(100, 390, 200, 30);
        panel.add(marital);

        String occupationValues[] = {"Salaried","Self-Employed","Student","Retired","BusinessMan","Others"};
        occupation = new JComboBox(occupationValues);
         occupation.setFont(new Font("Raleway", Font.BOLD, 14));
         occupation.setBounds(300, 390, 400, 30);
         occupation.setBackground(Color.WHITE);
        panel.add( occupation);

        
        // PAn no
        JLabel address = new JLabel("PAN No.:");
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(100, 440, 200, 30);
        panel.add(address);

      
        Pan = new JTextField();
        Pan.setFont(new Font("Raleway", Font.BOLD, 14));
        Pan.setBounds(300, 440, 400, 30);
        panel.add(Pan);

        // AADHAR NO
       JLabel city= new JLabel("AADHAR No.:");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
       city.setBounds(100, 490, 200, 30);
        panel.add(city);
        

        aadhar =  new JTextField();
        aadhar.setFont(new Font("Raleway", Font.BOLD, 14));
        aadhar.setBounds(300, 490, 400, 30);
        panel.add(aadhar);

        // Senior citizen
        JLabel state = new JLabel(" Senior Citizen :");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100, 540, 200, 30);
        panel.add(state);

        //radio button for senior citizen :Yes
        syes = new JRadioButton("Yes");
        syes.setBounds(300, 540, 100, 30);
        syes.setBackground(Color.WHITE);
        panel.add(syes);

        //radio button for senior citizen :No
        sno = new JRadioButton("No");
        sno.setBounds(420, 540, 100, 30);
        sno.setBackground(Color.WHITE);
        panel.add(sno);


        ButtonGroup maritalGroup = new ButtonGroup();
        maritalGroup.add(syes);
        maritalGroup.add(sno);
      
        // Existing account
        JLabel pincode = new JLabel("Existing Account :");
        pincode.setFont(new Font("Raleway", Font.BOLD, 20));
        pincode.setBounds(100, 590, 200, 30);
        panel.add(pincode);

         //radio button for Existing account :Yes
        eyes = new JRadioButton("Yes");
        eyes.setBounds(300, 590, 100, 30);
        eyes.setBackground(Color.WHITE);
        panel.add(eyes);

        //radio button for Existing account :No
        eno = new JRadioButton("No");
        eno.setBounds(420, 590, 100, 30);
        eno.setBackground(Color.WHITE);
        panel.add(eno);


        ButtonGroup emaritalGroup = new ButtonGroup();
        emaritalGroup.add(eyes);
        emaritalGroup.add(eno);
      

        // Next button
        next = new JButton("Next");
        next.setBounds(580, 650, 100, 30);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.addActionListener(this);
        panel.add(next);

        // Scroll pane
        JScrollPane scrollPane = new JScrollPane(panel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        getContentPane().add(scrollPane);

       
        setSize(750, 700); // visible window size
        setLocationRelativeTo(null); // center on screen
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
   
    String sreligion =  (String) religion.getSelectedItem();
    String scategory =  (String) category.getSelectedItem();
    String sincome = (String) income.getSelectedItem();
    String seducation = (String) education.getSelectedItem();
    String soccupation = (String) occupation.getSelectedItem();
    String seniorcitizen = null;
    if(syes.isSelected()){
    seniorcitizen = "Yes";
    }
    else if(sno.isSelected()){
        seniorcitizen = "No";
    }
    
    String existingaccount = null;
    if(eyes.isSelected()){
        existingaccount = "Yes";
    }
    else if(eno.isSelected()){
       existingaccount = "No";
    }
    
    String saadhar = aadhar.getText();
    String sPan = Pan.getText();
    

    try{
       
            Conn c = new Conn();
           String query = "INSERT INTO signupTwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+sPan+"','"+saadhar+"','"+seniorcitizen+"','"+existingaccount+"')";
               
       // String query = "INSERT INTO signup(...) VALUES(...)";
            System.out.println(query);
            c.s.executeUpdate(query);

            //signupThree object

            setVisible(false);
            new SignupThree(formno).setVisible(true);


           JOptionPane.showMessageDialog(null, "Data inserted successfully!"); 
            // Finish signup: close this window
    setVisible(false);
    

    // Optional: show a final message or main dashboard
    JOptionPane.showMessageDialog(null, "Signup Completed Successfully!");


        
    }catch(Exception e){
         e.printStackTrace();
    }
     }
    
    public static void main(String[] args) {
        new SignupTwo("");
    }
}



