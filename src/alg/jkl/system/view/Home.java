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
        panelDadosAcoes = new javax.swing.JPanel();
        servicosLabel = new javax.swing.JLabel();
        servicosDados = new javax.swing.JLabel();
        contratosLabel = new javax.swing.JLabel();
        contratosDados = new javax.swing.JLabel();
        panelDadosUsuarios = new javax.swing.JPanel();
        usuariosLabel = new javax.swing.JLabel();
        usuariosDados = new javax.swing.JLabel();
        panelDadosEntidades = new javax.swing.JPanel();
        clientesLabel = new javax.swing.JLabel();
        clientesDados = new javax.swing.JLabel();
        profissionaisLabel = new javax.swing.JLabel();
        profissionaisDados = new javax.swing.JLabel();
        atualizarDados = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();

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

        servicosCall.setBackground(new java.awt.Color(0, 102, 255));
        servicosCall.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        servicosCall.setForeground(new java.awt.Color(204, 204, 204));
        servicosCall.setText("Serviços");

        javax.swing.GroupLayout panelAcoesLayout = new javax.swing.GroupLayout(panelAcoes);
        panelAcoes.setLayout(panelAcoesLayout);
        panelAcoesLayout.setHorizontalGroup(
            panelAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAcoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(servicosCall, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contratosCall, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        profissionaisCall.setBackground(new java.awt.Color(0, 102, 255));
        profissionaisCall.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        profissionaisCall.setForeground(new java.awt.Color(204, 204, 204));
        profissionaisCall.setText("Profissionais");

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

        admCall.setBackground(new java.awt.Color(0, 102, 255));
        admCall.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        admCall.setForeground(new java.awt.Color(204, 204, 204));
        admCall.setText("Administrar");

        javax.swing.GroupLayout panelUsuariosLayout = new javax.swing.GroupLayout(panelUsuarios);
        panelUsuarios.setLayout(panelUsuariosLayout);
        panelUsuariosLayout.setHorizontalGroup(
            panelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usuariosCall, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(admCall, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        panelDadosAcoes.setBackground(new java.awt.Color(51, 51, 51));
        panelDadosAcoes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Total de Serviços e Contratos ativos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        panelDadosAcoes.setForeground(new java.awt.Color(204, 204, 204));

        servicosLabel.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        servicosLabel.setForeground(new java.awt.Color(204, 204, 204));
        servicosLabel.setText("Total de Serviços:");

        servicosDados.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        servicosDados.setForeground(new java.awt.Color(204, 204, 204));
        servicosDados.setText("30 Serviços cadastrados ativos");
        servicosDados.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        contratosLabel.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        contratosLabel.setForeground(new java.awt.Color(204, 204, 204));
        contratosLabel.setText("Total de Contratos:");

        contratosDados.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        contratosDados.setForeground(new java.awt.Color(204, 204, 204));
        contratosDados.setText("30 Serviços cadastrados ativos");
        contratosDados.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout panelDadosAcoesLayout = new javax.swing.GroupLayout(panelDadosAcoes);
        panelDadosAcoes.setLayout(panelDadosAcoesLayout);
        panelDadosAcoesLayout.setHorizontalGroup(
            panelDadosAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDadosAcoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDadosAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contratosLabel)
                    .addComponent(servicosLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDadosAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(servicosDados, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contratosDados, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelDadosAcoesLayout.setVerticalGroup(
            panelDadosAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDadosAcoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDadosAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(servicosLabel)
                    .addComponent(servicosDados, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelDadosAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contratosLabel)
                    .addComponent(contratosDados, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        panelDadosUsuarios.setBackground(new java.awt.Color(51, 51, 51));
        panelDadosUsuarios.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Total de Usuário cadastrados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        panelDadosUsuarios.setForeground(new java.awt.Color(204, 204, 204));

        usuariosLabel.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        usuariosLabel.setForeground(new java.awt.Color(204, 204, 204));
        usuariosLabel.setText("Total de Usuários:");

        usuariosDados.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        usuariosDados.setForeground(new java.awt.Color(204, 204, 204));
        usuariosDados.setText("30 Usuários cadastrados");
        usuariosDados.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout panelDadosUsuariosLayout = new javax.swing.GroupLayout(panelDadosUsuarios);
        panelDadosUsuarios.setLayout(panelDadosUsuariosLayout);
        panelDadosUsuariosLayout.setHorizontalGroup(
            panelDadosUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDadosUsuariosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(usuariosLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usuariosDados, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelDadosUsuariosLayout.setVerticalGroup(
            panelDadosUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDadosUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDadosUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usuariosLabel)
                    .addComponent(usuariosDados, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelDadosEntidades.setBackground(new java.awt.Color(51, 51, 51));
        panelDadosEntidades.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Total de Entidades ativas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        panelDadosEntidades.setForeground(new java.awt.Color(204, 204, 204));

        clientesLabel.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        clientesLabel.setForeground(new java.awt.Color(204, 204, 204));
        clientesLabel.setText("Total de Clientes:");

        clientesDados.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        clientesDados.setForeground(new java.awt.Color(204, 204, 204));
        clientesDados.setText("30 Clientes cadastrados ativos");
        clientesDados.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        profissionaisLabel.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        profissionaisLabel.setForeground(new java.awt.Color(204, 204, 204));
        profissionaisLabel.setText("Total de Profissionais:");

        profissionaisDados.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        profissionaisDados.setForeground(new java.awt.Color(204, 204, 204));
        profissionaisDados.setText("30 Profissionais cadastrados ativos");
        profissionaisDados.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout panelDadosEntidadesLayout = new javax.swing.GroupLayout(panelDadosEntidades);
        panelDadosEntidades.setLayout(panelDadosEntidadesLayout);
        panelDadosEntidadesLayout.setHorizontalGroup(
            panelDadosEntidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDadosEntidadesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDadosEntidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(profissionaisLabel)
                    .addComponent(clientesLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDadosEntidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clientesDados, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(profissionaisDados, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelDadosEntidadesLayout.setVerticalGroup(
            panelDadosEntidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDadosEntidadesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDadosEntidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clientesLabel)
                    .addComponent(clientesDados, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelDadosEntidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(profissionaisLabel)
                    .addComponent(profissionaisDados, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        atualizarDados.setBackground(new java.awt.Color(0, 102, 255));
        atualizarDados.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        atualizarDados.setForeground(new java.awt.Color(204, 204, 204));
        atualizarDados.setText("Atualizar Dados");

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelAcoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelEntidades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelDadosAcoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelDadosUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelDadosEntidades, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(atualizarDados, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelAcoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelDadosAcoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(panelDadosEntidades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelDadosUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(atualizarDados, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(panelEntidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 14, Short.MAX_VALUE))))
        );

        jMenu6.setText("File");
        jMenuBar2.add(jMenu6);

        jMenu7.setText("Edit");
        jMenuBar2.add(jMenu7);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JButton atualizarDados;
    private javax.swing.JButton clientesCall;
    private javax.swing.JLabel clientesDados;
    private javax.swing.JLabel clientesLabel;
    private javax.swing.JButton contratosCall;
    private javax.swing.JLabel contratosDados;
    private javax.swing.JLabel contratosLabel;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelAcoes;
    private javax.swing.JPanel panelDadosAcoes;
    private javax.swing.JPanel panelDadosEntidades;
    private javax.swing.JPanel panelDadosUsuarios;
    private javax.swing.JPanel panelEntidades;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelUsuarios;
    private javax.swing.JButton profissionaisCall;
    private javax.swing.JLabel profissionaisDados;
    private javax.swing.JLabel profissionaisLabel;
    private javax.swing.JButton servicosCall;
    private javax.swing.JLabel servicosDados;
    private javax.swing.JLabel servicosLabel;
    private javax.swing.JButton usuariosCall;
    private javax.swing.JLabel usuariosDados;
    private javax.swing.JLabel usuariosLabel;
    // End of variables declaration//GEN-END:variables
}
