/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.disciplina;

import View.Menu;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class MenuDisciplina extends javax.swing.JFrame {

    /**
     * Creates new form Cursos
     */
    public MenuDisciplina() {
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

        jLabel1 = new javax.swing.JLabel();
        btnCadastroDisc = new javax.swing.JButton();
        btnListagemDisc = new javax.swing.JButton();
        btnAtualizacaoDisc = new javax.swing.JButton();
        btnDeletarDisc = new javax.swing.JButton();
        btnAddTurma = new javax.swing.JButton();
        btnAddMatricula = new javax.swing.JButton();
        btnAddHistorico = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        btnAddProfessor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(0, 0, 153));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Disciplina");

        btnCadastroDisc.setText("Cadastrar Disciplina");
        btnCadastroDisc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroDiscActionPerformed(evt);
            }
        });

        btnListagemDisc.setText("Listar Disciplinas");
        btnListagemDisc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListagemDiscActionPerformed(evt);
            }
        });

        btnAtualizacaoDisc.setText("Atualizar Disciplina");
        btnAtualizacaoDisc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizacaoDiscActionPerformed(evt);
            }
        });

        btnDeletarDisc.setText("Deletar Disciplina");
        btnDeletarDisc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarDiscActionPerformed(evt);
            }
        });

        btnAddTurma.setText("Adicionar Turma");
        btnAddTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTurmaActionPerformed(evt);
            }
        });

        btnAddMatricula.setText("Adicionar Matricula");
        btnAddMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMatriculaActionPerformed(evt);
            }
        });

        btnAddHistorico.setText("Adicionar Historico");
        btnAddHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddHistoricoActionPerformed(evt);
            }
        });

        btnMenu.setText("Menu");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        btnAddProfessor.setText("Adicionar Professor");
        btnAddProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProfessorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(283, 283, 283)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(158, 158, 158)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnCadastroDisc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnListagemDisc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAtualizacaoDisc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnDeletarDisc, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(62, 62, 62)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnAddTurma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAddMatricula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAddHistorico, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                    .addComponent(btnAddProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 168, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnMenu)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastroDisc)
                    .addComponent(btnAddTurma))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnListagemDisc)
                    .addComponent(btnAddMatricula))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtualizacaoDisc)
                    .addComponent(btnAddHistorico))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeletarDisc)
                    .addComponent(btnAddProfessor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(btnMenu)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListagemDiscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListagemDiscActionPerformed
        // TODO add your handling code here:
        dispose();
        TelaListagem telaListagem = new TelaListagem();
        telaListagem.setVisible(true);
        telaListagem.setLocation(300, 100);
        telaListagem.setResizable(false);
    }//GEN-LAST:event_btnListagemDiscActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        // TODO add your handling code here:
        dispose();
        Menu menu = new Menu();
        menu.setVisible(true);
        menu.setLocation(300, 100);
        menu.setResizable(false);
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnCadastroDiscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroDiscActionPerformed
        // TODO add your handling code here:
        dispose();
        TelaCadastro telaCadastro = new TelaCadastro();
        telaCadastro.setVisible(true);
        telaCadastro.setLocation(300, 100);
        telaCadastro.setResizable(false);
    }//GEN-LAST:event_btnCadastroDiscActionPerformed

    private void btnAtualizacaoDiscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizacaoDiscActionPerformed
        // TODO add your handling code here:
        dispose();
        TelaAtualizacao telaAtualizacao = new TelaAtualizacao();
        telaAtualizacao.setVisible(true);
        telaAtualizacao.setLocation(300, 100);
        telaAtualizacao.setResizable(false);
    }//GEN-LAST:event_btnAtualizacaoDiscActionPerformed

    private void btnDeletarDiscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarDiscActionPerformed
        // TODO add your handling code here:
        dispose();
        TelaDeletar telaDeletar = new TelaDeletar();
        telaDeletar.setVisible(true);
        telaDeletar.setLocation(300, 100);
        telaDeletar.setResizable(false);
    }//GEN-LAST:event_btnDeletarDiscActionPerformed

    private void btnAddTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTurmaActionPerformed
        // TODO add your handling code here:
        dispose();
        TelaAddTurma telaAddTurma = new TelaAddTurma();
        telaAddTurma.setVisible(true);
        telaAddTurma.setLocation(300, 100);
        telaAddTurma.setResizable(false);
    }//GEN-LAST:event_btnAddTurmaActionPerformed

    private void btnAddMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMatriculaActionPerformed
        // TODO add your handling code here:
        dispose();
        TelaAddMatricula telaAddMatricula = new TelaAddMatricula();
        telaAddMatricula.setVisible(true);
        telaAddMatricula.setLocation(300, 100);
        telaAddMatricula.setResizable(false);
    }//GEN-LAST:event_btnAddMatriculaActionPerformed

    private void btnAddHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddHistoricoActionPerformed
        // TODO add your handling code here:
        dispose();
        TelaAddHistorico telaAddHistorico = new TelaAddHistorico();
        telaAddHistorico.setVisible(true);
        telaAddHistorico.setLocation(300, 100);
        telaAddHistorico.setResizable(false);
    }//GEN-LAST:event_btnAddHistoricoActionPerformed

    private void btnAddProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProfessorActionPerformed
        // TODO add your handling code here:
        dispose();
        TelaAddProfessor telaAddProfessor = new TelaAddProfessor();
        telaAddProfessor.setVisible(true);
        telaAddProfessor.setLocation(300, 100);
        telaAddProfessor.setResizable(false);
    }//GEN-LAST:event_btnAddProfessorActionPerformed

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
            java.util.logging.Logger.getLogger(MenuDisciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuDisciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuDisciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuDisciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuDisciplina().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddHistorico;
    private javax.swing.JButton btnAddMatricula;
    private javax.swing.JButton btnAddProfessor;
    private javax.swing.JButton btnAddTurma;
    private javax.swing.JButton btnAtualizacaoDisc;
    private javax.swing.JButton btnCadastroDisc;
    private javax.swing.JButton btnDeletarDisc;
    private javax.swing.JButton btnListagemDisc;
    private javax.swing.JButton btnMenu;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
