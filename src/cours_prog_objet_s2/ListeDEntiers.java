package cours_prog_objet_s2;

public class ListeDEntiers {

    CelluleEntier cellule;
    // Liste vide

    ListeDEntiers() {
        this.cellule = null;
    }
    // Liste d’un element.

    ListeDEntiers(int n) {
        this.cellule = new CelluleEntier(n);
    }
    // Construction d’une liste par ajout d'un element en tete d’une liste.

    ListeDEntiers(int n, ListeDEntiers l) {
        this.cellule = new CelluleEntier(n, l.cellule);
    }
    // Renvoie la valeur de la tˆete de la liste.

    public int tete() {
        assert (this.cellule != null);
        return this.cellule.valeur();
    }
    // Supprime la premier valeur de la liste

    public void queue() {
        assert (this.cellule != null);
        this.cellule = this.cellule.celluleSuivante();
    }
    // Ajoute un entier en tˆete de liste

    public void ajoute(int n) {
        this.cellule = new CelluleEntier(n, this.cellule);
    }
    // Indique si la liste est vide

    public boolean estVide() {
        return cellule == null;
    }
    // Renvoie la longueur de la liste

    public int longueur() {
        int longueur = 0;
        CelluleEntier c = this.cellule;
        while (c != null) {
            longueur = longueur + 1;
            c = c.celluleSuivante();
        }
        return longueur;
    }
    // Renvoie une chaıne de caracteres representant la liste.

    public String toString() {
        String s = "[";
        CelluleEntier c = this.cellule;
        while (c != null) {
            s = s + c.valeur();
            c = c.celluleSuivante();
            if (c != null) {
                s = s + ";";
            }
           
        }
        s = s + "]";
        return s;
    }
}

// Renvoie la longueur de la liste version recursive
    private int longueur_aux(CelluleEntier c){
        if(c==null)
        return 0;
    else
        return 1 + longueur aux(c.celluleSuivante());
    }

    public int longueur rec(){
     return longueur aux(this.cellule);
    }
