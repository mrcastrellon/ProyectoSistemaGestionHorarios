/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inicio;

import Conexion_base_de_datos.Conexion;
import java.sql.*;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;



/**
 *
 * 
 */
public class AltasUsuarios extends javax.swing.JFrame {

    /**
     * Creates new form INTERFAZ
     */
    void limpiar(){
    camponombre.setText(" ");
    campousuario.setText(" ");
    campocontraseña.setText("");
    }
    public AltasUsuarios() {
        initComponents();
    }
    public AltasUsuarios(String usuario){
        initComponents();
        label1.setText(usuario);
        setResizable(true);
        setVisible(true);
        vinusuario=usuario;
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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
        usuar = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        AsignarMaterias = new javax.swing.JButton();
        ConsultarUsuarios = new javax.swing.JButton();
        AltaUsuario = new javax.swing.JLabel();
        AltaNombre = new javax.swing.JLabel();
        AltaContraseña = new javax.swing.JLabel();
        camponombre = new javax.swing.JTextField();
        campousuario = new javax.swing.JTextField();
        campocontraseña = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        AltaGuardar = new javax.swing.JButton();
        AltaConfirmarContraseña1 = new javax.swing.JLabel();
        Salir = new javax.swing.JButton();
        tipo_usuario = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(153, 255, 153));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1300, 648));
        setResizable(false);
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
        Cuatrimestre.setBounds(68, 93, 111, 25);

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
        HorariosAlumnos.setBounds(540, 90, 148, 30);

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
        jSeparator1.setBounds(0, 85, 1275, 2);

        jSeparator2.setForeground(new java.awt.Color(255, 102, 0));
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(0, 124, 1275, 2);

        jSeparator3.setForeground(new java.awt.Color(255, 102, 0));
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(0, 644, 1275, 2);

        SGH.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 24)); // NOI18N
        SGH.setText("SISTEMA DE GESTIÓN DE HORARIOS");
        getContentPane().add(SGH);
        SGH.setBounds(233, 38, 414, 29);

        LogoUnipoli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo.jpg"))); // NOI18N
        getContentPane().add(LogoUnipoli);
        LogoUnipoli.setBounds(685, 20, 300, 56);

        CerrarSesion.setBackground(new java.awt.Color(255, 102, 0));
        CerrarSesion.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        CerrarSesion.setText("Cerrar sesión");
        CerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(CerrarSesion);
        CerrarSesion.setBounds(1152, 51, 113, 25);
        getContentPane().add(usuar);
        usuar.setBounds(1027, 57, 0, 0);

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
                .addContainerGap(454, Short.MAX_VALUE)
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
        jPanel2.setBounds(0, 652, 1275, 23);

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

        ConsultarUsuarios.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        ConsultarUsuarios.setText("Consultar Usuarios");
        ConsultarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarUsuariosActionPerformed(evt);
            }
        });
        getContentPane().add(ConsultarUsuarios);
        ConsultarUsuarios.setBounds(60, 270, 197, 27);

        AltaUsuario.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        AltaUsuario.setText("Usuario");
        getContentPane().add(AltaUsuario);
        AltaUsuario.setBounds(521, 317, 59, 21);

        AltaNombre.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        AltaNombre.setText("Nombre");
        getContentPane().add(AltaNombre);
        AltaNombre.setBounds(521, 270, 59, 21);

        AltaContraseña.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        AltaContraseña.setText("Contraseña");
        getContentPane().add(AltaContraseña);
        AltaContraseña.setBounds(494, 370, 86, 21);
        getContentPane().add(camponombre);
        camponombre.setBounds(598, 272, 150, 20);
        getContentPane().add(campousuario);
        campousuario.setBounds(598, 319, 150, 20);
        getContentPane().add(campocontraseña);
        campocontraseña.setBounds(598, 372, 150, 20);

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel8.setText("Usuarios");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(590, 130, 120, 30);

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel9.setText("Nuevo usuario");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(580, 230, 130, 23);

        AltaGuardar.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        AltaGuardar.setText("Guardar");
        AltaGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AltaGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(AltaGuardar);
        AltaGuardar.setBounds(648, 547, 100, 25);

        AltaConfirmarContraseña1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        AltaConfirmarContraseña1.setText("Tipo de Usuario");
        getContentPane().add(AltaConfirmarContraseña1);
        AltaConfirmarContraseña1.setBounds(460, 436, 120, 21);

        Salir.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        getContentPane().add(Salir);
        Salir.setBounds(464, 547, 90, 25);

        tipo_usuario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Invitado", "Administrador"}));
        getContentPane().add(tipo_usuario);
        tipo_usuario.setBounds(598, 438, 150, 20);

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel10.setText("Altas Usuarios");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(580, 170, 130, 23);

        label1.setText("jLabel1");
        getContentPane().add(label1);
        label1.setBounds(1000, 50, 150, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HorariosExternosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HorariosExternosActionPerformed
        // Link para modulo horarios externos
        HorariosExternos obj=new HorariosExternos();
        obj.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_HorariosExternosActionPerformed

    private void UsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuariosActionPerformed
        // Link para modulo usuarios
        Usuarios obj=new Usuarios();
        obj.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_UsuariosActionPerformed

    private void GeneraciondeHorariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GeneraciondeHorariosActionPerformed
        // Link para modulo generación de horarios
        PaginaPrincipalGeneraciondeHorarios obj=new PaginaPrincipalGeneraciondeHorarios();
        obj.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_GeneraciondeHorariosActionPerformed

    private void CuatrimestreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CuatrimestreActionPerformed
        // Link para modulo cuatrimestres
        cuatrimestres obj=new cuatrimestres();
        obj.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_CuatrimestreActionPerformed

    private void HorariosAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HorariosAlumnosActionPerformed
        // Link para modulo horarios alumnos
        HorariosAlumnos obj=new HorariosAlumnos();
        obj.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_HorariosAlumnosActionPerformed

    private void CerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarSesionActionPerformed
        // Link para modulo cerrar sesion
        IngresaralSistema obj=new IngresaralSistema();
        obj.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_CerrarSesionActionPerformed

    private void AsignarMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AsignarMateriasActionPerformed
        // Link para modulo asignar materias
        AsignarAsignatura obj=new AsignarAsignatura();
        obj.setVisible(true);
        this.dispose();
 
    }//GEN-LAST:event_AsignarMateriasActionPerformed

    private void DocentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DocentesActionPerformed
        // Link para modulo docentes
        Docentes obj=new Docentes();
        obj.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_DocentesActionPerformed

    private void ConsultarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarUsuariosActionPerformed
        // Link para asignación de privilegios
        ConsultaUsuarios obj=new ConsultaUsuarios (vinusuario);
        obj.setVisible(true);

    }//GEN-LAST:event_ConsultarUsuariosActionPerformed

    private void AltaGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AltaGuardarActionPerformed
        Conexion con=new Conexion();
        Connection con2=con.conexion();
        //declarando 
        
        String sql;
        //declaro la variable error
        String mensajeerror;
        //usamos las variables anteriormente declaradas, para referenciales que equivalen a lo que se muestra en los campos de texto
                   
        sql="INSERT INTO usuarios(nombre,nombre_usuario,contrasena,tipo_usuario)VALUES ('"+camponombre.getText()+"','"+campousuario.getText()+"','"+campocontraseña.getText()+"','"+tipo_usuario.getSelectedItem()+"')";
        //le digo a la variable que hara la del error para luego ser llamada
        
        mensajeerror="Ingresa los datos correctamente";
        try {
            PreparedStatement pst=con2.prepareStatement(sql);
            /*
            PreparedStatement pst=con2.prepareStatement(sql);
            //pst.setString(numero de campo,nombre de la caja de texto,gettext());
            pst.setString(1,camponombre.getText());
            camponombre.setText(null);
            pst.setString(2,campousuario.getText());
            campousuario.setText(null);
             pst.setString(3,campocontraseña.getText());
            campocontraseña.setText(null);
            pst.setString(4,tipo_usuario.getSelectedItem());
            */
            int n=pst.executeUpdate();
            if (n>=0){
                //son los mensajes de que se ejecuto correctamente la insercion
             JOptionPane.showMessageDialog(rootPane,"Usuario Registrado Satisfactoriamente!!!");
             limpiar();
             System.out.println("Guardado correctamente");
                    }
{
            
                        }
         }catch (Exception e){
             //lo puse de esta manera para mostrarle que no introdujo correctamente los datos
             JOptionPane.showMessageDialog(rootPane,"Ingresa los datos correctamente");
             //este mensaje solo se imprimira en el registro--
        }        // TODO add your handling code here:
    }//GEN-LAST:event_AltaGuardarActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        Usuarios   obj=new Usuarios(vinusuario);
        obj.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_SalirActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AltaConfirmarContraseña1;
    private javax.swing.JLabel AltaContraseña;
    public javax.swing.JButton AltaGuardar;
    private javax.swing.JLabel AltaNombre;
    private javax.swing.JLabel AltaUsuario;
    private javax.swing.JButton AsignarMaterias;
    private javax.swing.JButton CerrarSesion;
    private javax.swing.JButton ConsultarUsuarios;
    private javax.swing.JButton Cuatrimestre;
    private javax.swing.JButton Docentes;
    private javax.swing.JButton GeneraciondeHorarios;
    private javax.swing.JButton HorariosAlumnos;
    private javax.swing.JButton HorariosExternos;
    private javax.swing.JLabel LogoUnipoli;
    private javax.swing.JLabel SGH;
    private javax.swing.JButton Salir;
    private javax.swing.JButton Usuarios;
    private javax.swing.JPasswordField campocontraseña;
    public javax.swing.JTextField camponombre;
    private javax.swing.JTextField campousuario;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel label1;
    private javax.swing.JComboBox tipo_usuario;
    private javax.swing.JLabel usuar;
    // End of variables declaration//GEN-END:variables
private String vinusuario;
}

//ejemplo