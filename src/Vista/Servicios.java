/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vista;

/**
 *
 * @author hp
 */
public class Servicios extends javax.swing.JFrame {

    /**
     * Creates new form Servicios
     */
    public Servicios() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblAutoMap = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        btnCotizar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        cboxLavadoMano = new javax.swing.JCheckBox();
        cboxLavadoLlantas = new javax.swing.JCheckBox();
        cboxLavadoMotor = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        cboxSecadora = new javax.swing.JCheckBox();
        cboxAplicacion = new javax.swing.JCheckBox();
        cboxCarroceria = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        lblServicios = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        rbtnSi = new javax.swing.JRadioButton();
        lblServicioDomicilio = new javax.swing.JLabel();
        rbtnNo = new javax.swing.JRadioButton();
        lblSi = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        btnRealizarVenta = new javax.swing.JButton();
        btnVerFacturas = new javax.swing.JButton();
        lblValorVenta = new javax.swing.JLabel();
        txtValorVenta = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblAutoMap.setFont(new java.awt.Font("Segoe Print", 1, 48)); // NOI18N
        lblAutoMap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAutoMap.setText("AutoMap");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono1.png"))); // NOI18N
        jLabel3.setText("jLabel3");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                .addComponent(lblAutoMap, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAutoMap, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 790, 70));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.setMaximumSize(new java.awt.Dimension(85, 25));
        btnSalir.setMinimumSize(new java.awt.Dimension(85, 25));
        btnSalir.setPreferredSize(new java.awt.Dimension(85, 25));
        jPanel5.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 90, 56));

        txtNombre.setEnabled(false);
        jPanel5.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 29, 250, -1));

        lblNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/persona.png"))); // NOI18N
        jPanel5.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 56, 56));

        btnCotizar.setBackground(new java.awt.Color(153, 204, 255));
        btnCotizar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnCotizar.setText("COTIZAR");
        btnCotizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.add(btnCotizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 15, 104, 50));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 790, 80));

        jPanel2.setBackground(new java.awt.Color(224, 235, 252));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cboxLavadoMano.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        cboxLavadoMano.setText("Lavado a Mano");
        cboxLavadoMano.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cboxLavadoMano.setEnabled(false);
        jPanel4.add(cboxLavadoMano, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        cboxLavadoLlantas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cboxLavadoLlantas.setText("Lavado llantas, cepillo lava-ruedas Multi-disk y cepillo lava-ruedas con ocho cepillos");
        cboxLavadoLlantas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cboxLavadoLlantas.setEnabled(false);
        cboxLavadoLlantas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel4.add(cboxLavadoLlantas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        cboxLavadoMotor.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        cboxLavadoMotor.setText("Lavado de motor, Lavado de vestiduras de tela o piel, Teflón en vestiduras");
        cboxLavadoMotor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cboxLavadoMotor.setEnabled(false);
        jPanel4.add(cboxLavadoMotor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lavado.png"))); // NOI18N
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 520, 110));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 540, 130));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cboxSecadora.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        cboxSecadora.setText("Secadora de Carros Integrada en el Equipo");
        cboxSecadora.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cboxSecadora.setEnabled(false);
        jPanel6.add(cboxSecadora, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        cboxAplicacion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cboxAplicacion.setText("Aplicación de Jabón, Cera Espuma, Encerado, Pulido y descontaminación de carrocería");
        cboxAplicacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cboxAplicacion.setEnabled(false);
        jPanel6.add(cboxAplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        cboxCarroceria.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        cboxCarroceria.setText("Porcelánica de carrocería, Cristalizado de carrocería");
        cboxCarroceria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cboxCarroceria.setEnabled(false);
        jPanel6.add(cboxCarroceria, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/carroestrella.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 520, 90));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 540, 130));

        lblServicios.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblServicios.setText("SERVICIOS");
        jPanel2.add(lblServicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rbtnSi.setBackground(new java.awt.Color(255, 255, 255));
        rbtnSi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0)));
        rbtnSi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbtnSi.setEnabled(false);
        rbtnSi.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel7.add(rbtnSi, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 20, 20));

        lblServicioDomicilio.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        lblServicioDomicilio.setText("SERVICIO A DOMICILIO");
        jPanel7.add(lblServicioDomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        rbtnNo.setSelected(true);
        rbtnNo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbtnNo.setEnabled(false);
        rbtnNo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        rbtnNo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel7.add(rbtnNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 20, 20));

        lblSi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/si.png"))); // NOI18N
        jPanel7.add(lblSi, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/no.png"))); // NOI18N
        jPanel7.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/domicilio.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel7.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 180, 230));

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, 200, 270));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 790, 350));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRealizarVenta.setBackground(new java.awt.Color(102, 255, 102));
        btnRealizarVenta.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnRealizarVenta.setText("Realizar Venta");
        btnRealizarVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRealizarVenta.setEnabled(false);
        jPanel8.add(btnRealizarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 130, 40));

        btnVerFacturas.setBackground(new java.awt.Color(204, 204, 204));
        btnVerFacturas.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnVerFacturas.setText("Ver Facturas");
        btnVerFacturas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVerFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerFacturasActionPerformed(evt);
            }
        });
        jPanel8.add(btnVerFacturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 120, 40));

        lblValorVenta.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblValorVenta.setText("Valor Venta: $");
        jPanel8.add(lblValorVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, -1, 20));

        txtValorVenta.setEditable(false);
        txtValorVenta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtValorVenta.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtValorVenta.setText("0");
        jPanel8.add(txtValorVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 30, 160, -1));

        btnCancelar.setBackground(new java.awt.Color(255, 51, 51));
        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel8.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 120, 40));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 790, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 812, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerFacturasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVerFacturasActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCancelar;
    public javax.swing.JButton btnCotizar;
    public javax.swing.JButton btnRealizarVenta;
    public javax.swing.JButton btnSalir;
    public javax.swing.JButton btnVerFacturas;
    public javax.swing.JCheckBox cboxAplicacion;
    public javax.swing.JCheckBox cboxCarroceria;
    public javax.swing.JCheckBox cboxLavadoLlantas;
    public javax.swing.JCheckBox cboxLavadoMano;
    public javax.swing.JCheckBox cboxLavadoMotor;
    public javax.swing.JCheckBox cboxSecadora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel lblAutoMap;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblServicioDomicilio;
    private javax.swing.JLabel lblServicios;
    private javax.swing.JLabel lblSi;
    private javax.swing.JLabel lblValorVenta;
    public javax.swing.JRadioButton rbtnNo;
    public javax.swing.JRadioButton rbtnSi;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtValorVenta;
    // End of variables declaration//GEN-END:variables
}
