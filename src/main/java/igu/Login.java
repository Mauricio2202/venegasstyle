
package igu;

import controller.CConnection;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Login extends javax.swing.JFrame {
    private CardLayout cardLayout; private JPanel panelModules;
    
    Image userIcon = Toolkit.getDefaultToolkit().createImage("D:\\Java\\NetbeansProjects\\VenegasStyleS\\src\\main\\java\\igu\\iconUser.png");
    Image masIcon = Toolkit.getDefaultToolkit().createImage("D:\\Java\\NetbeansProjects\\VenegasStyleS\\src\\main\\java\\igu\\mas.png");
    Image menosIcon = Toolkit.getDefaultToolkit().createImage("D:\\Java\\NetbeansProjects\\VenegasStyleS\\src\\main\\java\\igu\\menos.png");
    Image fondo = Toolkit.getDefaultToolkit().createImage("D:\\Java\\NetbeansProjects\\VenegasStyleS\\src\\main\\java\\igu\\fondo.png");

    private int contadorPiezas = 0;
    private int contadorPiezasEditar = 0;
    
    public Login() {
        initComponents();        
        btnIniciar.addActionListener(this::btnIniciarActionPerformed);
    
        tabbedPane.setEnabledAt(1, false);
        tabbedPane.setEnabledAt(2, false);
        this.setLocationRelativeTo(this);
        
        userIcon = userIcon.getScaledInstance(165, 165, 1);
        masIcon = masIcon.getScaledInstance(20, 20, 1);
        menosIcon = menosIcon.getScaledInstance(20, 20, 1);
        fondo = fondo.getScaledInstance(713, 570, 1);
        
        this.icon.setIcon(new ImageIcon(userIcon));
        this.lblMas.setIcon(new ImageIcon(masIcon));
        this.lblMasEditar.setIcon(new ImageIcon(masIcon));
        this.lblMenos.setIcon(new ImageIcon(menosIcon));
        this.lblMenosEditar.setIcon(new ImageIcon(menosIcon));
        this.jLabel5.setIcon(new ImageIcon(fondo));
        
        this.cmbMaterial.addItem("Accesorios");
        this.cmbMaterial.addItem("Botones");
        this.cmbMaterial.addItem("Broches");
        this.cmbMaterial.addItem("Encajes");
        this.cmbMaterial.addItem("Etiquetas");
        this.cmbMaterial.addItem("Herramientas");
        this.cmbMaterial.addItem("Hilo");
        this.cmbMaterial.addItem("Lazos");
        
        this.cmbMaterialEditar.addItem("Accesorios");
        this.cmbMaterialEditar.addItem("Botones");
        this.cmbMaterialEditar.addItem("Broches");
        this.cmbMaterialEditar.addItem("Encajes");
        this.cmbMaterialEditar.addItem("Etiquetas");
        this.cmbMaterialEditar.addItem("Herramientas");
        this.cmbMaterialEditar.addItem("Hilo");
        this.cmbMaterialEditar.addItem("Lazos");
        
        this.cmbTela.addItem("Acrílico");
        this.cmbTela.addItem("Algodón");
        this.cmbTela.addItem("Cuero");
        this.cmbTela.addItem("Lana");
        this.cmbTela.addItem("Lana metálica");
        this.cmbTela.addItem("Liso tuke");
        this.cmbTela.addItem("Mónaco colombiano");
        this.cmbTela.addItem("Nylon");
        
        this.cmbTelaEditar.addItem("Acrílico");
        this.cmbTelaEditar.addItem("Algodón");
        this.cmbTelaEditar.addItem("Cuero");
        this.cmbTelaEditar.addItem("Lana");
        this.cmbTelaEditar.addItem("Lana metálica");
        this.cmbTelaEditar.addItem("Liso tuke");
        this.cmbTelaEditar.addItem("Mónaco colombiano");
        this.cmbTelaEditar.addItem("Nylon");
        
        this.cmbVestido.addItem("Vestido coctelero");
        this.cmbVestido.addItem("Vestido cuello halter");
        this.cmbVestido.addItem("Vestido sin espalda");
        this.cmbVestido.addItem("Vestido en V");
        this.cmbVestido.addItem("Vestido halter con espalda");
        this.cmbVestido.addItem("Vestido halter cruzado");
        this.cmbVestido.addItem("Vestido con abertura");
        
        this.cmbVestidoEditar.addItem("Vestido coctelero");
        this.cmbVestidoEditar.addItem("Vestido cuello halter");
        this.cmbVestidoEditar.addItem("Vestido sin espalda");
        this.cmbVestidoEditar.addItem("Vestido en V");
        this.cmbVestidoEditar.addItem("Vestido halter con espalda");
        this.cmbVestidoEditar.addItem("Vestido halter cruzado");
        this.cmbVestidoEditar.addItem("Vestido con abertura");
        
        this.cmbPlantilla.addItem("Forro Falda frente");
        this.cmbPlantilla.addItem("Falta posterior");
        this.cmbPlantilla.addItem("Faldón Espalda");
        this.cmbPlantilla.addItem("Manga izquierda");
        this.cmbPlantilla.addItem("Manga derecha");
        this.cmbPlantilla.addItem("Cuello Busto");
        this.cmbPlantilla.addItem("Derecho Busto");
        this.cmbPlantilla.addItem("Izquierdo Busco");
        this.cmbPlantilla.addItem("Completo Bolero");
        this.cmbPlantilla.addItem("Chal");
    }
   
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        txtContrasenia = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        btnIniciar = new javax.swing.JButton();
        icon = new javax.swing.JLabel();
        pswContrasenia = new javax.swing.JPasswordField();
        lblRecuperarContrasenia = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtApp = new javax.swing.JTextField();
        txtApm = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNumExtension = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        correo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        pswContra = new javax.swing.JPasswordField();
        tabbedPane = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtNombreModelo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtFolioModelo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        dteIngreso = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        cmbTela = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        cmbVestido = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        cmbMaterialEditar = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtBuscarModelo = new javax.swing.JTextField();
        txtBuscarNombre = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnCancelarBuscar = new javax.swing.JButton();
        lblResultado = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtNumeroEditar = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtNombreEditar = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        dteFechaEditar = new com.toedter.calendar.JDateChooser();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        cmbTelaEditar = new javax.swing.JComboBox<>();
        cmbVestidoEditar = new javax.swing.JComboBox<>();
        cmbMaterial = new javax.swing.JComboBox<>();
        btnEditar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        txtFolioPlantilla = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        lblMas = new javax.swing.JLabel();
        btnGuardarPlantilla = new javax.swing.JButton();
        btnCancelarPlantilla = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        cmbPlantilla = new javax.swing.JComboBox<>();
        jLabel39 = new javax.swing.JLabel();
        txtBuscarPlantilla = new javax.swing.JTextField();
        btnBuscarPlantilla = new javax.swing.JButton();
        btnCancelarBP = new javax.swing.JButton();
        lblMenos = new javax.swing.JLabel();
        lblMasEditar = new javax.swing.JLabel();
        lblMenosEditar = new javax.swing.JLabel();
        lblContador = new javax.swing.JLabel();
        lblContadorEditar = new javax.swing.JLabel();
        lblResultadoPlantilla = new javax.swing.JLabel();
        btnEditarPlantilla = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txtContrasenia.setBackground(new java.awt.Color(157, 23, 51));
        txtContrasenia.setForeground(new java.awt.Color(204, 0, 0));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(" LOGIN DE USUARIO");

        txtUsuario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnIniciar.setText("INICIAR");
        btnIniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        lblRecuperarContrasenia.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblRecuperarContrasenia.setForeground(new java.awt.Color(255, 255, 255));
        lblRecuperarContrasenia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRecuperarContrasenia.setText("Recuperar contraseña");
        lblRecuperarContrasenia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRecuperarContrasenia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRecuperarContraseniaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout txtContraseniaLayout = new javax.swing.GroupLayout(txtContrasenia);
        txtContrasenia.setLayout(txtContraseniaLayout);
        txtContraseniaLayout.setHorizontalGroup(
            txtContraseniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtContraseniaLayout.createSequentialGroup()
                .addGroup(txtContraseniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(txtContraseniaLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(txtContraseniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(txtContraseniaLayout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(txtContraseniaLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(txtContraseniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                            .addComponent(pswContrasenia)
                            .addComponent(lblRecuperarContrasenia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1))))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        txtContraseniaLayout.setVerticalGroup(
            txtContraseniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtContraseniaLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(pswContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblRecuperarContrasenia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Login", txtContrasenia);

        jPanel3.setBackground(new java.awt.Color(157, 23, 51));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("REGISTRAR USUARIO");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Apellido Paterno");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Apellido Materno");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Número de extensión");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Correo");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Contraseña");

        jButton2.setText("Cancelar");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        pswContra.setText("jPasswordField1");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel2)
                        .addGap(0, 39, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNombre)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtApp, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                                .addComponent(txtApm, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                                .addComponent(txtNumExtension, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(correo, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                            .addComponent(pswContra))))
                .addGap(54, 54, 54))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addGap(32, 32, 32)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtApp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtApm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNumExtension, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pswContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(btnGuardar))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Registro", jPanel3);

        tabbedPane.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 713, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
        );

        tabbedPane.addTab("Bienvenido", jPanel2);

        jPanel1.setBackground(new java.awt.Color(157, 23, 51));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel10.setText("Número de modelo:");

        jLabel11.setText("Nombre del modelo:");

        jLabel12.setText("Folio del modelo:");

        jLabel13.setText("Fecha de ingreso:");

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Agregar modelo");

        jLabel21.setText("Tipo de tela:");

        jLabel22.setText("Tipo de vestido:");

        jLabel23.setText("Tipo de material:");

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Buscar modelo");

        jLabel24.setText("Folio del modelo:");

        jLabel25.setText("Nombre del modelo:");

        btnBuscar.setText("Buscar");
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnCancelarBuscar.setText("Cancelar");
        btnCancelarBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelarBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarBuscarActionPerformed(evt);
            }
        });

        lblResultado.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel17.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Editar modelo");

        jLabel18.setText("Número de modelo:");

        jLabel19.setText("Nombre del modelo:");

        jLabel20.setText("Folio del modelo:");

        jLabel26.setText("Fecha de ingreso:");

        jLabel27.setText("Tipo de tela:");

        jLabel28.setText("Tipo de vestido:");

        jLabel29.setText("Tipo de material:");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cmbVestido, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtBuscarModelo))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnCancelarBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtBuscarNombre))))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cmbMaterial, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel13)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel12))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtFolioModelo)
                                        .addComponent(txtNombreModelo)
                                        .addComponent(dteIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(cmbTela, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addGap(67, 67, 67)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cmbMaterialEditar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(cmbVestidoEditar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(jLabel26)
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addComponent(jLabel18)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtNumeroEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel19)
                                                    .addComponent(jLabel20))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jTextField8)
                                                    .addComponent(txtNombreEditar)
                                                    .addComponent(dteFechaEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(cmbTelaEditar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(24, Short.MAX_VALUE))))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel17))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtNombreModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtFolioModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(dteIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(cmbTela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(cmbVestido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(cmbMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(txtNumeroEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(txtNombreEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26)
                            .addComponent(dteFechaEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(cmbTelaEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(cmbVestidoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(cmbMaterialEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregar)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(txtBuscarModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(txtBuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBuscar)
                            .addComponent(btnCancelarBuscar))
                        .addContainerGap(32, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabbedPane.addTab("Modelo", jPanel1);

        jPanel4.setBackground(new java.awt.Color(157, 23, 51));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel30.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Agregar plantilla");

        jLabel31.setText("Folio de la plantilla:");

        jLabel32.setText("Número de piezas:");

        lblMas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblMas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMasMouseClicked(evt);
            }
        });

        btnGuardarPlantilla.setText("Guardar");
        btnGuardarPlantilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarPlantillaActionPerformed(evt);
            }
        });

        btnCancelarPlantilla.setText("Cancelar");
        btnCancelarPlantilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarPlantillaActionPerformed(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("Editar plantilla");

        jLabel36.setText("Número de piezas:");

        jLabel39.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("Buscar plantilla");

        txtBuscarPlantilla.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnBuscarPlantilla.setText("Buscar");
        btnBuscarPlantilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPlantillaActionPerformed(evt);
            }
        });

        btnCancelarBP.setText("Cancelar");
        btnCancelarBP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarBPActionPerformed(evt);
            }
        });

        lblMenos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblMenos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenosMouseClicked(evt);
            }
        });

        lblMasEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblMasEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMasEditarMouseClicked(evt);
            }
        });

        lblMenosEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblMenosEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenosEditarMouseClicked(evt);
            }
        });

        lblContador.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblContadorEditar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblResultadoPlantilla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResultadoPlantilla.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnEditarPlantilla.setText("Editar");
        btnEditarPlantilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPlantillaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblResultadoPlantilla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(btnBuscarPlantilla, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancelarBP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnCancelarPlantilla, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel31)
                                    .addComponent(jLabel32)
                                    .addComponent(btnGuardarPlantilla, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFolioPlantilla, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(lblMas, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblContador, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(txtBuscarPlantilla))
                        .addGap(113, 113, 113)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel36)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblMasEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblMenosEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblContadorEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cmbPlantilla, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditarPlantilla, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jLabel33))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel31)
                        .addComponent(txtFolioPlantilla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel36))
                    .addComponent(lblMasEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMenosEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblContadorEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel32)
                    .addComponent(cmbPlantilla)
                    .addComponent(lblMas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMenos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblContador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGuardarPlantilla)
                            .addComponent(btnCancelarPlantilla)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btnEditarPlantilla)))
                .addGap(60, 60, 60)
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscarPlantilla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarPlantilla)
                    .addComponent(btnCancelarBP))
                .addGap(18, 18, 18)
                .addComponent(lblResultadoPlantilla, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        tabbedPane.addTab("Plantilla", jPanel4);

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Nuevo usuario");
        jMenuItem1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setText("Abrir usuario");
        jMenuItem2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem3.setText("Cerrar");
        jMenuItem3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabbedPane)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
    String username = txtUsuario.getText();
    char[] passwordArray = pswContrasenia.getPassword();
    String password = new String(passwordArray); 

    try (Connection connection = new CConnection().estableceConexion()) {
        String sql = "SELECT FK_Id_Tipo_Usuario FROM TBL_USUARIO WHERE Nombre_Usuario = ? AND Contrasenia = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, username);
        preparedStatement.setString(2, password);

        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            int userType = resultSet.getInt("FK_Id_Tipo_Usuario");

            if (userType == 1) { 
                tabbedPane.setEnabledAt(1, true); 
                tabbedPane.setSelectedIndex(1);
            } else if (userType == 2) { 
                tabbedPane.setEnabledAt(2, true); 
                tabbedPane.setSelectedIndex(2); 
            } else {
                JOptionPane.showMessageDialog(this, "Tipo de usuario no permitido.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrecta.");
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error en la conexión a la base de datos.");
    }

    }//GEN-LAST:event_btnIniciarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
    String numeroModelo = txtModelo.getText();
    String nombreModelo = txtNombreModelo.getText();
    String folioModelo = txtFolioModelo.getText();
    java.util.Date fechaIngreso = dteIngreso.getDate();
    String tipoTela = (String) cmbTela.getSelectedItem();
    String tipoVestido = (String) cmbVestido.getSelectedItem();
    String tipoMaterial = (String) cmbMaterialEditar.getSelectedItem();

    if (numeroModelo.isEmpty() || nombreModelo.isEmpty() || folioModelo.isEmpty() || fechaIngreso == null || tipoTela.isEmpty() || tipoVestido.isEmpty() || tipoMaterial.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.");
        return;
    }

    java.sql.Date sqlFechaIngreso = new java.sql.Date(fechaIngreso.getTime());

    try (Connection connection = new CConnection().estableceConexion()) {
        String sql = "INSERT INTO TBL_MODELO (Numero_Modelo, Nombre_Modelo, Folio_Modelo, Fecha_Entrada, Tipo_Tela, Tipo_Vestido, Tipo_Material) VALUES (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, Integer.parseInt(numeroModelo));
        preparedStatement.setString(2, nombreModelo);
        preparedStatement.setString(3, folioModelo);
        preparedStatement.setDate(4, sqlFechaIngreso);
        preparedStatement.setString(5, tipoTela);
        preparedStatement.setString(6, tipoVestido);
        preparedStatement.setString(7, tipoMaterial);

        int rowsInserted = preparedStatement.executeUpdate();
        if (rowsInserted > 0) {
            JOptionPane.showMessageDialog(this, "El modelo se ha agregado exitosamente.");
        } else {
            JOptionPane.showMessageDialog(this, "Error al agregar el modelo. Por favor, inténtelo de nuevo.");
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error en la conexión a la base de datos: " + e.getMessage());
    }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
    // Obtener los valores de los campos de búsqueda
    String folioModelo = txtBuscarModelo.getText();
    String nombreModelo = txtBuscarNombre.getText();

    // Verificar que al menos uno de los campos no esté vacío
    if (folioModelo.isEmpty() && nombreModelo.isEmpty()) {
        lblResultado.setText("Por favor, ingrese el folio o nombre del modelo para buscar.");
        return;
    }

    // Conexión y consulta en la base de datos
    try (Connection connection = new CConnection().estableceConexion()) {
        StringBuilder sql = new StringBuilder("SELECT * FROM TBL_MODELO WHERE ");
        boolean addAnd = false;

        if (!folioModelo.isEmpty()) {
            sql.append("Folio_Modelo = ?");
            addAnd = true;
        }
        if (!nombreModelo.isEmpty()) {
            if (addAnd) {
                sql.append(" AND ");
            }
            sql.append("Nombre_Modelo = ?");
        }

        PreparedStatement preparedStatement = connection.prepareStatement(sql.toString());

        int paramIndex = 1;
        if (!folioModelo.isEmpty()) {
            preparedStatement.setString(paramIndex++, folioModelo);
        }
        if (!nombreModelo.isEmpty()) {
            preparedStatement.setString(paramIndex++, nombreModelo);
        }

        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            // Mostrar los resultados de la búsqueda en lblResultado
            String resultado = String.format("<html>Modelo encontrado:<br/>Número: %d<br/>Nombre: %s<br/>Folio: %s<br/>Fecha de Ingreso: %s<br/>Tipo de Tela: %s<br/>Tipo de Vestido: %s<br/>Tipo de Material: %s</html>",
                    resultSet.getInt("Numero_Modelo"),
                    resultSet.getString("Nombre_Modelo"),
                    resultSet.getString("Folio_Modelo"),
                    resultSet.getDate("Fecha_Entrada").toString(),
                    resultSet.getString("Tipo_Tela"),
                    resultSet.getString("Tipo_Vestido"),
                    resultSet.getString("Tipo_Material")
            );
            lblResultado.setText(resultado);
        } else {
            lblResultado.setText("No se encontró ningún modelo con los datos proporcionados.");
        }
    } catch (SQLException e) {
        e.printStackTrace();
        lblResultado.setText("Error en la conexión a la base de datos: " + e.getMessage());
    }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCancelarBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarBuscarActionPerformed
        txtBuscarModelo.setText("");
        txtBuscarNombre.setText("");
         lblResultado.setText("");
    }//GEN-LAST:event_btnCancelarBuscarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
    // Obtener los valores de los campos
    String numeroModelo = txtNumeroEditar.getText();
    String nombreModelo = txtNombreEditar.getText();
    String folioModelo = txtBuscarModelo.getText(); // Supongamos que el folio es la clave única para buscar el modelo
    java.util.Date fechaIngreso = dteFechaEditar.getDate();
    String tipoTela = (String) cmbTelaEditar.getSelectedItem();
    String tipoVestido = (String) cmbVestidoEditar.getSelectedItem();
    String tipoMaterial = (String) cmbMaterialEditar.getSelectedItem();

    // Verificar que ningún campo esté vacío
    if (numeroModelo.isEmpty() || nombreModelo.isEmpty() || folioModelo.isEmpty() || fechaIngreso == null || tipoTela.isEmpty() || tipoVestido.isEmpty() || tipoMaterial.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.");
        return;
    }

    // Convertir java.util.Date a java.sql.Date
    java.sql.Date sqlFechaIngreso = new java.sql.Date(fechaIngreso.getTime());

    // Conexión y actualización en la base de datos
    try (Connection connection = new CConnection().estableceConexion()) {
        String sql = "UPDATE TBL_MODELO SET Numero_Modelo = ?, Nombre_Modelo = ?, Fecha_Entrada = ?, Tipo_Tela = ?, Tipo_Vestido = ?, Tipo_Material = ? WHERE Folio_Modelo = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, Integer.parseInt(numeroModelo));
        preparedStatement.setString(2, nombreModelo);
        preparedStatement.setDate(3, sqlFechaIngreso);
        preparedStatement.setString(4, tipoTela);
        preparedStatement.setString(5, tipoVestido);
        preparedStatement.setString(6, tipoMaterial);
        preparedStatement.setString(7, folioModelo); // El folio es la clave para buscar el modelo

        int rowsUpdated = preparedStatement.executeUpdate();
        if (rowsUpdated > 0) {
            JOptionPane.showMessageDialog(this, "El modelo se ha actualizado exitosamente.");
        } else {
            JOptionPane.showMessageDialog(this, "Error al actualizar el modelo. Por favor, inténtelo de nuevo.");
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error en la conexión a la base de datos: " + e.getMessage());
    }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void lblMasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMasMouseClicked
        contadorPiezas++;
        lblContador.setText(String.valueOf(contadorPiezas));
    }//GEN-LAST:event_lblMasMouseClicked

    private void lblMenosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenosMouseClicked
        if (contadorPiezas > 0) {
            contadorPiezas--;
            lblContador.setText(String.valueOf(contadorPiezas));
        }
    }//GEN-LAST:event_lblMenosMouseClicked

    private void btnGuardarPlantillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarPlantillaActionPerformed
    String folioPlantilla = txtFolioPlantilla.getText();
    int numeroPiezas = contadorPiezas;

    if (folioPlantilla.isEmpty() || numeroPiezas <= 0) {
        JOptionPane.showMessageDialog(this, "Por favor, ingrese el folio de la plantilla y asegúrese de que el número de piezas sea mayor a cero.");
        return;
    }

    try (Connection connection = new CConnection().estableceConexion()) {
        String sql = "INSERT INTO TBL_PLANTILLA (folio_plantilla, numero_piezas) VALUES (?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, folioPlantilla);
        preparedStatement.setInt(2, numeroPiezas);

        int rowsInserted = preparedStatement.executeUpdate();
        if (rowsInserted > 0) {
            JOptionPane.showMessageDialog(this, "La plantilla se ha agregado exitosamente.");
            txtFolioPlantilla.setText("");
            contadorPiezas = 0;
            lblContador.setText("0");
        } else {
            JOptionPane.showMessageDialog(this, "Error al agregar la plantilla. Por favor, inténtelo de nuevo.");
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error en la conexión a la base de datos: " + e.getMessage());
    }
    }//GEN-LAST:event_btnGuardarPlantillaActionPerformed

    private void btnCancelarPlantillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarPlantillaActionPerformed
        txtFolioPlantilla.setText("");
        contadorPiezas = 0;
        lblContador.setText("0");
    }//GEN-LAST:event_btnCancelarPlantillaActionPerformed

    private void btnBuscarPlantillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPlantillaActionPerformed
    String folioPlantilla = txtBuscarPlantilla.getText();

    if (folioPlantilla.isEmpty()) {
        lblResultadoPlantilla.setText("Por favor, ingrese el folio de la plantilla para buscar.");
        return;
    }

    try (Connection connection = new CConnection().estableceConexion()) {
        String sql = "SELECT * FROM TBL_PLANTILLA WHERE folio_plantilla = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, folioPlantilla);

        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            String resultado = String.format("<html>Plantilla encontrada:<br/>Folio: %s<br/>Número de Piezas: %d</html>",
                    resultSet.getString("folio_plantilla"),
                    resultSet.getInt("numero_piezas")
            );
            lblResultadoPlantilla.setText(resultado);
        } else {
            lblResultadoPlantilla.setText("No se encontró ninguna plantilla con el folio proporcionado.");
        }
    } catch (SQLException e) {
        e.printStackTrace();
        lblResultadoPlantilla.setText("Error en la conexión a la base de datos: " + e.getMessage());
    }
    }//GEN-LAST:event_btnBuscarPlantillaActionPerformed

    private void btnCancelarBPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarBPActionPerformed
        txtBuscarPlantilla.setText(""); 
        lblResultadoPlantilla.setText("");
    }//GEN-LAST:event_btnCancelarBPActionPerformed

    private void lblMasEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMasEditarMouseClicked
        contadorPiezasEditar++;
        lblContadorEditar.setText(String.valueOf(contadorPiezasEditar));
    }//GEN-LAST:event_lblMasEditarMouseClicked

    private void lblMenosEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenosEditarMouseClicked
        if (contadorPiezasEditar > 0) {
            contadorPiezasEditar--; 
            lblContadorEditar.setText(String.valueOf(contadorPiezasEditar)); 
        }
    }//GEN-LAST:event_lblMenosEditarMouseClicked

    private void btnEditarPlantillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPlantillaActionPerformed
    String folioPlantilla = (String) cmbPlantilla.getSelectedItem();
    int numeroPiezas = contadorPiezasEditar;

    if (folioPlantilla == null || folioPlantilla.isEmpty() || numeroPiezas <= 0) {
        JOptionPane.showMessageDialog(this, "Por favor, seleccione una plantilla y asegúrese de que el número de piezas sea mayor a cero.");
        return;
    }

    try (Connection connection = new CConnection().estableceConexion()) {
        String sql = "UPDATE TBL_PLANTILLA SET numero_piezas = ? WHERE folio_plantilla = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, numeroPiezas);
        preparedStatement.setString(2, folioPlantilla);

        int rowsUpdated = preparedStatement.executeUpdate();
        if (rowsUpdated > 0) {
            JOptionPane.showMessageDialog(this, "La plantilla se ha actualizado exitosamente.");
        } else {
            JOptionPane.showMessageDialog(this, "Error al actualizar la plantilla. Por favor, inténtelo de nuevo.");
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error en la conexión a la base de datos: " + e.getMessage());
    }
    }//GEN-LAST:event_btnEditarPlantillaActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
    // Obtener los valores de los campos
    String nombre = txtNombre.getText();
    String apellidoPaterno = txtApp.getText();
    String apellidoMaterno = txtApm.getText();
    String numExtension = txtNumExtension.getText();
    String correoUsuario = correo.getText();
    char[] passwordArray = pswContra.getPassword();
    String password = new String(passwordArray);

    // Verificar que los campos no estén vacíos
    if (nombre.isEmpty() || apellidoPaterno.isEmpty() || apellidoMaterno.isEmpty() || numExtension.isEmpty() || correoUsuario.isEmpty() || password.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.");
        return;
    }

    // Conexión e inserción en la base de datos
    try (Connection connection = new CConnection().estableceConexion()) {
        // No es necesario especificar PK_Id_Usuario ya que es autoincremental
        String sql = "INSERT INTO tbl_usuario (Nombre_Usuario, App_Usuario, Apm_Usuario, Numero_Extension_Usuario, Correo, Contrasenia) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, nombre);
        preparedStatement.setString(2, apellidoPaterno);
        preparedStatement.setString(3, apellidoMaterno);
        preparedStatement.setString(4, numExtension);
        preparedStatement.setString(5, correoUsuario);
        preparedStatement.setString(6, password);

        int rowsInserted = preparedStatement.executeUpdate();
        if (rowsInserted > 0) {
            JOptionPane.showMessageDialog(this, "Usuario registrado exitosamente.");
            // Limpiar los campos del formulario
            txtNombre.setText("");
            txtApp.setText("");
            txtApm.setText("");
            txtNumExtension.setText("");
            correo.setText("");
            pswContra.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Error al registrar el usuario. Por favor, inténtelo de nuevo.");
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error en la conexión a la base de datos: " + e.getMessage());
    }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    txtNombre.setText("");
    txtApp.setText("");
    txtApm.setText("");
    txtNumExtension.setText("");
    correo.setText("");
    pswContra.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void lblRecuperarContraseniaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRecuperarContraseniaMouseClicked
        JOptionPane.showMessageDialog(this, "Función no disponible hasta la versión 1.1");
    }//GEN-LAST:event_lblRecuperarContraseniaMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscarPlantilla;
    private javax.swing.JButton btnCancelarBP;
    private javax.swing.JButton btnCancelarBuscar;
    private javax.swing.JButton btnCancelarPlantilla;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEditarPlantilla;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardarPlantilla;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JComboBox<String> cmbMaterial;
    public javax.swing.JComboBox<String> cmbMaterialEditar;
    public javax.swing.JComboBox<String> cmbPlantilla;
    private javax.swing.JComboBox<String> cmbTela;
    public javax.swing.JComboBox<String> cmbTelaEditar;
    private javax.swing.JComboBox<String> cmbVestido;
    public javax.swing.JComboBox<String> cmbVestidoEditar;
    private javax.swing.JTextField correo;
    private com.toedter.calendar.JDateChooser dteFechaEditar;
    private com.toedter.calendar.JDateChooser dteIngreso;
    private javax.swing.JLabel icon;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JLabel lblContador;
    private javax.swing.JLabel lblContadorEditar;
    private javax.swing.JLabel lblMas;
    private javax.swing.JLabel lblMasEditar;
    private javax.swing.JLabel lblMenos;
    private javax.swing.JLabel lblMenosEditar;
    private javax.swing.JLabel lblRecuperarContrasenia;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblResultadoPlantilla;
    private javax.swing.JPasswordField pswContra;
    private javax.swing.JPasswordField pswContrasenia;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JTextField txtApm;
    private javax.swing.JTextField txtApp;
    private javax.swing.JTextField txtBuscarModelo;
    private javax.swing.JTextField txtBuscarNombre;
    private javax.swing.JTextField txtBuscarPlantilla;
    private javax.swing.JPanel txtContrasenia;
    private javax.swing.JTextField txtFolioModelo;
    private javax.swing.JTextField txtFolioPlantilla;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreEditar;
    private javax.swing.JTextField txtNombreModelo;
    private javax.swing.JTextField txtNumExtension;
    private javax.swing.JTextField txtNumeroEditar;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
