package alg.jkl.system.view;

import alg.jkl.system.models.Profissional;
import alg.jkl.system.models.dao.ProfissionalDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FormularioProfissional extends javax.swing.JFrame {

    //A flag serve para definir se a classe vai ser usada para cadastrar ou alterar
    //Aqui ele pega a flag passada na ListaServicos
    int newflag = 0;
    public void passaflag (int flag){
        newflag = flag;
    }
    
    public FormularioProfissional() {
        initComponents();
    }
    
    //Metodo que passa o item para ser alterado
        ArrayList<Profissional> retorno = null;
    
    //Pega o item da lista a ser alterado e o seu id_servico
    int newcode = 0;
    public void enviaDados(ArrayList alteraDados, int codigo){
        ProfissionalDAO profissionalDao = new ProfissionalDAO();
        retorno = profissionalDao.retornaDados(codigo);
        newcode = codigo;
    }
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cpfProfissional = new javax.swing.JTextField();
        nomeProfissional = new javax.swing.JTextField();
        funcaoProfissional = new javax.swing.JTextField();
        Bt_Cancelar = new javax.swing.JButton();
        Bt_Salvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel1.setText("CPF:");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel3.setText("Função:");

        cpfProfissional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfProfissionalActionPerformed(evt);
            }
        });

        Bt_Cancelar.setText("Cancelar");
        Bt_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_CancelarActionPerformed(evt);
            }
        });

        Bt_Salvar.setText("Salvar");
        Bt_Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_SalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeProfissional, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Bt_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(Bt_Salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpfProfissional, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(funcaoProfissional))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cpfProfissional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeProfissional, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(funcaoProfissional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Bt_Salvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Bt_Cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cpfProfissionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfProfissionalActionPerformed
        
    }//GEN-LAST:event_cpfProfissionalActionPerformed

    private void Bt_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_SalvarActionPerformed
        
        //Se o flag == 1, ele vai cadastrar
    if (newflag == 1){

        ProfissionalDAO profissionalDao = new ProfissionalDAO();
        Profissional novoProfissional = new Profissional();
      
        novoProfissional.setCpf(cpfProfissional.getText()); 
        novoProfissional.setNome(nomeProfissional.getText());
        novoProfissional.setFuncao(funcaoProfissional.getText());
        
        boolean retorno = profissionalDao.cadastrar(novoProfissional);
        
        if (retorno == true) {
            JOptionPane.showMessageDialog(null, "Profissisonal cadastrado com sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
            
            
        }else {
            JOptionPane.showMessageDialog(null, "Não foi possível cadastrar profissional!", "Erro!", JOptionPane.ERROR_MESSAGE);
        }
        dispose();
      
    //Se o flag == 2, ele vai alterar
    }else{

            ProfissionalDAO profissionalDao = new ProfissionalDAO();
            Profissional profissionalAlterado = new Profissional();
            
            profissionalAlterado.setCpf(cpfProfissional.getText());
            profissionalAlterado.setNome(nomeProfissional.getText());
            profissionalAlterado.setFuncao(funcaoProfissional.getText());

            boolean retorno = profissionalDao.alterar(profissionalAlterado, newcode);

            if (retorno == true) {
                JOptionPane.showMessageDialog(null, "Profissional alterado com sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);

            }else {
                JOptionPane.showMessageDialog(null, "Não foi possível alterar Profissional!", "Erro!", JOptionPane.ERROR_MESSAGE);
            }
            dispose();
    }   
    }//GEN-LAST:event_Bt_SalvarActionPerformed

    private void Bt_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_CancelarActionPerformed
        dispose();
    }//GEN-LAST:event_Bt_CancelarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //Se o flag == 2, 
        if (newflag == 2){
            cpfProfissional.setText(retorno.get(0).getCpf());
            nomeProfissional.setText(retorno.get(0).getNome());
            funcaoProfissional.setText(retorno.get(0).getFuncao());
        }
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(FormularioProfissional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioProfissional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioProfissional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioProfissional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioProfissional().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bt_Cancelar;
    private javax.swing.JButton Bt_Salvar;
    private javax.swing.JTextField cpfProfissional;
    private javax.swing.JTextField funcaoProfissional;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField nomeProfissional;
    // End of variables declaration//GEN-END:variables
}
