import java.util.Observer;
import java.util.Observable;
import java.awt.*;
import java.awt.event.*;


public class VuePropositions extends Canvas implements Observer {
    

    public VuePropositions()
    {
        setBackground (Color.GRAY);
        setSize(500, 500);
    }

    public void paint (Graphics g) {
        Graphics2D g2;
        g2 = (Graphics2D) g;
        g2.drawString ("It is a custom canvas area", 70, 70);
     }


    @Override
	public void update(Observable o, Object arg) {
		repaint();
	}
}
