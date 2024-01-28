package primeiraParte_Exercicio1;

public class ContadorDeDigitos {
    public void contarDigitos(String input) {
        int contador = 0;

        for (int i = 0; i < input.length(); i++) {
            char caractere = input.charAt(i);

            if (Character.isDigit(caractere)) {
                contador++;
            }
        }

        System.out.println("Número de dígitos (0 a 9) na string: " + contador);
    }
}
