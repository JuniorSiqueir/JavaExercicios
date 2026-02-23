public class cachorro extends animal {
    @Override
    public void emitirSom() {
        System.out.println("O cachorro " + getNome() + " está latindo");
    }
}
