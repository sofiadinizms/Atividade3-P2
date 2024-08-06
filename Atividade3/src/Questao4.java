import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Recebe o valor do primeiro número
        System.out.println("Insira o valor de A:");
        int a = scanner.nextInt();


        //Recebe o valor do segundo número
        System.out.println("Insira o valor de B:");
        int b = scanner.nextInt();

        //Printa os números ímpares entre eles
        for (int i = a; i <= b; i++) {
            if (i % 2 != 0) {
                System.out.println("É impar: " + i);
            }
        }

        scanner.close();
    }
}
