package produtoEmEstoque;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome do produto ");
		String nome = sc.nextLine();
		System.out.println("Digite a quantidade do produto ");
		Integer quantidade = sc.nextInt();
		System.out.println("Digite o Preço do produto ");
		Double preco = sc.nextDouble();
		
		Produto tv = new Produto(nome, preco, quantidade);
		
		System.out.println(tv);
		System.out.println();
		System.out.println("Digite a quantidade que deseja adicionar ao estoque");
		tv.adicionarProduto(sc.nextInt());
		System.out.println();
		System.out.println(tv);
		System.out.println();		
		System.out.println("Digite a quantidade que retirou do estoque");
		tv.removerProduto(sc.nextInt());
		System.out.println();
		System.out.println("Estoque Atualizado: ");
		System.out.println(tv);
		
		
		
		
		
		sc.close();
		
	}

}
/*
 * Ficou claro como criar metodo adicionar e também o remover e chamar os metodos no programa principal e 
 * adicionar e remover produtos retornando o valor atualizado*/

