import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;


public class Vueframe extends Frame implements WindowListener {

    public static void main(String[] args) {
		new Vueframe();
	}

    public Vueframe()
    {
		
		this.setSize(800, 700);

        this.setLayout(new BorderLayout());
		Modele model = new Modele();
		Controleur control = new Controleur(model);
		Vueclavier clavier = new Vueclavier();
		VuePropositions page = new VuePropositions(model);
		
		this.add(clavier, BorderLayout.SOUTH);
		this.add(page, BorderLayout.CENTER);

		


        


        this.addWindowListener(this);
		this.setTitle("Visualisation d'images");
		this.pack();
		this.setVisible(true);
        this.add(page, clavier);
        
    }


    @Override
	public void windowOpened(WindowEvent e) {}

	@Override
	public void windowClosing(WindowEvent e) {

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
