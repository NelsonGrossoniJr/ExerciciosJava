package primeiraParte_Exercicio1;

public class VerificadorSufixo {
    public void verificarSufixo(String input)
    {
        if (input.toLowerCase().endsWith("net")) {
            System.out.println("A string termina com 'NET'.");
        } else {
            System.out.println("A string não termina com 'NET'.");
        }

    }
}
