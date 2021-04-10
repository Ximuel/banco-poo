package FEITO;

public class Conta {

	private int numeroConta;
	private String dataCriacao;
	private double saldo;
	private Cliente cliente;
			
	public Conta(int numeroConta, String dataCriacao, double saldo) {
		super();
		this.numeroConta = numeroConta;
		this.dataCriacao = dataCriacao;
		this.saldo = saldo;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public String getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(String dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getCliente() {
		return this.cliente.getNome();
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public void sacar(double valorSaque) {
		if(saldo < valorSaque) {
			System.out.println("Valor indisponível!");
		}
		else {
			this.saldo -= valorSaque;
			System.out.println("Valor de " + valorSaque + " reais sacado!");
		}
	}
	
	public void depositar(double valorDeposito) {
		this.saldo += valorDeposito;
		System.out.println("Valor de " + valorDeposito + " reais depositado!");
	}
	
	public void transferir(Conta ContaDestino, double valorTransferencia) {
		sacar(valorTransferencia);
		ContaDestino.depositar(valorTransferencia);
		System.out.println("Transferência concluída!");
	}
	
}
