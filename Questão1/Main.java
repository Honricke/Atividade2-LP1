import java.util.Scanner;

public class Main{
    public static void main(String[] argv){
        Scanner sc  = new Scanner(System.in);
        
        float valores[] = new float[2];

        System.out.print("Diga o 1º valor: ");
        valores[0] = sc.nextInt();

        System.out.print("Diga o 2º valor: ");
        valores[1] = sc.nextInt();

        System.out.printf("Soma: %.2f",valores[0]+valores[1]);
        System.out.printf("\nSubtração: %.2f",valores[0]-valores[1]);
        System.out.printf("\nMultiplicação: %.2f",valores[0]*valores[1]);
        System.out.printf("\nDivisão: %.2f",valores[0]/valores[1]);
        System.out.printf("\nResto da Divisão: %.0f",valores[0]%valores[1]);
        System.out.printf("\nRaiz do segundo número: %.2f",Math.sqrt(valores[1]));
        System.out.printf("\nPotencia do primeiro número: %.2f",valores[0]*valores[0]);
    }
}