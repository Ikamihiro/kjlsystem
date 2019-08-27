package alg.jkl.system.view;
import alg.jkl.system.models.Servico;
import alg.jkl.system.models.dao.ServicoDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FormularioServico extends javax.swing.JFrame {
    
    //A flag serve para definir se a classe vai ser usada para cadastrar ou alterar
    //Aqui ele pega a flag passada na ListaServicos
    int newflag = 0;
    public void passaflag (int flag){
        newflag = flag;
    }
    
    public FormularioServico() {
        initComponents();  
        cbxCategoria.removeAllItems();
    }
    
    //Metodo que passa o item para ser alterado
        ArrayList<Servico> retorno = null;
    
    //Pega o item da lista a ser alterado e o seu id_servico
    int newcode = 0;
    public void enviaDados(ArrayList alteraDados, int codigo){
        ServicoDAO servicoDAO = new ServicoDAO();
        retorno = servicoDAO.retornaDados(codigo);
        newcode = codigo;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtDescricao = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbxCategoria = new javax.swing.JComboBox<>();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Serviços");
        setBackground(new java.awt.Color(51, 51, 51));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        txtDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoActionPerformed(evt);
            }
        });

        jLabel1.setText("Descrição");

        jLabel2.setText("Categoria");

        cbxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnSalvar.setBackground(new java.awt.Color(0, 51, 255));
        btnSalvar.setForeground(new java.awt.Color(204, 204, 204));
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(102, 0, 0));
        btnCancelar.setForeground(new java.awt.Color(204, 204, 204));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDescricao)
                            .addComponent(cbxCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 47, Short.MAX_VALUE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescricaoActionPerformed

    //Botão Salvar
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
    
    //Se o flag == 1, ele vai cadastrar
    if (newflag == 1){
            String categoria = cbxCategoria.getSelectedItem().toString();

            ServicoDAO servicoDAO = new ServicoDAO();
            Servico novoServico = new Servico();

            novoServico.setcategoria_servico(categoria);
            novoServico.setdescricao_servico(txtDescricao.getText());

            boolean retorno = servicoDAO.cadastrar(novoServico);

            if (retorno == true) {
                JOptionPane.showMessageDialog(null, "Serviço cadastrado com sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);


            }else {
                JOptionPane.showMessageDialog(null, "Não foi possível cadastrar serviço!", "Erro!", JOptionPane.ERROR_MESSAGE);
            }
            dispose();
    //Se o flag == 2, ele vai alterar
    }else{
        String categoria = cbxCategoria.getSelectedItem().toString();

            ServicoDAO servicoDAO = new ServicoDAO();
            Servico servicoAlterado = new Servico();

            servicoAlterado.setcategoria_servico(categoria);
            servicoAlterado.setdescricao_servico(txtDescricao.getText());

            boolean retorno = servicoDAO.alterar(servicoAlterado, newcode);

            if (retorno == true) {
                JOptionPane.showMessageDialog(null, "Serviço alterado com sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);


            }else {
                JOptionPane.showMessageDialog(null, "Não foi possível alterar serviço!", "Erro!", JOptionPane.ERROR_MESSAGE);
            }
            dispose();
    }
       
    }//GEN-LAST:event_btnSalvarActionPerformed

    //Botão Cancelar
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    //Ao abrir a janela de Formulario
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //Se o flag == 1, o Dropdown vai aparecer as opções 
        if (newflag == 1){
            cbxCategoria.addItem("Hardware");
            cbxCategoria.addItem("Software");    
        }else{
            //#####Gambiarra
            for (Servico servico : retorno){
                cbxCategoria.addItem(servico.getcategoria_servico());
                txtDescricao.setText(servico.getdescricao_servico());
                if (servico.getcategoria_servico() == "Hardware"){
                    cbxCategoria.addItem("Software");
                }else{
                    cbxCategoria.addItem("Hardware");
                }
            }
        }
    }//GEN-LAST:event_formWindowOpened

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
        java.util.logging.Logger.getLogger(FormularioServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger(FormularioServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger(FormularioServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(FormularioServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new FormularioServico().setVisible(true);
        }
    });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cbxCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtDescricao;
    // End of variables declaration//GEN-END:variables
}
