import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
public class Controleur implements ActionListener {

    private Modele monModele;

    public Controleur(Modele monModele){
        this.monModele = monModele;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JButton) {
            JButton button = (JButton) e.getSource();
            monModele.addProposition(button.getBackground());
        }
    }
}
