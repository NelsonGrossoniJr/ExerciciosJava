package segundaParte_Exercicio1;

public class Aniversario extends CartaoWeb implements ICartaoWeb {
    public Aniversario(String email, String nome) {
        super(email, nome);
    }

    public String showMessage() {
        return String.format("mensagem para: %s%nFeliz Aniversário, %s!%n======================================", email, nome);
    }
}