package project;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;
import java.awt.Image;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NODE5
 */
public class firstpage extends javax.swing.JFrame {
//Image image=Image("D:\\project\\project\\collegelobo.png");
    /**
     * Creates new form firstpage
     */
    public firstpage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        close = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        create = new javax.swing.JMenu();
        btcard = new javax.swing.JMenuItem();
        bc = new javax.swing.JMenuItem();
        tc = new javax.swing.JMenuItem();
        icard = new javax.swing.JMenuItem();
        account = new javax.swing.JMenu();
        register = new javax.swing.JMenuItem();
        Modify = new javax.swing.JMenuItem();
        rollcalllist = new javax.swing.JMenu();
        computerbranch = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        MechanicalEngineering = new javax.swing.JMenuItem();
        ElectricalEngineering = new javax.swing.JMenuItem();
        dcstudent = new javax.swing.JMenu();
        adddcstudent = new javax.swing.JMenuItem();
        removedcstudent = new javax.swing.JMenuItem();
        classmenu = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        changebranch = new javax.swing.JMenuItem();
        helpmenu = new javax.swing.JMenu();
        displayrulehelp = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Information Management System");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 122, 72), 7, true));
        jPanel1.setPreferredSize(new java.awt.Dimension(1355, 345));

        close.setBackground(new java.awt.Color(175, 163, 163));
        close.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        close.setText("Exit");
        close.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\project\\image\\cologofirstpage.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(488, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(463, 463, 463))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(586, 586, 586))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setIcon(new javax.swing.ImageIcon("D:\\project\\image\\msbt.jpg")); // NOI18N

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel7.setText("Maharashtra State Board Of Techanical Education, Mumbai ");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel8.setText("Student Information Management System");

        jLabel9.setIcon(new javax.swing.ImageIcon("D:\\project\\image\\images.jpeg")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(1, 1, 1))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(41, 41, 41)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(187, 187, 187)
                            .addComponent(jLabel8)))
                    .addContainerGap(161, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel8)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jMenuBar2.setBackground(new java.awt.Color(204, 204, 204));
        jMenuBar2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 51), 2, true));
        jMenuBar2.setForeground(new java.awt.Color(255, 102, 51));
        jMenuBar2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuBar2.setPreferredSize(new java.awt.Dimension(95, 60));

        create.setText("Create");
        create.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        create.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        create.setPreferredSize(new java.awt.Dimension(78, 35));

        btcard.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        btcard.setBackground(new java.awt.Color(245, 245, 245));
        btcard.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btcard.setIcon(new javax.swing.ImageIcon("D:\\project\\image\\btcardimage.jpg")); // NOI18N
        btcard.setText("Borrower's Ticket");
        btcard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcardActionPerformed(evt);
            }
        });
        create.add(btcard);

        bc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        bc.setBackground(new java.awt.Color(255, 0, 153));
        bc.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        bc.setIcon(new javax.swing.ImageIcon("D:\\project\\image\\bcimage.jpg")); // NOI18N
        bc.setText("Bonafied Certificate");
        bc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcActionPerformed(evt);
            }
        });
        create.add(bc);

        tc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        tc.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tc.setIcon(new javax.swing.ImageIcon("D:\\project\\image\\tcicon.jpg")); // NOI18N
        tc.setText("Leaving Certificate      ");
        tc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tcActionPerformed(evt);
            }
        });
        create.add(tc);

        icard.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        icard.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        icard.setIcon(new javax.swing.ImageIcon("D:\\project\\image\\icardimage.jpg")); // NOI18N
        icard.setText("Identitiy Card");
        icard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                icardActionPerformed(evt);
            }
        });
        create.add(icard);

        jMenuBar2.add(create);
        create.getAccessibleContext().setAccessibleDescription("");

        account.setText("Account");
        account.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        account.setPreferredSize(new java.awt.Dimension(100, 28));

        register.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        register.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        register.setIcon(new javax.swing.ImageIcon("D:\\project\\image\\registericon.jpg")); // NOI18N
        register.setText("Register     ");
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });
        account.add(register);

        Modify.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        Modify.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Modify.setIcon(new javax.swing.ImageIcon("D:\\project\\image\\modifyimage.jpg")); // NOI18N
        Modify.setText("Modify");
        Modify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifyActionPerformed(evt);
            }
        });
        account.add(Modify);

        jMenuBar2.add(account);

        rollcalllist.setText("Roll Call List");
        rollcalllist.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        rollcalllist.setPreferredSize(new java.awt.Dimension(160, 22));

        computerbranch.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        computerbranch.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        computerbranch.setText("Computer Engineering");
        computerbranch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                computerbranchActionPerformed(evt);
            }
        });
        rollcalllist.add(computerbranch);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jMenuItem3.setText("Information Technology   ");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        rollcalllist.add(jMenuItem3);

        MechanicalEngineering.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        MechanicalEngineering.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        MechanicalEngineering.setText("Mechanical Engineering");
        MechanicalEngineering.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MechanicalEngineeringActionPerformed(evt);
            }
        });
        rollcalllist.add(MechanicalEngineering);

        ElectricalEngineering.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        ElectricalEngineering.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        ElectricalEngineering.setText("Electrical Engineering");
        ElectricalEngineering.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ElectricalEngineeringActionPerformed(evt);
            }
        });
        rollcalllist.add(ElectricalEngineering);

        jMenuBar2.add(rollcalllist);

        dcstudent.setText("DC Student");
        dcstudent.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        adddcstudent.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        adddcstudent.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        adddcstudent.setText("Add DC Student");
        adddcstudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adddcstudentActionPerformed(evt);
            }
        });
        dcstudent.add(adddcstudent);

        removedcstudent.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK));
        removedcstudent.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        removedcstudent.setText("Remove DC Student");
        removedcstudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removedcstudentActionPerformed(evt);
            }
        });
        dcstudent.add(removedcstudent);

        jMenuBar2.add(dcstudent);

        classmenu.setText("Class");
        classmenu.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        classmenu.setPreferredSize(new java.awt.Dimension(70, 28));

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jMenuItem1.setText("Change Class");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        classmenu.add(jMenuItem1);

        changebranch.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_MASK));
        changebranch.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        changebranch.setText("Change Branch");
        changebranch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changebranchActionPerformed(evt);
            }
        });
        classmenu.add(changebranch);

        jMenuBar2.add(classmenu);

        helpmenu.setText("Help");
        helpmenu.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        helpmenu.setPreferredSize(new java.awt.Dimension(65, 28));

        displayrulehelp.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK));
        displayrulehelp.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        displayrulehelp.setText("Display Rule");
        displayrulehelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayrulehelpActionPerformed(evt);
            }
        });
        helpmenu.add(displayrulehelp);

        jMenuBar2.add(helpmenu);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btcardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcardActionPerformed
                dispose();
        new btcardpage().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btcardActionPerformed

    private void bcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcActionPerformed
                        dispose();
        new bcinformationpage().setVisible(true);
    }//GEN-LAST:event_bcActionPerformed

    private void tcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tcActionPerformed
                        dispose();
        new tcinformationpage().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_tcActionPerformed

    private void icardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_icardActionPerformed
                        dispose();
        new icardpage().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_icardActionPerformed

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
                        dispose();
        new registerpage().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_registerActionPerformed

    private void ModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifyActionPerformed
                        dispose();
        new modifypage().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_ModifyActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_closeActionPerformed

    private void MechanicalEngineeringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MechanicalEngineeringActionPerformed
dispose();
new mechanicalrollcalllist().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_MechanicalEngineeringActionPerformed

    private void adddcstudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adddcstudentActionPerformed
                dispose();
        new adddcstudent().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_adddcstudentActionPerformed

    private void removedcstudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removedcstudentActionPerformed
                dispose();
        new removedcstudent().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_removedcstudentActionPerformed

    private void displayrulehelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayrulehelpActionPerformed
            new ruledisplay().setVisible(true);
    }//GEN-LAST:event_displayrulehelpActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        dispose();
        new changeclass().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void changebranchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changebranchActionPerformed
        dispose();
        new changebranch().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_changebranchActionPerformed

    private void computerbranchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_computerbranchActionPerformed
     dispose();
     new computerengineeringrollcalllist().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_computerbranchActionPerformed

    private void ElectricalEngineeringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ElectricalEngineeringActionPerformed
        dispose();
        new electricalrollcalllist().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_ElectricalEngineeringActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        dispose();
        new informationtechnologyrollcalllist().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

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
            java.util.logging.Logger.getLogger(firstpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(firstpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(firstpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(firstpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new firstpage().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ElectricalEngineering;
    private javax.swing.JMenuItem MechanicalEngineering;
    private javax.swing.JMenuItem Modify;
    private javax.swing.JMenu account;
    private javax.swing.JMenuItem adddcstudent;
    private javax.swing.JMenuItem bc;
    private javax.swing.JMenuItem btcard;
    private javax.swing.JMenuItem changebranch;
    private javax.swing.JMenu classmenu;
    private javax.swing.JButton close;
    private javax.swing.JMenuItem computerbranch;
    private javax.swing.JMenu create;
    private javax.swing.JMenu dcstudent;
    private javax.swing.JMenuItem displayrulehelp;
    private javax.swing.JMenu helpmenu;
    private javax.swing.JMenuItem icard;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenuItem register;
    private javax.swing.JMenuItem removedcstudent;
    private javax.swing.JMenu rollcalllist;
    private javax.swing.JMenuItem tc;
    // End of variables declaration//GEN-END:variables
}
