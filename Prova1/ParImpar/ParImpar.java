package Prova1.ParImpar;

/*
2) (3,0). Classe ParImpar. 
Faça uma classe contendo dois arrays do tipo inteiro, 
um chamado par e outro chamado ímpar. 
Cada array deve conter 10 elementos.

Popule esses arrays através de uma geração randômica de números entre 1 e 30,
categorizando os valores pares e ímpares. 

Ao final imprima na tela a lista de número pares e a lista de números ímpares.
*/

import java.util.Random;

public class ParImpar {
    public static void main(String[] args) {

        int tamanho = 10;
        int Impar[] = new int[tamanho];
        int Par[] = new int[tamanho];
        int aux=0;
        Random gerador = new Random();

        int par=0,impar=0;

        do{
            aux = gerador.nextInt(30);

            if (aux%2 ==0  && par<10){
                Par[par] = aux;
                par++;
            }else if( aux%2 !=0  && impar<10){
                Impar[impar] = aux;
                impar++;
            }
        }while(impar<10  && par<10);

        for (int i=0; i<tamanho;i++) {
            System.out.printf("\nO valor(%s) impar: %s \n",i+1, Impar[i]);

            System.out.printf("\nO valor(%s) par: %s \n",i+1, Par[i]);
        }
    }
}