package modelo;

public class Produto {

    private static int contador = 1;

    private String nome;
    private double preco;
    private int id;

    public Produto() {
        this.id = contador++;
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.id = contador++;
    }

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
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", id=" + id +
                '}';
    }
}
