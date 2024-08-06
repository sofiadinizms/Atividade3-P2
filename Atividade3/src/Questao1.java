public class Questao1 {
    public static void main(String[] args) {
        int soma = 0;
        //Loop que soma ao resultado final o valor de i. i recebe um acréscimo de 1 a cada iteração,
        //representando todos os números de 1 a 10.
        for (int i = 1; i <= 10; i++) {
            soma += i;
        }
        System.out.println("Somatório: " + soma);
    }
}

