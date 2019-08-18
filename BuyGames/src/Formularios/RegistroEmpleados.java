package Formularios;

import Metodos.ConexionDB;
import java.sql.Statement;
import Objectos.Cliente;
import Metodos.MenuPrincipal;
import Objectos.Empleado;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Erick Retana Sánchez
 *
 *
 */
public class RegistroEmpleados extends javax.swing.JFrame {

    javax.swing.ImageIcon check = new javax.swing.ImageIcon(getClass().getResource("/Pictures/Icons/check.png"));

    public RegistroEmpleados() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JTextNombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        JTextApellido = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        JTextCorreo = new javax.swing.JTextField();
        JTextDireccion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        JTextCedula = new javax.swing.JTextField();
        JButtonAgregar = new javax.swing.JButton();
        JTextPassword2 = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        JTextTelefono = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        JTextUsuario = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        JTextPassword1 = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        JButtonMenuPrincipal = new javax.swing.JButton();
        ShowButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        CleanButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Registro de Clientes");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(450, 550));
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel11.setText("Nuevo Empleado");

        jLabel3.setText("Nombre:");

        JTextNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                JTextNombreFocusLost(evt);
            }
        });
        JTextNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextNombreActionPerformed(evt);
            }
        });
        JTextNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTextNombreKeyTyped(evt);
            }
        });

        jLabel7.setText("Apellido:");

        JTextApellido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                JTextApellidoFocusLost(evt);
            }
        });
        JTextApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextApellidoActionPerformed(evt);
            }
        });
        JTextApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTextApellidoKeyTyped(evt);
            }
        });

        jLabel6.setText("Correo:");

        JTextCorreo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                JTextCorreoFocusLost(evt);
            }
        });
        JTextCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTextCorreoKeyTyped(evt);
            }
        });

        JTextDireccion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                JTextDireccionFocusLost(evt);
            }
        });
        JTextDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTextDireccionKeyTyped(evt);
            }
        });

        jLabel4.setText("Dirección:");

        jLabel8.setText("Cedula:");

        JTextCedula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                JTextCedulaFocusLost(evt);
            }
        });
        JTextCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextCedulaActionPerformed(evt);
            }
        });
        JTextCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTextCedulaKeyTyped(evt);
            }
        });

        JButtonAgregar.setText("Agregar");
        JButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonAgregarActionPerformed(evt);
            }
        });

        JTextPassword2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextPassword2ActionPerformed(evt);
            }
        });
        JTextPassword2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTextPassword2KeyTyped(evt);
            }
        });

        jLabel5.setText("Telefono:");

        JTextTelefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                JTextTelefonoFocusLost(evt);
            }
        });
        JTextTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTextTelefonoKeyTyped(evt);
            }
        });

        jLabel9.setText("Usuario:");

        JTextUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                JTextUsuarioFocusLost(evt);
            }
        });
        JTextUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextUsuarioActionPerformed(evt);
            }
        });
        JTextUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTextUsuarioKeyTyped(evt);
            }
        });

        jLabel13.setText("Contraseña:");

        JTextPassword1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextPassword1ActionPerformed(evt);
            }
        });
        JTextPassword1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTextPassword1KeyTyped(evt);
            }
        });

        jLabel12.setText("Confirmar contraseña:");

        JButtonMenuPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Icons/home.png"))); // NOI18N
        JButtonMenuPrincipal.setPreferredSize(new java.awt.Dimension(50, 50));
        JButtonMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonMenuPrincipalActionPerformed(evt);
            }
        });

        ShowButton.setText("Ver Empleados");
        ShowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowButtonActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Icons/gamer.png"))); // NOI18N

        CleanButton.setText("Limpiar Datos");
        CleanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CleanButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(JTextNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                                    .addComponent(JTextApellido, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JTextDireccion, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JTextCorreo, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JTextUsuario)
                                    .addComponent(JTextTelefono)
                                    .addComponent(JTextCedula)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(JTextPassword2))
                                .addGap(44, 44, 44)
                                .addComponent(CleanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel13)
                                    .addComponent(JTextPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(ShowButton)
                                                .addComponent(JButtonMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addComponent(JButtonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 1, Short.MAX_VALUE)))))
                        .addGap(20, 20, 20))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3))
                    .addComponent(JButtonMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTextApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTextCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ShowButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(JTextDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JTextCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTextTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTextUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CleanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTextPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JButtonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTextPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("Regitro de Clientes");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JButtonMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonMenuPrincipalActionPerformed
        dispose();
        MenuPrincipal frame = new MenuPrincipal();
        frame.setSize(650, 440);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }//GEN-LAST:event_JButtonMenuPrincipalActionPerformed

    private void CleanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CleanButtonActionPerformed
        //Limpia todos los campos del formulario de registro
        JTextNombre.setText("");
        JTextApellido.setText("");
        JTextCorreo.setText("");
        JTextDireccion.setText("");
        JTextTelefono.setText("");
        JTextCedula.setText("");
        JTextUsuario.setText("");
        JTextPassword1.setText("");
        JTextPassword2.setText("");


    }//GEN-LAST:event_CleanButtonActionPerformed

    private void JButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonAgregarActionPerformed
        String clave1 = String.valueOf(JTextPassword1.getPassword());
        String clave2 = String.valueOf(JTextPassword2.getPassword());

        if ((clave1.equals(clave2))) {

            if (JTextNombre.getText().length() < 1) {
                JOptionPane.showMessageDialog(null, "Por favor ingrese un nombre valido");
                return;
            }
            if (JTextApellido.getText().length() < 1) {
                JOptionPane.showMessageDialog(null, "Por favor ingrese un apellido valido");
                return;
            }
            if (JTextCorreo.getText().contains("@") == false) {
                JOptionPane.showMessageDialog(null, "Por favor ingrese una cuenta de correo valida");
                return;
            }
            if (JTextDireccion.getText().length() < 5) {
                JOptionPane.showMessageDialog(null, "Por favor ingrese una direccion valida");
                return;
            }
            if (JTextTelefono.getText().length() < 8) {
                JOptionPane.showMessageDialog(null, "Por favor ingrese un numero de telefono valido");
                return;
            }
            if (JTextCedula.getText().length() < 9) {
                JOptionPane.showMessageDialog(null, "Por favor ingrese un numero de cedula valido");

            } else {

                String nombre = JTextNombre.getText();
                String apellido = JTextApellido.getText();
                String direccion = JTextDireccion.getText();
                String telefono = JTextTelefono.getText();
                String correo = JTextCorreo.getText();
                String cedula = JTextCedula.getText();
                String usuario = JTextUsuario.getText();
                String clave = String.valueOf(JTextPassword1.getPassword());
                String tabla = "empleados";
                String tablaUsuarios = "usuarios";
                Empleado nuevo = new Empleado(usuario,clave,nombre,apellido,direccion,telefono,correo,cedula);

                //Conexion a base de datos
                ConexionDB conexion = new ConexionDB();

                String SSQL1 = "INSERT INTO " + tabla + " VALUES "
                        + "(null,'" + nuevo.getNombre() + "','" + nuevo.getApellido() + "'"
                        + ",'" + nuevo.getEmail() + "','" + nuevo.getDireccion() + "'"
                        + ",'" + nuevo.getCedula() + "','" + nuevo.getTelefono() + "' )";
                String SSQL2 = "INSERT INTO " +tablaUsuarios+ " VALUES (null, '"+nuevo.getUsername()+"'"
                        + ", '"+nuevo.getPassword()+"')";
                
                Connection conect = null;

                try {
                    conect = conexion.dataSource.getConnection();
                    Statement st = conect.createStatement();
                    st.executeUpdate(SSQL1);
                    st.executeUpdate(SSQL2);

                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex, "Error de conexión", JOptionPane.ERROR_MESSAGE);
                } finally {
                }
                try {
                    conect.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex, "Error de desconexión", JOptionPane.ERROR_MESSAGE);
                }
                JOptionPane.showMessageDialog(null, "Se agrego el nuevo Cliente a la Base de Datos");
                //Limpia todos los campos del formulario de registro
                JTextNombre.setText("");
                JTextApellido.setText("");
                JTextCorreo.setText("");
                JTextDireccion.setText("");
                JTextTelefono.setText("");
                JTextCedula.setText("");
                JTextUsuario.setText("");
                JTextPassword1.setText("");
                JTextPassword2.setText("");

            }
        } else {
            JOptionPane.showMessageDialog(null, "La nueva contraseña y la contraseña de confirmación son diferentes");
        }
    }//GEN-LAST:event_JButtonAgregarActionPerformed

    private void JTextNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextNombreActionPerformed

    private void JTextNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextNombreKeyTyped
        //Codigo para limitar la cantidad de caracteres
        if (JTextNombre.getText().length() == 20) {
            evt.consume();
        }
        //Codigo para solo permitir letras en el campo Nombre Completo del Formulario
        char TipoDeTecla = evt.getKeyChar();
        if (!Character.isWhitespace(TipoDeTecla) && !Character.isLetter(TipoDeTecla)) {
            evt.consume();
        } else {
        }
    }//GEN-LAST:event_JTextNombreKeyTyped

    private void JTextUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextUsuarioKeyTyped
        //Codigo para limitar la cantidad de caracteres
        if (JTextUsuario.getText().length() == 8) {
            evt.consume();
        }
    }//GEN-LAST:event_JTextUsuarioKeyTyped

    private void JTextNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTextNombreFocusLost

    }//GEN-LAST:event_JTextNombreFocusLost

    private void JTextDireccionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTextDireccionFocusLost

    }//GEN-LAST:event_JTextDireccionFocusLost

    private void JTextUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTextUsuarioFocusLost

    }//GEN-LAST:event_JTextUsuarioFocusLost

    private void JTextCorreoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTextCorreoFocusLost

    }//GEN-LAST:event_JTextCorreoFocusLost

    private void ShowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowButtonActionPerformed

    }//GEN-LAST:event_ShowButtonActionPerformed

    private void JTextDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextDireccionKeyTyped
        //Codigo para limitar la cantidad de caracteres
        if (JTextDireccion.getText().length() == 15) {
            evt.consume();
        }
    }//GEN-LAST:event_JTextDireccionKeyTyped

    private void JTextCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextCorreoKeyTyped
        //Codigo para limitar la cantidad de caracteres
        if (JTextDireccion.getText().length() == 20) {
            evt.consume();
        }
    }//GEN-LAST:event_JTextCorreoKeyTyped

    private void JTextApellidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTextApellidoFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextApellidoFocusLost

    private void JTextApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextApellidoActionPerformed

    private void JTextApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextApellidoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextApellidoKeyTyped

    private void JTextCedulaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTextCedulaFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextCedulaFocusLost

    private void JTextCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextCedulaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextCedulaKeyTyped

    private void JTextCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextCedulaActionPerformed

    private void JTextTelefonoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTextTelefonoFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextTelefonoFocusLost

    private void JTextTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextTelefonoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextTelefonoKeyTyped

    private void JTextPassword2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextPassword2ActionPerformed

    }//GEN-LAST:event_JTextPassword2ActionPerformed

    private void JTextPassword2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextPassword2KeyTyped
        if (JTextPassword2.getText().length() == 20) {
            evt.consume();
        }
    }//GEN-LAST:event_JTextPassword2KeyTyped

    private void JTextPassword1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextPassword1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextPassword1ActionPerformed

    private void JTextPassword1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextPassword1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextPassword1KeyTyped

    private void JTextUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroEmpleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CleanButton;
    private javax.swing.JButton JButtonAgregar;
    private javax.swing.JButton JButtonMenuPrincipal;
    private javax.swing.JTextField JTextApellido;
    private javax.swing.JTextField JTextCedula;
    private javax.swing.JTextField JTextCorreo;
    private javax.swing.JTextField JTextDireccion;
    private javax.swing.JTextField JTextNombre;
    private javax.swing.JPasswordField JTextPassword1;
    private javax.swing.JPasswordField JTextPassword2;
    private javax.swing.JTextField JTextTelefono;
    private javax.swing.JTextField JTextUsuario;
    private javax.swing.JButton ShowButton;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
