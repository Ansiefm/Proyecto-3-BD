/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package co.edu.javeriana.fdb.view;

import co.edu.javeriana.fdb.parcialdb.model.dto.UsuarioDTO;

import javax.swing.*;
import java.util.List;

/**
 *
 * @author Andres
 */
public class UsuarioJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UsuarioJPanel
     */
    //public final Principal principal;
    private final Principal principal;
    
    public UsuarioJPanel(Principal principal) {
        initComponents();
        this.principal = principal;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        BotonCambiar = new javax.swing.JButton();
        BotonSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        BotonCrear = new javax.swing.JButton();
        BotonEliminar = new javax.swing.JButton();
        BotonMenu = new javax.swing.JButton();
        BoxUser = new javax.swing.JTextField();
        BoxPassword = new javax.swing.JTextField();

        jLabel2.setFont(new java.awt.Font("Old English Text MT", 0, 24)); // NOI18N
        jLabel2.setText("Usuario");

        BotonCambiar.setText("Cambiar contrasenia");
        BotonCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCambiarActionPerformed(evt);
            }
        });

        BotonSalir.setBackground(new java.awt.Color(204, 0, 0));
        BotonSalir.setForeground(new java.awt.Color(255, 255, 255));
        BotonSalir.setText("Salir");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });

        jLabel1.setText("User:");

        jLabel3.setText("Password:");

        BotonCrear.setBackground(new java.awt.Color(255, 255, 255));
        BotonCrear.setText("Crear");
        BotonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCrearActionPerformed(evt);
            }
        });

        BotonEliminar.setText("Eliminar");
        BotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarActionPerformed(evt);
            }
        });

        BotonMenu.setBackground(new java.awt.Color(204, 204, 204));
        BotonMenu.setText("Menu");
        BotonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMenuActionPerformed(evt);
            }
        });

        BoxUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxUserActionPerformed(evt);
            }
        });

        BoxPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(BotonCrear)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BotonCambiar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BotonEliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BotonMenu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BotonSalir))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(189, 189, 189)
                                .addComponent(jLabel2)))
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel1)
                        .addGap(38, 38, 38)
                        .addComponent(BoxUser, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(BoxPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(136, 136, 136))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(BoxUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BoxPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonCambiar)
                    .addComponent(BotonCrear)
                    .addComponent(BotonEliminar)
                    .addComponent(BotonMenu)
                    .addComponent(BotonSalir))
                .addGap(29, 29, 29))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BotonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMenuActionPerformed
        this.principal.UsuarioMenu();
    }//GEN-LAST:event_BotonMenuActionPerformed

    private void BotonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCrearActionPerformed
        UsuarioDTO Usuario;
        if(!WhiteSpace()){
            Usuario = new UsuarioDTO(this.BoxUser.getText(),this.BoxPassword.getText());
            if(this.principal.CrearUsuario(Usuario))
                JOptionPane.showMessageDialog(null,"Usuario creado!");
            else
                JOptionPane.showMessageDialog(null,"No se pudo crear el usuario, revise los campos!");
        }
    }//GEN-LAST:event_BotonCrearActionPerformed

    private void BotonCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCambiarActionPerformed
        UsuarioDTO Usuario;
        if(!WhiteSpace()){
            Usuario = new UsuarioDTO(this.BoxUser.getText(),this.BoxPassword.getText());
            if(this.principal.ChangePass(Usuario.getUsuario(),this.BoxPassword.getText()))
                JOptionPane.showMessageDialog(null,"Usuario actualizado!");
            else
                JOptionPane.showMessageDialog(null,"No debe haber algun campo en blanco!");
        }
    }//GEN-LAST:event_BotonCambiarActionPerformed

    private void BotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarActionPerformed
        if(this.BoxUser.getText().equals(""))
            JOptionPane.showMessageDialog(null,"El campo Usuario no puede estar vacio!");
        else {
            if(this.principal.EliminarUsu(this.BoxUser.getText()))
                JOptionPane.showMessageDialog(null,"Usuario eliminado!");
            else
                JOptionPane.showMessageDialog(null,"No se pudo eliminar el usuario. Verifique que exista!");
        }
    }//GEN-LAST:event_BotonEliminarActionPerformed

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        this.principal.salir();
    }//GEN-LAST:event_BotonSalirActionPerformed

    private void BoxUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BoxUserActionPerformed

    private void BoxPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BoxPasswordActionPerformed
    protected boolean WhiteSpace(){
        return (this.BoxUser.getText().equals("") || this.BoxPassword.getText().equals(""));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCambiar;
    private javax.swing.JButton BotonCrear;
    private javax.swing.JButton BotonEliminar;
    private javax.swing.JButton BotonMenu;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JTextField BoxPassword;
    private javax.swing.JTextField BoxUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
