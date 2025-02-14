import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.List;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;

public class GestionImages extends Frame implements WindowListener {

	public static void main(String[] args) {
		new GestionImages();
	}

	public Modele leModele ;

	public GestionImages() {

		this.setLayout(new BorderLayout());

		this.leModele = new Modele();
		Controleur leControleur = new Controleur(leModele);
		AWT_ListeImages panneauGauche = new AWT_ListeImages(leControleur);
		this.add(panneauGauche, BorderLayout.WEST);

		AWT_AfficheurImage panneauDroite = new AWT_AfficheurImage(leModele);
		this.add(panneauDroite, BorderLayout.EAST);

		AWT_NoteImage panneauBas = new AWT_NoteImage(leControleur);
		this.add(panneauBas, BorderLayout.SOUTH);

		leModele.addObserver(panneauDroite);

		this.addWindowListener(this);
		this.setTitle("Visualisation d'images");
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void windowOpened(WindowEvent e) {}

	@Override
	public void windowClosing(WindowEvent e) {
        try {
            this.leModele.enregistrer();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        System.exit(0);

	}

	@Override
	public void windowClosed(WindowEvent e) {}

	@Override
	public void windowIconified(WindowEvent e) {}

	@Override
	public void windowDeiconified(WindowEvent e) {}

	@Override
	public void windowActivated(WindowEvent e) {}

	@Override
	public void windowDeactivated(WindowEvent e) {}

}
