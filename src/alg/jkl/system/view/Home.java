    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alg.jkl.system.view;

/**
 *
 * @author joao
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        panelPrincipal = new javax.swing.JPanel();
        panelAcoes = new javax.swing.JPanel();
        contratosCall = new javax.swing.JButton();
        servicosCall = new javax.swing.JButton();
        panelEntidades = new javax.swing.JPanel();
        clientesCall = new javax.swing.JButton();
        profissionaisCall = new javax.swing.JButton();
        panelUsuarios = new javax.swing.JPanel();
        usuariosCall = new javax.swing.JButton();
        admCall = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Início");
        setBackground(new java.awt.Color(51, 51, 51));
        setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        setIconImages(null);
        setName("frameInicio"); // NOI18N
        setSize(new java.awt.Dimension(733, 439));

        panelPrincipal.setBackground(new java.awt.Color(51, 51, 51));
        panelPrincipal.setForeground(new java.awt.Color(255, 255, 255));

        panelAcoes.setBackground(new java.awt.Color(51, 51, 51));
        panelAcoes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ações do sistema", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        panelAcoes.setForeground(new java.awt.Color(255, 255, 255));

        contratosCall.setBackground(new java.awt.Color(0, 102, 255));
        contratosCall.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        contratosCall.setForeground(new java.awt.Color(204, 204, 204));
        contratosCall.setText("Contratos");
        contratosCall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contratosCallActionPerformed(evt);
            }
        });

        servicosCall.setBackground(new java.awt.Color(0, 102, 255));
        servicosCall.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        servicosCall.setForeground(new java.awt.Color(204, 204, 204));
        servicosCall.setText("Serviços");
        servicosCall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                servicosCallActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAcoesLayout = new javax.swing.GroupLayout(panelAcoes);
        panelAcoes.setLayout(panelAcoesLayout);
        panelAcoesLayout.setHorizontalGroup(
            panelAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAcoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(servicosCall, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contratosCall, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelAcoesLayout.setVerticalGroup(
            panelAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAcoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(servicosCall, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contratosCall, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelEntidades.setBackground(new java.awt.Color(51, 51, 51));
        panelEntidades.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Entidades do sistema", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        panelEntidades.setForeground(new java.awt.Color(255, 255, 255));

        clientesCall.setBackground(new java.awt.Color(0, 102, 255));
        clientesCall.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        clientesCall.setForeground(new java.awt.Color(204, 204, 204));
        clientesCall.setText("Clientes");
        clientesCall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientesCallActionPerformed(evt);
            }
        });

        profissionaisCall.setBackground(new java.awt.Color(0, 102, 255));
        profissionaisCall.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        profissionaisCall.setForeground(new java.awt.Color(204, 204, 204));
        profissionaisCall.setText("Profissionais");
        profissionaisCall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profissionaisCallActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelEntidadesLayout = new javax.swing.GroupLayout(panelEntidades);
        panelEntidades.setLayout(panelEntidadesLayout);
        panelEntidadesLayout.setHorizontalGroup(
            panelEntidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEntidadesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEntidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clientesCall, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(profissionaisCall, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelEntidadesLayout.setVerticalGroup(
            panelEntidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEntidadesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(clientesCall, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(profissionaisCall, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelUsuarios.setBackground(new java.awt.Color(51, 51, 51));
        panelUsuarios.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Usuários do Sistema", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        panelUsuarios.setForeground(new java.awt.Color(255, 255, 255));

        usuariosCall.setBackground(new java.awt.Color(0, 102, 255));
        usuariosCall.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        usuariosCall.setForeground(new java.awt.Color(204, 204, 204));
        usuariosCall.setText("Usuário");
        usuariosCall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuariosCallActionPerformed(evt);
            }
        });

        admCall.setBackground(new java.awt.Color(0, 102, 255));
        admCall.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        admCall.setForeground(new java.awt.Color(204, 204, 204));
        admCall.setText("Administrar");
        admCall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admCallActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelUsuariosLayout = new javax.swing.GroupLayout(panelUsuarios);
        panelUsuarios.setLayout(panelUsuariosLayout);
        panelUsuariosLayout.setHorizontalGroup(
            panelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usuariosCall, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(admCall, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelUsuariosLayout.setVerticalGroup(
            panelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(usuariosCall, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(admCall, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alg/jkl/system/images/logo_semfundo.png"))); // NOI18N

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(panelUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelAcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelEntidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(81, 81, 81))))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelAcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelEntidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addComponent(panelUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void admCallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admCallActionPerformed
        UsuarioAdmin admin = new UsuarioAdmin();
        admin.setVisible(true);
    }//GEN-LAST:event_admCallActionPerformed

    private void usuariosCallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuariosCallActionPerformed
        CadastroUsuario cadastrouser = new CadastroUsuario();
        cadastrouser.setVisible(true);
    }//GEN-LAST:event_usuariosCallActionPerformed

    private void servicosCallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_servicosCallActionPerformed
        ListaServicos listaServicos = new ListaServicos();
        listaServicos.setVisible(true);
    }//GEN-LAST:event_servicosCallActionPerformed

    private void profissionaisCallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profissionaisCallActionPerformed
        // TODO add your handling code here:
        ListaProfissionais profissional = new ListaProfissionais();
        profissional.setVisible(true);
    }//GEN-LAST:event_profissionaisCallActionPerformed

    private void clientesCallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientesCallActionPerformed
        // TODO add your handling code here:
        ListaCliente cliente = new ListaCliente();
        cliente.setVisible(true);
    }//GEN-LAST:event_clientesCallActionPerformed

    private void contratosCallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contratosCallActionPerformed
        ListaContratos lista = new ListaContratos   ();
        lista.setVisible(true);
    }//GEN-LAST:event_contratosCallActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton admCall;
    private javax.swing.JButton clientesCall;
    private javax.swing.JButton contratosCall;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelAcoes;
    private javax.swing.JPanel panelEntidades;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelUsuarios;
    private javax.swing.JButton profissionaisCall;
    private javax.swing.JButton servicosCall;
    private javax.swing.JButton usuariosCall;
    // End of variables declaration//GEN-END:variables
}
