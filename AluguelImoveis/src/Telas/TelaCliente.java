package Telas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class TelaCliente extends Cabecalho {

    public TelaCliente() {
        initComponents();
    }
     //CONFIGURAÇÃO DE AÇÃO DOS BOTÕES
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButtonBuscaClienteCPF = new javax.swing.JToggleButton();
        jTextFieldNumConta = new javax.swing.JTextField();
        jTextFieldNumConta1 = new javax.swing.JTextField();
        jTextFieldNumConta2 = new javax.swing.JTextField();
        jTextFieldNumConta3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButtonAlteraCliente = new javax.swing.JToggleButton();
        jButtonCancelar = new javax.swing.JToggleButton();
        jButtonBuscaClienteCPF1 = new javax.swing.JToggleButton();
        jButtonExcluir = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel4.setText("Cliente:");

        jLabel7.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel7.setText("CPF:");

        jLabel8.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel8.setText("Sexo");

        jLabel9.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel9.setText("Nascimento:");

        jButtonBuscaClienteCPF.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jButtonBuscaClienteCPF.setText("Buscar Cliente");
        jButtonBuscaClienteCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscaClienteCPFActionPerformed(evt);
            }
        });

        jTextFieldNumConta.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jTextFieldNumConta.setForeground(new java.awt.Color(0, 0, 51));
        jTextFieldNumConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumContaActionPerformed(evt);
            }
        });

        jTextFieldNumConta1.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jTextFieldNumConta1.setForeground(new java.awt.Color(0, 0, 51));
        jTextFieldNumConta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumConta1ActionPerformed(evt);
            }
        });

        jTextFieldNumConta2.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jTextFieldNumConta2.setForeground(new java.awt.Color(0, 0, 51));
        jTextFieldNumConta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumConta2ActionPerformed(evt);
            }
        });

        jTextFieldNumConta3.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jTextFieldNumConta3.setForeground(new java.awt.Color(0, 0, 51));
        jTextFieldNumConta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumConta3ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel5.setText("Tela Cliente:");

        jButtonAlteraCliente.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jButtonAlteraCliente.setText("Salvar e Sair");
        jButtonAlteraCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlteraClienteActionPerformed(evt);
            }
        });

        jButtonCancelar.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jButtonCancelar.setText("Cancelar e Voltar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonBuscaClienteCPF1.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jButtonBuscaClienteCPF1.setText("Alterar");
        jButtonBuscaClienteCPF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscaClienteCPF1ActionPerformed(evt);
            }
        });

        jButtonExcluir.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldNumConta, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel9)
                        .addGap(6, 6, 6)
                        .addComponent(jTextFieldNumConta3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldNumConta2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNumConta1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonAlteraCliente)
                    .addComponent(jButtonBuscaClienteCPF1)
                    .addComponent(jButtonBuscaClienteCPF)
                    .addComponent(jButtonExcluir))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextFieldNumConta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldNumConta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jButtonBuscaClienteCPF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonBuscaClienteCPF1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonExcluir)))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jTextFieldNumConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldNumConta3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonAlteraCliente))
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonCancelar)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscaClienteCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscaClienteCPFActionPerformed

    }//GEN-LAST:event_jButtonBuscaClienteCPFActionPerformed

    private void jTextFieldNumContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumContaActionPerformed
    }//GEN-LAST:event_jTextFieldNumContaActionPerformed

    private void jTextFieldNumConta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumConta1ActionPerformed
    }//GEN-LAST:event_jTextFieldNumConta1ActionPerformed

    private void jTextFieldNumConta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumConta2ActionPerformed
    }//GEN-LAST:event_jTextFieldNumConta2ActionPerformed

    private void jTextFieldNumConta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumConta3ActionPerformed
    }//GEN-LAST:event_jTextFieldNumConta3ActionPerformed

    private void jButtonAlteraClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlteraClienteActionPerformed
    }//GEN-LAST:event_jButtonAlteraClienteActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonBuscaClienteCPF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscaClienteCPF1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonBuscaClienteCPF1ActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonExcluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton jButtonAlteraCliente;
    private javax.swing.JToggleButton jButtonBuscaClienteCPF;
    private javax.swing.JToggleButton jButtonBuscaClienteCPF1;
    private javax.swing.JToggleButton jButtonCancelar;
    private javax.swing.JToggleButton jButtonExcluir;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldNumConta;
    private javax.swing.JTextField jTextFieldNumConta1;
    private javax.swing.JTextField jTextFieldNumConta2;
    private javax.swing.JTextField jTextFieldNumConta3;
    // End of variables declaration//GEN-END:variables
}
