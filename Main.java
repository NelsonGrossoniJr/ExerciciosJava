import primeiraParte_Exercicio1.*;
import primeiraParte_Exercicio2.ConversorDigitoParaExtenso;
import primeiraParte_Exercicio3.VisualizadorDeIniciais;
import primeiraParte_Exercicio4.*;
import segundaParte_Exercicio1.*;
import segundaParte_Exercicio2.*;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.LinkedList;
import java.lang.System;

public class Main {
    public static void main(String[] args) {

        /*
        1-) Faça um programa que a partir de uma String digitada pelo usuário imprima:
        */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma frase, palavra ou número: ");
        String input = scanner.nextLine();

        /* a)O número de caracteres da string. */
        ContadorDeCaracteres contador = new ContadorDeCaracteres();
        contador.contarCaracteres(input);

        /* b) A string com todas suas letras em maiúsculo. */
        ConversorMaiusculas conversor = new ConversorMaiusculas();
        conversor.ConverterMaiusculas(input);

        /* c) O número de vogais da string.  (Criar uma classe utilitária e um método pra isso.) */
        ContadorDeVogal contador2 = new ContadorDeVogal();
        contador2.contarVogais(input);

        /* d) Se a string digitada começa com "INF" (ignorando maiúsculas/minúsculas). */
        VerificadorPrefixo verificador = new VerificadorPrefixo();
        verificador.verificarPrefixo(input);

        /* e) Se a string digitada termina com "NET" (ignorando maiúsculas/minúsculas). */
        VerificadorSufixo verificador2 = new VerificadorSufixo();
        verificador2.verificarSufixo(input);

        /* f) O número de dígitos (0 a 9) da string. (Utilizar a classe utilitaria e criar um método para isso) */
        ContadorDeDigitos contador3 = new ContadorDeDigitos();
        contador3.contarDigitos(input);

        /* g) Os 2 primeiros digitos da String. */
        VisualizadorDoisPrimeirosCarcteres visualizador = new VisualizadorDoisPrimeirosCarcteres();
        visualizador.visualizarDoisPrimeirosCaracteres(input);

        /* h) Se a string é um palíndromo ou não. (Utilizar a classe utilitaria e criar um método para isso) */
        VerificadorPalindromo verificador3 = new VerificadorPalindromo();
        verificador3.verificarPalindromo(input);

        System.out.println("==========================================");
        System.out.println("******************************************");
        System.out.println("==========================================");


        /*
        2-)Escreva um programa que dado um valor numérico digitado pelo usuário (armazenado em  uma variável inteira), imprima cada um dos seus dígitos por extenso.
        */
        boolean repetir = true; // Variável para controlar a repetição do código
        System.out.println("Aperte em qualquer tecla para ir ao exercício 2 ");
        while (repetir) {
            scanner.nextLine();

            try {
                System.out.println("Digite um número inteiro: ");
                int numeroInput = scanner.nextInt();


                ConversorDigitoParaExtenso conversor2 = new ConversorDigitoParaExtenso();
                conversor2.converterDigitoParaExtendo(numeroInput);

                repetir = false; // Se chegou aqui sem exceções, não repetirá o código
            } catch (InputMismatchException e) {
                System.out.println("O valor inserido não é um número válido.");
            }
        }
        scanner.nextLine();

        System.out.println("==========================================");
        System.out.println("******************************************");
        System.out.println("==========================================");


        /*
        3-) Escreva um programa que, a partir de um nome informado pelo usuário, exiba suas  iniciais.  As iniciais são formadas pela primeira letra de cada nome, sendo que todas deverão  aparecer em maiúsculas na saída do programa. Note que os conectores e, do, da, dos, das,  de, di, du não são considerados nomes e, portanto, não devem ser considerados para a  obtenção das iniciais. As iniciais devem ser impressas em maiúsculas, ainda que o nome  seja entrado todo em minúsculas.
        */
        System.out.println("Aperte em qualquer tecla para ir ao exercício 3 ");
        scanner.nextLine();
        try
        {
            System.out.print("Digite um nome: ");
            String nomeInput = scanner.nextLine();

            VisualizadorDeIniciais visualizador2 = new VisualizadorDeIniciais();
            visualizador2.visualizarIniciais(nomeInput);

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Você esta colocando a tecla Backspace duas ou mais vezes entre seus nomes digitados.");
        }

        System.out.println("==========================================");
        System.out.println("******************************************");
        System.out.println("==========================================");


        /*
        4-) Um algoritmo genético é técnica de inteligência artificial que se inspira na forma como a  natureza funciona e na teoria da evolução para resolver problemas complexos. Os  algoritmos genéticos funcionando mantendo uma população de estruturas que evoluem  de forma semelhante à evolução das espécies.
        A recombinação e a mutação são os operadores básicos de um algoritmo genético.
        Considerando que os indivíduos da população são codificados através de strings, o  operador de recombinação recebe duas strings S1 e S2, sorteia aleatoriamente um ponto  de corte em S1 e S2. Em seguida, realizada a troca de informações genéticas de S1 e S2, de  forma a gerar dois novos indivíduos filhos. A figura abaixo ilustra o processo de  recombinação.
        */
        System.out.println("Aperte em qualquer tecla para ir ao exercício 4 ");
        scanner.nextLine();

        System.out.print("Digite o tamanho das cadeias de DNA: ");
        int tamanho = scanner.nextInt();

        String dna1 = CadeiaDeDna.gerarCadeiaDeDna(tamanho);
        String dna2 = CadeiaDeDna.gerarCadeiaDeDna(tamanho);

        System.out.println("Cadeia 1: " + dna1);
        System.out.println("Cadeia 2: " + dna2);

        String[] filhos = AlgoritmosGeneticos.recombinacao(dna1, dna2);

        System.out.println("Filho 1 após recombinação: " + filhos[0]);
        System.out.println("Filho 2 após recombinação: " + filhos[1]);

        String mutacao1 = AlgoritmosGeneticos.mutacao(dna1);
        String mutacao2 = AlgoritmosGeneticos.mutacao(dna2);

        System.out.println("Cadeia 1 após mutação: " + mutacao1);
        System.out.println("Cadeia 2 após mutação: " + mutacao2);

        scanner.nextLine();

        System.out.println("==========================================");
        System.out.println("******************************************");
        System.out.println("==========================================");


        /*
        1-) Crie uma classe Chamada CartãoWEB. Essa classe representará todos os cartões web e deverá ter apenas dois atributos: email(String) e nome(String).
        */
      
        System.out.println("Aperte em qualquer tecla para ir ao exercício 1 parte 2 ");
        scanner.nextLine();

        LinkedList<CartaoWeb> cartoes = new LinkedList<>();

        // Criando cartões de diferentes tipos
        cartoes.add(new DiaDosNamorados("joao@example.com", "João"));
        cartoes.add(new Natal("maria@example.com", "Maria"));
        cartoes.add(new Aniversario("carlos@example.com", "Carlos"));
        cartoes.add(new Pascoa("ana@example.com", "Ana"));
      
        cartoes.add(new DiaDosNamorados("pedroexamplecom", "Pedro"));
        cartoes.add(new Natal("pedroexamplecom", "Pedro"));
        cartoes.add(new Aniversario("pedroexamplecom", "Pedro"));
        cartoes.add(new Pascoa("anaexamplecom", "Ana"));

        /* 
        O REPLIT NAO ESTA ME PERMITINDO USAR P STREAMS AQUI, ESTA ME RETORNANDO ESTA MSG " Method references are allowed only at source level 1.8 or above "
        
        cartoes.stream()
                .map(CartaoWeb::showMessage)
                .forEach(System.out::println);
        */

        for (CartaoWeb cartao : cartoes) {
            System.out.println(cartao.showMessage());
        }

        System.out.println("==========================================");
        System.out.println("******************************************");
        System.out.println("==========================================");

      
        /*
        4-) As ilhas Faroe te contrataram para implementar o sistema de caixas bancários(ATM) da ilha.
        A moeda local se chama BIT e eles possuem as seguintes cédulas: B$50,B$10,B$5 e B$1.
        */

        System.out.println("Aperte em qualquer tecla para ir ao exercício 2 parte 2 ");
        scanner.nextLine();

        ClienteStandard clienteS1 = new ClienteStandard("ClienteStandard", Arrays.asList("fulano@example.com", "beltrano@example.com"), "123-456-7890", "Rua da Paz", 123, "Centro", "São Paulo", "SP", 1000.00);
        ClienteVIP clienteV1 = new ClienteVIP("ClienteVIP", Arrays.asList("fulano@example.com", "beltrano@example.com"), "123-456-7890", "Rua da Paz", 123, "Centro", "São Paulo", "SP", 1000.00);

        int escolherConta = 10;
        boolean verificadorLoopEscolherConta = true;

        while (verificadorLoopEscolherConta)
        {
            do {
                System.out.println("Deseja entrar em sua conta VIP ou Standard ?");
                System.out.println("Digite:");
                System.out.println("[ 0 ] = Standard");
                System.out.println("[ 1 ] = VIP");
                System.out.println("[ 2 ] = Sair");

                try {
                    escolherConta = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("O valor inserido não é um número valido.");
                    scanner.nextLine();
                }

            } while (escolherConta < 0 || escolherConta > 2);
            scanner.nextLine();


            switch (escolherConta) {

                case 0:
                    int escolherMetodo = 10;

                    do {
                        System.out.println(clienteS1);

                        System.out.println("Você deseja sacar ou depositar seu dinheiro");
                        System.out.println("Digite:");
                        System.out.println("[ 0 ] = Sacar");
                        System.out.println("[ 1 ] = Depositar");
                        try {
                            escolherMetodo = scanner.nextInt();
                        } catch (InputMismatchException e) {
                            System.out.println("O valor inserido não é um número valido.");
                        }
                    } while (escolherMetodo < 0 || escolherMetodo > 2);


                    scanner.nextLine();

                    switch (escolherMetodo) {


                        case 0 :
                            double valorSaque = 0.0;

                            System.out.println("Digite qual valor você deseja sacar:");
                            try {
                                valorSaque = scanner.nextInt();
                            } catch (InputMismatchException e) {
                                System.out.println("O valor inserido não é um número valido.");
                            }

                            clienteS1.sacar(valorSaque);
                            System.out.println("Seu Saldo atual é: " + clienteS1.getSaldo());

                            scanner.nextLine();
                        break;

                        case 1:
                            double valorDeposito = 0.0;

                            System.out.println("Digite qual valor você deseja depositar:");
                            try {
                                valorDeposito = scanner.nextInt();
                            } catch (InputMismatchException e) {
                                System.out.println("O valor inserido não é um número valido.");
                            }

                            clienteS1.depositar(valorDeposito);
                            System.out.println("Seu Saldo atual é: " + clienteS1.getSaldo());

                            scanner.nextLine();
                        break;


                        default: System.out.println("Digite [ 0 ] ou [ 1 ] para escolher sua conta.");
                    }
                break;

                case 1:
                    int escolherMetodo2 = 10;
                    do {
                        System.out.println(clienteV1);

                        System.out.println("Você deseja sacar ou depositar seu dinheiro");
                        System.out.println("Digite:");
                        System.out.println("[ 0 ] = Sacar");
                        System.out.println("[ 1 ] = Depositar");
                        try {
                            escolherMetodo2 = scanner.nextInt();
                        } catch (InputMismatchException e) {
                            System.out.println("O valor inserido não é um número valido.");
                        }
                    } while (escolherMetodo2 < 0 || escolherMetodo2 > 1);

                    scanner.nextLine();

                    switch (escolherMetodo2) {

                        case 0:
                            double valorSaque = 0.0;

                            System.out.println("Digite qual valor você deseja sacar:");
                            try {
                                valorSaque = scanner.nextInt();
                            } catch (InputMismatchException e) {
                                System.out.println("O valor inserido não é um número valido.");
                            }
                            clienteV1.sacar(valorSaque);
                            System.out.println("Seu Saldo atual é: " + clienteV1.getSaldo());

                            scanner.nextLine();
                        break;

                        case 1:
                            double valorDeposito = 0.0;

                            System.out.println("Digite qual valor você deseja depositar:");
                            try {
                                valorDeposito = scanner.nextInt();
                            } catch (InputMismatchException e) {
                                System.out.println("O valor inserido não é um número valido.");
                            }
                            clienteV1.depositar(valorDeposito);
                            System.out.println("Seu Saldo atual é: " + clienteV1.getSaldo());

                        break;

                        default: System.out.println("Digite [ 0 ] ou [ 1 ] para escolher sua conta.");
                    }
                break;

                case 2: verificadorLoopEscolherConta = false;

                break;
                default: System.out.println("Digite [ 0 ] ou [ 1 ] ou [ 2 ] para a escolha.");
            }
        }


        scanner.close();
    }
}