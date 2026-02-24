public class contaCorrente extends contaBancaria {

    @Override
    public void depositar(int deposito) {
        super.depositar(deposito - 50);
    }

}
