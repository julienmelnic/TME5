public class Projet{
    private Trio t;
    private String nom;
    private static int nbprojet=0;
    public Projet(String nom){
        this.nom=nom;
        this.t=new Trio();
        this.nbprojet++;
    }
    public String toString(){
        return this.nom +" "+this.t;
    }
    public static int getNbprojet(){
        return Projet.nbprojet;
    }

}