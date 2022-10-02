import java.util.Scanner;

public class PontosDoQuadrante {
    public static void main(String[] argv){
        Scanner sc  = new Scanner(System.in);
        
        int N;
        do{
            System.out.printf("\nDiga a quantidade de pontos de 1 a 20: ");
            N = sc.nextInt();
        }while(N >= 20 || N < 0);
        
        int X[] = new int[N];
        int Y[] = new int[N];
        
        for(int i = 0; i < N;i++){
            System.out.printf("\nDiga o valor do %sº X: ", i+1);
            X[i] = sc.nextInt();
            
            System.out.printf("Diga o valor do %sº Y: ", i+1);
            Y[i] = sc.nextInt();
        }

        int Q[] = new int[N];

        for(int i = 0; i < N;i++){
            if(X[i] > 0 && Y[i] > 0){
                Q[i] = 1;
            }
            else if(X[i] < 0 && Y[i] > 0){
                Q[i] = 2;
            }
            else if(X[i] < 0 && Y[i] < 0){
                Q[i] = 3;
            }
            else if(X[i] > 0 && Y[i] < 0){
                Q[i] = 4;
            }
            else if(X[i] == 0 || Y[i] == 0){
                Q[i] = 0;
            }
        }

        for(int i = 0;i < N;i++){
            if(Q[i] != 0){
                System.out.printf("\nO ponto (%s,%s) está no %sº quadrante",X[i],Y[i],Q[i]);
            }else{
                System.out.printf("\nO ponto (%s,%s) está em um eixo",X[i],Y[i]);
            }
        }
    }
}
