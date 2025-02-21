import java.util.Observer;
import java.util.Observable;
import java.awt.*;
import java.awt.event.*;


public class VuePropositions extends Canvas implements Observer {

    public VuePropositions()
    {
        setBackground (Color.GRAY);
        setSize(800, 500);
    }

    public void paint (Graphics g) {
        int x = 700;
        Graphics2D g2;
        g2 = (Graphics2D) g;
        g2.drawString ("rslt", 70, 70);
        for (int i = 0; i< 4; i++)
        {
            x+=15;
            g2.drawRect(x, 100, 10, 10);
        }
        

     }


    @Override
	public void update(Observable o, Object arg) {
		repaint();
	}
}
