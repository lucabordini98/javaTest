public class Nazione {

    private Citta capitale;
    public Nazione ( Citta capitale )
    {
        this.capitale = new Citta ( );
        this.capitale = capitale;
    }

    public void getCapitale ( )
    {
        System.out.println( "Name:\t" + this.capitale.getName() + "\tNum. Abitanti:\t"+ this.capitale.getAbitanti() );
    }
}
