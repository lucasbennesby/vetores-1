import java.util.Scanner;

public class LeiaVetor {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int vetor[] = new int[10];
        int total = 0;

        for (int i = 0; i < vetor.length; i++) {

            System.out.println("digite o " + i + "º valor");

            vetor[i] = leitor.nextInt();
            total += vetor[i];

        }

        System.out.println("a soma total dos 10 valores é: " + total);

    }
}