/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.service.system;
import java.io.File;
import java.io.FileWriter;
import java.time.LocalDate;
import java.util.Scanner;
import java.time.temporal.ChronoUnit;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class returned extends javax.swing.JFrame {

    /**
     * Creates new form returned
     */
    public returned() {
        initComponents();
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ClientID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        BookName = new javax.swing.JTextField();
        lblClientName = new javax.swing.JLabel();
        lblClientRole = new javax.swing.JLabel();
        lblBookID = new javax.swing.JLabel();
        lblBookGenre = new javax.swing.JLabel();
        lblBorrowDate = new javax.swing.JLabel();
        lblDueDate = new javax.swing.JLabel();
        lblToday = new javax.swing.JLabel();
        lblFined = new javax.swing.JLabel();
        Confirm = new javax.swing.JButton();
        Verify = new javax.swing.JButton();
        SectionTitle = new javax.swing.JLabel();
        Reset = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Borrow = new javax.swing.JMenuItem();
        Renew = new javax.swing.JMenuItem();
        Return = new javax.swing.JMenuItem();
        CilentRegistration = new javax.swing.JMenuItem();
        ClientEdit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        AddBook = new javax.swing.JMenuItem();
        EditBook = new javax.swing.JMenuItem();
        Records = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ClientID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Client ID");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Client Name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Client Role");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Book ID");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Book Name");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Book Genre");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Borrow Date");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Fined");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Today");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Due Date");

        BookName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblClientName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblClientName.setText("- - - - - - - - - - - -");

        lblClientRole.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblClientRole.setText("- - - - - - - - - - - -");

        lblBookID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblBookID.setText("- - - - - - - - - - - -");

        lblBookGenre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblBookGenre.setText("- - - - - - - - - - - -");

        lblBorrowDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblBorrowDate.setText("- - - - - - - - - - - -");

        lblDueDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDueDate.setText("- - - - - - - - - - - -");

        lblToday.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblToday.setText("- - - - - - - - - - - -");

        lblFined.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblFined.setText("- - - - - - - - - - - -");

        Confirm.setText("Confirm");
        Confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmActionPerformed(evt);
            }
        });

        Verify.setText("Verify");
        Verify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerifyActionPerformed(evt);
            }
        });

        SectionTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SectionTitle.setText("Return Section");

        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        jMenu1.setText("Client Section");

        Borrow.setText("Borrow Book");
        Borrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrowActionPerformed(evt);
            }
        });
        jMenu1.add(Borrow);

        Renew.setText("Renew Book");
        Renew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RenewActionPerformed(evt);
            }
        });
        jMenu1.add(Renew);

        Return.setText("Return Book");
        Return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnActionPerformed(evt);
            }
        });
        jMenu1.add(Return);

        CilentRegistration.setText("Client Registration");
        CilentRegistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CilentRegistrationActionPerformed(evt);
            }
        });
        jMenu1.add(CilentRegistration);

        ClientEdit.setText("Client Edit");
        ClientEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientEditActionPerformed(evt);
            }
        });
        jMenu1.add(ClientEdit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Library Management");

        AddBook.setText("Add Book");
        AddBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBookActionPerformed(evt);
            }
        });
        jMenu2.add(AddBook);

        EditBook.setText("Edit Book");
        EditBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBookActionPerformed(evt);
            }
        });
        jMenu2.add(EditBook);

        Records.setText("Borrow Records");
        Records.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecordsActionPerformed(evt);
            }
        });
        jMenu2.add(Records);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Account");

        jMenuItem7.setText("Log Out");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblClientRole)
                                    .addComponent(lblClientName)
                                    .addComponent(ClientID, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblBookID))
                                .addGap(91, 91, 91)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblFined))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblToday))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblDueDate))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(35, 35, 35)
                                        .addComponent(lblBorrowDate))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BookName, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblBookGenre)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(Verify)
                        .addGap(104, 104, 104)
                        .addComponent(Reset)
                        .addGap(99, 99, 99)
                        .addComponent(Confirm)))
                .addContainerGap(78, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(SectionTitle)
                .addGap(280, 280, 280))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(SectionTitle)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(ClientID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lblClientName))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lblClientRole))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(lblBookID)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(lblBorrowDate))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(lblDueDate))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(lblToday))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(lblFined))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(BookName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblBookGenre))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Verify)
                    .addComponent(Confirm)
                    .addComponent(Reset))
                .addGap(62, 62, 62))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VerifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerifyActionPerformed
        // TODO add your handling code here:
        CID = ClientID.getText();
        BN = BookName.getText();
        String status = "fail";
        try {
            File file = new File("borrow.txt");
            Scanner inputFile = new Scanner(file); 
            while (inputFile.hasNext()) {       // Read lines from the file until no more are left.
                String line = inputFile.nextLine();
                String[] details = line.split(":");
                String clientid = details[0];
                String clientname = details[1];
                String clientrole = details[2];
                String bookid = details[3];
                String bookname = details[4];
                String bookgenre = details[5];
                String borrowdate = details[6];
                String duedate = details[7];
                String borrowstatus = details[8];
                    if (CID.equals(clientid) && BN.equals(bookname) && borrowstatus.equals("not returned")){
                    lblClientName.setText(clientname);
                    lblClientRole.setText(clientrole);
                    lblBookID.setText(bookid);
                    lblBookGenre.setText(bookgenre);
                    lblBorrowDate.setText(borrowdate);
                    lblDueDate.setText(duedate);
                    LocalDate currentDate = LocalDate.now(); // Get current Date value
                    lblToday.setText(currentDate.toString());
                    LocalDate DueDate = LocalDate.parse(lblDueDate.getText()); // Convert Date from String to Local Date
                        if (currentDate.isAfter(DueDate)){
                        long noOfDaysBetween = ChronoUnit.DAYS.between(DueDate, currentDate);
                        double fined = noOfDaysBetween * 1.00;
                        lblFined.setText("$"+fined);
                        status = "success";
                        }
                        else { status = "success";
                        lblFined.setText("$0.00");
                        }
            }} if (status == "fail") {JOptionPane.showMessageDialog(this, "Oops! No Results! Please Input Available Client ID and Book Name!");
            }
            } catch (Exception ae){
            JOptionPane.showMessageDialog(null, ae);
      }   
    }//GEN-LAST:event_VerifyActionPerformed

    private void ConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmActionPerformed
        // TODO add your handling code here:
        CID = ClientID.getText();
        CNAME = lblClientName.getText();
        BN = BookName.getText();
        String oldContent = "";
        String status = "fail";
            if (CNAME.equals("- - - - - - - - - - - -")){
               JOptionPane.showMessageDialog(this, "Incomplete Data Entry!!");
               }
        else {result = JOptionPane.showConfirmDialog(this, "Are You Sure You Want To Return This Book?", "Save To Library", JOptionPane.ERROR_MESSAGE);
        if (result == JOptionPane.YES_OPTION) {
        try
        {   
            File file = new File("borrow.txt");
            Scanner inputFile = new Scanner(file); 
            
            while (inputFile.hasNext()){ // Read lines from the file until no more are left.
            String line = inputFile.nextLine();
            String[] details = line.split(":");
            
                if (CID.equals(details[0]) && CNAME.equals(details[1]) && BN.equals(details[4]) && details[8].equals("not returned")){
                Scanner sc = new Scanner(new File ("borrow.txt")); 
                    while (sc.hasNextLine()) 
                    {
                     oldContent = oldContent + sc.nextLine() + System.lineSeparator();//Reading all the lines of input text file into oldContent
                    }       
                String oldString = details[0] + ":" + details[1] + ":" + details[2] + ":" + details[3] + ":" + details[4] + ":" + details[5] + ":" + details[6] + ":" + details[7] + ":" + details[8];
                String newString = details[0] + ":" + details[1] + ":" + details[2] + ":" + details[3] + ":" + details[4] + ":" + details[5] + ":" + details[6] + ":" + details[7] + ":" + "returned";
                //Replacing oldString with newString in the oldContent
                String newContent = oldContent.replaceAll(oldString, newString);
                //Rewriting the input text file with newContent
                FileWriter writer = new FileWriter("borrow.txt");
                writer.append(newContent);
                writer.flush();
                status = "success";
                JOptionPane.showMessageDialog(this, "Return Successful!");
                setReset();
                }
             }
                if (status=="fail"){
                    JOptionPane.showMessageDialog(this, "Oops! No Results!");
                    }} catch (Exception ae){
                    JOptionPane.showMessageDialog(null, ae);
                    }
        }
        }
    }//GEN-LAST:event_ConfirmActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        // TODO add your handling code here:
        setReset();
    }//GEN-LAST:event_ResetActionPerformed

    private void BorrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrowActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        borrow page = new borrow();
    }//GEN-LAST:event_BorrowActionPerformed

    private void RenewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RenewActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        renew page = new renew();
    }//GEN-LAST:event_RenewActionPerformed

    private void ReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        returned page = new returned();
    }//GEN-LAST:event_ReturnActionPerformed

    private void CilentRegistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CilentRegistrationActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        cilentregistration page = new cilentregistration();
    }//GEN-LAST:event_CilentRegistrationActionPerformed

    private void ClientEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientEditActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        clientedit page = new clientedit();
    }//GEN-LAST:event_ClientEditActionPerformed

    private void AddBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBookActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        addbook page = new addbook();
    }//GEN-LAST:event_AddBookActionPerformed

    private void EditBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBookActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        bookedit page = new bookedit();
    }//GEN-LAST:event_EditBookActionPerformed

    private void RecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecordsActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        records page = new records();
    }//GEN-LAST:event_RecordsActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        login page = new login();
    }//GEN-LAST:event_jMenuItem7ActionPerformed
private void setReset(){
        ClientID.setText("");
        BookName.setText("");

        lblClientName.setText("- - - - - - - - - - - -");
        lblClientRole.setText("- - - - - - - - - - - -");
        lblBookID.setText("- - - - - - - - - - - -");
        lblBookGenre.setText("- - - - - - - - - - - -");
        lblBorrowDate.setText("- - - - - - - - - - - -");
        lblDueDate.setText("- - - - - - - - - - - -");
        lblToday.setText("- - - - - - - - - - - -");
        lblFined.setText("- - - - - - - - - - - -");
}
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(returned.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(returned.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(returned.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(returned.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new returned().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AddBook;
    private javax.swing.JTextField BookName;
    private javax.swing.JMenuItem Borrow;
    private javax.swing.JMenuItem CilentRegistration;
    private javax.swing.JMenuItem ClientEdit;
    private javax.swing.JTextField ClientID;
    private javax.swing.JButton Confirm;
    private javax.swing.JMenuItem EditBook;
    private javax.swing.JMenuItem Records;
    private javax.swing.JMenuItem Renew;
    private javax.swing.JButton Reset;
    private javax.swing.JMenuItem Return;
    private javax.swing.JLabel SectionTitle;
    private javax.swing.JButton Verify;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JLabel lblBookGenre;
    private javax.swing.JLabel lblBookID;
    private javax.swing.JLabel lblBorrowDate;
    private javax.swing.JLabel lblClientName;
    private javax.swing.JLabel lblClientRole;
    private javax.swing.JLabel lblDueDate;
    private javax.swing.JLabel lblFined;
    private javax.swing.JLabel lblToday;
    // End of variables declaration//GEN-END:variables
    private String CID, BN, CNAME;
    private int result;
}
