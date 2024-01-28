package primeiraParte_Exercicio1;

public class VerificadorPrefixo
{
    public void verificarPrefixo( String input)
    {
        if (input.toLowerCase().startsWith("inf")) {
            System.out.println("A string começa com 'INF'.");
        } else {
            System.out.println("A string não começa com 'INF'.");
        }
    }
}
