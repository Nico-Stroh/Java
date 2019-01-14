package p111mil.agenda.formularios;


import java.awt.Color;
import java.awt.Font;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;
import p111mil.agenda.dao.ContactoDao;
import p111mil.agenda.modelo.Contacto;


public class Listado extends javax.swing.JFrame {
    private ContactoDao contactoDao;
    
    public void cargarTabla(List<Contacto> contactos) {
        ContactoModeloTabla contactoModeloTabla = new ContactoModeloTabla(contactos);
                
        tablaContactos.setModel(contactoModeloTabla);
        tablaContactos.setRowSelectionAllowed(true);
        tablaContactos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(JLabel.RIGHT);
        tablaContactos.getColumnModel().getColumn(0).setCellRenderer(rightRenderer);    
        tablaContactos.getTableHeader().setForeground(Color.black);
        tablaContactos.getTableHeader().setBackground(Color.DARK_GRAY);
        tablaContactos.getTableHeader().setFont(new Font("SansSerif", Font.BOLD, 16));
    }
    
    //Inicializa el formulario
    public Listado() {
        initComponents();
        contactoDao = new ContactoDao();        
        cargarTabla(contactoDao.buscarTodos());
        OcultarBotones();
    }

    private void OcultarBotones(){
        botonEditar.setEnabled(false);
        botonEliminar.setEnabled(false);
    }
    
    private void MostrarBotones(){
        botonEditar.setEnabled(true);
        botonEliminar.setEnabled(true);
    }
    
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaContactos = new javax.swing.JTable();
        botonNuevo = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        botonEditar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        labelBusqueda = new javax.swing.JLabel();
        textoBusqueda = new javax.swing.JTextField();
        botonBuscar = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Contactos");
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        tablaContactos.setBackground(new java.awt.Color(252, 224, 143));
        tablaContactos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaContactos.setGridColor(new java.awt.Color(51, 51, 51));
        tablaContactos.setSelectionBackground(new java.awt.Color(51, 51, 51));
        tablaContactos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaContactos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaContactosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaContactos);

        botonNuevo.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        botonNuevo.setText("Nuevo");
        botonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNuevoActionPerformed(evt);
            }
        });

        botonEliminar.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        botonEliminar.setText("Eliminar");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        botonEditar.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        botonEditar.setText("Editar");
        botonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        labelBusqueda.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        labelBusqueda.setForeground(new java.awt.Color(255, 255, 255));
        labelBusqueda.setText("Búsqueda");

        textoBusqueda.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textoBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textoBusquedaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoBusquedaKeyTyped(evt);
            }
        });

        botonBuscar.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        botonBuscar.setText("Mostrar Todos");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(textoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(botonBuscar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelBusqueda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(textoBusqueda))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        botonSalir.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonEliminar)
                        .addGap(327, 327, 327)
                        .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonNuevo)
                    .addComponent(botonEditar)
                    .addComponent(botonEliminar)
                    .addComponent(botonSalir))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevoActionPerformed
        Edicion edicion = new Edicion();
        edicion.mostrarFormulario(this);
    }//GEN-LAST:event_botonNuevoActionPerformed

    private void botonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarActionPerformed
        if (tablaContactos.getSelectedRow() < 0) {
            return;
        }
        int filaSeleccionada = tablaContactos.getSelectedRow();
        int idContacto = (int) tablaContactos.getValueAt(filaSeleccionada, 0);
        
        ContactoDao contactoDao = new ContactoDao();
        Contacto contactoExistente = contactoDao.buscarPorId(idContacto);
        Edicion edicion = new Edicion();
        edicion.setContacto(contactoExistente);
        edicion.mostrarFormulario(this); 
        OcultarBotones();
    }//GEN-LAST:event_botonEditarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
         if (tablaContactos.getSelectedRow() < 0) {
            return;
        }

       int mensaje = JOptionPane.showConfirmDialog(this, "¿Esta seguro que desea eliminar?","Eliminar",JOptionPane.YES_NO_OPTION);
       if(mensaje==JOptionPane.YES_OPTION){
            int filaSeleccionada = tablaContactos.getSelectedRow();
            int idContacto = (int) tablaContactos.getValueAt(filaSeleccionada, 0);

            ContactoDao contacto = new ContactoDao();
            contacto.eliminar(idContacto);
            cargarTabla(contactoDao.buscarTodos());    
       }
          OcultarBotones();     
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
         cargarTabla(contactoDao.buscarTodos());
         textoBusqueda.setText("");
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
      //cargarTabla(contactoDao.buscarTodos());
    }//GEN-LAST:event_formWindowGainedFocus

    private void textoBusquedaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoBusquedaKeyPressed
       
    }//GEN-LAST:event_textoBusquedaKeyPressed

    private void textoBusquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoBusquedaKeyTyped
         cargarTabla(contactoDao.buscarPor(textoBusqueda.getText()));
    }//GEN-LAST:event_textoBusquedaKeyTyped

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
       System.exit(0);
    }//GEN-LAST:event_botonSalirActionPerformed

    private void tablaContactosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaContactosMouseClicked
       MostrarBotones();
    }//GEN-LAST:event_tablaContactosMouseClicked


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
            java.util.logging.Logger.getLogger(Listado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Listado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Listado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Listado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Listado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonEditar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonNuevo;
    private javax.swing.JButton botonSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelBusqueda;
    private javax.swing.JTable tablaContactos;
    private javax.swing.JTextField textoBusqueda;
    // End of variables declaration//GEN-END:variables


}
