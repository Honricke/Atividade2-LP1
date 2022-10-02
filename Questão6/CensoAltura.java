import java.util.Random;

public class CensoAltura {
    public static void main(String[] argv){
        Random gerador = new Random();
        Alturas[] alturas = new Alturas[20];

        //Gerando alturas das pessoas em centimetros de 1 metro até 2 metros
        for (int i = 0; i < 20; i++) {
            do{
                alturas[i] = new Alturas();
                alturas[i].sexo = gerador.nextInt(2) == 0 ? "H" : "M";
                alturas[i].altura = gerador.nextInt(200);
            }
            while(alturas[i].altura < 100);
        }

        int maiorH = 0;
        int menorH = 0;
        int qtdHomens = 0;

        int maiorF = 0;
        int menorF = 0;
        int somaMulheres = 0;
        int qtdMulheres = 0;

        //Pega o maior e menor entre eles
        for (Alturas classAtual : alturas){
            int valor = classAtual.altura;
            String sexo = classAtual.sexo;
            System.out.print(sexo);

            if(sexo.equals("H")){
                if(valor > maiorH){
                    maiorH = valor;
                }
                if(valor < menorH || menorH == 0){
                    menorH = valor;
                }
                qtdHomens +=1;
            }
            else{
                if(valor > maiorF){
                    maiorF = valor;
                }
                else if(valor < menorF || menorF == 0){
                    menorF = valor;
                }
                somaMulheres += valor;
                qtdMulheres +=1;
            }
        }
        
        for (int i = 0; i < 20; i++){
            System.out.printf("\nNúmero %s com sexo %s: %s", (i+1),alturas[i].sexo,alturas[i].altura);
        }

        System.out.println("\nMaior número dos Homens: "+maiorH);
        System.out.println("Menor número dos Homens: "+menorH);
        System.out.println("\nMaior número dos Mulheres: "+maiorF);
        System.out.println("Menor número dos Mulheres: "+menorF);
        System.out.println("\nSoma das alturas das mulheres: "+somaMulheres/qtdMulheres);
        System.out.println("Quantidade de homens: "+qtdHomens);


    }
}


