package cadastrarClienteGerarPedido.Entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private String nome;
	private String email;
	private String celular;
	private Date aniversario;
	
	public Cliente() {
	}

	public Cliente(String nome, String email, String celular, Date aniversario) {
		this.nome = nome;
		this.email = email;
		this.celular = celular;
		this.aniversario = aniversario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public Date getAniversario() {
		return aniversario;
	}

	public void setAniversario(Date aniversario) {
		this.aniversario = aniversario;
	}

	@Override
	public String toString() {
		return "Cliente: " + nome +
				" (" + sdf.format(aniversario) + ") "+
				" E-mail: " + email + 
				" Celular: " + celular;
	}
	
	
	
	
	

}
