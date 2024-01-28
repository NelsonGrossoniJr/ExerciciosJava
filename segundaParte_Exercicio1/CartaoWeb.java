package segundaParte_Exercicio1;

public class CartaoWeb {
    protected String email;
    protected String nome;

    public CartaoWeb(String email, String nome) {
        if (validarEmail(email)) {
            this.email = email;
        } else {
            this.email = "email invalido";
        }
        this.nome = nome;
    }

    private boolean validarEmail(String email) {
        if (email == null || email.trim().isEmpty()) {
            return false;
        }

        // Verifique se o e-mail contém um '@'
        if (!email.contains("@")) {
            return false;
        }

        // Verifique se o e-mail contém um ponto
        if (!email.contains(".")) {
            return false;
        }

        // Verifique se o e-mail contém pelo menos 6 caracteres
        return email.length() >= 6;

        // O e-mail é válido

    }

    public Object showMessage() {
        return null;
    }
}
