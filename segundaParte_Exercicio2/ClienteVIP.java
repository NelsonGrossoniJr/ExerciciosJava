package segundaParte_Exercicio2;

import java.util.List;
import java.util.Scanner;

public class ClienteVIP extends Cliente {



    public ClienteVIP(String nome, List<String> email, String seguroSocial, String logradouro, int numero, String bairro, String cidade, String zipCode, double saldo) {
        super(nome, email, seguroSocial, logradouro, numero, bairro, cidade, zipCode, saldo);
    }

    @Override
    public String toString() {
        return "ClienteVIP{" +
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
        Scanner scanner = new Scanner(System.in);

        int escolherMetodoSacar = 10;
        int notas50 = 0;
        int notas10 = 0;
        int notas5;
        int notas1;

        if(valor < 50){
            System.out.println("Você quer usar o metodo com notas de B$5 e B$1.");
            System.out.println("Digite:");
            System.out.println("[ 0 ] = Sim");
            System.out.println("[ 1 ] = Não");
            escolherMetodoSacar = scanner.nextInt();
        }
        switch (escolherMetodoSacar){
            case 0 -> {
                notas5 = valor / 5;
                valor %= 5;

                notas1 = valor;
                System.out.println(notas50 + " notas de B$50, " + notas10 + " notas de B$10, " + notas5 + " notas de B$5, " + notas1 + " notas de B$1");
            }
            case 1 -> {
                notas50 = valor / 50;
                valor %= 50;

                notas10 = valor / 10;
                valor %= 10;

                notas5 = valor / 5;
                valor %= 5;

                notas1 = valor;

                System.out.println(notas50 + " notas de B$50, " + notas10 + " notas de B$10, " + notas5 + " notas de B$5, " + notas1 + " notas de B$1");
            }
        }

    }
}