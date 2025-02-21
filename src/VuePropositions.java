import java.util.Observer;
import java.util.Observable;
import java.awt.*;
import java.awt.event.*;


public class VuePropositions extends Canvas implements Observer {
    
    private Modele monModele;
    private Color[][] col;
    private Integer[][] rslt;
    public VuePropositions(Modele monModele)
    {
        this.monModele = monModele;
        setBackground (Color.GRAY);
        setSize(600, 500);
    }

    public void paint (Graphics g) {
        int x = 500;
        Graphics2D g2;
        g2 = (Graphics2D) g;
        g2.drawString ("rslt", 70, 70);

        for (int i = 0; i< 4; i++)
        {
            
            
            if(i>1)
            {
                g.setColor(Color.BLACK);
                g.fillRect(x, 125, 15, 15);    
                x-=25;
            }
            else {
                x+=25;
                g.setColor(Color.WHITE);
            g.fillRect(x, 100, 15, 15);    
            }
                    
            
        }
        

     }


    @Override
	public void update(Observable o, Object arg) {
        this.col = this.monModele.getProposition();
        this.rslt = this.monModele.getResult();
		repaint();
	}
}
