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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
<<<<<<< HEAD:src/alg/jkl/system/view/FormularioProfissional.java
        cpfProfissional = new javax.swing.JTextField();
=======
>>>>>>> master:src/alg/jkl/system/view/CadastroProfissional.java
        nomeProfissional = new javax.swing.JTextField();
        funcaoProfissional = new javax.swing.JTextField();
        Bt_Cancelar = new javax.swing.JButton();
        Bt_Salvar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cpfCampo = new javax.swing.JTextField();

<<<<<<< HEAD:src/alg/jkl/system/view/FormularioProfissional.java
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel1.setText("cpf:");
=======
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Profissionais");
>>>>>>> master:src/alg/jkl/system/view/CadastroProfissional.java

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel3.setText("Função:");

<<<<<<< HEAD:src/alg/jkl/system/view/FormularioProfissional.java
        cpfProfissional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfProfissionalActionPerformed(evt);
            }
        });

=======
        Bt_Cancelar.setBackground(new java.awt.Color(102, 0, 0));
        Bt_Cancelar.setForeground(new java.awt.Color(204, 204, 204));
>>>>>>> master:src/alg/jkl/system/view/CadastroProfissional.java
        Bt_Cancelar.setText("Cancelar");
        Bt_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_CancelarActionPerformed(evt);
            }
        });

        Bt_Salvar.setBackground(new java.awt.Color(0, 51, 255));
        Bt_Salvar.setForeground(new java.awt.Color(204, 204, 204));
        Bt_Salvar.setText("Salvar");
        Bt_Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_SalvarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel4.setText("CPF:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeProfissional, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addComponent(funcaoProfissional)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Bt_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Bt_Salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
<<<<<<< HEAD:src/alg/jkl/system/view/FormularioProfissional.java
                    .addComponent(jLabel3)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpfProfissional, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(funcaoProfissional))
                .addContainerGap(134, Short.MAX_VALUE))
=======
                    .addComponent(cpfCampo))
                .addContainerGap(32, Short.MAX_VALUE))
>>>>>>> master:src/alg/jkl/system/view/CadastroProfissional.java
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
<<<<<<< HEAD:src/alg/jkl/system/view/FormularioProfissional.java
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cpfProfissional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
=======
>>>>>>> master:src/alg/jkl/system/view/CadastroProfissional.java
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeProfissional, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cpfCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(funcaoProfissional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bt_Cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Bt_Salvar))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

<<<<<<< HEAD:src/alg/jkl/system/view/FormularioProfissional.java
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
=======
    private void Bt_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_SalvarActionPerformed
        // TODO add your handling code here:
        Profissional profissional = new Profissional();
        ProfissionalDAO profissionalDao = new ProfissionalDAO();
         
        //profissional.setId); 
        profissional.setNome(nomeProfissional.getText());
        profissional.setFuncao(funcaoProfissional.getText());
>>>>>>> master:src/alg/jkl/system/view/CadastroProfissional.java
        
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
<<<<<<< HEAD:src/alg/jkl/system/view/FormularioProfissional.java
    private javax.swing.JTextField cpfProfissional;
    private javax.swing.JTextField funcaoProfissional;
    private javax.swing.JLabel jLabel1;
=======
    private javax.swing.JTextField cpfCampo;
    private javax.swing.JTextField funcaoProfissional;
>>>>>>> master:src/alg/jkl/system/view/CadastroProfissional.java
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField nomeProfissional;
    // End of variables declaration//GEN-END:variables
}
