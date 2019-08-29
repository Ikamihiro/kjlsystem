
package alg.jkl.system.view;

import alg.jkl.system.models.Cliente;
import alg.jkl.system.models.Contrato;
import alg.jkl.system.models.Profissional;
import alg.jkl.system.models.Servico;
import alg.jkl.system.models.dao.ClienteDAO;
import alg.jkl.system.models.dao.ContratoDAO;
import alg.jkl.system.models.dao.ProfissionalDAO;
import alg.jkl.system.models.dao.ServicoDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FormularioContrato extends javax.swing.JFrame {

    //A Atuacao serve para definir se a classe vai ser usada para cadastrar ou alterar
    
    public FormularioContrato() {
        initComponents();
        cbxServico_Contrato.removeAllItems();
        cbxCliente_Contrato.removeAllItems();
        cbxProfissional_Contrato.removeAllItems();
    }
    
    int newflag = 0;
    public void passaflag (int flag){
        newflag = flag;
    }
    
    //Metodo que passa o item para ser alterado
    ArrayList<Contrato> retorno = null;

    //Pega o item da lista a ser alterado e o seu id_servico
    int newcode = 0;

    public void enviaDados(ArrayList alteraDados, int codigo) {
        ServicoDAO servicoDAO = new ServicoDAO();
        retorno = servicoDAO.retornaDados(codigo);
        newcode = codigo;
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbxServico_Contrato = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbxCliente_Contrato = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        cbxProfissional_Contrato = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        txtValor_Contrato = new javax.swing.JTextField();
        cancelarBotao = new javax.swing.JButton();
        cadastrarBotao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Contratos");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        cbxServico_Contrato.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setText("Serviços:");

        jLabel2.setText("Clientes:");

        cbxCliente_Contrato.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setText("Profissionais:");

        cbxProfissional_Contrato.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setText("Valor do serviço:");

        cancelarBotao.setText("Cancelar");
        cancelarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBotaoActionPerformed(evt);
            }
        });

        cadastrarBotao.setText("Salvar");
        cadastrarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarBotaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxProfissional_Contrato, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbxCliente_Contrato, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbxServico_Contrato, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cancelarBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cadastrarBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtValor_Contrato, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 226, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxServico_Contrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxCliente_Contrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxProfissional_Contrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValor_Contrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelarBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastrarBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //Preenchendo o ComboBox (DropDown) com descrições de servicos
        ServicoDAO servicoDAO = new ServicoDAO();
        ArrayList<Servico> listaServicos = servicoDAO.listar();
        for (Servico servico : listaServicos){
            cbxServico_Contrato.addItem(servico.getid_servico());
        }
        //Preenchendo o ComboBox (DropDown) com nomes de clientes
        ClienteDAO clienteDAO = new ClienteDAO();
        ArrayList<Cliente> listaClientes = clienteDAO.listar();
        for (Cliente cliente : listaClientes){
            cbxCliente_Contrato.addItem(cliente.getId_cliente());
        }
        //Preenchendo o ComboBox (DropDown) com nomes de profissionais
        ProfissionalDAO profissionalDAO = new ProfissionalDAO();
        ArrayList<Profissional> listaProfissionais = profissionalDAO.listar();
        for (Profissional profissional : listaProfissionais){
            cbxProfissional_Contrato.addItem(profissional.getId_profissional());
        }
        
        

    }//GEN-LAST:event_formWindowOpened

    private void cancelarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBotaoActionPerformed
        dispose();
    }//GEN-LAST:event_cancelarBotaoActionPerformed

    private void cadastrarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarBotaoActionPerformed
        
            int servico_contrato = (int) cbxServico_Contrato.getSelectedItem();
            int cliente_contrato = (int) cbxCliente_Contrato.getSelectedItem();
            int profissional_contrato = (int) cbxProfissional_Contrato.getSelectedItem();

            ContratoDAO contratoDAO = new ContratoDAO();
            Contrato novoContrato = new Contrato();
            
            
            

        //Se o flag == 1, ele vai cadastrar
         if (newflag == 1){
            
            novoContrato.setid_servico(servico_contrato);
            novoContrato.setId_cliente(cliente_contrato);
            novoContrato.setid_profissional(profissional_contrato);
            novoContrato.setvalor_contrato(Float.parseFloat(txtValor_Contrato.getText()));
             
            boolean retorno = contratoDAO.cadastrar((Object) novoContrato);
            System.out.println("Alolol");
            if (retorno == true) {
                JOptionPane.showMessageDialog(null, "Contrato cadastrado com sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(null, "Não foi possível cadastrar contrato!", "Erro!", JOptionPane.ERROR_MESSAGE);
            }
            dispose();
            //Se o flag == 2, ele vai alterar
        } else {

            
            novoContrato.setid_servico(servico_contrato);
            novoContrato.setId_cliente(cliente_contrato);
            novoContrato.setid_profissional(profissional_contrato);
            novoContrato.setvalor_contrato(Float.parseFloat(txtValor_Contrato.getText()));
            
            boolean retorno = contratoDAO.alterar((Object) novoContrato, newcode);

            if (retorno == true) {
                JOptionPane.showMessageDialog(null, "Contrato alterado com sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(null, "Não foi possível alterar contrato!", "Erro!", JOptionPane.ERROR_MESSAGE);
            }
            dispose();
        }
    }//GEN-LAST:event_cadastrarBotaoActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormularioContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioContrato().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrarBotao;
    private javax.swing.JButton cancelarBotao;
    private javax.swing.JComboBox cbxCliente_Contrato;
    private javax.swing.JComboBox cbxProfissional_Contrato;
    private javax.swing.JComboBox cbxServico_Contrato;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtValor_Contrato;
    // End of variables declaration//GEN-END:variables
}
