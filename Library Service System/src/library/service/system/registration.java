/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.service.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class registration extends JFrame implements ActionListener,WindowListener{
    private JLabel lblID, lblName, lblPassword, lblConfirm;
    private JTextField txtID, txtName;
    private JPasswordField txtPassword, txtConfirm;
    private JButton btnlogin, btnregister;
    private String id, name, password, confirm;
    private Integer result;
    
    public registration(){
     setSize(450,300);
     setLocation(100,100); 
     setTitle("APU Library Registration Page");
     setLayout(new GridLayout(5,2,0,0));  // Gridlayout (row, column,horizontal and vertical gap)
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
      // Confirm Password
      lblConfirm = new JLabel("Confirm Password");
      txtConfirm= new JPasswordField();
      // Register
      btnregister = new JButton("Submit Registration");
      // Submit
      btnlogin = new JButton("Back To Login Page");
      add(lblID);
      add(txtID);
      add(lblName);
      add(txtName);
      add(lblPassword);
      add(txtPassword);
      add(lblConfirm);
      add(txtConfirm);
      add(btnlogin);
      add(btnregister);
        
      addWindowListener(this);
      btnregister.addActionListener(this);
      btnlogin.addActionListener(this);
}
      public void actionPerformed(ActionEvent e){
      if (e.getSource()==btnregister){
      getID();
      getname();
      getPassword();
      getConfirmPassword();
      
         if(id.equals("") || name.equals("") || password.equals("") || confirm.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please Fill In All Valid Data"); 
        }
         else if (IDValidator()) {
        JOptionPane.showMessageDialog(null,"Oops, the ID has been used!");
       }        
        else if ((new String(txtPassword.getPassword()).equals(new String(txtConfirm.getPassword())))){
           JOptionPane.showMessageDialog(this, "Register Successful!! Please Login!!");
            try {
                FileWriter fw = new FileWriter("librarian.txt", true); // insert True is to insert new record instead of overwrite
                PrintWriter out = new PrintWriter(fw);
                      out.write(id);// first row first column
                      out.write(":");
                      out.write(name);// first row second column
                      out.write(":");
                      out.write(password);// first row third column
                      out.write(System.getProperty("line.separator"));
                      out.close();
                      fw.close();
                      setVisible(false);
                      login page = new login();
            } catch (Exception ae){
                JOptionPane.showMessageDialog(null, ae);
            }
        }
        else JOptionPane.showMessageDialog(this, "Oops!! The Password Is Not Match, Please Try Again!!");    
      }
      else if (e.getSource()==btnlogin){
            setVisible(false);
            login page = new login();
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
        password = String.valueOf(txtPassword.getPassword());
        return  password;
        }
        private String getConfirmPassword(){
         confirm = String.valueOf(txtConfirm.getPassword());
         return  password;
        }
        
         private boolean IDValidator(){
         id = txtID.getText();  // Get ID string
         boolean status = false; // For debugging purpose
        try {
            File file = new File("librarian.txt");
            Scanner inputFile = new Scanner(file); // Read all librarian information
            
            while (inputFile.hasNext()) // Read lines from the file until no more are left.
            {
              String line = inputFile.nextLine();// Read the next line
              String[] details = line.split(":");
                if (id.equals(details[0])) { // Compare with first row array
                     status = true;
                }
            }
            inputFile.close();
        } catch (Exception ex) {  
        }
        return status;
    }
}
