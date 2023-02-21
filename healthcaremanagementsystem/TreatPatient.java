/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.healthcaremanagementsystem;

import javax.swing.JOptionPane;



/**
 *
 * @author Jumana
 */
public class TreatPatient extends javax.swing.JFrame {

    /**
     * Creates new form DoctorAvailability
     */
    public TreatPatient() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pnID = new javax.swing.JTextField();
        pdiagnosis = new javax.swing.JTextField();
        pprescription = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        st = new javax.swing.JComboBox<>();
        state = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel1.setText("Treat Patient");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 290, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jumana\\Desktop\\final resize.png")); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 239, 95));

        jLabel3.setText("Patient ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, -1, -1));

        jLabel4.setText("Diagnosis");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, -1, -1));

        jLabel5.setText("Prescription");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, -1, -1));
        getContentPane().add(pnID, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 340, -1));

        pdiagnosis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pdiagnosisActionPerformed(evt);
            }
        });
        getContentPane().add(pdiagnosis, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 340, -1));
        getContentPane().add(pprescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, 340, -1));

        jButton1.setText("Confirm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 440, -1, -1));

        jLabel6.setText("State");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, -1, -1));

        st.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Emergency" }));
        getContentPane().add(st, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, -1, -1));

        state.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateActionPerformed(evt);
            }
        });
        getContentPane().add(state, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, 210, -1));

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 440, 80, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pdiagnosisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pdiagnosisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pdiagnosisActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
         state.setText(st.getSelectedItem().toString());
         if (st.getSelectedItem().toString().equals("Normal"))
         {
             for (int i=0; i< Hospital.normalpatientslist.size(); i++)
             {
                 if (Hospital.normalpatientslist.get(i).getNationalID().equals(pnID.getText())){
                     Hospital.normalpatientslist.get(i).setDiagnosis(pdiagnosis.getText());
                     Hospital.normalpatientslist.get(i).setPrescription(pprescription.getText());
                 }
             }
         }
         else{
              for (int i=0; i< Hospital.emergencypatientslist.size(); i++)
             {
                 if (Hospital.emergencypatientslist.get(i).getNationalID().equals(pnID.getText())){
                     Hospital.emergencypatientslist.get(i).setDiagnosis(pdiagnosis.getText());
                     Hospital.emergencypatientslist.get(i).setPrescription(pprescription.getText());
                 }
         }
         }
       
       JOptionPane.showMessageDialog(rootPane, "\n Prescription: " + pprescription.getText() + "\n Diagnosis: " + pdiagnosis.getText()+ "\n Diagnosis and Prescription added successfully" );
        
        
        //NormalPdiagnosis = pdiagnosis.getText();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void stateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stateActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        MenuPage obj = new MenuPage();
       obj.setVisible(true);
       dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(DoctorAvailability.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorAvailability.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorAvailability.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorAvailability.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TreatPatient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField pdiagnosis;
    private javax.swing.JTextField pnID;
    private javax.swing.JTextField pprescription;
    private javax.swing.JComboBox<String> st;
    private javax.swing.JTextField state;
    // End of variables declaration//GEN-END:variables
}