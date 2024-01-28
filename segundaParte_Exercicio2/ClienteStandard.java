package segundaParte_Exercicio2;

import java.util.List;

public class ClienteStandard extends Cliente {

    public ClienteStandard(String nome, List<String> email, String seguroSocial, String logradouro, int numero, String bairro, String cidade, String zipCode, double saldo) {
        super(nome, email, seguroSocial, logradouro, numero, bairro, cidade, zipCode, saldo);
    }

    @Override
    public String toString() {
        return "ClienteStandard{" +
                "nome='" + getNome() + '\'' +
                ", email=" + getEmail() +
                ", seguroSocial='" + getSeguroSocial() + '\'' +
                ", logradouro=" + getLogradouro() +
                ", numero=" + getNumero() +
                ", bairro='" + getBairro() + '\'' +
                ", cidade='" + getCidade() + '\'' +
                ", zipCode='" + getZipCode() + '\'' +
                ", saldo=" + getSaldo() +
                '}';
    }

    public void sacar(double valor){
        if (valor < 0) {
            throw new IllegalArgumentException("O valor do saque deve ser maior do que zero.");
        } else if (valor > getSaldo()) {
            System.out.println("O saldo da conta é insuficiente para o saque.");
        } else {
            setSaldo(getSaldo() - valor);
            realizarSaque((int)valor);
        }
    }
    private static void realizarSaque(int valor) {
        int notas50 = valor / 50;
        valor %= 50;

        int notas10 = valor / 10;
        valor %= 10;

        int notas5 = valor / 5;
        valor %= 5;

        int notas1 = valor;

        System.out.println(notas50 + " notas de B$50, " + notas10 + " notas de B$10, " + notas5 + " notas de B$5, " + notas1 + " notas de B$1");
    }

}
