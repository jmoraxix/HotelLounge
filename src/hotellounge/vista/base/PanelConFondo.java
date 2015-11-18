/*
 * HotelLounge
 * José David Mora Loría
 * Oscar Mauricio Gil
 * Melvin Arce Rodriguez
 * Marvin Andrei Sandi Brenes
 * Nov 11, 2015
 */
package hotellounge.vista.base;

import hotellounge.HotelLounge;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.SystemColor;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 *
 * @author jmora
 * Extiende JPanel. Define un panel y le asigna un
 *         fondo
 */
public class PanelConFondo extends JPanel {

	private JButton btn;

	// Recibe un string con la URL de la imagen
	public PanelConFondo(String urlImagen) {
		setForeground(SystemColor.controlHighlight);
		definirBorde(urlImagen);
		setLayout(null);
	}

	// Recibe un string con la URL de la imagen y si el panel es opaco o no
	public PanelConFondo(String urlImagen, boolean isOpaque) {
		setForeground(SystemColor.controlHighlight);
		definirBorde(urlImagen);
		setOpaque(isOpaque);
	}

	// Recibe un string con la URL de la imagen y si el panel es opaco o no y crea un
	// botón con el título ingresado
	public PanelConFondo(String urlImagen, boolean isOpaque, String titulo) {
		setForeground(SystemColor.controlHighlight);
		definirBorde(urlImagen);
		setOpaque(isOpaque);
		setLayout(new BorderLayout(0, 0));

		this.btn = new JButton(titulo);
		this.btn.setOpaque(false);
		this.btn.setContentAreaFilled(false);
		this.btn.setBorderPainted(false);
		//this.btn.setFont(Principal.getLetratexto2());
		add(this.btn, BorderLayout.CENTER);
	}

	public JButton getBtn() {
		return this.btn;
	}

	public void definirBorde(String url) {
		try {
			URL imagen = HotelLounge.class.getResource("vista/imagenes/" + url);
			BufferedImage img = ImageIO.read(imagen);
			BgBorder borde = new BgBorder(img);
			this.setBorder(borde);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

/**
 * @author jmora 17/11/2015
 * Clase para generar un borde para el panel y asignarselo como fondo.
 */
class BgBorder implements Border {
	private BufferedImage mImagen = null;

	public BgBorder(BufferedImage pImagen) {
		mImagen = pImagen;
	}

	public void paintBorder(Component c, Graphics g, int x, int y, int width,
			int height) {
		if (mImagen != null) {
			g.drawImage(mImagen, 0, 0, width, height, null);
		}
	}

	public Insets getBorderInsets(Component c) {
		return new Insets(0, 0, 0, 0);
	}

	public boolean isBorderOpaque() {
		return true;
	}
}