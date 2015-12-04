/*
 * HotelLounge
 * José David Mora Loría
 * Oscar Mauricio Gil
 * Melvin Arce Rodriguez
 * Dec 4, 2015
 */
package hotellounge.vista;

import hotellounge.Principal;

/**
 *
 * @author cocho
 */
public class ConsultaDelAdministrador extends javax.swing.JPanel {

    /**
     * Creates new form ConsultaDelAdministrador
     */
    public ConsultaDelAdministrador() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBase3 = new hotellounge.vista.base.PanelBase();
        panel_titulo2 = new hotellounge.vista.base.PanelConFondo();
        lbl_titulo2 = new javax.swing.JLabel();
        panel_izq4 = new hotellounge.vista.base.PanelConFondo();
        btn_regresar2 = new hotellounge.vista.base.PanelConFondo();

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("hotellounge/vista/Bundle"); // NOI18N
        panel_titulo2.setFondo(bundle.getString("CrearReservaciones.panel_titulo.fondo")); // NOI18N

        lbl_titulo2.setFont(Principal.getLetraTexto1());
        lbl_titulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_titulo2.setText(bundle.getString("CrearReservaciones.lbl_titulo.text")); // NOI18N
        panel_titulo2.add(lbl_titulo2);
        lbl_titulo2.setBounds(30, 10, 380, 40);

        panelBase3.add(panel_titulo2);
        panel_titulo2.setBounds(200, 60, 420, 60);

        panel_izq4.setFondo(bundle.getString("CrearReservaciones.panel_izq.fondo")); // NOI18N
        panelBase3.add(panel_izq4);
        panel_izq4.setBounds(110, 140, 490, 350);

        btn_regresar2.setFondo(bundle.getString("CrearReservaciones.btn_regresar.fondo")); // NOI18N
        btn_regresar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_regresar2MouseClicked(evt);
            }
        });
        panelBase3.add(btn_regresar2);
        btn_regresar2.setBounds(40, 70, 80, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBase3, javax.swing.GroupLayout.DEFAULT_SIZE, 978, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBase3, javax.swing.GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_regresar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_regresar2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_regresar2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private hotellounge.vista.base.PanelConFondo btn_regresar2;
    private javax.swing.JLabel lbl_titulo2;
    private hotellounge.vista.base.PanelBase panelBase3;
    private hotellounge.vista.base.PanelConFondo panel_izq4;
    private hotellounge.vista.base.PanelConFondo panel_titulo2;
    // End of variables declaration//GEN-END:variables
}
