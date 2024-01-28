package segundaParte_Exercicio1;

public class Natal extends CartaoWeb implements ICartaoWeb {
    public Natal(String email, String nome) {
        super(email, nome);
    }

    public String showMessage() {
        return String.format("mensagem para: %s%nFeliz Natal, %s!%n======================================", email, nome);
    }
}