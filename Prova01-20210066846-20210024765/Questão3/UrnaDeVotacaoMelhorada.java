import java.util.Scanner;

public class UrnaDeVotacaoMelhorada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		String entrada, ganhador;
		int votos[] = new int[3],totalVotos = 0, votoInvalido=0; 
		float qtdVotos = 0;
		
		System.out.println("Diga quantas pessoas vão votar: ");
		int nmrPessoas = sc.nextInt();

		// for(int i = 0;i < votos.length;i++){
		// 	votos[i] = 0;
		// }

		do{	
			System.out.println("Digite o código de seu candidato \n"+
				"    111 - Maria da Silva \n" +
				"    222 - Pedro de Araújo \n" +
				"    333 - José de Souza \n");
			entrada = sc2.nextLine();
		
			switch (entrada) {
				case "111":
					votos[0]++;
				break;
				case "222":
					votos[1]++;
				break;
				case "333":
					votos[2]++;
				break;
				default:
					votoInvalido++;
					break;
			}
			qtdVotos++;
			nmrPessoas--;
		}while(nmrPessoas != 0);
			
		if (votos[0]>votos[1] && votos[0]>votos[2]) {
			ganhador = "Maria Silva";
			totalVotos = votos[0];
		}else if (votos[1]>votos[2]) {
				ganhador = "Pedro Araújo";
				totalVotos=votos[1];
		}else 
		{	ganhador = "José de Souza";
			totalVotos=votos[2];
		}
		
		System.out.println("\nTotal de votos: "+qtdVotos);
		System.out.println("\nO ganhador foi "+ganhador+" com "
				+totalVotos + " votos");
		System.out.println("\nVotos inválidos foram: "+(votoInvalido/qtdVotos)*100+"%"+
		"\nVotos válidos foram: "+((qtdVotos-votoInvalido)/qtdVotos)*100+"%");
		
		for(int i = 0;i < 3;i++){
			System.out.println("\nO percentual do canditado "+(i+1)+" foi de: "+(votos[i]/qtdVotos)*100+"%");
		}
		
		System.exit(0);		
	}
}
