import java.util.Scanner;

public class MiniProntuario {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int [][] matrizpul = new int[24][4];
        int lin, col;
// a) Armazenar as leituras de cada paciente em uma matriz de dimensão 24 x 4 dos valores das pulsações dos 4 pacientes ao longo das 24 horas de um dia;
        for (lin = 0; lin < 24; lin++) {
            for (col = 0; col < 4; col++) {
                System.out.println("Pulsações do paciente " + col + " dentro de: " + lin);
                matrizpul[lin][col] = sc.nextInt();
            }
        }
// b) Calcular e apresentar a média das pulsações para cada um dos pacientes;
        double media,  maiorMedia = 0;
        int cama = -1, soma = 0;

        for (col = 0; col < 4; col++) {
            for (lin = 0; lin < 24; lin++) {
                soma = soma + matrizpul[lin][col];
            }
            media = (float) soma / 24;
            System.out.println("Média das pulsações do paciente da cama " + col + " = " + media);

            if (maiorMedia < media) {
                maiorMedia = media;
                cama = col;
            }
            soma = 0;
            media = 0;
        }
        System.out.println("A Maior média de pulsações = " + maiorMedia + " cama = " + cama);
// c) Identificar os pacientes que apresentaram o maior valor médio das pulsações.
        cama = -1;
        int maior = -1;
        int hora = -1;
        for (col = 0; col < 4; col++) {
            for (lin = 0; lin < 24; lin++) {
                if (maior < matrizpul[lin][col]) {
                    maior = matrizpul[lin][col];
                    cama = col;
                    hora = lin;
                }
            }
        }
        System.out.println("Maiores pulsações = " + maior + " cama= " + cama + " horas = " + hora);
    }
}

