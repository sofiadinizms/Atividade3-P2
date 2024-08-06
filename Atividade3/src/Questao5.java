import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Recebe um número do usuário
        System.out.println("Insira um número:");
        int n = scanner.nextInt();

        //Checa se ele é primo e printa a mensagem adequada de acordo com o resultado
        if (n <= 1) {
            System.out.println(n + " não é primo.");
        } else {
            boolean isPrimo = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrimo = false;
                    break;
                }
            }

            if (isPrimo) {
                System.out.println(n + " é primo.");
            } else {
                System.out.println(n + " não é primo.");
            }
        }

        scanner.close();
    }
}
