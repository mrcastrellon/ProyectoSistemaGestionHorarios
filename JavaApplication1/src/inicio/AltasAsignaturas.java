/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inicio;
// para importar lo de la base de datos
import Conexion_base_de_datos.Conexion;
import java.sql.*;
import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author BENJAMIN
 */
public class AltasAsignaturas extends javax.swing.JFrame {

    /**
     * Creates new form INTERFAZ
     */
    public AltasAsignaturas() {
        //aqui voy
        initComponents();
         mostrardatos();
         setResizable(false);
        setSize(1300,720);
        setTitle("Altas asignaturas");
         }
        //este codigo es para trabajar en los formularios 
       void mostrardatos(){
       modelo = new DefaultTableModel();
        modelo.addColumn("cuatrimestre_id");
        modelo.addColumn("nombre");
        modelo.addColumn("clave");
        modelo.addColumn("creditos");
        modelo.addColumn("horas");
        modelo.addColumn("cuatrimestreasignatura");
        
     
        
        tablaaltaasignaturayaagregadas.setModel(modelo);
        String []datos = new String [10];
        try{
        Statement st = con2.createStatement();
        ResultSet rs= st.executeQuery("SELECT * FROM asignatura");
        while (rs.next()){
        datos [0]=rs.getString(1);
        datos [1]=rs.getString(2);
        datos [2]=rs.getString(3);
        datos [3]=rs.getString(4);
        datos [4]=rs.getString(5);
        datos [5]=rs.getString(6);
       
       
        modelo.addRow(datos);
        tablaaltaasignaturayaagregadas.setModel(modelo);
        
}
    }catch (Exception e){
       //  Logger.getLogger(consultadocentes.class.getName()).log(Level.SEVERE, null, ex); 
        System.out.println("chupando faros" + e);
    }
        
        
        
        
        
        
        
        
        limpiar();
        desbloquear();
    }
       //solo los mandamos llamar asi desbloquear(); o asi limpiar(); para limpiar los campos requeridos
void limpiar (){
    nombrecampo.setText("");
     clavecampo.setText("");
      creditoscampo.setText("");
       horascampo.setText("");
} 
  void desbloquear(){
    nombrecampo.setEnabled(true);
     clavecampo.setEnabled(true);
      creditoscampo.setEnabled(true);
       horascampo.setEnabled(true);


}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Cuatrimestre = new javax.swing.JButton();
        Docentes = new javax.swing.JButton();
        HorariosExternos = new javax.swing.JButton();
        HorariosAlumnos = new javax.swing.JButton();
        Usuarios = new javax.swing.JButton();
        GeneraciondeHorarios = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        SGH = new javax.swing.JLabel();
        LogoUnipoli = new javax.swing.JLabel();
        CerrarSesion = new javax.swing.JButton();
        NombredelUsuario = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        AsignarMaterias = new javax.swing.JButton();
        AltasdeUsuarios = new javax.swing.JButton();
        AsignaciondePrivilegios = new javax.swing.JButton();
        ConsultarUsuarios = new javax.swing.JButton();
        AltaUsuario = new javax.swing.JLabel();
        AltaNombre = new javax.swing.JLabel();
        AltaContraseña = new javax.swing.JLabel();
        AltaConfirmarContraseña = new javax.swing.JLabel();
        nombrecampo = new javax.swing.JTextField();
        clavecampo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        AltaGuardar = new javax.swing.JButton();
        creditoscampo = new javax.swing.JTextField();
        horascampo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaaltaasignaturayaagregadas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        cuatrimestrecampo = new javax.swing.JTextField();
        AltaConfirmarContraseña1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(153, 255, 153));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(null);

        Cuatrimestre.setBackground(new java.awt.Color(255, 102, 0));
        Cuatrimestre.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        Cuatrimestre.setText("Cuatrimestre");
        Cuatrimestre.setAlignmentX(0.1F);
        Cuatrimestre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CuatrimestreActionPerformed(evt);
            }
        });
        getContentPane().add(Cuatrimestre);
        Cuatrimestre.setBounds(68, 93, 120, 25);

        Docentes.setBackground(new java.awt.Color(255, 102, 0));
        Docentes.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        Docentes.setText("Docentes");
        Docentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DocentesActionPerformed(evt);
            }
        });
        getContentPane().add(Docentes);
        Docentes.setBounds(216, 93, 104, 25);

        HorariosExternos.setBackground(new java.awt.Color(255, 102, 0));
        HorariosExternos.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        HorariosExternos.setText("Horarios Externos");
        HorariosExternos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HorariosExternosActionPerformed(evt);
            }
        });
        getContentPane().add(HorariosExternos);
        HorariosExternos.setBounds(370, 93, 141, 25);

        HorariosAlumnos.setBackground(new java.awt.Color(255, 102, 0));
        HorariosAlumnos.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        HorariosAlumnos.setText("Horarios Alumnos");
        HorariosAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HorariosAlumnosActionPerformed(evt);
            }
        });
        getContentPane().add(HorariosAlumnos);
        HorariosAlumnos.setBounds(563, 93, 148, 25);

        Usuarios.setBackground(new java.awt.Color(255, 102, 0));
        Usuarios.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        Usuarios.setText("Usuarios");
        Usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuariosActionPerformed(evt);
            }
        });
        getContentPane().add(Usuarios);
        Usuarios.setBounds(934, 93, 93, 25);

        GeneraciondeHorarios.setBackground(new java.awt.Color(255, 102, 102));
        GeneraciondeHorarios.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        GeneraciondeHorarios.setText("Generación de Horarios");
        GeneraciondeHorarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GeneraciondeHorariosActionPerformed(evt);
            }
        });
        getContentPane().add(GeneraciondeHorarios);
        GeneraciondeHorarios.setBounds(1068, 93, 173, 25);

        jSeparator1.setForeground(new java.awt.Color(255, 102, 0));
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 85, 1304, 2);

        jSeparator2.setForeground(new java.awt.Color(255, 102, 0));
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(0, 124, 1304, 2);

        jSeparator3.setForeground(new java.awt.Color(255, 102, 0));
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(0, 657, 1304, 2);

        SGH.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 24)); // NOI18N
        SGH.setText("SISTEMA DE GESTIÓN DE HORARIOS");
        getContentPane().add(SGH);
        SGH.setBounds(233, 38, 414, 29);

        LogoUnipoli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo.jpg"))); // NOI18N
        getContentPane().add(LogoUnipoli);
        LogoUnipoli.setBounds(685, 20, 329, 56);

        CerrarSesion.setBackground(new java.awt.Color(255, 102, 0));
        CerrarSesion.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        CerrarSesion.setText("Cerrar sesión");
        CerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(CerrarSesion);
        CerrarSesion.setBounds(1181, 51, 113, 25);

        NombredelUsuario.setText("Nombre del Usuario");
        getContentPane().add(NombredelUsuario);
        NombredelUsuario.setBounds(1056, 57, 93, 14);

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
                .addContainerGap(483, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(401, 401, 401))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jLabel3))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 665, 1304, 23);

        AsignarMaterias.setBackground(new java.awt.Color(255, 102, 0));
        AsignarMaterias.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        AsignarMaterias.setText("Asignar Materias");
        AsignarMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AsignarMateriasActionPerformed(evt);
            }
        });
        getContentPane().add(AsignarMaterias);
        AsignarMaterias.setBounds(747, 93, 148, 25);

        AltasdeUsuarios.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        AltasdeUsuarios.setText("Alta Asignaturas");
        AltasdeUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AltasdeUsuariosActionPerformed(evt);
            }
        });
        getContentPane().add(AltasdeUsuarios);
        AltasdeUsuarios.setBounds(89, 290, 170, 27);

        AsignaciondePrivilegios.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        AsignaciondePrivilegios.setText("Modificar Asignatura");
        AsignaciondePrivilegios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AsignaciondePrivilegiosActionPerformed(evt);
            }
        });
        getContentPane().add(AsignaciondePrivilegios);
        AsignaciondePrivilegios.setBounds(90, 380, 170, 27);

        ConsultarUsuarios.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        ConsultarUsuarios.setText("Alta Cuatrimestres");
        ConsultarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarUsuariosActionPerformed(evt);
            }
        });
        getContentPane().add(ConsultarUsuarios);
        ConsultarUsuarios.setBounds(89, 472, 170, 27);

        AltaUsuario.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        AltaUsuario.setText("Clave");
        getContentPane().add(AltaUsuario);
        AltaUsuario.setBounds(375, 342, 43, 21);

        AltaNombre.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        AltaNombre.setText("Nombre");
        getContentPane().add(AltaNombre);
        AltaNombre.setBounds(359, 290, 59, 21);

        AltaContraseña.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        AltaContraseña.setText("Creditos");
        getContentPane().add(AltaContraseña);
        AltaContraseña.setBounds(359, 395, 64, 21);

        AltaConfirmarContraseña.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        AltaConfirmarContraseña.setText("Horas");
        getContentPane().add(AltaConfirmarContraseña);
        AltaConfirmarContraseña.setBounds(378, 451, 45, 21);

        nombrecampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombrecampoActionPerformed(evt);
            }
        });
        getContentPane().add(nombrecampo);
        nombrecampo.setBounds(441, 292, 152, 20);

        clavecampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clavecampoActionPerformed(evt);
            }
        });
        getContentPane().add(clavecampo);
        clavecampo.setBounds(441, 344, 152, 20);

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel8.setText("Usuarios");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(629, 178, 98, 17);

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel9.setText("Altas Asignaturas");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(600, 201, 118, 17);

        AltaGuardar.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        AltaGuardar.setText("Guardar");
        AltaGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AltaGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(AltaGuardar);
        AltaGuardar.setBounds(414, 570, 79, 25);

        creditoscampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditoscampoActionPerformed(evt);
            }
        });
        getContentPane().add(creditoscampo);
        creditoscampo.setBounds(441, 397, 152, 20);

        horascampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horascampoActionPerformed(evt);
            }
        });
        getContentPane().add(horascampo);
        horascampo.setBounds(441, 453, 152, 20);

        jButton1.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(518, 570, 85, 25);

        tablaaltaasignaturayaagregadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaaltaasignaturayaagregadas);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(650, 350, 470, 160);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Lista de asignaturas ya registradas en la base de datos ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(670, 300, 437, 22);

        cuatrimestrecampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuatrimestrecampoActionPerformed(evt);
            }
        });
        getContentPane().add(cuatrimestrecampo);
        cuatrimestrecampo.setBounds(441, 511, 152, 20);

        AltaConfirmarContraseña1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        AltaConfirmarContraseña1.setText("Cuatrimestre");
        getContentPane().add(AltaConfirmarContraseña1);
        AltaConfirmarContraseña1.setBounds(324, 511, 99, 21);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HorariosExternosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HorariosExternosActionPerformed
        // Link para modulo horarios externos
        HorariosExternos obj=new HorariosExternos();
        obj.setVisible(true);
        dispose();

    }//GEN-LAST:event_HorariosExternosActionPerformed

    private void UsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuariosActionPerformed
        // Link para modulo usuarios
        Usuarios obj=new Usuarios();
        obj.setVisible(true);
        dispose();

    }//GEN-LAST:event_UsuariosActionPerformed

    private void GeneraciondeHorariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GeneraciondeHorariosActionPerformed
        // Link para modulo usuarios
        PaginaPrincipalGeneraciondeHorarios obj=new PaginaPrincipalGeneraciondeHorarios();
        obj.setVisible(true);
        dispose();

    }//GEN-LAST:event_GeneraciondeHorariosActionPerformed

    private void CuatrimestreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CuatrimestreActionPerformed
        // Link para modulo cuatrimestres
        cuatrimestres obj=new cuatrimestres();
        obj.setVisible(true);
        dispose();

    }//GEN-LAST:event_CuatrimestreActionPerformed

    private void HorariosAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HorariosAlumnosActionPerformed
        // Link para modulo horarios alumnos
        HorariosAlumnos obj=new HorariosAlumnos();
        obj.setVisible(true);
        dispose();

    }//GEN-LAST:event_HorariosAlumnosActionPerformed

    private void CerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarSesionActionPerformed
        // Link para modulo cerrar sesion
        IngresaralSistema obj=new IngresaralSistema();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_CerrarSesionActionPerformed

    private void AsignarMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AsignarMateriasActionPerformed
        // Link para modulo horarios alumnos
        AsignarAsignatura obj=new AsignarAsignatura();
        obj.setVisible(true);
        dispose();

    }//GEN-LAST:event_AsignarMateriasActionPerformed

    private void DocentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DocentesActionPerformed
        // Link para modulo docentes
        Docentes obj=new Docentes();
        obj.setVisible(true);
        dispose();    }//GEN-LAST:event_DocentesActionPerformed

    private void AltasdeUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AltasdeUsuariosActionPerformed
desbloquear();
        nombrecampo.requestFocus();        
        AltasAsignaturas obj=new AltasAsignaturas();
        obj.setVisible(true);
        dispose();    
    }//GEN-LAST:event_AltasdeUsuariosActionPerformed

    private void ConsultarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarUsuariosActionPerformed
        // Link para alta cuatrimestre
        AltasCuatrimestre obj=new AltasCuatrimestre();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_ConsultarUsuariosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void AsignaciondePrivilegiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AsignaciondePrivilegiosActionPerformed
        // Link para modificar asignatura
        ModificarAsignaturas obj=new ModificarAsignaturas();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_AsignaciondePrivilegiosActionPerformed

    private void nombrecampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombrecampoActionPerformed
//nombre.transferFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_nombrecampoActionPerformed

    private void clavecampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clavecampoActionPerformed
//clave.transferFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_clavecampoActionPerformed

    private void creditoscampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditoscampoActionPerformed
//creditos.transferFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_creditoscampoActionPerformed

    private void horascampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horascampoActionPerformed
//horas.transferFocus();       // TODO add your handling code here:
    }//GEN-LAST:event_horascampoActionPerformed

    private void AltaGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AltaGuardarActionPerformed
         // codigo para boton de guardar
        
        //declarando 
        
        String sql;
        //declaro la variable error
        String mensajeerror;
        //usamos las variables anteriormente declaradas, para referenciales que equivalen a lo que se muestra en los campos de texto
                   
        sql="INSERT INTO asignatura(nombre,clave,creditos,horas,cuatrimestreasignatura)VALUES (?,?,?,?,?)";
        //le digo a la variable que hara la del error para luego ser llamada
        mensajeerror="Ingresa los datos correctamente";
        try {
            PreparedStatement pst=con2.prepareStatement(sql);
            //pst.setString(numero de campo,nombre de la caja de texto,gettext());
            pst.setString(1,nombrecampo.getText());
            pst.setString(2,clavecampo.getText());
            pst.setString(3,creditoscampo.getText());
            pst.setString(4,horascampo.getText());   
            pst.setString(5,cuatrimestrecampo.getText());   
            int n=pst.executeUpdate();
            if (n>=0){
                //son los mensajes de que se ejecuto correctamente la insercion
                //Para que se muestre el mensaje de guardado correctamente hay que agregar rootpane, 
             JOptionPane.showMessageDialog(rootPane,"registrado con exito en la base de datos");
                //para limpiar los campos del formulario 
                 limpiar();
                 //mandamos llamar el metodo para que se actualize la tabla al guardar una nueva asignatura
                 mostrardatos();
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
    }//GEN-LAST:event_AltaGuardarActionPerformed

    private void cuatrimestrecampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuatrimestrecampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cuatrimestrecampoActionPerformed
    
    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AltaConfirmarContraseña;
    private javax.swing.JLabel AltaConfirmarContraseña1;
    private javax.swing.JLabel AltaContraseña;
    private javax.swing.JButton AltaGuardar;
    private javax.swing.JLabel AltaNombre;
    private javax.swing.JLabel AltaUsuario;
    private javax.swing.JButton AltasdeUsuarios;
    private javax.swing.JButton AsignaciondePrivilegios;
    private javax.swing.JButton AsignarMaterias;
    private javax.swing.JButton CerrarSesion;
    private javax.swing.JButton ConsultarUsuarios;
    private javax.swing.JButton Cuatrimestre;
    private javax.swing.JButton Docentes;
    private javax.swing.JButton GeneraciondeHorarios;
    private javax.swing.JButton HorariosAlumnos;
    private javax.swing.JButton HorariosExternos;
    private javax.swing.JLabel LogoUnipoli;
    private javax.swing.JLabel NombredelUsuario;
    private javax.swing.JLabel SGH;
    private javax.swing.JButton Usuarios;
    private javax.swing.JTextField clavecampo;
    private javax.swing.JTextField creditoscampo;
    private javax.swing.JTextField cuatrimestrecampo;
    private javax.swing.JTextField horascampo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField nombrecampo;
    private javax.swing.JTable tablaaltaasignaturayaagregadas;
    // End of variables declaration//GEN-END:variables
Conexion con=new Conexion();
        Connection con2=con.conexion();
        DefaultTableModel modelo;
    
}
