package entities;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> listaDeProdutos;

    public CadastroProdutos(){
        this.listaDeProdutos = new HashSet<>();
    }

    public void adicionarProduto(final long cod, final String nome, final double preco, final int quantidade){
        this.listaDeProdutos.add(new Produto(cod, nome, preco, quantidade));
    }

    public void exibirProdutosPorNome(){
        Set<Produto> listaOrdenada = new TreeSet<>(listaDeProdutos);
        if (!listaDeProdutos.isEmpty()){
            for (Produto produto : listaOrdenada){
                System.out.println(produto);
            }
        }
        else{
            throw new RuntimeException("A coleção está vazia!");
        }
    }

    public void exibirProdutosPorPreco(){
        Set<Produto> listaOrdenadaPorPreco = new TreeSet<>(new CompararPorPreco());
        if (!listaDeProdutos.isEmpty()){
            listaOrdenadaPorPreco.addAll(listaDeProdutos);
            for (Produto produto : listaOrdenadaPorPreco){
                System.out.println(produto);
            }
        }
        else {
            throw new RuntimeException("A coleção está vazia!");
        }
    }
}
