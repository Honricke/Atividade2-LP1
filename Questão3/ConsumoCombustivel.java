import java.util.Scanner;

public class ConsumoCombustivel {
    public static void main(String[] argv){
        Scanner sc  = new Scanner(System.in);

        System.out.print("Diga o tempo em minutos: ");
        float tempo = sc.nextInt();

        System.out.print("Diga a valocidade média: ");
        float velocidade = sc.nextInt();

        float distancia = (tempo/60)*velocidade;

        System.out.printf("\nVelocidade média: %s", (velocidade));
        System.out.printf("\nTempo: %s", (tempo));
        System.out.printf("\nDistância: %s", (distancia));
        System.out.printf("\nLitros usados: %s", (distancia/12)*1.00);
        
    }
}
