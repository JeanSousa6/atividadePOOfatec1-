package Fatec.aulas.Grace.Atividades;

public class ContaCorrente {
    private String titular;
    private int numConta;
    private double saldo;

    public ContaCorrente(String titular, int numConta, double saldo){

        this.titular = titular;
        this.numConta = numConta;
        this.saldo = saldo;
    }



    public void Depositar(double valor){
        this.saldo += valor;
        System.out.println("Valor: " + valor + " Depositado com sucesso.");

    }

    public void Sacar(double valor){
        if(valor > saldo){
            System.out.println("Saldo insuficitente.");
            System.out.println("Saldo atual: " + this.saldo);
        }
        else{
            this.saldo -= valor;
            System.out.println("Valor: " + valor + " Sacado com sucesso.");
            System.out.println("Saldo atual: " + this.saldo);

        }
    }

    public void exibirDados(){
        System.out.println("Número da conta: 00" + this.numConta);
        System.out.println("Titular: " + this.titular);
        System.out.println("Saldo atual: " + this.saldo);
    }



}
