package produtoEmEstoque;

public class Produto {
	
	private String nome;
	private double preco;
	private int quantidade;
	
	public Produto() {
	
	}
	
	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
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

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public double valorTotalEmEstoque() {
		double soma = quantidade * preco;
		return soma;
	}

	public void adicionarProduto(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void removerProduto(int quantidade) {
		this.quantidade -= quantidade;
	}

	@Override
	public String toString() {
		return  "Produto: " + nome +
				"\nPreço R$ " + String.format("%.2f ", preco) +
				"\nQuantidade: " + quantidade +
				"\nValor Total R$ " + String.format("%.2f ",valorTotalEmEstoque());				
	}
	
	
	

}
