package p111mil.agenda.formularios;


import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import p111mil.agenda.modelo.Ciudad;
import p111mil.agenda.dao.CiudadDao;
import p111mil.agenda.dao.ContactoDao;
import p111mil.agenda.modelo.Contacto;



public class Edicion extends javax.swing.JFrame {
    private Listado listado;
    private int idContacto= 0;
    
    public void mostrarFormulario(Listado listado) {
        this.listado = listado;        
        this.listado.setEnabled(false);
        
        this.setLocationRelativeTo(listado);
        this.setVisible(true);        
    }
    
    public void setContacto(Contacto contacto){
        textoNombre.setText(contacto.getNombre());
        textoApellido.setText(contacto.getApellido());
        textoTelefono.setText(contacto.getTelefono());
        comboCiudades.setSelectedItem(contacto.getCiudad());
        idContacto= contacto.getId();
    }
    
    public void cerrarFormulario() {
        this.dispose();
        this.listado.setVisible(true);
        this.listado.setEnabled(true);
    }
    
    private void limpiarFormulario() {
        this.textoNombre.setText("");
        this.textoApellido.setText("");
        this.textoTelefono.setText("");
        this.comboCiudades.setSelectedIndex(0);        
    }
    
    /**
     * Creates new form Edicion
     */
    public Edicion() {
        initComponents();
        // Para evitar hacer copy/paste sobre los campos
        textoNombre.setTransferHandler(null);
        textoApellido.setTransferHandler(null);
        textoTelefono.setTransferHandler(null);
        
        CiudadDao ciudadDao = new CiudadDao();
        List<Ciudad> ciudades = ciudadDao.buscarTodos();
        
        comboCiudades.setModel(new DefaultComboBoxModel(ciudades.toArray()));
        comboCiudades.setSelectedIndex(0);
        
        limpiarFormulario();  
        textoNombre.requestFocus();
        }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelNombre = new javax.swing.JLabel();
        textoNombre = new javax.swing.JTextField();
        textoApellido = new javax.swing.JTextField();
        labelApellido = new javax.swing.JLabel();
        textoTelefono = new javax.swing.JTextField();
        labelNombre2 = new javax.swing.JLabel();
        labelCiudad = new javax.swing.JLabel();
        comboCiudades = new javax.swing.JComboBox<>();
        botonCancelar = new javax.swing.JButton();
        botonGuardar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edicion de Contacto");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        labelNombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelNombre.setText("Nombre");

        textoNombre.setText("Nombre");
        textoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoNombreActionPerformed(evt);
            }
        });
        textoNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoNombreKeyTyped(evt);
            }
        });

        textoApellido.setText("Apellido");
        textoApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoApellidoActionPerformed(evt);
            }
        });
        textoApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoApellidoKeyTyped(evt);
            }
        });

        labelApellido.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelApellido.setText("Apellido");

        textoTelefono.setText("Telefono");
        textoTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoTelefonoActionPerformed(evt);
            }
        });
        textoTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoTelefonoKeyTyped(evt);
            }
        });

        labelNombre2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelNombre2.setText("Teléfono");

        labelCiudad.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelCiudad.setText("Ciudad");

        comboCiudades.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        comboCiudades.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboCiudades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCiudadesActionPerformed(evt);
            }
        });

        botonCancelar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        botonGuardar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botonGuardar.setText("Guardar");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Datos Personales");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textoNombre)
                    .addComponent(textoApellido, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboCiudades, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textoTelefono)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelNombre2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCiudad, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelApellido, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(botonGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonCancelar)))
                .addGap(20, 20, 20))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelApellido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelNombre2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelCiudad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(comboCiudades, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCancelar)
                    .addComponent(botonGuardar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
       int mensaje = JOptionPane.showConfirmDialog(this, "¿Quiere cancelar la entrada de datos?","Confirmacion",JOptionPane.YES_NO_OPTION);
       if(mensaje==JOptionPane.YES_OPTION){
          this.cerrarFormulario(); 
       }else{
           textoNombre.requestFocus();
       }
       
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.listado.setVisible(true);
        this.listado.setEnabled(true);
    }//GEN-LAST:event_formWindowClosing

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        // 1. Validamos que todos los datos sean validos
        if (textoNombre.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "El Nombre es obligatorio", "Edicion de Contacto", JOptionPane.INFORMATION_MESSAGE);
            // Seteo el cursor sobre el campo Nombre
            textoNombre.requestFocus();
            return;
        }
        
        if (textoApellido.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "El Apellido es obligatorio", "Edicion de Contacto", JOptionPane.INFORMATION_MESSAGE);
            // Seteo el cursor sobre el campo Apellido
            textoApellido.requestFocus();
            return;
        }
        
        if (textoTelefono.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "El Telefono es obligatorio", "Edicion de Contacto", JOptionPane.INFORMATION_MESSAGE);
            // Seteo el cursor sobre el campo Telefono
            textoTelefono.requestFocus();
            return;
        }
        
        if (textoNombre.getText().length() > 50) {
            JOptionPane.showMessageDialog(this, "La longitud del Nombre no puede ser mayor a 50 caracteres", "Edicion de Contacto", JOptionPane.INFORMATION_MESSAGE);
            // Seteo el cursor sobre el campo Telefono
            textoNombre.requestFocus();
            return;
        }
        
        if (textoApellido.getText().length() > 50) {
            JOptionPane.showMessageDialog(this, "La longitud del Apellido no puede ser mayor a 50 caracteres", "Edicion de Contacto", JOptionPane.INFORMATION_MESSAGE);
            // Seteo el cursor sobre el campo Telefono
            textoApellido.requestFocus();
            return;
        }        
                        
        if (textoTelefono.getText().length() > 50) {
            JOptionPane.showMessageDialog(this, "La longitud del Telefono no puede ser mayor a 50 caracteres", "Edicion de Contacto", JOptionPane.INFORMATION_MESSAGE);
            // Seteo el cursor sobre el campo Telefono
            textoNombre.requestFocus();
            return;
        }
        
        // 2. Guardamos en la base de datos
        Contacto contacto = new Contacto();
        
        contacto.setId(idContacto);
        contacto.setNombre(textoNombre.getText());
        contacto.setApellido(textoApellido.getText());
        contacto.setTelefono(textoTelefono.getText());
        contacto.setCiudad((Ciudad) comboCiudades.getSelectedItem());
        
        ContactoDao contactoDao = new ContactoDao();
        contactoDao.guardar(contacto);
        
        // 3. Cerramos el formulario y refrescamos la base de datos
        this.cerrarFormulario();  
        this.listado.cargarTabla(contactoDao.buscarTodos());
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void textoNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoNombreKeyTyped
          if (textoNombre.getText().length() >= 50) {
            // Si ya llegue a los 5 caracteres el consume() hace que de ahora en mas las teclas no agreguen mas caracteres
            evt.consume();
        }
        
    }//GEN-LAST:event_textoNombreKeyTyped

    private void textoApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoApellidoKeyTyped
        if (textoApellido.getText().length() >= 50) {
            evt.consume();
        }
    }//GEN-LAST:event_textoApellidoKeyTyped

    private void textoTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoTelefonoKeyTyped
        if (textoTelefono.getText().length() >= 50) {
            evt.consume();
        } else {        
            char caracter = evt.getKeyChar();

            // Verificar si la tecla pulsada no es un digito
            // Caracteres validos: 0123456789 +#*
            if(((caracter < '0') ||
                (caracter > '9')) &&
                (caracter != '+') &&
                (caracter != '#') &&
                (caracter != '*') &&
                (caracter != '\b')) /* corresponde a BACK_SPACE */
            {
                evt.consume();  // ignorar el evento de teclado
            }
        }               
    }//GEN-LAST:event_textoTelefonoKeyTyped

    private void textoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoNombreActionPerformed
       textoApellido.requestFocus();
    }//GEN-LAST:event_textoNombreActionPerformed

    private void textoApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoApellidoActionPerformed
       textoTelefono.requestFocus();
    }//GEN-LAST:event_textoApellidoActionPerformed

    private void textoTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoTelefonoActionPerformed
        comboCiudades.requestFocus();
    }//GEN-LAST:event_textoTelefonoActionPerformed

    private void comboCiudadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCiudadesActionPerformed
        botonGuardar.requestFocus();
    }//GEN-LAST:event_comboCiudadesActionPerformed


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
            java.util.logging.Logger.getLogger(Edicion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Edicion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Edicion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Edicion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Edicion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JComboBox<String> comboCiudades;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelApellido;
    private javax.swing.JLabel labelCiudad;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelNombre2;
    private javax.swing.JTextField textoApellido;
    private javax.swing.JTextField textoNombre;
    private javax.swing.JTextField textoTelefono;
    // End of variables declaration//GEN-END:variables
}
