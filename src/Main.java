import entities.CadastroProdutos;
import entities.Produto;

import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        // Criando uma instância do CadastroProdutos
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        // Adicionando produtos ao cadastro
        cadastroProdutos.adicionarProduto(1111, "Iphone 17", 8000.00, 10);
        cadastroProdutos.adicionarProduto(2222, "Samsung s25", 5000.00, 10);
        cadastroProdutos.adicionarProduto(3333, "Motorola Edge 60 pro", 3200.00, 10);
        cadastroProdutos.adicionarProduto(4444, "Iphone 17 pro", 11000.00, 10);
        cadastroProdutos.adicionarProduto(1111, "Motorola Edge 50", 2000.00, 10);

        System.out.println();
        System.out.println("Exibindo produtos ordenados por nome");
        cadastroProdutos.exibirProdutosPorNome();

        System.out.println();
        System.out.println("Exibindo produtos ordenados por preço");
        cadastroProdutos.exibirProdutosPorPreco();
    }
}