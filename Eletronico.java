public class Eletronico extends Produto {

    private static final String TIPO = "Eletrônicos";

    public Eletronico(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public String toString() {
        return String.format(
                    "%s: (%d) %s %8.2f", 
                    TIPO, 
                    this.getId(), 
                    this.getNome(), 
                    this.getPreco()
                );
    }

}
