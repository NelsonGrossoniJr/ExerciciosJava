package primeiraParte_Exercicio4;
import java.util.Random;
public class CadeiaDeDna {
    public static String gerarCadeiaDeDna(int tamanho) {
        Random rand = new Random();
        StringBuilder dna = new StringBuilder();
        String bases = "ACGT";

        for (int i = 0; i < tamanho; i++) {
            int index = rand.nextInt(bases.length());
            char base = bases.charAt(index);
            dna.append(base);
        }

        return dna.toString();
    }
}