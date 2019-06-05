/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.professor;

import View.Menu;
import controller.ControllerProfessor;
import model.Professor;
import javax.swing.JOptionPane;

/**
 *
 * @author guilherme
 */
public class CadastrarProfessor extends javax.swing.JDialog {
    
    public ControllerProfessor controller = Menu.controller.getControllerProfessor();

    /**
     * Creates new form CadastrarProfessor
     */
    public CadastrarProfessor() {
        initComponents();
        setLocation(300, 100);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnMenuBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        campoNomeprof = new javax.swing.JTextField();
        btnEvetivarcadastro = new javax.swing.JButton();
        btnMenuprof = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        campoTextdout = new javax.swing.JTextField();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Professor");

        btnMenuBack.setText("Menu");
        btnMenuBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuBackActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome");

        campoNomeprof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeprofActionPerformed(evt);
            }
        });

        btnEvetivarcadastro.setText("Cadastrar");
        btnEvetivarcadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEvetivarcadastroActionPerformed(evt);
            }
        });

        btnMenuprof.setText("Menu Professor");
        btnMenuprof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuprofActionPerformed(evt);
            }
        });

        jLabel3.setText("Possui Diploma de Doutorado:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnMenuprof)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMenuBack))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoTextdout))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(campoNomeprof, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel1)
                                .addComponent(btnEvetivarcadastro)))
                        .addGap(0, 142, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(campoNomeprof, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoTextdout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnEvetivarcadastro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMenuBack)
                    .addComponent(btnMenuprof))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuBackActionPerformed
        dispose();
        Menu menu = new Menu();
        menu.setVisible(true);
        menu.setLocation(300, 100);
        menu.setResizable(false);
    }//GEN-LAST:event_btnMenuBackActionPerformed

    private void campoNomeprofActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeprofActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeprofActionPerformed

    private void btnEvetivarcadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEvetivarcadastroActionPerformed
        String nomeprof = campoNomeprof.getText();
        String verificDout = campoTextdout.getText();
        
        Professor professor = new Professor(nomeprof);
        professor.setDiplomaDout(verificDout);
        
        if (professor.VerificarCondicao()) {
            this.controller.AddProfessor(professor);
            JOptionPane.showMessageDialog(null, "Cadastrado");
            System.out.println(professor);
        } else {
            JOptionPane.showMessageDialog(null, "Não pode ser cadastrado, não possui Doutorado");
        }
    }//GEN-LAST:event_btnEvetivarcadastroActionPerformed

    private void btnMenuprofActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuprofActionPerformed
        dispose();
        MenuProfessor menup = new MenuProfessor();
        menup.setVisible(true);
        menup.setLocation(300, 100);
        menup.setResizable(false);
    }//GEN-LAST:event_btnMenuprofActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        // Set the Nimbus look and feel 
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
            java.util.logging.Logger.getLogger(CadastrarProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        // Create and display the dialog
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarProfessor().setVisible(true);
               
          }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEvetivarcadastro;
    private javax.swing.JButton btnMenuBack;
    private javax.swing.JButton btnMenuprof;
    private javax.swing.JTextField campoNomeprof;
    private javax.swing.JTextField campoTextdout;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
