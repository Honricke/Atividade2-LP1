import java.util.Random;

public class PesquisaMercado {
    public static void main(String[] argv){
        Random gerador = new Random();
        Respostas[] respostas = new Respostas[2000];

        //Gerando respostas das pessoas em centimetros de 1 metro até 2 metros
        for (int i = 0; i < 2000; i++) {
            respostas[i] = new Respostas();
            respostas[i].sexo = gerador.nextInt(2) == 0 ? "H" : "M";
            respostas[i].resposta = gerador.nextInt(2) == 0 ? "sim" : "nao";
        }

        float nao = 0;
        float sim = 0;

        //Pega o maior e menor entre eles
        for (Respostas classAtual : respostas){
            String valor = classAtual.resposta;
            if(valor.equals("sim")){
                sim += 1;
            }else{
                nao +=1;
            }
        }
        
        System.out.println("\nQuantidade de sim: "+sim);
        System.out.println("Quantidade de nao: "+nao);
        System.out.println("Porcentagem de sim: "+(sim/(sim+nao))*100);
        System.out.println("Porcentagem de não: "+(nao/(sim+nao))*100);
    }
}


