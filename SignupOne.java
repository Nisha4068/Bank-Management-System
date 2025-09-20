// import javax.swing.*;
// import java.awt.*;
// import java.util.*;
// import com.toedter.calendar.JDateChooser;

// public class SignupOne extends JFrame {

//     SignupOne(){
//         setLayout(null);
//           // Main panel for form
//         JPanel panel = new JPanel();
//         panel.setLayout(null);
//         panel.setBackground(Color.WHITE);
//         panel.setPreferredSize(new Dimension(750, 800)); // taller than visible frame
//         Random ran = new Random();

//         long Random = Math.abs((ran.nextLong() %9000L)+ 1000L);

//         //for the application no 
//         JLabel formno = new JLabel("APPLICATION FORM NO." + Random);
//         formno.setFont(new Font("Raleway",Font.BOLD,38));
//         formno.setBounds(140,20,600,40);
//         add(formno);

//         //for the first page that is personal details
//         JLabel personalDetails = new JLabel("Page 1 : Personal Details");
//         personalDetails.setFont(new Font("Raleway",Font.BOLD,22));
//         personalDetails.setBounds(290,80,400,30);
//         add(personalDetails);

//          //for the name title in the details

//         JLabel name = new JLabel("Name:");
//         name.setFont(new Font("Raleway",Font.BOLD,20));
//         name.setBounds(100,140,100,30);
//         add(name);

//         //textfield for name

//         JTextField nameTextField = new JTextField();
//         nameTextField.setFont(new Font("Raleway",Font.BOLD,14));
//         nameTextField.setBounds(300,140,400,30);
//         add(nameTextField);


//         //for the fathers name

//         JLabel fname = new JLabel("Father`s name : ");
//         fname.setFont(new Font("Raleway",Font.BOLD,20));
//         fname.setBounds(100,190,200,30);
//         add(fname);

//         //textfield for fname

//         JTextField fnameTextField = new JTextField();
//         fnameTextField.setFont(new Font("Raleway",Font.BOLD,14));
//         fnameTextField.setBounds(300,190,400,30);
//         add(fnameTextField);



//         //for the date of birth 

//         JLabel dob = new JLabel("Date of Birth : ");
//         dob.setFont(new Font("Raleway",Font.BOLD,20));
//         dob.setBounds(100,240,200,30);
//         add(dob);

//         //textchooser for the date
//        JDateChooser dateChooser = new JDateChooser();
//        dateChooser.setBounds(300,240,400,30);
//        dateChooser.setForeground(Color.WHITE);
//        add(dateChooser);

//         //for the gender
//         JLabel gender = new JLabel(" Gender : ");
//         gender.setFont(new Font("Raleway",Font.BOLD,20));
//         gender.setBounds(100,290,200,30);
//         add(gender);


//         // radio buttons for the gender
//         JRadioButton male = new JRadioButton("Male");
//         male.setBounds(300,290,60,30);
//         male.setBackground(Color.WHITE);
//         add(male);

//          JRadioButton female = new JRadioButton("female");
//          female.setBounds(450,290,120,30);
//           female.setBackground(Color.WHITE);
//          add(female);

//          //to group radiobuttons

//          ButtonGroup gendergroup = new ButtonGroup();
//          gendergroup.add(male);
//          gendergroup.add(female);


//        //for the email address

//         JLabel email = new JLabel("Email Address : ");
//         email.setFont(new Font("Raleway",Font.BOLD,20));
//         email.setBounds(100,340,200,30);
//         add(email);

//          //textfield for email

//         JTextField emailTextField = new JTextField();
//         emailTextField.setFont(new Font("Raleway",Font.BOLD,14));
//         emailTextField.setBounds(300,340,400,30);
//         add(emailTextField);

//        // for the marital status
           
//         JLabel marital = new JLabel("Marital Status: ");
//         marital.setFont(new Font("Raleway",Font.BOLD,20));
//         marital.setBounds(100,390,200,30);
//         add(marital);

        
//         // radio buttons for the marital status
//         JRadioButton married = new JRadioButton("Married");
//         married.setBounds(300,390,100,30);
//         married.setBackground(Color.WHITE);
//         add(married);

//          JRadioButton unmarried = new JRadioButton("unmarried");
//          unmarried.setBounds(450,390,100,30);
//           unmarried.setBackground(Color.WHITE);
//          add(unmarried);

//          JRadioButton others = new JRadioButton("others");
//          others.setBounds(630,390,100,30);
//         others.setBackground(Color.WHITE);
//          add(others);

//          //to group radiobuttons

//          ButtonGroup maritalgroup = new ButtonGroup();
//          maritalgroup.add(married);
//          maritalgroup.add(unmarried);
//          maritalgroup.add(others);

//         //for the address

//         JLabel address= new JLabel(" Address : ");
//         address.setFont(new Font("Raleway",Font.BOLD,20));
//         address.setBounds(100,440,200,30);
//         add(address);

//          //textfield for address

//         JTextField addressTextField = new JTextField();
//         addressTextField.setFont(new Font("Raleway",Font.BOLD,14));
//         addressTextField.setBounds(300,440,400,30);
//         add(addressTextField);


//         //for the city 

//         JLabel city = new JLabel("city  : ");
//         city.setFont(new Font("Raleway",Font.BOLD,20));
//         city.setBounds(100,490,200,30);
//         add(city);

//          //textfield for city textfield

//         JTextField cityTextField = new JTextField();
//         cityTextField.setFont(new Font("Raleway",Font.BOLD,14));
//         cityTextField.setBounds(300,490,400,30);
//         add(cityTextField);

//         //for the state

//         JLabel state = new JLabel("state  : ");
//         state.setFont(new Font("Raleway",Font.BOLD,20));
//         state.setBounds(100,540,200,30);
//         add(state);

//          //textfield for state

//         JTextField stateTextField = new JTextField();
//         stateTextField.setFont(new Font("Raleway",Font.BOLD,14));
//         stateTextField.setBounds(300,540,400,30);
//         add(stateTextField);

//         //for the pincode

//         JLabel pincode = new JLabel(" pincode :");
//         pincode.setFont(new Font("Raleway",Font.BOLD,20));
//         pincode.setBounds(100,590,200,30);
//         add(pincode);

//          //textfield for pincode

//         JTextField pincodeTextField = new JTextField();
//         pincodeTextField.setFont(new Font("Raleway",Font.BOLD,14));
//         pincodeTextField.setBounds(300,590,400,30);
//         add(pincodeTextField);

//         //for the next button
//         JButton next = new JButton("Next");
//         next.setBackground(Color.BLACK);
//         next.setForeground(Color.WHITE);
//         next.setFont(new Font("Raleway",Font.BOLD,14));
//         next.setBounds(580,650,100,30);
//         add(next);

//         getContentPane().setBackground(Color.WHITE);
//         getContentPane().setPreferredSize(new Dimension(750, 900));
//         pack(); // lets JFrame size itself based on content pane
        


//         setSize(750,730);
//         setLocationRelativeTo(null); // center on screen
//         setVisible(true);
//     }
//     public static void main(String args[]){
//         new SignupOne();

//     }
// }
import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignupOne extends JFrame implements ActionListener {
    long Random;
    JTextField nameTextField,fnameTextField, dobTextField,emailTextField,cityTextfield,pincodeTextField,addressTextField,stateTextField;
    JRadioButton male, female, married, unmarried,others;
    JButton next;
    JDateChooser dateChooser;
    SignupOne() {
        // Main panel for form
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.WHITE);
        panel.setPreferredSize(new Dimension(750, 900)); // tall enough to fit all fields

        Random ran = new Random();
        Random = Math.abs((ran.nextLong() % 9000L) + 1000L);

        // Application number
        JLabel formno = new JLabel("APPLICATION FORM NO." + Random);
        formno.setFont(new Font("Raleway", Font.BOLD, 38));
        formno.setBounds(140, 20, 600, 40);
        panel.add(formno);

        // Personal details title
        JLabel personalDetails = new JLabel("Page 1 : Personal Details");
        personalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        personalDetails.setBounds(290, 80, 400, 30);
        panel.add(personalDetails);

        // Name
        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100, 140, 100, 30);
        panel.add(name);
   
        //textfield for name
        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        nameTextField.setBounds(300, 140, 400, 30);
        panel.add(nameTextField);

        // Father's name
        JLabel fname = new JLabel("Father's Name:");
        fname.setFont(new Font("Raleway", Font.BOLD, 20));
        fname.setBounds(100, 190, 200, 30);
        panel.add(fname);

        //textfield for fathername
        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        fnameTextField.setBounds(300, 190, 400, 30);
        panel.add(fnameTextField);

        // Date of Birth
        JLabel dob = new JLabel("Date of Birth:");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100, 240, 200, 30);
        panel.add(dob);

        //textfield for dob
        dateChooser = new JDateChooser();
        dateChooser.setBounds(300, 240, 400, 30);
        panel.add(dateChooser);

        // Gender
        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100, 290, 200, 30);
        panel.add(gender);

        //radio button for male
        male = new JRadioButton("Male");
        male.setBounds(300, 290, 80, 30);
        male.setBackground(Color.WHITE);
        panel.add(male);

        //radio button for female

        female = new JRadioButton("Female");
        female.setBounds(400, 290, 100, 30);
        female.setBackground(Color.WHITE);
        panel.add(female);

        //button for gender
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);

        // Email
        JLabel email = new JLabel("Email Address:");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100, 340, 200, 30);
        panel.add(email);


        //textfield for email
        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        emailTextField.setBounds(300, 340, 400, 30);
        panel.add(emailTextField);

        // Marital Status
        JLabel marital = new JLabel("Marital Status:");
        marital.setFont(new Font("Raleway", Font.BOLD, 20));
        marital.setBounds(100, 390, 200, 30);
        panel.add(marital);

        //radio button for marital
        married = new JRadioButton("Married");
        married.setBounds(300, 390, 100, 30);
        married.setBackground(Color.WHITE);
        panel.add(married);

        //radio button for marital
        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(420, 390, 100, 30);
        unmarried.setBackground(Color.WHITE);
        panel.add(unmarried);

         //radio button for marital
        others = new JRadioButton("Others");
        others.setBounds(540, 390, 100, 30);
        others.setBackground(Color.WHITE);
        panel.add(others);

        ButtonGroup maritalGroup = new ButtonGroup();
        maritalGroup.add(married);
        maritalGroup.add(unmarried);
        maritalGroup.add(others);

        // Address
        JLabel address = new JLabel("Address:");
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(100, 440, 200, 30);
        panel.add(address);

       //textfield for  address
       addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        addressTextField.setBounds(300, 440, 400, 30);
        panel.add(addressTextField);

        // City
        JLabel city = new JLabel("City:");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100, 490, 200, 30);
        panel.add(city);

        //cityTextfield
        cityTextfield = new JTextField();
        cityTextfield.setFont(new Font("Raleway", Font.BOLD, 14));
        cityTextfield.setBounds(300, 490, 400, 30);
        panel.add(cityTextfield);

        // State
        JLabel state = new JLabel("State:");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100, 540, 200, 30);
        panel.add(state);

        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        stateTextField.setBounds(300, 540, 400, 30);
        panel.add(stateTextField);

        // Pincode
        JLabel pincode = new JLabel("Pincode:");
        pincode.setFont(new Font("Raleway", Font.BOLD, 20));
        pincode.setBounds(100, 590, 200, 30);
        panel.add(pincode);

        pincodeTextField = new JTextField();
        pincodeTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        pincodeTextField.setBounds(300, 590, 400, 30);
        panel.add(pincodeTextField);

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

        setTitle("Signup Form");
        setSize(750, 700); // visible window size
        setLocationRelativeTo(null); // center on screen
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
    String formno = ""+Random;//long into string
    String name =  nameTextField.getText();
    String fname = fnameTextField.getText();
    String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
    String gender = null;
    if(male.isSelected()){
    gender = "Male";
    }
    else if(female.isSelected()){
        gender = "female";
    }
    String email = emailTextField.getText();
    String marital = null;
    if(married.isSelected()){
        marital = "Married";
    }
    else if(unmarried.isSelected()){
        marital = "Unmarried";
    }
    else if(others.isSelected()){
        marital = "Others";
    }

    String address = addressTextField.getText();
    String city = cityTextfield.getText();
    String state = stateTextField.getText();
    String Pincode = pincodeTextField.getText();

    try{
        if(name.equals("")){
            JOptionPane.showMessageDialog(null,"Name is Required");
            
        }
        else{
            Conn c = new Conn();
           String query = "INSERT INTO signup(formno, name, fname, dob, gender, email, marital, address, city, state, pincode) " +
               "VALUES('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+state+"','"+Pincode+"')";
      
            System.out.println(query);
     
            c.s.executeUpdate(query);
           JOptionPane.showMessageDialog(null, "Data inserted successfully!"); 
           setVisible(false);
           new SignupTwo(formno).setVisible(true);


        }
    }catch(Exception e){
         e.printStackTrace();
     }
    }

    public static void main(String[] args) {
        new SignupOne();
    }
}

