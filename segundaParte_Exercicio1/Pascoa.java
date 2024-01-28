package segundaParte_Exercicio1;

public class Pascoa extends CartaoWeb implements ICartaoWeb {
    public Pascoa(String email, String nome) {
        super(email, nome);
    }

    public String showMessage() {
        return String.format("mensagem para: %s%nFeliz Páscoa, %s!%n======================================", email, nome);
    }
}