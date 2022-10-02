import java.util.Scanner;

public class CalculadoraAvancada {
    public static void main(String[] argv){
        Scanner sc  = new Scanner(System.in);
        
        int Q;
        do{
            System.out.printf("\n\n1 = Dobro\n2 = Triplo\n3 = Metade\n4 = Quadrado\n5 = Cubo\n6 = Raiz Quadrada\n7 = Raiz Cúbica\n8 = Módulo\n9 = Inverso \n0 = Sair do Programa: ");
            Q = sc.nextInt();

            System.out.printf("\nDiga o valor da operação: ");
            float N = sc.nextInt();

            switch(Q){
                case 1:
                    dobro(N);
                break;
                case 2:
                    triplo(N);
                break;
                case 3:
                    metade(N);
                break;
                case 4:
                    quadrado(N);
                break;
                case 5:
                    cubo(N);
                break;
                case 6:
                    raizQuadrada(N);
                break;
                case 7:
                    raizCubica(N);
                break;
                case 8:
                    modulo(N);
                break;
                case 9:
                    inverso(N);
                break;
            }
        }while(Q != 0);
    }
    
    public static void dobro(float valor){
        System.out.printf("\nResultado = %s",valor*2);
    }
    public static void triplo(float valor){
        System.out.printf("\nResultado = %s",valor*3);
    }
    public static void metade(float valor){
        System.out.printf("\nResultado = %s",valor/2);
    }
    public static void quadrado(float valor){
        System.out.printf("\nResultado = %s",Math.pow(valor,2));
    }
    public static void cubo(float valor){
        System.out.printf("\nResultado = %s",Math.pow(valor,3));
    }
    public static void raizQuadrada(float valor){
        System.out.printf("\nResultado = %s",Math.sqrt(valor));
    }
    public static void raizCubica(float valor){
        System.out.printf("\nResultado = %s",Math.cbrt(valor));
    }
    public static void modulo(float valor){
        if(valor < 0){
            System.out.printf("\nResultado = %s",valor*-1);
        }else{
            System.out.printf("\nResultado = %s",valor);
        }
    }
    public static void inverso(float valor){
        System.out.printf("\nResultado = %s",valor*-1);
    }
}
