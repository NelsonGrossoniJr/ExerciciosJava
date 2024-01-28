package segundaParte_Exercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Reutilizando {


    public static void testInputMismatchException(int escolherInput) {
        Scanner scanner = new Scanner(System.in);
        try {
            escolherInput = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("O valor inserido não é um número valido.");
            scanner.nextLine();
        }
    }
}
