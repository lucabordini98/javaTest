public class Citta {
    private int numero_abitanti = 0 ;
    private String nome = "";

    public Citta () {

    }
    public Citta ( int numero_abitanti, String nome ) {
        this.numero_abitanti = numero_abitanti;
        this.nome = nome;
    }

    public String getName (){
        return this.nome;
    }

    public int getAbitanti (){
        return this.numero_abitanti;
    }
}
