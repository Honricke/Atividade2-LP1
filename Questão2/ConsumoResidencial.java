import java.util.Scanner;

public class ConsumoResidencial {
    public static void main(String[] argv){
        Scanner sc  = new Scanner(System.in);

        System.out.print("Diga o valor do salário mínimo: ");
        int salarioMinimo = sc.nextInt();

        System.out.print("Diga a quantidade gasta de quilowatt: ");
        int qtdQuilowatt = sc.nextInt();

        System.out.printf("\nValor do quilowatt: %s", (salarioMinimo/5));
        System.out.printf("\nValor do quilowatt por mês: %s", (salarioMinimo/5)*qtdQuilowatt);
        System.out.printf("\nValor do quilowatt por mês com desconto: %s", ((salarioMinimo/5)*qtdQuilowatt)*0.15);
    }
}
