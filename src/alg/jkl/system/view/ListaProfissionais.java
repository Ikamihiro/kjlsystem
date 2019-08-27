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
        bt_Alterar = new javax.swing.JButton();
        bt_Atualizar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Profissionais");
        setBackground(new java.awt.Color(22, 21, 19));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel2.setText("PROFISSIONAIS CADASTRADOS");

        pesquisa.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                pesquisaAncestorMoved(evt);
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
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
                "Identificador", "CPF", "Nome", "Função"
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

        bt_Alterar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        bt_Alterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alg/jkl/system/images/Pencil-icon.png"))); // NOI18N
        bt_Alterar.setText("Alterar");
        bt_Alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_AlterarActionPerformed(evt);
            }
        });

        bt_Atualizar.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        bt_Atualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alg/jkl/system/images/Arrow-refresh-icon.png"))); // NOI18N
        bt_Atualizar.setText("Atualizar");
        bt_Atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_AtualizarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel1.setText("Nome:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Bt_incluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Bt_Excluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt_Atualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(bt_Alterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Bt_incluir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Bt_Excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bt_Atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bt_Alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btPesquisa))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisaActionPerformed

    }//GEN-LAST:event_pesquisaActionPerformed

    private void Bt_incluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_incluirActionPerformed
        // Instancia a Frame FormularioProfissional.
        try {
            int flagcadastrar = 1;
            FormularioProfissional formularioProfissional = new FormularioProfissional();
            formularioProfissional.setVisible(true);
            formularioProfissional.passaflag(flagcadastrar);    
        } catch (Exception e) {
            System.out.println("Erro no cadastro");
        }
        
        
    }//GEN-LAST:event_Bt_incluirActionPerformed

    private void bt_AlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_AlterarActionPerformed
        
        ProfissionalDAO profissionalDao = new  ProfissionalDAO();
        
        //Retorna um inteiro com o numero da linha que está selecionada
        int indiceLinha = tbListaProfissionais.getSelectedRow();
<<<<<<< HEAD
        
        //Paresenta uma mensagem se o usuário não selecionar uma linha
        if (indiceLinha < 0){
            JOptionPane.showMessageDialog(null, "Você precisa selecionar uma linha", "Erro!", JOptionPane.ERROR_MESSAGE);
=======
        //Me retorna o código do serviço
        int codigo = (int) tbListaProfissionais.getValueAt(indiceLinha, 0);
        //String nomeProfissional = (String) tbListaProfissionais.getValueAt(indiceLinha, 1);
        
        String pesquisar = pesquisa.getText();
        String alteraFuncao = novaFuncao.getText();
        //Exclui a linha do JTable
        ((DefaultTableModel) tbListaProfissionais.getModel()).removeRow(tbListaProfissionais.getSelectedRow());
        System.out.println("Teste: ... "+codigo+", "+alteraFuncao);
        //Exclui a linha do BAnco
        boolean retorno = profissionalDao.alterar(codigo, alteraFuncao);
        System.out.println("Teste.....");
        if (retorno == true) {
            JOptionPane.showMessageDialog(
                    null, 
                    "Profissional alterado com sucesso!", 
                    "Sucesso!", 
                    JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(
                    null, 
                    "Não foi possível alterar o profissional!", 
                    "Error!", 
                    JOptionPane.ERROR_MESSAGE);
>>>>>>> master
        }

        //Retorna o codigo do serviço
        int codigo = (int) tbListaProfissionais.getValueAt(indiceLinha, 0);
        
        //Retorna a lista selecionada
        ArrayList<Profissional> retorno = profissionalDao.retornaDados(codigo);
        
        //Chama o formulario Profissional para alterar os dados desejados 
        int flagalterar = 2;
        FormularioProfissional formularioProfissional = new FormularioProfissional();
        
        formularioProfissional.enviaDados(retorno, codigo);
        formularioProfissional.setVisible(true);
        formularioProfissional.passaflag(flagalterar);
        
    }//GEN-LAST:event_bt_AlterarActionPerformed

    
    
    private void bt_AtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_AtualizarActionPerformed
        
        // Chama o ProfissionalDAO e sua função listra
        ProfissionalDAO profissionalDao = new ProfissionalDAO();
        ArrayList<Profissional> listaProfissionais = profissionalDao.listar();
        
        // Declara tabela tbModel, que recebe a formatação da tbListaProfissionais
        DefaultTableModel tbModel = (DefaultTableModel) tbListaProfissionais.getModel();
        
        tbModel.setRowCount(0);
        
        // O laço for percorre a lista de profissionais que retornou do BD no ProfissionalDAO
        // Insere os dados de cada profissional doda listad de profissionais na tbModel 
        // E indiretamente também na tbListaProfissionais.
        for (Profissional profissional : listaProfissionais){
<<<<<<< HEAD
            Object[] linha = new Object[4];
=======
           Object[] linha = new Object[3];
>>>>>>> master
            linha[0] = profissional.getId_profissional();
            linha[1] = profissional.getCpf();
            linha[2] = profissional.getNome();
            linha[3] = profissional.getFuncao();
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
        
        boolean retorno = profissionalDao.remover(codigo);
        
        System.out.println("Teste.....");
        if (retorno == true) {
            JOptionPane.showMessageDialog(
                    null, 
                    "Profissional alterado com sucesso!", 
                    "Sucesso!", 
                    JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(
                    null, 
                    "Não foi possível alterar o profissional!", 
                    "Error!", 
                    JOptionPane.ERROR_MESSAGE);
        }        
    }//GEN-LAST:event_Bt_ExcluirActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // Chama o ProfissionalDAO e sua função listar
        ProfissionalDAO profissionalDao = new ProfissionalDAO();
        ArrayList<Profissional> listaProfissionais = profissionalDao.listar();
        
        // Declara tabela tbModel, que recebe a formatação da tbListaProfissionais
        DefaultTableModel tbModel = (DefaultTableModel) tbListaProfissionais.getModel();
        
        tbModel.setRowCount(0);
        
        // O laço for percorre a lista de profissionais que retornou do BD no ProfissionalDAO
        // Insere os dados de cada profissional doda listad de profissionais na tbModel 
        // E indiretamente também na tbListaProfissionais. 
        for (Profissional profissional : listaProfissionais){
            Object[] linha = new Object[4];
            linha[0] = profissional.getId_profissional();
<<<<<<< HEAD
            linha[1] = profissional.getCpf();
=======
>>>>>>> master
            linha[2] = profissional.getNome();
            linha[3] = profissional.getFuncao();
            tbModel.addRow(linha);
        }
    }//GEN-LAST:event_formWindowOpened

    
    private void btPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisaActionPerformed
        // Pega o nome a pesquisar digitado na tela de ListaProfissionais e guarda em pesquisar
        String pesquisar = pesquisa.getText(); 
        
        // Chama o ProfissionalDAO e sua função pesquiar
        ProfissionalDAO profissionalDao = new ProfissionalDAO();
        ArrayList<Profissional> pesquisaProfissionais = profissionalDao.pesquisar(pesquisar);
        
        // Declara tabela tbModel, que recebe a formatação da tbListaProfissionais
        DefaultTableModel tbModel = (DefaultTableModel) tbListaProfissionais.getModel();
        
        tbModel.setRowCount(0);
        
        // O laço for percorre a lista de profissionais que retornou do BD no ProfissionalDAO
        // Insere os dados de cada profissional doda listad de profissionais na tbModel 
        // E indiretamente também na tbListaProfissionais.
        for (Profissional profissional : pesquisaProfissionais){
            Object[] linha = new Object[4];
            linha[0] = profissional.getId_profissional();
<<<<<<< HEAD
            linha[1] = profissional.getCpf();
=======
>>>>>>> master
            linha[2] = profissional.getNome();
            linha[3] = profissional.getFuncao();
            tbModel.addRow(linha);
        }
<<<<<<< HEAD

=======
>>>>>>> master
    }//GEN-LAST:event_btPesquisaActionPerformed

    private void pesquisaAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_pesquisaAncestorMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_pesquisaAncestorMoved

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
    private javax.swing.JButton bt_Alterar;
    private javax.swing.JButton bt_Atualizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField pesquisa;
    private javax.swing.JTable tbListaProfissionais;
    // End of variables declaration//GEN-END:variables

  
    private void passaflag(int flag) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
