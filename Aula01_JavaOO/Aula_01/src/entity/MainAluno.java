package entity;

import negocio.AvaliacaoAluno;

public class MainAluno {

	public static void main(String[] args) {
		
		Aluno a = new Aluno();
		a.setMatricula(101);
		a.setNome("Leo");
		a.setN1(7.5);
		a.setN2(5.);
		
		
		Aluno a2 = new Aluno(102,"Bia",10.,8.);
		AvaliacaoAluno aa = new AvaliacaoAluno();
		
		System.out.println("Matricula: "+ a.getMatricula());
		System.out.println("Nome: " + a.getNome());
		System.out.println("Nota 1: " + a.getN1());
		System.out.println("Nota 2: " + a.getN2());
		System.out.println("Media : " + aa.gerarMedia(a.getN1(),a.getN2()));
		System.out.println("Situação : " + aa.verificarSituacao(aa.gerarMedia(a.getN1(),a.getN2())));
		
		System.out.println("Matricula: "+ a2.getMatricula());
		System.out.println("Nome: " + a2.getNome());
		System.out.println("Nota 1: " + a2.getN1());
		System.out.println("Nota 2: " + a2.getN2());
		System.out.println("Media : " + aa.gerarMedia(a2.getN1(),a2.getN2()));
		System.out.println("Situação : " + aa.verificarSituacao(aa.gerarMedia(a2.getN1(),a2.getN2())));
		
		
		
		System.out.println("Matricula: "+ a2.getMatricula());
		System.out.println("Nome: " + a2.getNome());
		System.out.println("Nota 1: " + a2.getN1());
		System.out.println("Nota 2: " + a2.getN2());
		
	}
	
	
}

