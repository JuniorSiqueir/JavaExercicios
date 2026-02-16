package Alura.DesafioPOO.Desafio2;

public class produto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("ERRO: Tá tentando quebrar o mercado, Choom? Preço não pode ser negativo!");
        }
    }

    public void aplicarDesconto(double percentual) {
        if (percentual > 0 && percentual <= 100) {
            double desconto = this.preco * (percentual / 100);
            this.preco -= desconto;
            System.out.println("Desconto aplicado! Preço atualizado para: " + this.preco);
        } else {
            System.out.println("Percentual inválido. Ou você dá desconto real ou não me faz perder tempo.");
        }
    }

}
