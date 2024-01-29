public class TestProjet{
    public static void main(String[]args){
        System.out.println(Personne.getNbPersonnes());
        Personne p1=new Personne();
        Personne p2=new Personne();
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(Personne.getNbPersonnes());
        Projet pro1=new Projet("Projet P3X-774");
        Projet pro2=new Projet("Projet P3R-233");
        System.out.println(pro1);
        System.out.println(pro2);
        System.out.println(Personne.getNbPersonnes());
        System.out.println(Trio.getNbTrio());
        System.out.println(Projet.getNbprojet());
    }
}