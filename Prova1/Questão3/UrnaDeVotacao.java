import java.util.Scanner;

public class UrnaDeVotacao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s, ganhador;
		String entrada;
		int count1=0,count2=0,count3=0, totalVotos=0, votoInvalido=0; 
		
		System.out.println("Diga quantas pessoas vão votar: ");
		int nmrPessoas = sc.nextInt();

		
		do{	
			System.out.println("Digite o código de seu candidato \n"+
				"    111 - Maria da Silva \n" +
				"    222 - Pedro de Araújo \n" +
				"    333 - José de Souza \n");
		
			if (entrada.equals("111")) {
				count1++;
			}else if (entrada.equals("222")){
				count2++;
			}
			else if(entrada.equals("333")){
				count3++;
			}else{
				votoInvalido++;
			}
		}while(contador != nmrPessoas);
			
		if (count1>count2 && count1>count3) {
			ganhador = "Maria Silva";
			totalVotos = count1;
		}else if (count2>count3) {
				ganhador = "Pedro Araújo";
				totalVotos=count2;
		}else 
		{	ganhador = "José de Souza";
			totalVotos=count3;
		}
		
		JOptionPane.showMessageDialog(null, "O ganhador foi "+ganhador+" com "
				+totalVotos + " votos");
		
		System.exit(0);		
	}
}
