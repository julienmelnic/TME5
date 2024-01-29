public class Personne{
    private String nom;
    private static int nbPersonnes=0;
    private static char lettre='A';
    public Personne(){
        this.nbPersonnes++;
        this.nom="Individu"+this.lettre;
        this.lettre+=1;
       
    }
    public static int getNbPersonnes(){
        return Personne.nbPersonnes;
    }
    public String toString(){
        return this.nom;
    }
}