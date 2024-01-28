package primeiraParte_Exercicio4;
import java.util.Random;
public class AlgoritmosGeneticos {
    public static String[] recombinacao(String s1, String s2) {
        Random rand = new Random();
        int pontoCorte = rand.nextInt(Math.min(s1.length(), s2.length()));

        String filho1 = s1.substring(0, pontoCorte) + s2.substring(pontoCorte);
        String filho2 = s2.substring(0, pontoCorte) + s1.substring(pontoCorte);

        return new String[] { filho1, filho2 };
    }

    public static String mutacao(String s) {
        Random rand = new Random();
        int posicao = rand.nextInt(s.length());
        char novaBase = gerarBaseAleatoria();
        StringBuilder mutacao = new StringBuilder(s);
        mutacao.setCharAt(posicao, novaBase);
        return mutacao.toString();
    }

    private static char gerarBaseAleatoria() {
        String bases = "ACGT";
        Random rand = new Random();
        int index = rand.nextInt(bases.length());
        return bases.charAt(index);
    }
}