package primeiraParte_Exercicio1;

public class VerificadorPalindromo {
    public void verificarPalindromo( String input )
    {
        String inputInvertido = new StringBuilder(input).reverse().toString();

        if (input.equals(inputInvertido)) {
            System.out.println("É um palíndromo");
        } else {
            System.out.println("Não é um palíndromo");
        }
    }
}
