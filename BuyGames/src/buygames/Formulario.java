package buygames;
import javax.swing.JOptionPane;
/**
 *
 * @author Erick Retana Sánchez
 * 
 **/
public class Formulario extends javax.swing.JFrame {
    
    javax.swing.ImageIcon check = new javax.swing.ImageIcon(getClass().getResource("/Pictures/Icons/check.png"));
    public Formulario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        FullName = new javax.swing.JTextField();
        Address = new javax.swing.JTextField();
        Phone = new javax.swing.JTextField();
        Email = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        OutButton = new javax.swing.JButton();
        RegisterButton = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        HomeButton = new javax.swing.JButton();
        CleanButton = new javax.swing.JButton();
        CheckName = new javax.swing.JLabel();
        CheckUsername = new javax.swing.JLabel();
        CheckPassword = new javax.swing.JLabel();
        CheckAddress = new javax.swing.JLabel();
        CheckPhone = new javax.swing.JLabel();
        CheckEmail = new javax.swing.JLabel();
        ShowButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Register Client");
        setResizable(false);

        jLabel3.setText("Full Name:");

        jLabel4.setText("Address:");

        jLabel5.setText("Phone:");

        jLabel6.setText("Email:");

        FullName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                FullNameFocusLost(evt);
            }
        });
        FullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FullNameActionPerformed(evt);
            }
        });
        FullName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FullNameKeyTyped(evt);
            }
        });

        Address.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                AddressFocusLost(evt);
            }
        });
        Address.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AddressKeyTyped(evt);
            }
        });

        Phone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                PhoneFocusLost(evt);
            }
        });
        Phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PhoneKeyTyped(evt);
            }
        });

        Email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                EmailFocusLost(evt);
            }
        });
        Email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                EmailKeyTyped(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Icons/logo.jpg"))); // NOI18N

        OutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Icons/SignOut.png"))); // NOI18N
        OutButton.setPreferredSize(new java.awt.Dimension(50, 50));
        OutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OutButtonActionPerformed(evt);
            }
        });

        RegisterButton.setText("Register");
        RegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterButtonActionPerformed(evt);
            }
        });

        jLabel11.setText("New Client");

        HomeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Icons/home.png"))); // NOI18N
        HomeButton.setPreferredSize(new java.awt.Dimension(50, 50));
        HomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButtonActionPerformed(evt);
            }
        });

        CleanButton.setText("Clean");
        CleanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CleanButtonActionPerformed(evt);
            }
        });

        CheckName.setMaximumSize(new java.awt.Dimension(30, 30));
        CheckName.setMinimumSize(new java.awt.Dimension(30, 30));
        CheckName.setPreferredSize(new java.awt.Dimension(30, 30));

        CheckUsername.setMaximumSize(new java.awt.Dimension(30, 30));
        CheckUsername.setMinimumSize(new java.awt.Dimension(30, 30));
        CheckUsername.setPreferredSize(new java.awt.Dimension(30, 30));

        CheckPassword.setMaximumSize(new java.awt.Dimension(30, 30));
        CheckPassword.setMinimumSize(new java.awt.Dimension(30, 30));
        CheckPassword.setPreferredSize(new java.awt.Dimension(30, 30));

        CheckAddress.setMaximumSize(new java.awt.Dimension(30, 30));
        CheckAddress.setMinimumSize(new java.awt.Dimension(30, 30));
        CheckAddress.setPreferredSize(new java.awt.Dimension(30, 30));

        CheckPhone.setMaximumSize(new java.awt.Dimension(30, 30));
        CheckPhone.setMinimumSize(new java.awt.Dimension(30, 30));
        CheckPhone.setPreferredSize(new java.awt.Dimension(30, 30));

        CheckEmail.setMaximumSize(new java.awt.Dimension(30, 30));
        CheckEmail.setMinimumSize(new java.awt.Dimension(30, 30));
        CheckEmail.setPreferredSize(new java.awt.Dimension(30, 30));

        ShowButton.setText("Show Clients");
        ShowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(73, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(FullName, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Email, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Phone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                                    .addComponent(Address, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ShowButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(CleanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(RegisterButton, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CheckName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CheckUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CheckPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CheckAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CheckPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CheckEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 367, Short.MAX_VALUE)
                                .addComponent(HomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OutButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(OutButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(HomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 78, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel11)
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabel3)
                                                                        .addComponent(FullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                    .addComponent(CheckName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(29, 29, 29))
                                                            .addComponent(CheckUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(18, 18, 18)
                                                        .addComponent(CheckPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jLabel4))
                                                        .addGap(10, 10, 10))
                                                    .addComponent(CheckAddress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel5)
                                                    .addComponent(Phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(CheckPhone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6)))
                                    .addComponent(CheckEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(RegisterButton)
                                    .addComponent(CleanButton))))
                        .addGap(18, 18, 18)
                        .addComponent(ShowButton)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel10)
                        .addGap(27, 27, 27))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButtonActionPerformed
            dispose();
            Welcome frame = new Welcome();
            frame.setSize(800,650);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
    }//GEN-LAST:event_HomeButtonActionPerformed

    private void OutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OutButtonActionPerformed
            dispose();
            login frame = new login();
            frame.setSize(800,650);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
    }//GEN-LAST:event_OutButtonActionPerformed

    private void CleanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CleanButtonActionPerformed
        //Limpia todos los campos del formulario de registro
        FullName.setText("");
        Address.setText("");
        Phone.setText("");
        Email.setText("");
        CheckName.setIcon(null);
        CheckUsername.setIcon(null);
        CheckPassword.setIcon(null);
        CheckAddress.setIcon(null);
        CheckPhone.setIcon(null);
        CheckEmail.setIcon(null);
    }//GEN-LAST:event_CleanButtonActionPerformed
    //Variables de Vector para almacenar los Clientes
    int arrPos = 0; //Contador de Posicion en vector
    int x = 50; //Tamaño de Clientes para Vector
    Cliente c[] = new Cliente[x];
    private void RegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterButtonActionPerformed
       if(FullName.getText().length()<5){
       JOptionPane.showMessageDialog(null, "Por favor ingrese un nombre completo valido");
       return;
       }
       if(Address.getText().length()<5){
       JOptionPane.showMessageDialog(null, "Por favor ingrese una direccion valida");
       return;
       }
       if(Phone.getText().length()<8){
       JOptionPane.showMessageDialog(null, "Por favor ingrese un numero de telefono valido");
       return;
       }
       if(Email.getText().contains("@")==false){
           JOptionPane.showMessageDialog(null, "Por favor ingrese una cuenta de correo valida");
           return;
       } else {
       }
       String fullname = FullName.getText();
       String address = Address.getText();
       String phone = Phone.getText();    
       String email = Email.getText();
       
       
       Cliente cliente = new Cliente (fullname,address,phone,email);
       
       //Se almacenan los Datos de los clientes en orden de 1 - 50 en el vector
        if(arrPos<x){
        c[arrPos] = cliente;  
        JOptionPane.showMessageDialog(null, "Se registro correctamente el Cliente");
        arrPos++;
        
        //Limpia todos los campos del formulario de registro
        FullName.setText("");
        Address.setText("");
        Phone.setText("");
        Email.setText("");
        CheckName.setIcon(null);
        CheckAddress.setIcon(null);
        CheckPhone.setIcon(null);
        CheckEmail.setIcon(null);
        }
             
    }//GEN-LAST:event_RegisterButtonActionPerformed
   
    
    private void FullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FullNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FullNameActionPerformed

    private void FullNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FullNameKeyTyped
        //Codigo para limitar la cantidad de caracteres
        if (FullName.getText().length()==20){
        evt.consume();    
        }
        //Codigo para solo permitir letras en el campo Nombre Completo del Formulario
        char TipoDeTecla = evt.getKeyChar();
        if (!Character.isWhitespace(TipoDeTecla) &&!Character.isLetter(TipoDeTecla)){
            evt.consume();
        }else{
        }
    }//GEN-LAST:event_FullNameKeyTyped

    private void PhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PhoneKeyTyped
        //Codigo para limitar la cantidad de caracteres
        if (Phone.getText().length()==8){
        evt.consume(); 
        }
        //Codigo para solo permitir numeros en el campo Telefono del Formulario
        char TipoDeTecla = evt.getKeyChar();
        if (!Character.isDigit(TipoDeTecla)){
        evt.consume();
        }
    }//GEN-LAST:event_PhoneKeyTyped

    private void FullNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FullNameFocusLost
        // Codigo para poner Check si el campo esta lleno
        if (FullName.getText().length()>=5){
            CheckName.setIcon(check);
        }else{
            CheckName.setIcon(null);
        }
    }//GEN-LAST:event_FullNameFocusLost

    private void AddressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AddressFocusLost
        // Codigo para poner Check si el campo esta lleno
        if (Address.getText().length()>=5){
            CheckAddress.setIcon(check);
        }else{
            CheckAddress.setIcon(null);
        }
    }//GEN-LAST:event_AddressFocusLost

    private void PhoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PhoneFocusLost
        // Codigo para poner Check si el campo esta lleno
        if (Phone.getText().length()==8){
            CheckPhone.setIcon(check);
        }else{
            CheckPhone.setIcon(null);
        }
    }//GEN-LAST:event_PhoneFocusLost

    private void EmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EmailFocusLost
        // Codigo para poner Check si el campo esta lleno
        if (Email.getText().contains("@")){
            CheckEmail.setIcon(check);
        }else{
            CheckEmail.setIcon(null);
        }
    }//GEN-LAST:event_EmailFocusLost
   
    private void ShowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowButtonActionPerformed
        for(int i=0;i<c.length;i++){                        
            if (c[0] == null){
            JOptionPane.showMessageDialog(null, "No existen Registros de Clientes");
            return;
            }
            if (c[i] != null){
                JOptionPane.showMessageDialog(null,"Cliente 00"+(i+1)+"\n"+ "Full Name: " + c[i].getFullName()+"\n"+"Email: " + c[i].getEmail()+"\n"+"Address: " + c[i].getAddress());
            }else{    
                return;
            }
          }
    }//GEN-LAST:event_ShowButtonActionPerformed

    private void AddressKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AddressKeyTyped
        //Codigo para limitar la cantidad de caracteres
        if (Address.getText().length()==15){
        evt.consume(); 
        }
    }//GEN-LAST:event_AddressKeyTyped

    private void EmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EmailKeyTyped
        //Codigo para limitar la cantidad de caracteres
        if (Address.getText().length()==20){
        evt.consume(); 
        }
    }//GEN-LAST:event_EmailKeyTyped

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
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Address;
    private javax.swing.JLabel CheckAddress;
    private javax.swing.JLabel CheckEmail;
    private javax.swing.JLabel CheckName;
    private javax.swing.JLabel CheckPassword;
    private javax.swing.JLabel CheckPhone;
    private javax.swing.JLabel CheckUsername;
    private javax.swing.JButton CleanButton;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField FullName;
    private javax.swing.JButton HomeButton;
    private javax.swing.JButton OutButton;
    private javax.swing.JTextField Phone;
    private javax.swing.JButton RegisterButton;
    private javax.swing.JButton ShowButton;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
