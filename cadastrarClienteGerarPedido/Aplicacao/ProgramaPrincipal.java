package cadastrarClienteGerarPedido.Aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import cadastrarClienteGerarPedido.Entidades.Cliente;
import cadastrarClienteGerarPedido.Entidades.ItemPedido;
import cadastrarClienteGerarPedido.Entidades.Pedido;
import cadastrarClienteGerarPedido.Entidades.Produto;
import cadastrarClienteGerarPedido.Enum.StatusPedido;

public class ProgramaPrincipal {
	
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Cadastrar Cliente:");
		System.out.print("Digite o nome do cliente: ");
		String nome = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.println("Celular: ");
		String celular = sc.nextLine();
		System.out.print("Data de nascimento: ");
		Date aniversario = sdf.parse(sc.next());
		
		Cliente cadastroUm = new Cliente(nome, email, celular, aniversario);
		
		System.out.println("Entre com o pedido: ");
		System.out.println("Status do pedido");
		StatusPedido status = StatusPedido.valueOf(sc.next());
		
		Pedido pedido01 = new Pedido(new Date(), status, cadastroUm);	
		
		System.out.println("Digite a quantidade de Itens do seu pedido ");
		int numeroDeItens = sc.nextInt();	
		for(int i = 1; i <= numeroDeItens;i++) {			
			System.out.println("Entre com o item número: "+ i);		
			System.out.print("Nome do produto: ");
			sc.nextLine();
			String nomeProduto = sc.nextLine();
			System.out.print("Preço do Produto: ");
			Double precoProduto = sc.nextDouble();
			System.out.print("Quantidade: ");
			Integer quantidade = sc.nextInt();
			
			Produto produto = new Produto(nomeProduto, precoProduto);
			ItemPedido item = new ItemPedido(quantidade, precoProduto, produto);
			
			pedido01.addItem(item);
		}
		
		System.out.println();
		System.out.println(pedido01);
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
		
	}

}
