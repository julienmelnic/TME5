public class Cone{
    private double r;
    private double h;
    public final double PI=3.14159;
    private static int nbCones=0;
    public Cone(double r, double h){
        this.r=r;
        this.h=h;
        this.nbCones++;
    }
    public Cone(){
        this(Math.random()*10,Math.random()*10);
    }
    public double getVolume(){
        return 1/3*(PI*(this.r*this.r)*this.h);
    }
    public String toString(){
        return "Cone r="+this.r+" h="+this.h+" V="+this.getVolume();
    }
    public static int getnbCones(){
        return nbCones;
    }
        
}