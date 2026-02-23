public class cachorro extends animal {
    @Override
    public void emitirSom() {
        System.out.println("O cachorro " + getNome() + " está latindo");
    }

    public void abanarRabo() {
        System.out.println("O cachorro está abanando o rabo");
    }
}
