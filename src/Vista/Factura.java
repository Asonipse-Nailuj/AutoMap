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
public class Factura extends javax.swing.JFrame {

    /**
     * Creates new form Factura
     */
    public Factura() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblFactura = new javax.swing.JLabel();
        lblNumeroFactura = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblNombreFactura = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaServiciosNombre = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtaServiciosValor = new javax.swing.JTextArea();
        txtNombreFactura = new javax.swing.JTextField();
        lblTotal = new javax.swing.JLabel();
        txtValorFactura = new javax.swing.JTextField();
        lblThanks = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guiones_horizontales.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guiones_verticales.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 30, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guiones_horizontales.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(227, 227, 227));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFactura.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        lblFactura.setText("FACTURA #");
        jPanel2.add(lblFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, -1, 60));

        lblNumeroFactura.setBackground(new java.awt.Color(255, 255, 255));
        lblNumeroFactura.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        lblNumeroFactura.setText("     ");
        jPanel2.add(lblNumeroFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, -1, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 740, 60));

        jPanel3.setBackground(new java.awt.Color(227, 227, 227));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombreFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/persona.png"))); // NOI18N
        jPanel3.add(lblNombreFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 56, 56));

        txtaServiciosNombre.setEditable(false);
        txtaServiciosNombre.setColumns(20);
        txtaServiciosNombre.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        txtaServiciosNombre.setLineWrap(true);
        txtaServiciosNombre.setRows(5);
        jScrollPane1.setViewportView(txtaServiciosNombre);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 640, 200));

        txtaServiciosValor.setEditable(false);
        txtaServiciosValor.setColumns(20);
        txtaServiciosValor.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        txtaServiciosValor.setLineWrap(true);
        txtaServiciosValor.setRows(5);
        txtaServiciosValor.setRequestFocusEnabled(false);
        jScrollPane2.setViewportView(txtaServiciosValor);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 90, 70, 200));

        txtNombreFactura.setEditable(false);
        txtNombreFactura.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(txtNombreFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 35, 200, -1));

        lblTotal.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        lblTotal.setText("TOTAL = $");
        jPanel3.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, 60));

        txtValorFactura.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtValorFactura.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel3.add(txtValorFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 200, 60));

        lblThanks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/gracias.png"))); // NOI18N
        lblThanks.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(lblThanks, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 303, 157, 136));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 740, 450));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guiones_verticales.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 30, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblFactura;
    private javax.swing.JLabel lblNombreFactura;
    public javax.swing.JLabel lblNumeroFactura;
    public javax.swing.JLabel lblThanks;
    private javax.swing.JLabel lblTotal;
    public javax.swing.JTextField txtNombreFactura;
    public javax.swing.JTextField txtValorFactura;
    public javax.swing.JTextArea txtaServiciosNombre;
    public javax.swing.JTextArea txtaServiciosValor;
    // End of variables declaration//GEN-END:variables
}
