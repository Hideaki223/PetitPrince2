package jeu;

public class JeuDe extends JeuSimple {

    public JeuDe(){
    }

    @Override
    public int abriter(String c1, String c2) {
        int i1 = Integer.valueOf(c1);
        int i2 = Integer.valueOf(c2);
        if (i1>i2) return -1;
        if (i1<i2) return 1;
        else return 0;
    }

    @Override
    public String jouerUnTour() {
        java.util.Random rand = new java.util.Random();
        int face = rand.nextInt(1,7);
        return "Résultat du dé : " + face;
    }

}
