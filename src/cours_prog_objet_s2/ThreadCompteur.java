package cours_prog_objet_s2;

public class ThreadCompteur {

    public static void main(String[] args) {
        Thread tache1 = new Thread(new Compteur(7));
        Thread tache2 = new Thread(new Compteur(5));
        
        for (int i = 0; i<10000; i++ ){
            Thread tache3 = new Thread(new Compteur(7));
            System.out.println("Nouveau thread");
            tache3.start();
        }
        
        tache1.start();
        tache2.start();
    }
}
