
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
public class Signupone extends JFrame implements ActionListener {
     
    long random;
    JTextField nameTextField,fnameTextField,emailTextField,addressTextField,cityTextField,stateTextField,pinTextField;
    JButton next;
    JRadioButton male,female,other,married,unmarried,Other;
   JDateChooser dateChooser;
    Signupone(){
        
        setLayout(null);
        
        Random ran=new Random();
        random=Math.abs((ran.nextLong()%9000L)+1000L);
        
        
        JLabel formno=new JLabel("APPLICATION FORM NO."+random);
        formno.setFont(new Font("Raleway",Font.BOLD,38));
        formno.setBounds(140,20,600,40);
        add(formno);
        
        
         JLabel personDetails=new JLabel("page1: personal Details");
        personDetails.setFont(new Font("Raleway",Font.BOLD,22));
        personDetails.setBounds(290,80,400,30);
        add(personDetails);
        
        
         JLabel name=new JLabel("Name:");
        name.setFont(new Font("Raleway",Font.BOLD,22));
        name.setBounds(100,140,100,30);
        add(name);
        
         nameTextField=new JTextField();
        nameTextField.setFont(new Font("RAleawy",Font.BOLD,14));
        nameTextField.setBounds(300, 140, 400, 30);
       add(nameTextField);
                
         JLabel fname=new JLabel("Father's Name:");
        fname.setFont(new Font("Raleway",Font.BOLD,22));
        fname.setBounds(100,190,200,30);
        add(fname);
        
          fnameTextField=new JTextField();
        fnameTextField.setFont(new Font("RAleawy",Font.BOLD,14));
        fnameTextField.setBounds(300, 190, 400, 30);
       add(fnameTextField);
        
         JLabel dob=new JLabel("Date of Birth:");
        dob.setFont(new Font("Raleway",Font.BOLD,22));
        dob.setBounds(100,240,200,30);
        add(dob);
        
         dateChooser=new JDateChooser();
        dateChooser.setBounds(300,240,400,30);
        dateChooser.setForeground(new Color(105,105,105));
        add(dateChooser);
        
        JLabel gender=new JLabel("Gender:");
        gender.setFont(new Font("Raleway",Font.BOLD,22));
        gender.setBounds(100,290,200,30);
        add(gender);
        
         male=new JRadioButton("Male");
        male.setBounds(300,290,60,30);
        male.setBackground(Color.white);
        add(male);
        
         female= new JRadioButton("Female");
        female.setBounds(450,290,80,30);
        female.setBackground(Color.white);
        add(female);
       
         other= new JRadioButton("Other");
        other.setBounds(600,290,80,30);
        other.setBackground(Color.white);
        add(other);
        
         ButtonGroup gendergroup=new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        gendergroup.add(other);
                
       
         JLabel email=new JLabel("Email Adress:");
        email.setFont(new Font("Raleway",Font.BOLD,22));
        email.setBounds(100,340,200,30);
        add(email);
        
        
          emailTextField=new JTextField();
        emailTextField.setFont(new Font("RAleawy",Font.BOLD,14));
        emailTextField.setBounds(300, 340, 400, 30);
       add(emailTextField);
        
         JLabel marital=new JLabel("Marital Status:");
        marital.setFont(new Font("Raleway",Font.BOLD,22));
        marital.setBounds(100,390,200,30);
        add(marital);
        
          married=new JRadioButton("Married");
        married.setBounds(300,390,80,30);
        married.setBackground(Color.white);
        add(married);
        
         unmarried= new JRadioButton("Unmarried");
        unmarried.setBounds(450,390,120,30);
        unmarried.setBackground(Color.white);
        add(unmarried);
       
         Other= new JRadioButton("Other");
        Other.setBounds(600,390,80,30);
        Other.setBackground(Color.white);
        add(Other);
        
         ButtonGroup maritalgroup=new ButtonGroup();
        maritalgroup.add(married);
        maritalgroup.add(unmarried);
        maritalgroup.add(Other);
       
        
       JLabel address=new JLabel("Address:");
        address.setFont(new Font("Raleway",Font.BOLD,22));
        address.setBounds(100,440,200,30);
        add(address);
        
        
            addressTextField=new JTextField();
        addressTextField.setFont(new Font("RAleawy",Font.BOLD,14));
        addressTextField.setBounds(300, 440, 400, 30);
       add(addressTextField);
       
         JLabel city=new JLabel("City:");
        city.setFont(new Font("Raleway",Font.BOLD,22));
        city.setBounds(100,490,200,30);
        add(city);
        
            cityTextField=new JTextField();
        cityTextField.setFont(new Font("RAleawy",Font.BOLD,14));
        cityTextField.setBounds(300, 490, 400, 30);
       add(cityTextField);
      
        
         JLabel state=new JLabel("State:");
        state.setFont(new Font("Raleway",Font.BOLD,22));
        state.setBounds(100,540,200,30);
        add(state);
        
        
          stateTextField=new JTextField();
        stateTextField.setFont(new Font("RAleawy",Font.BOLD,14));
        stateTextField.setBounds(300, 540, 400, 30);
       add(stateTextField);
      
         JLabel pincode=new JLabel("Pin Code:");
        pincode.setFont(new Font("Raleway",Font.BOLD,22));
        pincode.setBounds(100,590,200,30);
        add(pincode);
        
          pinTextField=new JTextField();
        pinTextField.setFont(new Font("RAleawy",Font.BOLD,14));
        pinTextField.setBounds(300, 590, 400, 30);
       add(pinTextField);
       
        next=new JButton("Next");
       next.setForeground(Color.WHITE);
       next.setBackground(Color.BLACK);
       next.setBounds(750,620,80,30);
       next.setFont(new Font("Ralway",Font.BOLD,14));
       next.addActionListener(this);
       add(next);
            

        
        
        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setVisible(true);
        setLocation(300,10);
        
    }
     public void actionPerformed(ActionEvent ae){
         String formno=""+random;
         String name=nameTextField.getText();
         String fname=fnameTextField.getText();
         String dob= ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
         String gender=null;
         if(male.isSelected()){
             
             gender="Male";
             
         }else if(female.isSelected()){
             
             gender="Female";
             
         }else if (other.isSelected()){
             
             gender="Other";
         }
         String email=emailTextField.getText();
         String marital=null;
         if(married.isSelected()){
             marital="Married";
         }
         else if(unmarried.isSelected()){
             marital="Unmarried";
         }
         else if(Other.isSelected()){
             marital="Other";
         }
         String address=addressTextField.getText();
         String city=cityTextField.getText();
         String state=stateTextField.getText();
         String pincode=pinTextField.getText();
         
         
         try{
             if(name.equals("") ){
                 JOptionPane.showMessageDialog(null, "Name is Required");
             }
             else if(fname.equals("")){
                 JOptionPane.showMessageDialog(null, " Father's Name is Required");
             }
              else if(dob.equals("")){
                 JOptionPane.showMessageDialog(null, "DOB is Required");
             }
              else if(email.equals("")){
                 JOptionPane.showMessageDialog(null, "Email is Required");
             }
              else if(address.equals("")){
                 JOptionPane.showMessageDialog(null, "Address is Required");
             }
              else if(city.equals("")){
                 JOptionPane.showMessageDialog(null, "City is Required");
             }
              else if(state.equals("")){
                 JOptionPane.showMessageDialog(null, "State is Required");
             }
              else if(pincode.equals("")){
                 JOptionPane.showMessageDialog(null, "Pincode is Required");
             }
              else{
                  Conn c=new Conn();
                  String query="insert into signup values('"+formno+" ','"+name+" ','"+fname+" ','"+dob+" ','"+gender+" ','"+email+" ','"+marital+" ','"+address+" ','"+city+" ','"+pincode+" ','"+state+" ')";
                  c.s.executeUpdate(query);
                  
                  setVisible(false);
                  new Signuptwo(formno).setVisible(true);
              }
         }
         
         catch(Exception e){
             System.out.println(e);
         }
             
         
                 
         
     }
    
    public static void main(String args[]){
        new Signupone();
    }
    
}
