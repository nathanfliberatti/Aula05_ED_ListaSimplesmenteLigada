package lista;

import modelo.Produto;

public class Lista {

    private No inicio;
    private No atual;
    private No aux;

    public void inserir(Produto produto) {
        if (inicio == null) { //lista vazia
            inicio = new No(produto, null);
            aux = inicio;
        } else {
            atual = new No(produto, null);
            aux.setProx(atual);
            aux = atual;
        }
    }

    public void exibir() {
        No e = inicio;
        while(e != null) {
            System.out.println(e.getProduto());
            e = e.getProx();
        }
    }

    public Produto pesquisar(int id) {
        No aux = inicio;
        while(aux != null) {
            if (aux.getProduto().getId() == id) {
                return aux.getProduto();
            }
            aux = aux.getProx();
        }
        return null;
    }

    public void atualizar(double novoPreco, int id) {
        No aux = inicio;
        while(aux != null) {
            if (aux.getProduto().getId() == id) {
                aux.getProduto().setPreco(novoPreco);
                System.out.println("O preço de " + aux.getProduto().getNome() + " atualizou para: R$" + novoPreco);
                return;
            }
            aux = aux.getProx();
        }
    }
}
