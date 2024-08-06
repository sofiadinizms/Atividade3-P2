import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadePositivos = 0;

        while (true) {
            //Recebe o número do usuário
            System.out.println("Insira um número:");
            int numero = scanner.nextInt();

            //Se o número for 0, quebra o loop e vai para a impressão da quantidade de positivos
            if (numero == 0) {
                break;
            }

            //Se for um número positivo, acrescenta em 1 a quantidade de positivos
            if (numero > 0) {
                quantidadePositivos++;
            }
        }

        //Printa a quantidade final de números positivos dados pelo usuário
        System.out.println("Quantidade de positivos: " + quantidadePositivos);
        scanner.close();
    }
}

