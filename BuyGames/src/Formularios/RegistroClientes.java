package Formularios;

import Metodos.ConexionDB;
import java.sql.Statement;
import Objectos.Cliente;
import Metodos.MenuPrincipal;
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
public class RegistroClientes extends javax.swing.JFrame {

    javax.swing.ImageIcon check = new javax.swing.ImageIcon(getClass().getResource("/Pictures/Icons/check.png"));

    public RegistroClientes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        JTextNombre = new javax.swing.JTextField();
        JTextDireccion = new javax.swing.JTextField();
        JTextPhone = new javax.swing.JTextField();
        JTextCorreo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        JButtonSalir = new javax.swing.JButton();
        RegisterButton = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        JButtonMenuPrincipal = new javax.swing.JButton();
        CleanButton = new javax.swing.JButton();
        ShowButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        JTextApellido = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        JTextCedula = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Register Client");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(450, 400));
        setResizable(false);

        jLabel3.setText("Nombre:");

        jLabel4.setText("Dirección:");

        jLabel5.setText("Telefono:");

        jLabel6.setText("Correo:");

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

        JTextPhone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                JTextPhoneFocusLost(evt);
            }
        });
        JTextPhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTextPhoneKeyTyped(evt);
            }
        });

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

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Icons/gamer.png"))); // NOI18N

        JButtonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Icons/SignOut.png"))); // NOI18N
        JButtonSalir.setPreferredSize(new java.awt.Dimension(50, 50));
        JButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonSalirActionPerformed(evt);
            }
        });

        RegisterButton.setText("Registro");
        RegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterButtonActionPerformed(evt);
            }
        });

        jLabel11.setText("Nuevo Cliente");

        JButtonMenuPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Icons/home.png"))); // NOI18N
        JButtonMenuPrincipal.setPreferredSize(new java.awt.Dimension(50, 50));
        JButtonMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonMenuPrincipalActionPerformed(evt);
            }
        });

        CleanButton.setText("Limpiar");
        CleanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CleanButtonActionPerformed(evt);
            }
        });

        ShowButton.setText("Ver Clientes");
        ShowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowButtonActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(61, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(JTextNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                            .addComponent(jLabel7)
                            .addComponent(JTextApellido)
                            .addComponent(jLabel6)
                            .addComponent(JTextCorreo)
                            .addComponent(JTextDireccion)
                            .addComponent(JTextCedula)
                            .addComponent(JTextPhone))
                        .addGap(45, 45, 45)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JButtonMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(CleanButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RegisterButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(ShowButton))
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(JButtonMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(CleanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ShowButton)
                        .addGap(52, 52, 52))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTextApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTextCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTextDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addGap(2, 2, 2)
                        .addComponent(JTextCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addGap(4, 4, 4)
                        .addComponent(JTextPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
        );

        getAccessibleContext().setAccessibleName("Regitro de Clientes");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JButtonMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonMenuPrincipalActionPerformed
        dispose();
        MenuPrincipal frame = new MenuPrincipal();
        frame.setSize(800, 650);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }//GEN-LAST:event_JButtonMenuPrincipalActionPerformed

    private void JButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonSalirActionPerformed
        dispose();
        Login frame = new Login();
        frame.setSize(800, 650);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }//GEN-LAST:event_JButtonSalirActionPerformed

    private void CleanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CleanButtonActionPerformed
        //Limpia todos los campos del formulario de registro
        JTextNombre.setText("");
        JTextDireccion.setText("");
        JTextPhone.setText("");
        JTextCorreo.setText("");
        CheckName.setIcon(null);
        CheckUsername.setIcon(null);
        CheckPassword.setIcon(null);
        CheckAddress.setIcon(null);
        CheckPhone.setIcon(null);
        CheckEmail.setIcon(null);
    }//GEN-LAST:event_CleanButtonActionPerformed

    private void RegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterButtonActionPerformed
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
        if (JTextPhone.getText().length() < 8) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese un numero de telefono valido");
            return;
        }
        if (JTextCedula.getText().length() < 9) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese un numero de cedula valido");

        } else {

            String nombre = JTextNombre.getText();
            String apellido = JTextApellido.getText();
            String direccion = JTextDireccion.getText();
            String telefono = JTextPhone.getText();
            String correo = JTextCorreo.getText();
            String cedula = JTextCedula.getText();
            String tabla = "clientes";
            Cliente nuevo = new Cliente(nombre, apellido, direccion, telefono, correo, cedula);

            //Conexion a base de datos
            ConexionDB conexion = new ConexionDB();


            String SSQL = "INSERT INTO "+tabla+" VALUES "
                    + "(1,'"+nuevo.getNombre()+"','"+nuevo.getApellido()+"'"
                    + ",'"+nuevo.getEmail()+"','"+nuevo.getDireccion()+"'"
                    + ",'"+nuevo.getCedula()+"','"+nuevo.getTelefono()+"' )";
            System.out.println(SSQL);
            Connection conect = null;

            try {
                conect = conexion.dataSource.getConnection();
                Statement st = conect.createStatement();
                st.executeUpdate(SSQL);

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex, "Error de conexión", JOptionPane.ERROR_MESSAGE);
            } finally {
            }
            try {
                conect.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex, "Error de desconexión", JOptionPane.ERROR_MESSAGE);
            }

            //Limpia todos los campos del formulario de registro
            JTextNombre.setText("");
            JTextDireccion.setText("");
            JTextPhone.setText("");
            JTextCorreo.setText("");
            CheckName.setIcon(null);
            CheckAddress.setIcon(null);
            CheckPhone.setIcon(null);
            CheckEmail.setIcon(null);

        }
    }//GEN-LAST:event_RegisterButtonActionPerformed


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

    private void JTextPhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextPhoneKeyTyped
        //Codigo para limitar la cantidad de caracteres
        if (JTextPhone.getText().length() == 8) {
            evt.consume();
        }
        //Codigo para solo permitir numeros en el campo Telefono del Formulario
        char TipoDeTecla = evt.getKeyChar();
        if (!Character.isDigit(TipoDeTecla)) {
            evt.consume();
        }
    }//GEN-LAST:event_JTextPhoneKeyTyped

    private void JTextNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTextNombreFocusLost
        // Codigo para poner Check si el campo esta lleno
        if (JTextNombre.getText().length() >= 5) {
            CheckName.setIcon(check);
        } else {
            CheckName.setIcon(null);
        }
    }//GEN-LAST:event_JTextNombreFocusLost

    private void JTextDireccionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTextDireccionFocusLost
        // Codigo para poner Check si el campo esta lleno
        if (JTextDireccion.getText().length() >= 5) {
            CheckAddress.setIcon(check);
        } else {
            CheckAddress.setIcon(null);
        }
    }//GEN-LAST:event_JTextDireccionFocusLost

    private void JTextPhoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTextPhoneFocusLost
        // Codigo para poner Check si el campo esta lleno
        if (JTextPhone.getText().length() == 8) {
            CheckPhone.setIcon(check);
        } else {
            CheckPhone.setIcon(null);
        }
    }//GEN-LAST:event_JTextPhoneFocusLost

    private void JTextCorreoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTextCorreoFocusLost
        // Codigo para poner Check si el campo esta lleno
        if (JTextCorreo.getText().contains("@")) {
            CheckEmail.setIcon(check);
        } else {
            CheckEmail.setIcon(null);
        }
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
            java.util.logging.Logger.getLogger(RegistroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CleanButton;
    private javax.swing.JButton JButtonMenuPrincipal;
    private javax.swing.JButton JButtonSalir;
    private javax.swing.JTextField JTextApellido;
    private javax.swing.JTextField JTextCedula;
    private javax.swing.JTextField JTextCorreo;
    private javax.swing.JTextField JTextDireccion;
    private javax.swing.JTextField JTextNombre;
    private javax.swing.JTextField JTextPhone;
    private javax.swing.JButton RegisterButton;
    private javax.swing.JButton ShowButton;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
