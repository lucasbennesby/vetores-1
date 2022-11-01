import java.util.Scanner;

public class PosicaoDigitada {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int size = 0, posicao;

        System.out.println("digite o tamanho do vetor");
        size = leitor.nextInt();

        int vetor[] = new int[size];

        System.out.println("digite uma posição do vetor");
        posicao = leitor.nextInt();

        while (true) {
            if (posicao > vetor.length) {
                System.out.println("posicao indeterminada, digite outra");
                posicao = leitor.nextInt();
            } else {
                break;
            }
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("digite o " + i + "º valor");
            vetor[i] = leitor.nextInt();
        }

        System.out.println("o valor da posicao " + posicao + " eh " + vetor[posicao - 1]);

    }
}
