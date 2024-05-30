package TEMA04;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Ventana2 extends javax.swing.JFrame {

    String[] cabecera = {"IDPERSONA", "NOMBRE", "CALLE", "NUMERO", "CIUDAD", "HOBBIES"};
    String[][] datos = {};
    DefaultTableModel dtm = new DefaultTableModel(datos, cabecera);

    public Ventana2() {
        initComponents();
        personalizarTabla();
        cargarDatos(MetodosJson.obtenerListaPersonasFromArchivoJson("data/personas.json"));
        cargarCiudad();
    }

    private void cargarCiudad() {
        List<Persona> personas_al = MetodosJson.obtenerListaPersonasFromArchivoJson("data/personas.json");
        Set<String> ciudades_ts = new TreeSet<>();
        for (Persona persona : personas_al) {
            Direccion direccion = persona.getDireccion();
            ciudades_ts.add(direccion.getCiudad());
        }
        cboCiudad.addItem("SELECCIONE CIUDAD");
        for (String ciudad : ciudades_ts) {
            cboCiudad.addItem(ciudad);
        }
    }

    private void personalizarTabla() {
        tblContenido.setModel(dtm);
        /*
        DefaultTableCellRenderer centerRenderer_center = new DefaultTableCellRenderer();
        centerRenderer_center.setHorizontalAlignment(JLabel.RIGHT);
        tblContenido.getColumnModel().getColumn(2).setCellRenderer(centerRenderer_center);
        tblContenido.getColumnModel().getColumn(3).setCellRenderer(centerRenderer_center);
         */
    }

    public void limpiarTabla() {
        int numeroFilas = dtm.getRowCount();
        for (int i = 0; i < numeroFilas; i++) {
            dtm.removeRow(0);
        }
    }

    private void cargarDatos(List<Persona> personasAux_al) {
        List<Persona> personas_al = personasAux_al;
        int numeroPersonas = personas_al.size();
        String[] filaVacia = {"", "", "", "", "", ""};
        for (int i = 0; i < numeroPersonas; i++) {
            Persona persona = personas_al.get(i);
            dtm.addRow(filaVacia);
            dtm.setValueAt(persona.getIdPersona(), i, 0);
            dtm.setValueAt(persona.getNombre(), i, 1);
            Direccion direccion = persona.getDireccion();
            dtm.setValueAt(direccion.getCalle(), i, 2);
            dtm.setValueAt(direccion.getNumero(), i, 3);
            dtm.setValueAt(direccion.getCiudad(), i, 4);
            String[] hobbies = persona.getHobbies();
            dtm.setValueAt(Arrays.toString(hobbies), i, 5);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblContenido = new javax.swing.JTable();
        botRefrescar = new javax.swing.JButton();
        botLimpiar = new javax.swing.JButton();
        botSalir = new javax.swing.JButton();
        cboCiudad = new javax.swing.JComboBox<>();
        lblFiltrarCiudad = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblContenido.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblContenido);

        botRefrescar.setText("REFRESCAR");
        botRefrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botRefrescarActionPerformed(evt);
            }
        });

        botLimpiar.setText("LIMPIAR");
        botLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botLimpiarActionPerformed(evt);
            }
        });

        botSalir.setText("SALIR");
        botSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botSalirActionPerformed(evt);
            }
        });

        cboCiudad.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboCiudadItemStateChanged(evt);
            }
        });

        lblFiltrarCiudad.setText("FILTRAR POR CIUDAD");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botRefrescar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblFiltrarCiudad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboCiudad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(90, 90, 90))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botRefrescar)
                    .addComponent(lblFiltrarCiudad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botLimpiar)
                    .addComponent(cboCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botSalir)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botRefrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botRefrescarActionPerformed
        limpiarTabla();
        cboCiudad.setSelectedIndex(0);
        cargarDatos(MetodosJson.obtenerListaPersonasFromArchivoJson("data/personas.json"));
    }//GEN-LAST:event_botRefrescarActionPerformed

    private void botLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botLimpiarActionPerformed
        limpiarTabla();
        cboCiudad.setSelectedIndex(0);
    }//GEN-LAST:event_botLimpiarActionPerformed

    private void botSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_botSalirActionPerformed

    private void cboCiudadItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboCiudadItemStateChanged
        String ciudad = (String) cboCiudad.getSelectedItem();
        //List<Persona> personasporciudad_al = MetodosJson.obtenerListaPersonasFromArchivoJsonPorCiudad(ciudad);
        if (!ciudad.equalsIgnoreCase("SELECCIONE CIUDAD")) {
            limpiarTabla();
            cargarDatos(MetodosJson.obtenerListaPersonasFromArchivoJsonPorCiudad(ciudad));
        }
    }//GEN-LAST:event_cboCiudadItemStateChanged

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
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botLimpiar;
    private javax.swing.JButton botRefrescar;
    private javax.swing.JButton botSalir;
    private javax.swing.JComboBox<String> cboCiudad;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFiltrarCiudad;
    private javax.swing.JTable tblContenido;
    // End of variables declaration//GEN-END:variables
}
