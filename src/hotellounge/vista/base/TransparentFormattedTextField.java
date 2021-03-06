/*
 * HotelLounge
 * José David Mora Loría
 * Oscar Mauricio Gil
 * Melvin Arce Rodriguez
 * Nov 25, 2015
 */
package hotellounge.vista.base;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFormattedTextField;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author jmora
 */
public class TransparentFormattedTextField extends JFormattedTextField {

    private static final long serialVersionUID = 1959323179223226142L;

    public TransparentFormattedTextField() {
        super();
        init();
    }

    public TransparentFormattedTextField(String text) {
        super(text);
        init();
    }

    public TransparentFormattedTextField(int columns) {
        super(columns);
        init();
    }
    
    public TransparentFormattedTextField(MaskFormatter maskFormatter) {
      super();  
      maskFormatter.setPlaceholderCharacter('_');
      setFormatterFactory(new DefaultFormatterFactory(maskFormatter));
   }

    protected void init() {
        setOpaque(false);
        setForeground(Color.black);
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setComposite(AlphaComposite.SrcOver.derive(0.5f));
        super.paint(g2d);
        g2d.dispose();
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setColor(getBackground());
        g2d.fillRect(0, 0, getWidth(), getHeight());
        super.paintComponent(g2d);
        g2d.dispose();
    }

}
