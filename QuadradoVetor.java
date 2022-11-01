import java.util.Scanner;

public class QuadradoVetor {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int size;

        System.out.println("digite o tamanho do vetor");
        size = leitor.nextInt();

        int vetorA[] = new int[size];
        int vetorB[] = new int[size];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("digite o " + i + "º valor do vetor A");
            vetorA[i] = leitor.nextInt();
        }

        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = vetorA[i] * vetorA[i];
        }
        System.out.print("vetor B = ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print("[" + vetorB[i] + "]");
        }

    }
}
