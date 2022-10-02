import java.util.Scanner;

public class EleicaoSindical {
    public static void main(String[] argv){
        Scanner sc  = new Scanner(System.in);

        System.out.print("Diga os votos do candidato 1: ");
        int A = sc.nextInt();

        System.out.print("Diga os votos do candidato 2: ");
        int B = sc.nextInt();

        System.out.print("Diga os votos do candidato 3: ");
        int C = sc.nextInt();

        System.out.print("Diga os votos nulos: ");
        int nulos = sc.nextInt();

        System.out.print("Diga os votos brancos: ");
        int brancos = sc.nextInt();

        float somaTotal = A+B+C+nulos+brancos;

        System.out.printf("\nPercentual do candidato 1: %.4s", (1/(somaTotal/A))*100);
        System.out.printf("\nPercentual do candidato 2: %.4s", (1/(somaTotal/B))*100);
        System.out.printf("\nPercentual do candidato 3: %.4s", (1/(somaTotal/C))*100);
        System.out.printf("\nPercentual de nulos: %.4s", (1/(somaTotal/nulos))*100);
        System.out.printf("\nPercentual de brancos: %.4s", (1/(somaTotal/brancos))*100);

    }
}
