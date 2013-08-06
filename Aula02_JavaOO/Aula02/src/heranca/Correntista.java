package heranca;


public class Correntista {
	
	private Integer conta;
	private String nome;
	private Double saldo;
	
	public Correntista() {
		// TODO Auto-generated constructor stub
	}
	
	public Correntista(Integer conta, String nome, Double saldo) {
		super();
		this.conta = conta;
		this.nome = nome;
		this.saldo = saldo;
	}


	public Integer getConta() {
		return conta;
	}

	public void setConta(Integer conta) {
		this.conta = conta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	
	@Override
	public String toString() {
		return "Correntista [conta=" + conta + ", nome=" + nome + ", saldo="
				+ saldo + "]";
	}

	public static void main(String[] args) {
		
		Correntista c = new Correntista(1,"Rui",3500.);
		System.out.println(c);
		
	}
}
