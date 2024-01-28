package primeiraParte_Exercicio1;

public class ContadorDeVogal {
    public void contarVogais(String input) {
        int contador = 0;

        // Converte o texto para letras minúsculas para facilitar a comparação
        input = input.toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            char caractere = input.charAt(i);

            // Verifica se o caractere é uma vogal
            if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u') {
                contador++;
            }
        }

       System.out.println("Número de vogais: " + contador);
    }
}