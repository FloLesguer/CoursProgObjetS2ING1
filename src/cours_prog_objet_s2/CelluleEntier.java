
package cours_prog_objet_s2;

class CelluleEntier{
private int valeur;
private CelluleEntier celluleSuivante;
// Creation d’une cellule contenant la valeur n.
CelluleEntier(int n){
this.valeur = n;
this.celluleSuivante = null;
}
// Creation d’une cellule contenant la valeur n et ayant comme
//cellule suivante la cellule c.
CelluleEntier(int n, CelluleEntier c){
this.valeur = n;
this.celluleSuivante = c;
}
// Renvoie la valeur contenue dans la cellule.
public int valeur(){
return this.valeur;
}
// Renvoie la cellule suivante.
public CelluleEntier celluleSuivante(){
return this.celluleSuivante;
}
}
