package entity;

public class Aluno {

	private Integer matricula;
	private String nome;
	private Double n1;
	private Double n2;
	
	
	public Aluno() {
		// TODO Auto-generated constructor stub
	}
	
	public Aluno(Integer matricula, String nome, Double n1, Double n2) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.n1 = n1;
		this.n2 = n2;
	}

	public Integer getMatricula() {
		return matricula;
	}
	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getN1() {
		return n1;
	}
	public void setN1(Double n1) {
		this.n1 = n1;
	}
	public Double getN2() {
		return n2;
	}
	public void setN2(Double n2) {
		this.n2 = n2;
	}
	
	
	
	
	
	
}
