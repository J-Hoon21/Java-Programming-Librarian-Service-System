/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.service.system;
import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author user
 */
public class bookedit extends javax.swing.JFrame {

    /**
     * Creates new form bookedit
     */
    public bookedit() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        BookTable = new javax.swing.JTable();
        Refresh = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        SectionTitle = new javax.swing.JLabel();
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

        BookTable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BookTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Book ID", "Book Name", "Book Genre", "Book Author", "Book Publisher", "Publish Year", "Summary"
            }
        ));
        jScrollPane1.setViewportView(BookTable);

        Refresh.setText("Refresh Table");
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });

        Update.setText("Update Changes");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        SectionTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SectionTitle.setText("Book Edit Section");

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
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(489, 489, 489)
                        .addComponent(Refresh)
                        .addGap(137, 137, 137)
                        .addComponent(Update)
                        .addGap(0, 431, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(568, 568, 568)
                .addComponent(SectionTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(SectionTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Refresh)
                    .addComponent(Update))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
        File file = new File("books.txt");
        try {
            BufferedReader br = new BufferedReader (new FileReader(file));
            // get the first line
            // get the columns name from the first line
            // set columns name to the jtable model
            DefaultTableModel model = (DefaultTableModel)BookTable.getModel();
             // get lines from txt file
            Object[] tableLines = br.lines().toArray();
            model.setRowCount(0);
            // extratct data from lines
            // set data to jtable model
            for (Object tableLine : tableLines) {
                String line = tableLine.toString().trim();
                String[] details = line.split(":");
                model.addRow(details);
            }
        }
        catch (FileNotFoundException e)
        {
            JOptionPane.showMessageDialog(null, "Booklist failed to retrieve");
        }
    }//GEN-LAST:event_RefreshActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        File file = new File("books.txt");
        String status = "fail";
        try {
            FileWriter f = new FileWriter(file);
            BufferedWriter writer = new BufferedWriter(f);
            for (int i = 0; i < BookTable.getRowCount(); i++){
            for(int a = 0; a < BookTable.getColumnCount(); a++){
                writer.write(BookTable.getValueAt(i,a).toString()+ ":");
            }
            writer.newLine();
            }
            status = "success";
            JOptionPane.showMessageDialog(this, "Edit Successful!");
            writer.close();
            f.close();
           } catch (Exception e){
                    JOptionPane.showMessageDialog(null, "Error");
                    }
                    
    }//GEN-LAST:event_UpdateActionPerformed

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

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        login page = new login();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void RecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecordsActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        records page = new records();
    }//GEN-LAST:event_RecordsActionPerformed

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
            java.util.logging.Logger.getLogger(bookedit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bookedit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bookedit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bookedit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bookedit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AddBook;
    private javax.swing.JTable BookTable;
    private javax.swing.JMenuItem Borrow;
    private javax.swing.JMenuItem CilentRegistration;
    private javax.swing.JMenuItem ClientEdit;
    private javax.swing.JMenuItem EditBook;
    private javax.swing.JMenuItem Records;
    private javax.swing.JButton Refresh;
    private javax.swing.JMenuItem Renew;
    private javax.swing.JMenuItem Return;
    private javax.swing.JLabel SectionTitle;
    private javax.swing.JButton Update;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
