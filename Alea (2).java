public class Alea{
    private Alea(){};
    //lettre et chaine sont des methode de classe car elles sont contenue dans la classe Cone
    public static char lettre(){
        return (char)(Math.random()*('z'-'a'+1)+'a');
    }
    public static String chaine(){
        String res="";
        for(int i=0;i<10;i++){
            res+=Alea.lettre();
        }
        return res;
    }


}