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

}
