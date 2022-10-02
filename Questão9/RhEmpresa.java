//Na questão 9 não entendi oq seria o salário observado, pois não faz sentido o mesmo ser o maior salário, já que não iria imprimir nada, mas eu coloquei um valor de salário fixo (1000) e fiz algo semelhante.
import java.util.ArrayList;
import java.util.Scanner;

public class RhEmpresa {
    public static void main(String[] argv){
        Scanner sc  = new Scanner(System.in);
        Scanner sc2  = new Scanner(System.in);
        
        int nmrFuncionarios;
        do{
            System.out.printf("\nDiga a quantidade de funcionários entre 80 e 0: ");
            nmrFuncionarios = sc.nextInt();
        }while(nmrFuncionarios > 80 || nmrFuncionarios < 0);
        
        String nome[] = new String[nmrFuncionarios];
        float salario[] = new float[nmrFuncionarios];
        
        for(int i = 0; i < nmrFuncionarios;i++){
            System.out.printf("\nDiga o nome do funcionário %s: ", i+1);
            nome[i] = sc2.nextLine();
            
            System.out.printf("Diga o salário do funcionário %s: ", i+1);
            salario[i] = sc.nextInt();
        }
        
        float maior = 0;
        ArrayList<String> nomeMaiores = new ArrayList<>();

        for(int i = 0; i < nmrFuncionarios;i++){
            if(maior == 0 || salario[i] > maior){
                maior = salario[i];
            }
            if(salario[i] >= 1000){
                nomeMaiores.add(nome[i]);
            }
        }

        System.out.printf("\nMaior salário: %.2f",maior);

        for(String nomeAtual : nomeMaiores){
            System.out.print("\nNome de uma pessoa com salário maior ou igual a 1000: "+nomeAtual);
        }
    }
}
