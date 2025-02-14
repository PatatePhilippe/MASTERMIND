import java.awt.*;
import java.util.LinkedList;

public class Rangee {

    private Color[]  Jetons;

    private LinkedList<Integer> Result;

    private int indiceJeton;

    public Rangee() {
        Jetons = new Color[Modele.Difficulite];
        Result = new LinkedList<Integer>();
        indiceJeton = 0;
    }
    public Boolean ligneComplete(){
        return !(indiceJeton < Modele.Difficulite);
    }
    public void addJetons(Color addColor ){
        if (!ligneComplete()){
            Jetons[indiceJeton] = addColor;
        }
        indiceJeton++;
    }
    public void ajoutResult(Color[] reponse){
        if (Jetons[indiceJeton-1]==reponse[indiceJeton-1]){
            this.Result.addFirst(1);
        }else{
            this.Result.addLast(0);
        }
    }

    @Override
    public String toString() {
        StringBuilder reponse = new StringBuilder();
        for (int i = 0; i < Jetons.length; i++) {
            reponse.append(Jetons[i].toString());
        }
        return reponse.toString();
    }
}
