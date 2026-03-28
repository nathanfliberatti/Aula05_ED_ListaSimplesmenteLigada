package principal;

import lista.Lista;
import modelo.Produto;

public class UsaLista {

    public static void main(String[] args) {
        Produto p1 = new Produto("Coca-cola", 10);
        Produto p2 = new Produto("Pepsi", 8);
        Produto p3 = new Produto("Água", 5);
        Produto p4 = new Produto("BYD", 200000);

        Lista listaProduto = new Lista();

        listaProduto.inserir(p1);
        listaProduto.inserir(p2);
        listaProduto.inserir(p3);
        listaProduto.inserir(p4);

        listaProduto.exibir();

        System.out.println();

        System.out.println(listaProduto.pesquisar(1));

        System.out.println();

        listaProduto.atualizar(20, 1);

        System.out.println("\n=== Remoção ===");

        if (listaProduto.remover(4)) {
            System.out.println("Removido com sucesso");
            listaProduto.exibir();
        } else {
            System.out.println("ID não encontrado");
        }
    }

}
