public class Trio{
    private Personne[] tab;
    private int numero;
    private static int compteur=0;
    public Trio(){
        this.tab=new Personne[3];
        for (int i=0;i<tab.length;i++){
            tab[i]=new Personne();
        }
        this.compteur++;
        this.numero=compteur;
    }
    public String toString(){
        String res="Trio "+this.numero+" : ";
        for(Personne p:tab){
            res+=p+" ";
        }
        return res;

    }
    public static int getNbTrio(){
        return Trio.compteur;
    }
}