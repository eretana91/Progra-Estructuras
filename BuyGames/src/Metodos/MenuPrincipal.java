package Metodos;

import Metodos.CarritoCompras;
import Formularios.Login;
import Formularios.RegistroClientes;
import Formularios.RegistroJuegos;

/**
 *
 * @author Erick Retana Sánchez
 *
 *
 */
public class MenuPrincipal extends javax.swing.JFrame {

    public MenuPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JButtonRegistroCliente = new javax.swing.JButton();
        JButtonTienda = new javax.swing.JButton();
        JButtonSalir = new javax.swing.JButton();
        JButtonRegistroJuegos = new javax.swing.JButton();
        JButtonRegistroEmpleado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Home");
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Icons/Crash.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Icons/logo.jpg"))); // NOI18N

        JButtonRegistroCliente.setText("Registro de Clientes");
        JButtonRegistroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonRegistroClienteActionPerformed(evt);
            }
        });

        JButtonTienda.setText("Tienda");
        JButtonTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonTiendaActionPerformed(evt);
            }
        });

        JButtonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Icons/SignOut.png"))); // NOI18N
        JButtonSalir.setMinimumSize(new java.awt.Dimension(50, 50));
        JButtonSalir.setPreferredSize(new java.awt.Dimension(50, 50));
        JButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonSalirActionPerformed(evt);
            }
        });

        JButtonRegistroJuegos.setText("Registro de Juegos");
        JButtonRegistroJuegos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonRegistroJuegosActionPerformed(evt);
            }
        });

        JButtonRegistroEmpleado.setText("Registro de Empleados");
        JButtonRegistroEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonRegistroEmpleadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(JButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JButtonRegistroCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JButtonRegistroJuegos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JButtonRegistroEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JButtonTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(39, 39, 39)
                        .addComponent(JButtonRegistroCliente)
                        .addGap(18, 18, 18)
                        .addComponent(JButtonRegistroEmpleado)
                        .addGap(18, 18, 18)
                        .addComponent(JButtonRegistroJuegos))
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(JButtonTienda)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        getAccessibleContext().setAccessibleName("Menu Principal");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonSalirActionPerformed
        dispose();
        Login frame = new Login();
        frame.setSize(800, 650);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }//GEN-LAST:event_JButtonSalirActionPerformed

    private void JButtonRegistroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonRegistroClienteActionPerformed
        dispose();
        RegistroClientes frame = new RegistroClientes();
        frame.setSize(450, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


    }//GEN-LAST:event_JButtonRegistroClienteActionPerformed

    private void JButtonTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonTiendaActionPerformed
        //Codigo para ir a ventana de Catalogo de Juegos
        dispose();
        CarritoCompras frame = new CarritoCompras();
        frame.setSize(800, 650);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }//GEN-LAST:event_JButtonTiendaActionPerformed

    private void JButtonRegistroJuegosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonRegistroJuegosActionPerformed
        dispose();
        RegistroJuegos frame = new RegistroJuegos();
        frame.setSize(450, 450);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }//GEN-LAST:event_JButtonRegistroJuegosActionPerformed

    private void JButtonRegistroEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonRegistroEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JButtonRegistroEmpleadoActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonRegistroCliente;
    private javax.swing.JButton JButtonRegistroEmpleado;
    private javax.swing.JButton JButtonRegistroJuegos;
    private javax.swing.JButton JButtonSalir;
    private javax.swing.JButton JButtonTienda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
