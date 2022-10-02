import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class ClubeDeCampo {
    public static void main(String[] argv){
        Scanner sc  = new Scanner(System.in);
        
        int nmrCadastrados;
        do{
            System.out.printf("\nDiga a quantidade de cadastrados de 1 a 10: ");
            nmrCadastrados = sc.nextInt();
        }while(nmrCadastrados > 10 || nmrCadastrados < 1);
        
        int ID[] = new int[nmrCadastrados];
        int ALT[] = new int[nmrCadastrados];
        
        for(int i = 0; i < nmrCadastrados;i++){
            System.out.printf("\nDiga a idade do cadastrado %s: ", i+1);
            ID[i] = sc.nextInt();
            
            System.out.printf("Diga a altura do cadastrado %s em centímetros: ", i+1);
            ALT[i] = sc.nextInt();
        }
        
        int soma10 = 0;
        int soma15 = 0;
        int soma21 = 0;
        int soma100 = 0;
        int qtd10 = 0;
        int qtd15 = 0;
        int qtd21 = 0;
        int qtd100 = 0;

        for(int i = 0; i < nmrCadastrados;i++){
            if(ID[i] <= 10){
                soma10 += ALT[i];
                qtd10 += 1;
            }
            else if(ID[i] > 10 && ID[i] <=15){
                soma15 += ALT[i];
                qtd15 += 1;
            }
            else if(ID[i] > 15 && ID[i] <=21){
                soma21 += ALT[i];
                qtd21 += 1;
            }
            else if(ID[i] > 21){
                soma100 += ALT[i];
                qtd100 += 1;
            }
        }

        System.out.print("\nMédia de alturas até 10 anos: "+soma10/qtd10);
        System.out.print("\nMédia de alturas maior que 10 até 15 anos: "+soma15/qtd15);
        System.out.print("\nMédia de alturas maior que 15 até 21 anos: "+soma21/qtd21);
        System.out.print("\nMédia de alturas maior que 21 anos: "+soma100/qtd100);
    }
}
