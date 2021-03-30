/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.service.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*; // action listener
import java.io.File;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class login extends JFrame implements ActionListener,WindowListener{
    private JLabel lblID, lblName, lblPassword;
    private JTextField txtID, txtName;
    private JPasswordField txtPassword;
    private JButton btnlogin, btnregister;
    private String id, name, password;
    private Integer result;
    
    public login(){
     setSize(450,300);
     setLocation(100,100); 
     setTitle("APU Library Login Page");
     setLayout(new GridLayout(4,2,0,0));  // Gridlayout (row, column,horizontal and vertical gap)
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
     initGUI();
     setVisible(true);
    }
     private void initGUI(){
      // ID
      lblID = new JLabel("ID");
      txtID = new JTextField();
      // Name
      lblName = new JLabel("Name");
      txtName = new JTextField();
      // Password
      lblPassword = new JLabel("Password");
      txtPassword = new JPasswordField();
      // Register
      btnregister = new JButton("Register A New Account");
      // Submit
      btnlogin = new JButton("Login");
      add(lblID);
      add(txtID);
      add(lblName);
      add(txtName);
      add(lblPassword);
      add(txtPassword);
      add(btnregister);
      add(btnlogin);
        
      addWindowListener(this);
      btnregister.addActionListener(this);
      btnlogin.addActionListener(this);
}
      public void actionPerformed(ActionEvent e){
      if (e.getSource()==btnlogin){
             getID();
             getname();
             getPassword();
             String status = "fail";
      try {
           File file = new File("librarian.txt");
            Scanner inputFile = new Scanner(file);
            
            while (inputFile.hasNext()) {       // Read lines from the file until no more are left.
            String line = inputFile.nextLine();
            String[] details = line.split(":");
            String ID = details[0];
            String Name = details[1];
            String Password = details[2];
            if (id.equals(ID) & name.equals(Name) & password.equals(Password))
            {
                    status = "success";
                    JOptionPane.showMessageDialog(this, "Login Successful!!");
                    setVisible(false);
                    borrow page = new borrow();
            }} if (status == "fail") { JOptionPane.showMessageDialog(this, "Oops! Login Unsuccessful! Please Try Again!");
           }
      } catch (Exception ae){
        JOptionPane.showMessageDialog(null, ae);
      }
      }      
      else if (e.getSource()==btnregister){
        String input=JOptionPane.showInputDialog("Enter Registration Password");  
        if (input.equals("Antidisestablishmentarianism")){
        setVisible(false);
        registration page = new registration();
   }
   }
   }    
       
       
       public void windowClosing(WindowEvent e){
       int result = JOptionPane.showConfirmDialog(this, "Are you sure", "Exit program", JOptionPane.ERROR_MESSAGE);
       if (result == JOptionPane.YES_OPTION)
            //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           System.exit(0);
       else
           setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }
       public void windowOpened(WindowEvent e){}
       public void windowIconified(WindowEvent e){
       JOptionPane.showMessageDialog(this, "Minimised");
    }
       public void windowDeiconified(WindowEvent e){}
       public void windowClosed(WindowEvent e){}
       public void windowActivated(WindowEvent e){}
       public void windowDeactivated(WindowEvent e){}
     
       
        private String getID(){
         id = txtID.getText();
         return id;
        } 
        private String getname(){
         name = txtName.getText();
         return name;  
        }
        private String getPassword(){
         password = txtPassword.getText();
         return  password;
        }
}
