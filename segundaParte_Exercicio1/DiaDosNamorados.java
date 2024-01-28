package segundaParte_Exercicio1;

public class DiaDosNamorados extends CartaoWeb implements ICartaoWeb {
    public DiaDosNamorados(String email, String nome) {
        super(email, nome);
    }

    public String showMessage() {
        return String.format("mensagem para: %s%nParabéns, %s pelo Dia dos Namorados.%n======================================", email, nome);
    }
}
