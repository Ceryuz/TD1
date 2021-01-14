package etudiant;

public class TestEtudiant {
    public static void main(String [] args)
    {
        // Etudiant prout = null;      // Déclarer un objet (Etudian) doit être fait avec un null puis on peut lui mettre des valeurs
        // prout.nom = "Prout";        // Déclarer des valeurs (selon le type de l'attribut)
        //  prout.age = 19;
        // System.out.println(prout.nom);
        // System.out.println(prout.age);

        // Exercices du TD

        Etudiant toto = new Etudiant("toto");       // On déclare toto
        Etudiant.age = 20;              // Et son age
        System.out.println(Etudiant.nom);
        System.out.println(Etudiant.age);
        toto.Travailler();

    }
}
