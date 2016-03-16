package tp3_correction;

public class Exercice2 {

    public static void main(String[] args) {
        Thread tache = new Thread(new Compteur(20));
        tache.start();
        Thread tache2 = new Thread(new Compteur(30));
        tache2.start();
        Thread tache3 = new Thread(new Compteur(10));
        tache3.start();
        Thread tache4 = new Thread(new Compteur(12));
        tache4.start();
    }
}
