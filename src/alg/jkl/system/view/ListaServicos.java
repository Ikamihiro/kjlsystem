package alg.jkl.system.view;

import alg.jkl.system.models.Servico;
import alg.jkl.system.models.dao.ServicoDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ListaServicos extends javax.swing.JFrame {
    public ListaServicos() {
        initComponents();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbListaServicos = new javax.swing.JTable();
        txtPesquisa = new javax.swing.JTextField();
        btnPesquisa = new javax.swing.JButton();
        javax.swing.JButton btnCadastrarServico = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jButton2.setText("Atualizar");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Serviços");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tbListaServicos.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        tbListaServicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Cod", "Categoria", "Descrição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbListaServicos);
        if (tbListaServicos.getColumnModel().getColumnCount() > 0) {
            tbListaServicos.getColumnModel().getColumn(0).setMinWidth(40);
            tbListaServicos.getColumnModel().getColumn(0).setMaxWidth(40);
        }

        btnPesquisa.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        btnPesquisa.setText("Pesquisar");
        btnPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaActionPerformed(evt);
            }
        });

        btnCadastrarServico.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        btnCadastrarServico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alg/jkl/system/images/New-file-icon.png"))); // NOI18N
        btnCadastrarServico.setText("Incluir");
        btnCadastrarServico.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCadastrarServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarServicoActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alg/jkl/system/images/page-remove-icon.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnAlterar.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alg/jkl/system/images/Pencil-icon.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnAtualizar.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        btnAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alg/jkl/system/images/Arrow-refresh-icon.png"))); // NOI18N
        btnAtualizar.setText("Atualizar");
        btnAtualizar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel1.setText("SERVIÇOS CADASTRADOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtPesquisa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPesquisa)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCadastrarServico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCadastrarServico, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPesquisa))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaActionPerformed
        // TODO add your handling code here:
        String pesquisar = txtPesquisa.getText(); 
        System.out.println("nome:"+pesquisar+"oi");
        
        String vazia = "";
        if (pesquisar.isEmpty()) {
            System.out.println("Caiu");
            JOptionPane.showMessageDialog(null, "Valor Nulo", "Erro!", JOptionPane.ERROR_MESSAGE);
        }else{
        
            ServicoDAO servicoDAO = new ServicoDAO();
            ArrayList<Servico> pesquisaServicos = servicoDAO.pesquisar(pesquisar);

            DefaultTableModel tbModel = (DefaultTableModel) tbListaServicos.getModel();

            tbModel.setRowCount(0);

            for (Servico servico : pesquisaServicos){
                Object[] linha = new Object[3];
                linha[0] = servico.getid_servico();
                linha[1] = servico.getcategoria_servico();
                linha[2] = servico.getdescricao_servico();
                tbModel.addRow(linha);
            }
        }
    }//GEN-LAST:event_btnPesquisaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        ServicoDAO servicoDAO = new ServicoDAO();
        ArrayList<Servico> listaServicos = servicoDAO.listar();
        
        DefaultTableModel tbModel = (DefaultTableModel) tbListaServicos.getModel();
        
        tbModel.setRowCount(0);
        
        for (Servico servico : listaServicos){
            Object[] linha = new Object[3];
            linha[0] = servico.getid_servico();
            linha[1] = servico.getcategoria_servico();
            linha[2] = servico.getdescricao_servico();
            tbModel.addRow(linha);
        }
        
    }//GEN-LAST:event_formWindowOpened

    //Remover elemento
    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        
        
        ServicoDAO servicoDAO = new ServicoDAO();
        ArrayList<Servico> listaServicos = servicoDAO.listar();
        
        //Me retorna um inteiro com o numero da linha que está selecionada
        int indiceLinha = tbListaServicos.getSelectedRow();
        
        //Me retorna o código do serviço
        int codigo = (int) tbListaServicos.getValueAt(indiceLinha, 0);
        
        //Exclui a linha do JTable
        ((DefaultTableModel) tbListaServicos.getModel()).removeRow(tbListaServicos.getSelectedRow());
        
        //Exclui a linha do BAnco
        boolean retorno = servicoDAO.remover(codigo);
        
        if (retorno == true) {
            JOptionPane.showMessageDialog(
                    null, 
                    "Servico removido com sucesso!", 
                    "Sucesso!", 
                    JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(
                    null, 
                    "Não foi possível remover o servico!", 
                    "Error!", 
                    JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnExcluirActionPerformed

    //Cadastrar ítem
    private void btnCadastrarServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarServicoActionPerformed
        try {
            int flagcadastrar = 1;
            FormularioServico formularioServico = new FormularioServico();
            formularioServico.setVisible(true);
        } catch (Exception e) {
            System.out.println("Erro no cadastro");
        }
        
        
    }//GEN-LAST:event_btnCadastrarServicoActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed

        ServicoDAO servicoDAO = new ServicoDAO();
        ArrayList<Servico> listaServicos = servicoDAO.listar();
        
        DefaultTableModel tbModel = (DefaultTableModel) tbListaServicos.getModel();
        
        tbModel.setRowCount(0);
        
        for (Servico servico : listaServicos){
            Object[] linha = new Object[3];
            linha[0] = servico.getid_servico();
            linha[1] = servico.getcategoria_servico();
            linha[2] = servico.getdescricao_servico();
            tbModel.addRow(linha);
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        ServicoDAO servicoDAO = new ServicoDAO();
        
        //Me retorna um inteiro com o numero da linha que está selecionada
        int indiceLinha = tbListaServicos.getSelectedRow();
        
        //Vai aparecer uma mensagem se o usuário não selecionar uma linha
        if (indiceLinha < 0){
            JOptionPane.showMessageDialog(null, "Você precisa selecionar uma linha", "Erro!", JOptionPane.ERROR_MESSAGE);
        }

        //Me retorna o codigo do serviço
        int codigo = (int) tbListaServicos.getValueAt(indiceLinha, 0);
        
        //Me retorna a lista selecionada
        ArrayList<Servico> retorno = servicoDAO.retornaDados(codigo);
        
        int flagalterar = 2;
        FormularioServico formularioServico = new FormularioServico();
        formularioServico.setAtuacao(Acao.ALTERAR);
        formularioServico.enviaDados(retorno, codigo);
        formularioServico.setVisible(true);
       
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
            java.util.logging.Logger.getLogger(ListaServicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaServicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaServicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaServicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaServicos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPesquisa;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbListaServicos;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables

}
