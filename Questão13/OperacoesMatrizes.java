import java.util.Scanner;

public class OperacoesMatrizes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][4];
        int lin, col;

        for (lin = 0; lin < 3; lin++) {
            for (col = 0; col < 4; col++) {
                System.out.println("Digite o número pra posição " + lin + "  " + col);
                matriz[lin][col] = sc.nextInt();
            }
        }
        double media;
        int soma = 0;

        for (col = 0; col < 4; col++) {
            for (lin = 0; lin < 3; lin++) {
                if (lin > col) {
                    soma = soma + matriz[lin][col];
                }
            }
        }
        media = (float) soma / 3;
        System.out.println("Média aritmética dos elementos abaixo da dp=  " + media);
        soma = 0;

        for (lin = 0; lin < 3; lin ++) {
            for (col = 0; col < 4; col++) {
                if (lin < col) {
                    soma = soma + matriz[lin][col];
                }
            }
        }
        System.out.println("Soma dos elementos acima da dp =  " + soma);
        soma = 0;

        for (lin = 0; lin < 3; lin++) {
            for (col = 0; col < 4; col++) {
                if (lin == col) {
                    soma = soma + matriz[lin][col];
                }
            }
        }
        media = (float) soma / 3;
        System.out.println("Média dos elementos da diagonal principal =  " + media);

        soma = 0;
        int menor = 0;

        for (col = 0; col < 4; col++) {
            for (lin = 0; lin < 3; lin++) {
                if (menor > matriz[lin][col] || menor == 0) {
                    menor = matriz[lin][col];
                }
            }
        }
        System.out.println("A menor elemento da matriz  =   " + menor);

        for (lin = 0; lin < 3; lin++) {
            for (col = 0; col < 4; col++) {
                soma = soma + matriz[lin][col];
            }
        }
        System.out.println("A soma de todos os elementos na matriz  =   " + soma);
    }
}
