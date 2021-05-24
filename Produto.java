public abstract class Produto {

    private static int lastID = 0;

    private int id;
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.id = ++lastID;
        this.nome = nome;
        this.preco = preco;
    }

    abstract public String toString();

    public int getId() {return id;}
    public String getNome() {return nome;}
    public double getPreco() {return preco;}

}
