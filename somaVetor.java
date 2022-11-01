import java.util.Scanner;

public class somaVetor {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int size;
        System.out.println("digite o tamanho dos vetores: ");
        size = leitor.nextInt();

        int vetorA[] = new int[size];
        int vetorB[] = new int[size];
        int vetorC[] = new int[size];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("digite o " + i + "º valor do vetor A");
            vetorA[i] = leitor.nextInt();
        }
        for (int i = 0; i < vetorB.length; i++) {
            System.out.println("digite o " + i + "º valor do vetor B");
            vetorB[i] = leitor.nextInt();
        }
        for (int i = 0; i < vetorC.length; i++) {
            vetorC[i] = vetorA[i] + vetorB[i];

        }
        System.out.print("vetor C = ");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.print("[" + vetorC[i] + "]");

        }
    }

}
