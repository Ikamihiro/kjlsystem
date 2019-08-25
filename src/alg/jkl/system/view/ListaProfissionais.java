package alg.jkl.system.view;

import alg.jkl.system.models.Profissional;
import alg.jkl.system.models.dao.ProfissionalDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ListaProfissionais extends javax.swing.JFrame {

    public ListaProfissionais() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jLabel2 = new javax.swing.JLabel();
        pesquisa = new javax.swing.JTextField();
        btPesquisa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbListaProfissionais = new javax.swing.JTable();
        Bt_incluir = new javax.swing.JButton();
        Bt_Excluir = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        bt_Atualizar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(22, 21, 19));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel2.setText("Profissionais Cadastrados");

        pesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisaActionPerformed(evt);
            }
        });

        btPesquisa.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btPesquisa.setText("Pesquisar");
        btPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisaActionPerformed(evt);
            }
        });

        tbListaProfissionais.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        tbListaProfissionais.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CPF", "Nome", "Função"
            }
        ));
        jScrollPane1.setViewportView(tbListaProfissionais);

        Bt_incluir.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        Bt_incluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alg/jkl/system/images/New-file-icon.png"))); // NOI18N
        Bt_incluir.setText("Incluir");
        Bt_incluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_incluirActionPerformed(evt);
            }
        });

        Bt_Excluir.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        Bt_Excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alg/jkl/system/images/page-remove-icon.png"))); // NOI18N
        Bt_Excluir.setText("Excluir");
        Bt_Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_ExcluirActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alg/jkl/system/images/Pencil-icon.png"))); // NOI18N
        jButton4.setText("Alterar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        bt_Atualizar.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        bt_Atualizar.setText("Atualizar");
        bt_Atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_AtualizarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel1.setText("nome:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                            .addComponent(Bt_Excluir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Bt_incluir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt_Atualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(Bt_incluir, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Bt_Excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bt_Atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesquisaActionPerformed

    private void Bt_incluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_incluirActionPerformed
        // TODO add your handling code here:
        CadastroProfissional cadastroProf = new CadastroProfissional();
        cadastroProf.setVisible(true);
    }//GEN-LAST:event_Bt_incluirActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void bt_AtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_AtualizarActionPerformed
        // TODO add your handling code here:
        ProfissionalDAO profissionalDao = new ProfissionalDAO();
        ArrayList<Profissional> listaProfissionais = profissionalDao.listar();

        DefaultTableModel tbModel = (DefaultTableModel) tbListaProfissionais.getModel();
        
        tbModel.setRowCount(0);
        
        for (Profissional profissional : listaProfissionais){
            Object[] linha = new Object[3];
            linha[0] = profissional.getId_profissional();
            linha[1] = profissional.getNome();
            linha[2] = profissional.getFuncao();
            tbModel.addRow(linha);
        }
    }//GEN-LAST:event_bt_AtualizarActionPerformed

    private void Bt_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_ExcluirActionPerformed
        System.out.println("Teste.....");
        ProfissionalDAO profissionalDao = new ProfissionalDAO();
        ArrayList<Profissional> listaProfissional = profissionalDao.listar();
        
        //Me retorna um inteiro com o numero da linha que está selecionada
        int indiceLinha = tbListaProfissionais.getSelectedRow();
        System.out.println("Teste.....");
        //Me retorna o código do serviço
        int codigo = (int) tbListaProfissionais.getValueAt(indiceLinha, 0);
        System.out.println("Teste.....");
        //Exclui a linha do JTable
        ((DefaultTableModel) tbListaProfissionais.getModel()).removeRow(tbListaProfissionais.getSelectedRow());
        System.out.println("Teste.....");
        //Exclui a linha do BAnco
        boolean retorno = profissionalDao.remover(codigo);
        System.out.println("Teste.....");
        if (retorno == true) {
            JOptionPane.showMessageDialog(
                    null, 
                    "Profissional removido com sucesso!", 
                    "Sucesso!", 
                    JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(
                    null, 
                    "Não foi possível remover o profissional!", 
                    "Error!", 
                    JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_Bt_ExcluirActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        ProfissionalDAO profissionalDao = new ProfissionalDAO();
        ArrayList<Profissional> listaProfissionais = profissionalDao.listar();

        DefaultTableModel tbModel = (DefaultTableModel) tbListaProfissionais.getModel();
        
        tbModel.setRowCount(0);
        
        for (Profissional profissional : listaProfissionais){
            Object[] linha = new Object[3];
            linha[0] = profissional.getId_profissional();
            linha[1] = profissional.getNome();
            linha[2] = profissional.getFuncao();
            tbModel.addRow(linha);
        }
    }//GEN-LAST:event_formWindowOpened

    private void btPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisaActionPerformed
        // TODO add your handling code here:
        String pesquisar = pesquisa.getText(); 
        System.out.println("nome: "+pesquisar);
        
        ProfissionalDAO profissionalDao = new ProfissionalDAO();
        ArrayList<Profissional> pesquisaProfissionais = profissionalDao.pesquisar(pesquisar);

        DefaultTableModel tbModel = (DefaultTableModel) tbListaProfissionais.getModel();
        
        tbModel.setRowCount(0);
        
        for (Profissional profissional : pesquisaProfissionais){
            Object[] linha = new Object[3];
            linha[0] = profissional.getId_profissional();
            linha[1] = profissional.getNome();
            linha[2] = profissional.getFuncao();
            tbModel.addRow(linha);
        }
  
        /*tbListaProfissionais.addRowSelectionInterval(0, tbListaProfissionais.getRowCount() - 1);
        ArrayList<Profissional> listaProfissionais = profissionalDao.listar(); 
        DefaultTableModel tbModel = (DefaultTableModel) tbListaProfissionais.getModel();
        tbModel.setRowCount(0);
        
        for (Profissional profissional : listaProfissionais){
            Object[] linha = new Object[3];
            linha[0] = profissional.getId_profissional();
            linha[1] = profissional.getNome();
            linha[2] = profissional.getFuncao();
            tbModel.addRow(linha);
        } */
    }//GEN-LAST:event_btPesquisaActionPerformed

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
            java.util.logging.Logger.getLogger(ListaProfissionais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaProfissionais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaProfissionais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaProfissionais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaProfissionais().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bt_Excluir;
    private javax.swing.JButton Bt_incluir;
    private javax.swing.JButton btPesquisa;
    private javax.swing.JButton bt_Atualizar;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField pesquisa;
    private javax.swing.JTable tbListaProfissionais;
    // End of variables declaration//GEN-END:variables
}
