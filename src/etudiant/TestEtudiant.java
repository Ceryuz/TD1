package etudiant;

public class TestEtudiant {
    public static void main(String [] args)
    {
        // Etudiant prout = null;      // Déclarer un objet (Etudian) doit être fait avec un null puis on peut lui mettre des valeurs
        // prout.nom = "Prout";        // Déclarer des valeurs (selon le type de l'attribut)
        //  prout.age = 19;
        // System.out.println(prout.nom);
        // System.out.println(prout.age);
        // Test 2
        // Exercices du TD

        Etudiant toto = new Etudiant("toto", 20);   // On déclare toto sauf que TOTO (Commit exo 3) utilise la class Etudiant qui est dans un fichier séparé
        System.out.println(toto.nom);       //on affiche le nom
        System.out.println(toto.age);       //on affiche l'age
        toto.Travailler();
        toto.seReposer();

    }
}
