package sujet;

import asteroide.Sujet;
import asteroide.console.ConsoleJavaBoy;

public class PetitPrince0 implements Sujet {
    private String nom;
    private int argent;
    private ConsoleJavaBoy console;
    private int cpt;
    public PetitPrince0(){
        this.nom = "";
        this.argent = 0;
        this.cpt = 0;
    }
    @Override
    public String getNom() {
        return this.nom;
    }

    @Override
    public int getArgent() {
        return this.argent;
    }

    @Override
    public void run() {
        console.parler("Je suis le petit prince, nous sommes au tour n°" + this.cpt);
        console.seDirigerVers(0);
    }

}
