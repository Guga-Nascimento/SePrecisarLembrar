package cadastrarClienteGerarPedido.Entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import cadastrarClienteGerarPedido.Enum.StatusPedido;

public class Pedido {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date momentoDoPedido;
	private StatusPedido status;
	private Cliente cliente;
	private List<ItemPedido> itens = new ArrayList<ItemPedido>();
	
	public Pedido() {
		
	}

	public Pedido(Date momentoDoPedido, StatusPedido status, Cliente cliente) {
		this.momentoDoPedido = momentoDoPedido;
		this.status = status;
		this.cliente = cliente;
	}

	public Date getMomentoDoPedido() {
		return momentoDoPedido;
	}

	public void setMomentoDoPedido(Date momentoDoPedido) {
		this.momentoDoPedido = momentoDoPedido;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void addItem(ItemPedido item) {
		itens.add(item);
	}
	
	public void removerItem(ItemPedido item) {
		itens.remove(item);
	}
	
	public double total() {
		
		double soma = 0;
		for(ItemPedido item : itens) {
			soma += item.subTotal();
		}		
		return soma;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pedido \nmomentoDoPedido = ");
		builder.append(sdf.format(momentoDoPedido));
		builder.append(",\n*status do pedido = ");
		builder.append(status);
		builder.append(",\n*cliente =");
		builder.append(cliente);
		builder.append(",\n*itens do pedido:\n");
		for(ItemPedido item : itens) {
			builder.append(item + "\n");
		}
		builder.append("Preço Total: R$");
		builder.append(String.format("%.2f", total()));
		return builder.toString();
	}
}
