import java.util.Scanner;

public class MesTraduzido{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        String repetir;
        do{

            System.out.println("Escolha o mês: \n1 - Janeiro\n2 - Fervereiron\n3 - Março\n4 - Abril \n5 - Maio\n6 - Junho\n7 - Julho\n8 - Agosto\n9 - Setembro\n10 - Outubro\n11 - Novembro\n12 - Dezembro");
            int mes = sc.nextInt();
            
            System.out.println("Diga o idioma:\n1 - Portugues\n2 - Inglês");
            int idioma = sc.nextInt();

            String mesTraduzido = new String();
    
            if(idioma == 1){
                switch(mes){
                    case 1:
                        mesTraduzido = "Janeiro";
                    break;
                    case 2:
                        mesTraduzido = "Fervereiro";
                    break;
                    case 3:
                        mesTraduzido = "Março";
                    break;
                    case 4:
                        mesTraduzido = "Abril";
                    break;
                    case 5:
                        mesTraduzido = "Maio";
                    break;
                    case 6:
                        mesTraduzido = "Junho";
                    break;
                    case 7:
                        mesTraduzido = "Julho";
                    break;
                    case 8:
                        mesTraduzido = "Agosto";
                    break;
                    case 9:
                        mesTraduzido = "Setembro";
                    break;
                    case 10:
                        mesTraduzido = "Outubro";
                    break;
                    case 11:
                        mesTraduzido = "Novembro";
                    break;
                    case 12:
                        mesTraduzido = "Dezembro";
                    break;
                    default: mesTraduzido = "Mês inválido";
                }
            }else if(idioma == 2){
                switch(mes){
                    case 1:
                        mesTraduzido = "January";
                    break;
                    case 2:
                        mesTraduzido = "February";
                    break;
                    case 3:
                        mesTraduzido = "March";
                    break;
                    case 4:
                        mesTraduzido = "April";
                    break;
                    case 5:
                        mesTraduzido = "May";
                    break;
                    case 6:
                        mesTraduzido = "June";
                    break;
                    case 7:
                        mesTraduzido = "July";
                    break;
                    case 8:
                        mesTraduzido = "August";
                    break;
                    case 9:
                        mesTraduzido = "September";
                    break;
                    case 10:
                        mesTraduzido = "October";
                    break;
                    case 11:
                        mesTraduzido = "November";
                    break;
                    case 12:
                        mesTraduzido = "December";
                    break;
                    default: mesTraduzido = "Mês inválido";
                }
            }else{
                mesTraduzido = "Idioma inválido";
            }
               
            System.out.println("\nO mês escolhido é: "+mesTraduzido);

            System.out.println("Quer encontrar outro mês? (s/n)");
            repetir = sc2.nextLine();

        }while(repetir.equals("s"));
    }
}