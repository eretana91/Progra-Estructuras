package main;

import java.awt.Color;
import java.awt.Component;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Level;
import java.util.logging.Logger;

public class principal extends javax.swing.JFrame {

    public principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel_pos_6 = new javax.swing.JPanel();
        jPanel_pos_5 = new javax.swing.JPanel();
        jPanel_pos_4 = new javax.swing.JPanel();
        jPanel_pos_3 = new javax.swing.JPanel();
        jPanel_pos_2 = new javax.swing.JPanel();
        jPanel_pos_1 = new javax.swing.JPanel();
        Jlabel_cajero_1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        Jlabel_cajero_2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        Jlabel_cajero_3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel_clientes_espera = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton_agregar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Procesos Academicos");

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setPreferredSize(new java.awt.Dimension(250, 60));

        jPanel_pos_6.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel_pos_6Layout = new javax.swing.GroupLayout(jPanel_pos_6);
        jPanel_pos_6.setLayout(jPanel_pos_6Layout);
        jPanel_pos_6Layout.setHorizontalGroup(
            jPanel_pos_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );
        jPanel_pos_6Layout.setVerticalGroup(
            jPanel_pos_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        jPanel_pos_5.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel_pos_5Layout = new javax.swing.GroupLayout(jPanel_pos_5);
        jPanel_pos_5.setLayout(jPanel_pos_5Layout);
        jPanel_pos_5Layout.setHorizontalGroup(
            jPanel_pos_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );
        jPanel_pos_5Layout.setVerticalGroup(
            jPanel_pos_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        jPanel_pos_4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel_pos_4Layout = new javax.swing.GroupLayout(jPanel_pos_4);
        jPanel_pos_4.setLayout(jPanel_pos_4Layout);
        jPanel_pos_4Layout.setHorizontalGroup(
            jPanel_pos_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );
        jPanel_pos_4Layout.setVerticalGroup(
            jPanel_pos_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        jPanel_pos_3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel_pos_3Layout = new javax.swing.GroupLayout(jPanel_pos_3);
        jPanel_pos_3.setLayout(jPanel_pos_3Layout);
        jPanel_pos_3Layout.setHorizontalGroup(
            jPanel_pos_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );
        jPanel_pos_3Layout.setVerticalGroup(
            jPanel_pos_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        jPanel_pos_2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel_pos_2Layout = new javax.swing.GroupLayout(jPanel_pos_2);
        jPanel_pos_2.setLayout(jPanel_pos_2Layout);
        jPanel_pos_2Layout.setHorizontalGroup(
            jPanel_pos_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );
        jPanel_pos_2Layout.setVerticalGroup(
            jPanel_pos_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        jPanel_pos_1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel_pos_1Layout = new javax.swing.GroupLayout(jPanel_pos_1);
        jPanel_pos_1.setLayout(jPanel_pos_1Layout);
        jPanel_pos_1Layout.setHorizontalGroup(
            jPanel_pos_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );
        jPanel_pos_1Layout.setVerticalGroup(
            jPanel_pos_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel_pos_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel_pos_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel_pos_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel_pos_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel_pos_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel_pos_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel_pos_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_pos_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_pos_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_pos_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_pos_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_pos_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Jlabel_cajero_1.setToolTipText("");
        Jlabel_cajero_1.setPreferredSize(new java.awt.Dimension(60, 60));

        jLabel7.setText("1");

        javax.swing.GroupLayout Jlabel_cajero_1Layout = new javax.swing.GroupLayout(Jlabel_cajero_1);
        Jlabel_cajero_1.setLayout(Jlabel_cajero_1Layout);
        Jlabel_cajero_1Layout.setHorizontalGroup(
            Jlabel_cajero_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Jlabel_cajero_1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Jlabel_cajero_1Layout.setVerticalGroup(
            Jlabel_cajero_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Jlabel_cajero_1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(23, 23, 23))
        );

        Jlabel_cajero_2.setPreferredSize(new java.awt.Dimension(60, 60));

        jLabel8.setText("2");

        javax.swing.GroupLayout Jlabel_cajero_2Layout = new javax.swing.GroupLayout(Jlabel_cajero_2);
        Jlabel_cajero_2.setLayout(Jlabel_cajero_2Layout);
        Jlabel_cajero_2Layout.setHorizontalGroup(
            Jlabel_cajero_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Jlabel_cajero_2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Jlabel_cajero_2Layout.setVerticalGroup(
            Jlabel_cajero_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Jlabel_cajero_2Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(20, 20, 20))
        );

        Jlabel_cajero_3.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel9.setText("3");

        javax.swing.GroupLayout Jlabel_cajero_3Layout = new javax.swing.GroupLayout(Jlabel_cajero_3);
        Jlabel_cajero_3.setLayout(Jlabel_cajero_3Layout);
        Jlabel_cajero_3Layout.setHorizontalGroup(
            Jlabel_cajero_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Jlabel_cajero_3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Jlabel_cajero_3Layout.setVerticalGroup(
            Jlabel_cajero_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Jlabel_cajero_3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel9)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jLabel6.setText("<-");

        jLabel10.setText("<-");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Jlabel_cajero_2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(Jlabel_cajero_1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(Jlabel_cajero_3, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(11, 11, 11)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Jlabel_cajero_1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Jlabel_cajero_2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Jlabel_cajero_3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(26, 26, 26))
        );

        jLabel4.setText("Clientes en espera:");

        jLabel_clientes_espera.setText("0");

        jButton_agregar.setText("Agregar");
        jButton_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_agregarActionPerformed(evt);
            }
        });

        jButton1.setText("Iniciar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addComponent(jLabel_clientes_espera))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton_agregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel_clientes_espera))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_agregar))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_agregarActionPerformed
        if (colas.tamanio < max) {
            int n = 10;
            dato = (int) (Math.random() * n) + 5;
            colas.insertar(dato);
        } else {
            System.out.println("No hay espacios disponibles");
        }

        pintaFila();

        jLabel_clientes_espera.setText(Integer.toString(colas.tamanio));

    }//GEN-LAST:event_jButton_agregarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        atender();


    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Jlabel_cajero_1;
    private javax.swing.JPanel Jlabel_cajero_2;
    private javax.swing.JPanel Jlabel_cajero_3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_agregar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_clientes_espera;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel_pos_1;
    private javax.swing.JPanel jPanel_pos_2;
    private javax.swing.JPanel jPanel_pos_3;
    private javax.swing.JPanel jPanel_pos_4;
    private javax.swing.JPanel jPanel_pos_5;
    private javax.swing.JPanel jPanel_pos_6;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

    //Limpio
    Colas colas = new Colas();
    Thread cajero = new Cajero();

    int dato = 0;
    int max = 6;

    public static int generateNumber() {
        int randomInt = ThreadLocalRandom.current().nextInt(5, 15);
        return randomInt;
    }

    public void pintaFila() {
        switch (colas.tamanio) {
            case 0:
                jPanel_pos_1.setBackground(Color.GRAY);
                jPanel_pos_2.setBackground(Color.GRAY);
                jPanel_pos_3.setBackground(Color.GRAY);
                jPanel_pos_4.setBackground(Color.GRAY);
                jPanel_pos_5.setBackground(Color.GRAY);
                jPanel_pos_6.setBackground(Color.GRAY);
            case 1:
                jPanel_pos_1.setBackground(Color.GREEN);
                jPanel_pos_2.setBackground(Color.GRAY);
                jPanel_pos_3.setBackground(Color.GRAY);
                jPanel_pos_4.setBackground(Color.GRAY);
                jPanel_pos_5.setBackground(Color.GRAY);
                jPanel_pos_6.setBackground(Color.GRAY);
                break;
            case 2:
                jPanel_pos_1.setBackground(Color.GREEN);
                jPanel_pos_2.setBackground(Color.GREEN);
                jPanel_pos_3.setBackground(Color.GRAY);
                jPanel_pos_4.setBackground(Color.GRAY);
                jPanel_pos_5.setBackground(Color.GRAY);
                jPanel_pos_6.setBackground(Color.GRAY);
                break;
            case 3:
                jPanel_pos_1.setBackground(Color.GREEN);
                jPanel_pos_2.setBackground(Color.GREEN);
                jPanel_pos_3.setBackground(Color.GREEN);
                jPanel_pos_4.setBackground(Color.GRAY);
                jPanel_pos_5.setBackground(Color.GRAY);
                jPanel_pos_6.setBackground(Color.GRAY);
                break;
            case 4:
                jPanel_pos_1.setBackground(Color.GREEN);
                jPanel_pos_2.setBackground(Color.GREEN);
                jPanel_pos_3.setBackground(Color.GREEN);
                jPanel_pos_4.setBackground(Color.GREEN);
                jPanel_pos_5.setBackground(Color.GRAY);
                jPanel_pos_6.setBackground(Color.GRAY);
                break;
            case 5:
                jPanel_pos_1.setBackground(Color.GREEN);
                jPanel_pos_2.setBackground(Color.GREEN);
                jPanel_pos_3.setBackground(Color.GREEN);
                jPanel_pos_4.setBackground(Color.GREEN);
                jPanel_pos_5.setBackground(Color.GREEN);
                jPanel_pos_6.setBackground(Color.GRAY);
                break;
            case 6:
                jPanel_pos_1.setBackground(Color.GREEN);
                jPanel_pos_2.setBackground(Color.GREEN);
                jPanel_pos_3.setBackground(Color.GREEN);
                jPanel_pos_4.setBackground(Color.GREEN);
                jPanel_pos_5.setBackground(Color.GREEN);
                jPanel_pos_6.setBackground(Color.GREEN);
                break;

            default:
                System.out.println("No hay espacios disponibles");

        }
    }

    public void atender() {
        try {
            if (colas.vacia()) {
                System.out.println("No hay clientes en fila");
                Jlabel_cajero_1.setBackground(Color.GREEN);
            } else {
                colas.extraer();
                pintaFila();
                Jlabel_cajero_1.setBackground(Color.RED);
                Thread.sleep(10000);
                Jlabel_cajero_1.setBackground(Color.GREEN);
                if (!colas.vacia()) {
                    atender();
                }
            }

        } catch (Exception e) {
        }
    }
}
