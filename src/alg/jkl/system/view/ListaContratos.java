
package alg.jkl.system.view;

import alg.jkl.system.models.Contrato;
import alg.jkl.system.models.dao.ContratoDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ListaContratos extends javax.swing.JFrame {

    public ListaContratos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblistaContratos = new javax.swing.JTable();
        btnExcluir = new javax.swing.JButton();
        btnInserir = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Contratos");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tblistaContratos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificador", "Serviço", "Cliente", "Profissional", "Valor"
            }
        ));
        jScrollPane1.setViewportView(tblistaContratos);

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alg/jkl/system/images/page-remove-icon.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alg/jkl/system/images/New-file-icon.png"))); // NOI18N
        btnInserir.setText("Inserir");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        btnAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alg/jkl/system/images/Arrow-refresh-icon.png"))); // NOI18N
        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alg/jkl/system/images/Pencil-icon.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setText("Contratos Cadastrados");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(337, 337, 337)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(720, 720, 720)
                    .addComponent(btnInserir, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(55, 55, 55)
                    .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(393, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        ContratoDAO contratoDAO = new ContratoDAO();
        ArrayList<Contrato> listaContratos = contratoDAO.listar();
        
        DefaultTableModel tbModel = (DefaultTableModel) tblistaContratos.getModel();
        
        tbModel.setRowCount(0);
        
        System.out.println("Aqui");
        for (Contrato contrato : listaContratos){
            Object[] linha = new Object[5];
            linha[0] = contrato.getid_contrato();
            linha[1] = contrato.getid_servico();
            linha[2] = contrato.getId_cliente();
            linha[3] = contrato.getid_profissional();
            linha[4] = contrato.getvalor_contrato();
            tbModel.addRow(linha);
            System.out.println("Aqui");
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
         try {
            int flagcadastrar = 1;
            FormularioContrato formularioContrato = new FormularioContrato();
            formularioContrato.setVisible(true);
            formularioContrato.passaflag(flagcadastrar);    
        } catch (Exception e) {
            System.out.println("Erro no cadastro");
        }
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        ContratoDAO contratoDAO = new ContratoDAO();
        ArrayList<Contrato> listaContratos = contratoDAO.listar();
        
        //Me retorna um inteiro com o numero da linha que está selecionada
        int indiceLinha = tblistaContratos.getSelectedRow();
        
        //Me retorna o código do serviço
        int codigo = (int) tblistaContratos.getValueAt(indiceLinha, 0);
        
        //Exclui a linha do JTable
        ((DefaultTableModel) tblistaContratos.getModel()).removeRow(tblistaContratos.getSelectedRow());
        
        //Exclui a linha do BAnco
        boolean retorno = contratoDAO.remover(codigo);
        
        if (retorno == true) {
            JOptionPane.showMessageDialog(
                    null, 
                    "Contrato removido com sucesso!", 
                    "Sucesso!", 
                    JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(
                    null, 
                    "Não foi possível remover o contrato!", 
                    "Error!", 
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        ContratoDAO contratoDAO = new ContratoDAO();
        ArrayList<Contrato> listaContratos = contratoDAO.listar();
        
        DefaultTableModel tbModel = (DefaultTableModel) tblistaContratos.getModel();
        
        tbModel.setRowCount(0);
        
        for (Contrato contrato : listaContratos){
            Object[] linha = new Object[5];
            linha[0] = contrato.getid_contrato();
            linha[1] = contrato.getid_servico();
            linha[2] = contrato.getId_cliente();
            linha[3] = contrato.getid_profissional();
            linha[4] = contrato.getvalor_contrato();
            tbModel.addRow(linha);
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        ContratoDAO contratoDAO = new ContratoDAO();
        
        //Me retorna um inteiro com o numero da linha que está selecionada
        int indiceLinha = tblistaContratos.getSelectedRow();
        
        //Vai aparecer uma mensagem se o usuário não selecionar uma linha
        if (indiceLinha < 0){
            JOptionPane.showMessageDialog(null, "Você precisa selecionar uma linha", "Erro!", JOptionPane.ERROR_MESSAGE);
        }

        //Me retorna o codigo do serviço
        int codigo = (int) tblistaContratos.getValueAt(indiceLinha, 0);
        
        //Me retorna a lista selecionada
        ArrayList<Contrato> retorno = contratoDAO.retornaDados(codigo);
        int flagcadastrar = 2;
        FormularioContrato formularioContrato = new FormularioContrato();
        formularioContrato.enviaDados(retorno, codigo);
        formularioContrato.setVisible(true);
        formularioContrato.passaflag(flagcadastrar);    
    }//GEN-LAST:event_btnAlterarActionPerformed

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
            java.util.logging.Logger.getLogger(ListaContratos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaContratos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaContratos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaContratos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaContratos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnInserir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblistaContratos;
    // End of variables declaration//GEN-END:variables
}
