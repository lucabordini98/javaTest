
public class Main {
    public static void main(String[] args)
    {
        Citta c = new Citta ( 12, "Como" );
        Nazione ita = new Nazione( c );
        ita.getCapitale();
    }
}