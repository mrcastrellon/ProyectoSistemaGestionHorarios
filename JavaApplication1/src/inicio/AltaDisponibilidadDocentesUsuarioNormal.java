/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inicio;

import Conexion_base_de_datos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;





/**
 *
 * @author MARCOS
 */
public class AltaDisponibilidadDocentesUsuarioNormal extends javax.swing.JFrame {
      public void limpiar(){
          campo1.setText(" ");
          campo2.setText(" ");
          campo3.setText(" ");
          campo4.setText(" ");
          campo5.setText(" ");
          campo6.setText(" ");
          campo7.setText(" ");
          campo8.setText(" ");
          campo9.setText(" ");
          campo10.setText(" ");
          campo11.setText(" ");
          campo12.setText(" ");
      }
    /**
     * 
     * Creates new form INTERFAZ
     */
    public AltaDisponibilidadDocentesUsuarioNormal() {
        initComponents();
    }
    public AltaDisponibilidadDocentesUsuarioNormal(String usuario) {
        initComponents();
        jLabel1.setText(usuario);
        usuarioexp=(usuario);
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
        campo6 = new javax.swing.JCheckBox();
        campo2 = new javax.swing.JCheckBox();
        campo1 = new javax.swing.JCheckBox();
        campo3 = new javax.swing.JCheckBox();
        campo4 = new javax.swing.JCheckBox();
        campo5 = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        campo7 = new javax.swing.JCheckBox();
        campo8 = new javax.swing.JCheckBox();
        campo10 = new javax.swing.JCheckBox();
        campo9 = new javax.swing.JCheckBox();
        campo11 = new javax.swing.JCheckBox();
        campo12 = new javax.swing.JCheckBox();
        jButton9 = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        tbmostrarmodulos = new javax.swing.JLabel();

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
        jButton1.setBounds(1090, 50, 160, 25);

        jLabel1.setText("Nombre del Usuario");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(630, 190, 93, 14);

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
        jLabel6.setBounds(480, 410, 53, 17);

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel7.setText("Modulo 1");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(480, 220, 53, 17);

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel8.setText("Modulo 2");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(480, 250, 53, 17);

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel9.setText("Modulo 3");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(480, 290, 53, 17);

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel10.setText("Modulo 4");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(480, 330, 53, 17);

        jLabel11.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel11.setText("Modulo 5");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(480, 370, 53, 17);
        getContentPane().add(campo6);
        campo6.setBounds(590, 410, 21, 21);
        getContentPane().add(campo2);
        campo2.setBounds(590, 250, 21, 21);
        getContentPane().add(campo1);
        campo1.setBounds(590, 210, 21, 21);
        getContentPane().add(campo3);
        campo3.setBounds(590, 290, 21, 21);
        getContentPane().add(campo4);
        campo4.setBounds(590, 330, 21, 21);
        getContentPane().add(campo5);
        campo5.setBounds(590, 370, 21, 21);

        jLabel13.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel13.setText("Modulo 7");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(720, 210, 53, 17);

        jLabel14.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel14.setText("Modulo 8");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(720, 250, 53, 17);

        jLabel15.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel15.setText("Modulo 9");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(720, 290, 53, 17);

        jLabel16.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel16.setText("Modulo 10");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(720, 330, 60, 17);

        jLabel17.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel17.setText("Modulo 11");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(720, 370, 60, 17);

        jLabel18.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel18.setText("Modulo 12");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(720, 410, 60, 17);
        getContentPane().add(campo7);
        campo7.setBounds(830, 210, 21, 21);
        getContentPane().add(campo8);
        campo8.setBounds(830, 250, 21, 21);
        getContentPane().add(campo10);
        campo10.setBounds(830, 330, 21, 21);
        getContentPane().add(campo9);
        campo9.setBounds(830, 290, 21, 21);
        getContentPane().add(campo11);
        campo11.setBounds(830, 370, 21, 21);
        getContentPane().add(campo12);
        campo12.setBounds(830, 410, 21, 21);

        jButton9.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jButton9.setText("Cancelar");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(550, 510, 120, 30);

        guardar.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        getContentPane().add(guardar);
        guardar.setBounds(750, 510, 120, 30);
        getContentPane().add(tbmostrarmodulos);
        tbmostrarmodulos.setBounds(490, 470, 290, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Link para modulo cerrar sesion
        IngresaralSistema obj=new IngresaralSistema();
        obj.setVisible(true);
        dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       ModificarDisponibilidadDocentesusuarionormal obj=new ModificarDisponibilidadDocentesusuarionormal(usuarioexp);
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
       
        String mensaje2="";
        String[] mensaje=new String [12];
           if(campo1.isSelected())
    {
        mensaje[0]="si";
    }else{
        mensaje[0]="no";   
    }
        if(campo2.isSelected())
    {
       mensaje[1]="si";
    }else{
        mensaje[1]="no";   
    
    }
          if(campo3.isSelected())
    {
       mensaje[2]="si";
    }else{
        mensaje[2]="no";   
    
    }
              if(campo4.isSelected())
    {
       mensaje[3]="si";
    }else{
        mensaje[3]="no";   
    
    }
        if(campo5.isSelected())
    {
        mensaje[4]="si";
    }else{
        mensaje[4]="no";   
    
    }
        if(campo6.isSelected())
    {
        mensaje[5]="si";
    }else{
        mensaje[5]="no";
    }
        if(campo7.isSelected())
    {
       mensaje[6]="si";
    }else{
        mensaje[6]="no";
    }
        if(campo8.isSelected())
    {
        mensaje[7]="si";
    }else{
        mensaje[7]="no";
    }
        if(campo9.isSelected())
    {
        mensaje[8]="si";
    }else{
        mensaje[8]="no";
    }
        if(campo10.isSelected())
    {
        mensaje[9]="si";
    }else{
        mensaje[9]="no";
    }
        if(campo11.isSelected())
    {
       mensaje[10]="si";
    }else{
        mensaje[10]="no";
    }
        if(campo12.isSelected())
    {
        mensaje[11]="si";
    }else{
        mensaje[11]="no";
    }
     for(int i=0; i<mensaje.length; i++){
      mensaje2=mensaje2+mensaje[i];
     }  
     

          String sql;
        //declaro la variable error
        String mensajeerror;
        //usamos las variables anteriormente declaradas, para referenciales que equivalen a lo que se muestra en los campos de texto
                   
        sql="INSERT INTO disponibilidad(modulo_1,modulo_2,modulo_3,modulo_4,modulo_5,modulo_6,modulo_7,modulo_8,modulo_9,modulo_10,modulo_11,modulo_12,docente)VALUES (?,?,?,?,?,?,?,?,?,?,?,?,'"+usuarioexp+"')";
        //le digo a la variable que hara la del error para luego ser llamada
        mensajeerror="Ingresa los datos correctamente";
        try {
            PreparedStatement pst=con2.prepareStatement(sql);
            //pst.setString(numero de campo,nombre de la caja de texto,gettext());
            pst.setString(1,mensaje[0]);
            pst.setString(2,mensaje[1]);
            pst.setString(3,mensaje[2]);
            pst.setString(4,mensaje[3]);
            pst.setString(5,mensaje[4]);
            pst.setString(6,mensaje[5]);
            pst.setString(7,mensaje[6]);
            pst.setString(8,mensaje[7]);
            pst.setString(9,mensaje[8]);
            pst.setString(10,mensaje[9]);
            pst.setString(11,mensaje[10]);
            pst.setString(12,mensaje[11]);
            int n=pst.executeUpdate();
            if (n>=0){
                //son los mensajes de que se ejecuto correctamente la insercion
             JOptionPane.showMessageDialog(rootPane,"registrado con exito en la base de datos");
             limpiar();
                System.out.println("Guardado correctamente");
                
                    }
{
            
                        }
         }catch (Exception e){
             //lo puse de esta manera para mostrarle que no introdujo correctamente los datos
             JOptionPane.showMessageDialog(rootPane,mensajeerror);
             //este mensaje solo se imprimira en el registro--
             System.out.println("Ingresa los datos correctamente" + e);
     
        } 
        // TODO add your handling code here:
    
        
    }//GEN-LAST:event_guardarActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
       DocentesUsuarioComun obj=new DocentesUsuarioComun(usuarioexp);
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LogoUnipoli;
    private javax.swing.JLabel SGH;
    private javax.swing.JCheckBox campo1;
    private javax.swing.JCheckBox campo10;
    private javax.swing.JCheckBox campo11;
    private javax.swing.JCheckBox campo12;
    private javax.swing.JCheckBox campo2;
    private javax.swing.JCheckBox campo3;
    private javax.swing.JCheckBox campo4;
    private javax.swing.JCheckBox campo5;
    private javax.swing.JCheckBox campo6;
    private javax.swing.JCheckBox campo7;
    private javax.swing.JCheckBox campo8;
    private javax.swing.JCheckBox campo9;
    private javax.swing.JButton guardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel tbmostrarmodulos;
    // End of variables declaration//GEN-END:variables
Conexion con=new Conexion();
Connection con2=con.conexion();
public String usuarioexp;
}
