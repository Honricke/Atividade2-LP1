import javax.swing.JOptionPane;

public class UrnaDeVotacao {

	public static void main(String[] args) {
		String s, ganhador;
		String entrada;
		int count1=0,count2=0,count3=0, totalVotos=0, votoInvalido=0; 
		
		s = "Digite o código de seu candidato \n"+
			"    111 - Maria da Silva \n" +
			"    222 - Pedro de Araújo \n" +
			"    333 - José de Souza \n";
		
		for (int i=0; i<5; i++) {	
			entrada = JOptionPane.showInputDialog(s);
		
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
		}
			
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
