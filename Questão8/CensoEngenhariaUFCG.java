import java.util.Scanner;

public class CensoEngenhariaUFCG {
    public static void main(String[] argv){
        Scanner sc  = new Scanner(System.in);
        Scanner sc2  = new Scanner(System.in);
        
        System.out.printf("\nDiga a quantidade de alunos que fizeram vestibular: ");
        int qtdAlunos = sc.nextInt();

        Alunos alunos[] = new Alunos[qtdAlunos];
        float qtdPassaram = 0;

        float homens = 0;
        float maisTres = 0;
        
        for(int i = 0; i < qtdAlunos;i++){
            System.out.printf("\nDiga o sexo do aluno %s entre 'M' ou 'H', se 'x' vai parar: ", i+1);
            String sexo = sc2.nextLine();

            if(sexo.equals("x")){
                break;
            }

            alunos[i] = new Alunos();
            alunos[i].sexo = sexo;
            if(sexo.equals("H")){
                homens += 1;
            }
            
            System.out.printf("Diga a quantidade de vezes que o aluno %s fez vestibular: ", i+1);
            alunos[i].vezesVtbl = sc.nextInt();
            if(alunos[i].vezesVtbl >= 3){
                maisTres += 1;
            }

            qtdPassaram += 1;
        }

        System.out.print("\nPorcentagem de alunos que passaram: "+(qtdPassaram/qtdAlunos)*100);
        System.out.print("\nPorcentagem de alunos que homens passaram: "+(homens/qtdAlunos)*100);
        System.out.print("\nPorcentagem de alunos que passaram e fizeram mais de 3 vezes: "+(maisTres/qtdAlunos)*100);
    }
}
