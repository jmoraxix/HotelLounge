/*
 * HotelLounge
 * José David Mora Loría
 * Oscar Mauricio Gil
 * Melvin Arce Rodriguez
 * Nov 24, 2015
 */
package hotellounge.vista;

import hotellounge.Principal;
import hotellounge.vista.base.PanelBase;
import hotellounge.vista.base.PanelConFondo;
import hotellounge.vista.base.VentanaBase;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author jmora
 */
public class AdministrarHabitaciones extends VentanaBase {

    public AdministrarHabitaciones() {
        //Se crea el panel del contenido 
        PanelBase panel_contenido = new PanelBase();
        setContentPane(panel_contenido);
        
        //Se instancian los botones y se agregan al panel base
        //Define el boton misReservaciones
        PanelConFondo btn_misReservaciones = new hotellounge.vista.base.PanelConFondo("logo_principal.png", "Mis reservaciones");
        btn_misReservaciones.setBounds(470, 160, 220, 220);
        panel_contenido.add(btn_misReservaciones);
        btn_misReservaciones.getBtn().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goToPage(evt);
            }
        });
        
        //Creacion de los titulos
        JLabel titulo1 = new javax.swing.JLabel("Bienvenido a su sistema de hotel", SwingConstants.CENTER);
        titulo1.setForeground(new java.awt.Color(0, 0, 0));
        titulo1.setFont(Principal.getLetraTexto1());
        panel_contenido.add(titulo1);
        titulo1.setBounds(Principal.getAncho()/2-250, 80, 500, 60);
        
        //Se hace visible la ventana
        this.setVisible(true);
    }
    
    private void goToPage(java.awt.event.MouseEvent evt) {                          
        //new MisReservaciones().setVisible(true);
        this.dispose();
    }    
    
    
}