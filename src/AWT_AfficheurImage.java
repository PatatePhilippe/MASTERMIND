import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.Observable;
import java.util.Observer;

import javax.imageio.ImageIO;

public class AWT_AfficheurImage extends Canvas implements Observer,Serializable {



	private Image img = null;

	private ImageModele imageAffiche = null;


	public AWT_AfficheurImage(Modele leModele) {


	}

	public void paint(Graphics g) {
	}

	@Override
	public void update(Observable o, Object arg) {
		repaint();
	}
}
