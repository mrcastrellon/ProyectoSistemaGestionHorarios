/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inicio.usuarios.administrador.cuatrimestres;

import inicio.IngresaralSistema;
import inicio.usuarios.administrador.usuarios.AltasUsuarios;
import inicio.usuarios.administrador.horariosexternos.HorariosExternos;
import inicio.usuarios.administrador.horariosalumnos.HorariosAlumnos;
import inicio.usuarios.administrador.docentes.Docentes;
import inicio.usuarios.administrador.asignarmaterias.AsignarAsignatura;
import inicio.usuarios.administrador.cuatrimestres.EliminarAsignaturas;
import inicio.usuarios.administrador.cuatrimestres.ModificarAsignaturas;
import inicio.usuarios.administrador.cuatrimestres.cuatrimestres;
import inicio.usuarios.administrador.cuatrimestres.AltasCuatrimestre;
import inicio.usuarios.administrador.usuarios.Usuarios;
import inicio.usuarios.administrador.generaciondehorarios.PaginaPrincipalGeneraciondeHorarios;
import inicio.usuarios.administrador.cuatrimestres.AltasAsignaturas;

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
         }
        //este codigo es para trabajar en los formularios 
       void mostrardatos(){
       modelo = new DefaultTableModel();
        modelo.addColumn("cuatrimestre_id");
        modelo.addColumn("nombre");
        modelo.addColumn("clave");
        modelo.addColumn("creditos");
        modelo.addColumn("horas");
        
     
        
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
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        AsignarMaterias = new javax.swing.JButton();
        AltasdeUsuarios = new javax.swing.JButton();
        AsignaciondePrivilegios = new javax.swing.JButton();
        ModificaciondeUsuarios = new javax.swing.JButton();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(153, 255, 153));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Cuatrimestre.setBackground(new java.awt.Color(255, 102, 0));
        Cuatrimestre.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        Cuatrimestre.setText("Cuatrimestre");
        Cuatrimestre.setAlignmentX(0.1F);
        Cuatrimestre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CuatrimestreActionPerformed(evt);
            }
        });

        Docentes.setBackground(new java.awt.Color(255, 102, 0));
        Docentes.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        Docentes.setText("Docentes");
        Docentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DocentesActionPerformed(evt);
            }
        });

        HorariosExternos.setBackground(new java.awt.Color(255, 102, 0));
        HorariosExternos.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        HorariosExternos.setText("Horarios Externos");
        HorariosExternos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HorariosExternosActionPerformed(evt);
            }
        });

        HorariosAlumnos.setBackground(new java.awt.Color(255, 102, 0));
        HorariosAlumnos.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        HorariosAlumnos.setText("Horarios Alumnos");
        HorariosAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HorariosAlumnosActionPerformed(evt);
            }
        });

        Usuarios.setBackground(new java.awt.Color(255, 102, 0));
        Usuarios.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        Usuarios.setText("Usuarios");
        Usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuariosActionPerformed(evt);
            }
        });

        GeneraciondeHorarios.setBackground(new java.awt.Color(255, 102, 102));
        GeneraciondeHorarios.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        GeneraciondeHorarios.setText("Generación de Horarios");
        GeneraciondeHorarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GeneraciondeHorariosActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(255, 102, 0));

        jSeparator2.setForeground(new java.awt.Color(255, 102, 0));

        jSeparator3.setForeground(new java.awt.Color(255, 102, 0));

        SGH.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 24)); // NOI18N
        SGH.setText("SISTEMA DE GESTIÓN DE HORARIOS");

        LogoUnipoli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo.jpg"))); // NOI18N

        CerrarSesion.setBackground(new java.awt.Color(255, 102, 0));
        CerrarSesion.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        CerrarSesion.setText("Cerrar sesión");
        CerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarSesionActionPerformed(evt);
            }
        });

        NombredelUsuario.setText("Nombre del Usuario");

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel2.setText("Página Principal");

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(401, 401, 401))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jLabel3))
        );

        AsignarMaterias.setBackground(new java.awt.Color(255, 102, 0));
        AsignarMaterias.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        AsignarMaterias.setText("Asignar Materias");
        AsignarMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AsignarMateriasActionPerformed(evt);
            }
        });

        AltasdeUsuarios.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        AltasdeUsuarios.setText("Alta Asignaturas");
        AltasdeUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AltasdeUsuariosActionPerformed(evt);
            }
        });

        AsignaciondePrivilegios.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        AsignaciondePrivilegios.setText("Modificar Asignatura");
        AsignaciondePrivilegios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AsignaciondePrivilegiosActionPerformed(evt);
            }
        });

        ModificaciondeUsuarios.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        ModificaciondeUsuarios.setText("Eliminar Asignatura");
        ModificaciondeUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificaciondeUsuariosActionPerformed(evt);
            }
        });

        ConsultarUsuarios.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        ConsultarUsuarios.setText("Alta Cuatrimestres");
        ConsultarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarUsuariosActionPerformed(evt);
            }
        });

        AltaUsuario.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        AltaUsuario.setText("Clave");

        AltaNombre.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        AltaNombre.setText("Nombre");

        AltaContraseña.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        AltaContraseña.setText("Creditos");

        AltaConfirmarContraseña.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        AltaConfirmarContraseña.setText("Horas");

        nombrecampo.setText("Ingresa Nombre");
        nombrecampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombrecampoActionPerformed(evt);
            }
        });

        clavecampo.setText("Ingresa Clave ");
        clavecampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clavecampoActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel8.setText("Usuarios");

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel9.setText("Altas Asignaturas");

        AltaGuardar.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        AltaGuardar.setText("Guardar");
        AltaGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AltaGuardarActionPerformed(evt);
            }
        });

        creditoscampo.setText("Ingresa el Numero de Creditos");
        creditoscampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditoscampoActionPerformed(evt);
            }
        });

        horascampo.setText("Ingresa el Numero de Horas");
        horascampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horascampoActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

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

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Lista de asignaturas ya registradas en la base de datos ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1304, Short.MAX_VALUE)
            .addComponent(jSeparator3)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(SGH, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(LogoUnipoli, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                        .addGap(42, 42, 42)
                        .addComponent(NombredelUsuario)
                        .addGap(32, 32, 32)
                        .addComponent(CerrarSesion))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(Cuatrimestre)
                        .addGap(37, 37, 37)
                        .addComponent(Docentes, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(HorariosExternos)
                        .addGap(52, 52, 52)
                        .addComponent(HorariosAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(AsignarMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(Usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(GeneraciondeHorarios)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(527, 527, 527))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(577, 577, 577))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(AltaGuardar)
                                .addGap(25, 25, 25)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(AltasdeUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(AsignaciondePrivilegios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(ModificaciondeUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(ConsultarUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(103, 103, 103)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(AltaNombre)
                                                .addComponent(AltaUsuario))
                                            .addComponent(AltaContraseña)))
                                    .addComponent(AltaConfirmarContraseña))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(clavecampo)
                                    .addComponent(nombrecampo)
                                    .addComponent(creditoscampo)
                                    .addComponent(horascampo, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(233, 233, 233))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(586, 586, 586))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LogoUnipoli, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(CerrarSesion)
                                .addComponent(NombredelUsuario)))
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(SGH, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cuatrimestre)
                    .addComponent(Docentes)
                    .addComponent(HorariosExternos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(HorariosAlumnos)
                    .addComponent(Usuarios)
                    .addComponent(GeneraciondeHorarios)
                    .addComponent(AsignarMaterias))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel1)
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombrecampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AltaNombre))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(clavecampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AltaUsuario))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(creditoscampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AltaContraseña))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(horascampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AltaConfirmarContraseña)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AltasdeUsuarios)
                        .addGap(32, 32, 32)
                        .addComponent(AsignaciondePrivilegios)
                        .addGap(33, 33, 33)
                        .addComponent(ModificaciondeUsuarios)
                        .addGap(36, 36, 36)
                        .addComponent(ConsultarUsuarios)
                        .addGap(2, 2, 2)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AltaGuardar)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

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

    private void ModificaciondeUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificaciondeUsuariosActionPerformed
        // Link para eliminar asignatura
        EliminarAsignaturas obj=new EliminarAsignaturas();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_ModificaciondeUsuariosActionPerformed

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
                   
        sql="INSERT INTO asignatura(nombre,clave,creditos,horas)VALUES (?,?,?,?)";
        //le digo a la variable que hara la del error para luego ser llamada
        mensajeerror="Ingresa los datos correctamente";
        try {
            PreparedStatement pst=con2.prepareStatement(sql);
            //pst.setString(numero de campo,nombre de la caja de texto,gettext());
            pst.setString(1,nombrecampo.getText());
            pst.setString(2,clavecampo.getText());
            pst.setString(3,creditoscampo.getText());
            pst.setString(4,horascampo.getText());            
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
            java.util.logging.Logger.getLogger(AltasUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AltasUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AltasUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AltasUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        
        // comente eso ee 27-11-14   al final note que si quito esto, no funcionan el run directamente desde la pantalla
        java.awt.EventQueue.invokeLater(new Runnable() {
           public void run() {
               new AltasAsignaturas().setVisible(true);
            }
       });
        
        //hasta aqui lo comente para en caso de que falle
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AltaConfirmarContraseña;
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
    private javax.swing.JButton ModificaciondeUsuarios;
    private javax.swing.JLabel NombredelUsuario;
    private javax.swing.JLabel SGH;
    private javax.swing.JButton Usuarios;
    private javax.swing.JTextField clavecampo;
    private javax.swing.JTextField creditoscampo;
    private javax.swing.JTextField horascampo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
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
