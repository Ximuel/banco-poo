package FEITO;
import java.util.List;

public class Banco {
	
	private String nome;
	private String endereco;
	private String cnpj;
	private List<Conta> listConta;
	
	public Banco(String nome, String endereco, String cnpj) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.cnpj = cnpj;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public List<Conta> getListConta() {
		return listConta;
	}
	public void setListConta(List<Conta> listConta) {
		this.listConta = listConta;
	}
	
	
	

}
