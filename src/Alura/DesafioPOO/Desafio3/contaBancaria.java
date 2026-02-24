public class contaBancaria {
    private int saldo;
    private String nome;

    public int getSaldo() {
        return saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void depositar(int deposito) {
        saldo += deposito;
    }

    public void sacar(int saque) {
        this.saldo -= saque;
    }

    public void consultaSaldo(){
        System.out.println("SALDO: " + getSaldo());
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

}
/*
 * Crie uma classe ContaBancaria com métodos para realizar operações bancárias
 * como depositar(), sacar() e consultarSaldo(). Em seguida, crie uma subclasse
 * ContaCorrente que herda da classe ContaBancaria. Adicione um método
 * específico para a subclasse, como cobrarTarifaMensal(), que desconta uma
 * tarifa mensal da conta corrente.
 */