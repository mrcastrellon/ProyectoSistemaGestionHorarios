/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inicio;





/**
 *
 * @author BENJAMIN
 */
public class AltaDisponibilidadDocentesUsuarioNormal extends javax.swing.JFrame {

    /**
     * Creates new form INTERFAZ
     */
    public AltaDisponibilidadDocentesUsuarioNormal(String usuario) {
        initComponents();
        jLabel1.setText(usuario);
        user=usuario;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        SGH = new javax.swing.JLabel();
        LogoUnipoli = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        jCheckBox12 = new javax.swing.JCheckBox();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(153, 255, 153));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1300, 648));
        getContentPane().setLayout(null);

        jSeparator1.setForeground(new java.awt.Color(255, 102, 0));
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 85, 1299, 2);

        jSeparator2.setForeground(new java.awt.Color(255, 102, 0));
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(0, 124, 1299, 2);

        jSeparator3.setForeground(new java.awt.Color(255, 102, 0));
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(0, 645, 1299, 2);

        SGH.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 24)); // NOI18N
        SGH.setText("SISTEMA DE GESTIÓN DE HORARIOS");
        getContentPane().add(SGH);
        SGH.setBounds(233, 38, 414, 29);

        LogoUnipoli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo.jpg"))); // NOI18N
        getContentPane().add(LogoUnipoli);
        LogoUnipoli.setBounds(685, 20, 324, 56);

        jButton1.setBackground(new java.awt.Color(255, 102, 0));
        jButton1.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jButton1.setText("Cerrar sesión");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(1176, 51, 113, 25);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Nombre del Usuario");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(500, 180, 360, 30);

        jPanel2.setBackground(new java.awt.Color(255, 102, 0));
        jPanel2.setMaximumSize(new java.awt.Dimension(23767, 32767));
        jPanel2.setPreferredSize(new java.awt.Dimension(860, 25));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel3.setText("Universidad Politecnica de Durango, Area de Desarollo de Software");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(485, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(394, 394, 394))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jLabel3))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 653, 1299, 23);

        jButton7.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jButton7.setText("Modificar Disponibilidad");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(100, 280, 211, 27);

        jLabel12.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel12.setText("Alta de Disponibilidad");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(540, 140, 288, 35);

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel6.setText("Modulo 6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(490, 450, 53, 17);

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel7.setText("Modulo 1");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(490, 260, 53, 17);

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel8.setText("Modulo 2");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(490, 290, 53, 17);

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel9.setText("Modulo 3");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(490, 330, 53, 17);

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel10.setText("Modulo 4");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(490, 370, 53, 17);

        jLabel11.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel11.setText("Modulo 5");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(490, 390, 53, 17);
        getContentPane().add(jCheckBox1);
        jCheckBox1.setBounds(600, 450, 21, 21);
        getContentPane().add(jCheckBox2);
        jCheckBox2.setBounds(600, 290, 21, 21);
        getContentPane().add(jCheckBox3);
        jCheckBox3.setBounds(600, 250, 21, 21);
        getContentPane().add(jCheckBox4);
        jCheckBox4.setBounds(600, 330, 21, 21);
        getContentPane().add(jCheckBox5);
        jCheckBox5.setBounds(600, 370, 21, 21);
        getContentPane().add(jCheckBox6);
        jCheckBox6.setBounds(600, 410, 21, 21);

        jLabel13.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel13.setText("Modulo 7");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(730, 250, 53, 17);

        jLabel14.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel14.setText("Modulo 8");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(730, 290, 53, 17);

        jLabel15.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel15.setText("Modulo 9");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(730, 330, 53, 17);

        jLabel16.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel16.setText("Modulo 10");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(730, 370, 60, 17);

        jLabel17.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel17.setText("Modulo 11");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(730, 420, 60, 17);

        jLabel18.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel18.setText("Modulo 12");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(730, 450, 60, 17);
        getContentPane().add(jCheckBox7);
        jCheckBox7.setBounds(840, 250, 21, 21);
        getContentPane().add(jCheckBox8);
        jCheckBox8.setBounds(840, 290, 21, 21);
        getContentPane().add(jCheckBox9);
        jCheckBox9.setBounds(840, 370, 21, 21);
        getContentPane().add(jCheckBox10);
        jCheckBox10.setBounds(840, 330, 21, 21);
        getContentPane().add(jCheckBox11);
        jCheckBox11.setBounds(840, 410, 21, 21);
        getContentPane().add(jCheckBox12);
        jCheckBox12.setBounds(840, 450, 21, 21);

        jButton9.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jButton9.setText("Cancelar");
        getContentPane().add(jButton9);
        jButton9.setBounds(770, 520, 85, 25);

        jButton10.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jButton10.setText("Guardar");
        getContentPane().add(jButton10);
        jButton10.setBounds(680, 520, 79, 25);

        jLabel19.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel19.setText("Seleccione los modulos donde se este disponible.");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(510, 210, 370, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Link para modulo cerrar sesion
        IngresaralSistema obj=new IngresaralSistema();
        obj.setVisible(true);
        dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
      ModificarDisponibilidadDocentesusuarionormal obj=new  ModificarDisponibilidadDocentesusuarionormal(user);
      obj.setVisible(true);
      dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LogoUnipoli;
    private javax.swing.JLabel SGH;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
private String user;
}
