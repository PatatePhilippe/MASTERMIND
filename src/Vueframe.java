import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.List;
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
        this.setLayout(new BorderLayout());
        VuePropositions page = new VuePropositions();
        Vueclavier clavier = new Vueclavier();
        
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
