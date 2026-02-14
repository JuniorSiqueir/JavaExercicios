package MeusTestes;

import java.util.Scanner;

public class pessoa {
    private int idade;
    private String nome;
    private double saldo;
    private boolean conta;
    Scanner inputPessoa = new Scanner(System.in);

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isConta() {
        return conta;
    }

    public void setConta(boolean conta) {
        this.conta = conta;
    }

    void criarConta() {
        if (isConta() == false) {
            System.out.println("Vi que não possui conta. Deseja criar conta?");
            System.out.println("1 - SIM");
            System.out.println("2 - NÃO");
            int escolha = inputPessoa.nextInt();

            switch (escolha) {
                case 1:
                    setConta(true);
                    System.out.println("Conta criada!");
                    break;
                case 2:
                    System.out.println("Conta não vai ser criada");
                    setConta(false);
                    break;

                default:
                    break;
            }
        }
    }

    void adicionarSaldo() {
        if (isConta() == true) {
            System.out.println("Coloque o valor que deseja inserir");
            double valorInserir = inputPessoa.nextDouble();
            this.saldo += valorInserir;
        } else {
            System.out.println("Sem conta");
        }

    }

    void mostrarInfos() {
        if (isConta()) {
            System.out.println("Conta Existe");
            System.out.println("");
            System.out.println("Nome: " + getNome());
            System.out.println("Idade: " + getIdade());
            System.out.println("Saldo: " + getSaldo());
        }else{
            System.out.println("Conta não encontrada");
        }

    }
}
