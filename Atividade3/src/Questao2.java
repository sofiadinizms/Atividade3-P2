import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Recebe e armazena o primeiro número
        System.out.println("Insira o valor de A:");
        int a = scanner.nextInt();

        //Recebe e armazena o segundo número
        System.out.println("Insira o valor de B:");
        int b = scanner.nextInt();

        //Printa a série de números entre eles
        System.out.println("Série numérica:");
        for (int i = a + 1; i < b; i++) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}

