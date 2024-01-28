package primeiraParte_Exercicio2;

import java.util.ArrayList;

public class ConversorDigitoParaExtenso {
    public void converterDigitoParaExtendo( int input )
    {
        // Converte o número para uma string.
        String numeroString = Integer.toString(input);

        // Cria um ArrayList com os dígitos do número.
        ArrayList<String> numeroDigitos = new ArrayList<>();

        for (char digito : numeroString.toCharArray()) {
            numeroDigitos.add(String.valueOf(digito));
        }

        // Itera sobre os dígitos, convertendo-os para uma string por extenso.
        StringBuilder extenso = new StringBuilder();
        for (String digito : numeroDigitos) {
            if (digito.equals("0")) {
                extenso.append("zero, ");
            } else if (digito.equals("1")) {
                extenso.append("um, ");
            } else if (digito.equals("2")) {
                extenso.append("dois, ");
            } else if (digito.equals("3")) {
                extenso.append("três, ");
            } else if (digito.equals("4")) {
                extenso.append("quatro, ");
            } else if (digito.equals("5")) {
                extenso.append("cinco, ");
            } else if (digito.equals("6")) {
                extenso.append("seis, ");
            } else if (digito.equals("7")) {
                extenso.append("sete, ");
            } else if (digito.equals("8")) {
                extenso.append("oito, ");
            } else if (digito.equals("9")) {
                extenso.append("nove, ");
            } else {
                throw new IllegalArgumentException("Digito inválido: " + digito);
            }
        }

        System.out.println("Digito(s) : " + extenso);

    }
}