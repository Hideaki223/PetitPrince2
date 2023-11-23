package jeu;

public abstract class JeuSimple {
    private String nom;

    public String getNom(){
        return this.nom;
    }
    public abstract int abriter(String c1, String c2);

    public abstract String jouerUnTour();

}
