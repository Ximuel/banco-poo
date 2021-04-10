package FEITO;

public class Cliente {
	
	private String nome;
	private String cpf;
	private String codigo;
	private String endereco;
	
	public Cliente(String nome, String cpf, String codigo, String endereco) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.codigo = codigo;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	
	
}
