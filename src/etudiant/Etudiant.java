package etudiant;

public class Etudiant{
    /**
     *
     * Method main
     *
     * @param args
     *
     **/
    public String nom;
    public Integer age;

    public Etudiant(String n, Integer i)
    {
        nom=n;
        age=i;
    }
    public void Travailler()
    {
        if(this.nom == "toto")
        {
            System.out.println(this.nom + " se met au travail"); // this == l'objet utilisé en cours
        }
    }
    public void seReposer() // dans le même cas on a un this en dessous et en gros ça correspond à Etudiant toto
    {
        if(this.nom == "toto")
        {
            System.out.println(this.nom + " se repose");
        }
    }
}