package Fatec.aulas.Grace.Atividades;
import java.util.Locale;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);


        Scanner lerDado = new Scanner(System.in);
        ContaCorrente c1 = new ContaCorrente("Jean Sousa", 007314-5, 550.00);
        
        boolean acesso = true;
        int opcao = 0;
        double v;

        System.out.println("****** Bem Vindo ao FATECBank. ******");
        while(acesso == true){

            System.out.println("-------------------------------------------");
            System.out.println("Digite 1 para depositar.");
            System.out.println("Digite 2 para sacar.");
            System.out.println("Digite 3 para exibir informações da conta.");
            System.out.println("Digite 4 para encerrar o atendimento.");
            System.out.println("-------------------------------------------");
            System.out.println();

            opcao = lerDado.nextInt();


            switch(opcao){
                case 1:
                    System.out.print("Digite a quantidade desejada: ");
                    v = lerDado.nextDouble();
                    c1.Depositar(v);
                    break;
                case 2:
                    System.out.print("Digite a quantidade desejada: ");
                    v = lerDado.nextDouble();
                    c1.Sacar(v);
                    break;
                case 3:
                    c1.exibirDados();
                    break;
                case 4:
                    System.out.println("Fim do atendimento, obrigado!");
                    acesso = false;
                    break;
                default:
                    System.out.println("Valor inválido, insira um valor entre 1 e 4. do menu de opções.");

            }



        }

    }
}
