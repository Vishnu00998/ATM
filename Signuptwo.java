
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Signuptwo extends JFrame implements ActionListener {
     
    JTextField panTextField,aadharTextField;
    JButton next;
    JRadioButton syes,sno,eyes,eno;
   JComboBox religion,category,income,occupation,education;
   String formno;
    Signuptwo(String formno){
        this.formno=formno;
        
        setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION FORM-2");
       
        
         JLabel additionalDetails=new JLabel("Page2: Additional Details");
        additionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        additionalDetails.setBounds(290,80,400,30);
        add(additionalDetails);
        
        
         JLabel name=new JLabel("Religion:");
        name.setFont(new Font("Raleway",Font.BOLD,22));
        name.setBounds(100,140,100,30);
        add(name);
        
        String ValReligion[]={"Hindu","Muslim","Sikh","Christian","Other"};
         religion =new JComboBox(ValReligion);
        religion.setBounds(300, 140, 400, 30);
        religion.setBackground(Color.white);
       add(religion);
        
        
       
         JLabel fname=new JLabel("Category:");
        fname.setFont(new Font("Raleway",Font.BOLD,22));
        fname.setBounds(100,190,200,30);
        add(fname);
        
        String ValCategory[]={"General","OBC","SC","ST","Other"};
         category=new JComboBox(ValCategory);
          category.setBounds(300, 190, 400, 30);
         category.setBackground(Color.white);
       add(category);
        
        
         JLabel dob=new JLabel("Income:");
        dob.setFont(new Font("Raleway",Font.BOLD,22));
        dob.setBounds(100,240,200,30);
        add(dob);
        
        String incomeCategory[]={"Null","< 1,50,000","< 2,50,000","< 5,00,000","upto 10,00,000"};
         income=new JComboBox(incomeCategory);
          income.setBounds(300, 240, 400, 30);
         income.setBackground(Color.white);
       add(income);
        
        JLabel gender=new JLabel("Educational:");
        gender.setFont(new Font("Raleway",Font.BOLD,22));
        gender.setBounds(100,290,200,30);
        add(gender);
        
       
         JLabel email=new JLabel("Qualification:");
        email.setFont(new Font("Raleway",Font.BOLD,22));
        email.setBounds(100,315,200,30);
        add(email);
        
        
        String educationVAlues[]={"Non Graduate","Graduate","Post-Graduate","Doctrate","Other"};
         education=new JComboBox(educationVAlues);
          education.setBounds(300, 315, 400, 30);
         education.setBackground(Color.white);
       add(education);
        
        
         JLabel marital=new JLabel("Occupation:");
        marital.setFont(new Font("Raleway",Font.BOLD,22));
        marital.setBounds(100,390,200,30);
        add(marital);
        
        
        String occupationValues[]={"Salaried","Self-Employed","Business","Student","Retired","Other"};
         occupation=new JComboBox(occupationValues);
          occupation.setBounds(300, 390, 400, 30);
         occupation.setBackground(Color.white);
       add(occupation);

        
       JLabel address=new JLabel("Pan Number:");
        address.setFont(new Font("Raleway",Font.BOLD,22));
        address.setBounds(100,440,200,30);
        add(address);
        
        
            panTextField=new JTextField();
        panTextField.setFont(new Font("RAleawy",Font.BOLD,14));
        panTextField.setBounds(300, 440, 400, 30);
       add(panTextField);
       
         JLabel city=new JLabel("Aadhar Number:");
        city.setFont(new Font("Raleway",Font.BOLD,22));
        city.setBounds(100,490,200,30);
        add(city);
        
            aadharTextField=new JTextField();
        aadharTextField.setFont(new Font("RAleawy",Font.BOLD,14));
        aadharTextField.setBounds(300, 490, 400, 30);
       add(aadharTextField);
      
        
         JLabel state=new JLabel("Senior Citizen:");
        state.setFont(new Font("Raleway",Font.BOLD,22));
        state.setBounds(100,540,200,30);
        add(state);
        
        
         syes=new JRadioButton("Yes");
        syes.setBounds(300,540,80,30);
        syes.setBackground(Color.white);
        add(syes);
        
         sno= new JRadioButton("No");
        sno.setBounds(450,540,120,30);
        sno.setBackground(Color.white);
        add(sno);
       
        
        
         ButtonGroup maritalgroup=new ButtonGroup();
        maritalgroup.add(syes);
        maritalgroup.add(sno);
        
        
          
         JLabel pincode=new JLabel("Existing Account:");
        pincode.setFont(new Font("Raleway",Font.BOLD,22));
        pincode.setBounds(100,590,200,30);
        add(pincode);
        
         eyes=new JRadioButton("Yes");
        eyes.setBounds(300,590,80,30);
        eyes.setBackground(Color.white);
        add(eyes);
        
         eno= new JRadioButton("No");
        eno.setBounds(450,590,120,30);
        eno.setBackground(Color.white);
        add(eno);
       
        
        
         ButtonGroup emaritalgroup=new ButtonGroup();
        emaritalgroup.add(eyes);
        emaritalgroup.add(eno);
        
        
        
       
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
         String sreligion=(String)religion.getSelectedItem();
         String scategory= (String)category.getSelectedItem();
          String sincome= (String)income.getSelectedItem();
           String seducation= (String)education.getSelectedItem();
            String soccupation= (String)occupation.getSelectedItem();
         
         String seniorcitizen=null;
         if(syes.isSelected()){
             
             seniorcitizen="Yes";
             
         }else if(sno.isSelected()){
             
             seniorcitizen="No";
             
         }
         String existingaccount=null;
         if(eyes.isSelected()){
             existingaccount="YES";
         }
         else if(eno.isSelected()){
             existingaccount="No";
         }
        
         String span=panTextField.getText();
         String saadhar=aadharTextField.getText();
         
         
          try{
             
                  Conn c=new Conn();
                  String query="insert into signuptwo values('"+formno+" ','"+sreligion+" ','"+scategory+" ','"+sincome+" ','"+seducation+" ','"+soccupation+" ','"+span+" ','"+saadhar+" ','"+seniorcitizen+" ','"+existingaccount+" ')";
                  c.s.executeUpdate(query);
                  
                 setVisible(false);
                 new Signupthree(formno).setVisible(true);
          }
          catch(Exception e){
             System.out.println(e);
         }      
         
     }
    
    public static void main(String args[]){
        new Signuptwo("");
    }
    
}

