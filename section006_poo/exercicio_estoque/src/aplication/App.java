package aplication;

import java.util.Locale;
import java.util.Scanner;
import entities.Produto;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        Produto produto = new Produto();

        System.out.print("Informe o nome do produto: ");
        produto.nome = sc.nextLine();

        System.out.print("Informe o preço do produto: ");
        produto.preco = sc.nextDouble();

        System.out.print("Informe a quantidade no estoque: ");
        produto.quantidade = sc.nextInt();

        System.out.printf(produto.toString());
        //Adiciona produto
        System.out.print("\nInforme a quantidade de produtos para adicionar: ");
        produto.adicionarProduto(sc.nextInt());

        System.out.printf(produto.toString());

        //Remove produto
        System.out.print("\nInforme a quantidade de produtos para remover: ");
        produto.removerProduto(sc.nextInt());

        System.out.printf(produto.toString());

        sc.close();
    }
}
