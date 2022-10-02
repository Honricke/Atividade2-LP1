import java.util.Scanner;

public class VolumeEsfera {
    public static void main(String[] argv){
        Scanner sc  = new Scanner(System.in);

        System.out.print("Diga o raio da esfera: ");
        float raio = sc.nextInt();

        System.out.printf("\nVolume: %s", (4/3)*3.1415*Math.pow(raio,3));

    }
}
