package execucao;

import entity.Produto;

public class ClasseDeExecucao {
	public static void main(String[] args) {
		
		Produto p = new Produto();
		p.setNome("Camera");
		p.setFabricante("Sony");
		p.setQtd(4);
		p.setPreco(780.0); 
		
		
		System.out.println("Nome produto " + p.getNome());
		System.out.println("Fabricante " + p.getFabricante());
		System.out.println("Quantidade " + p.getQtd());
		System.out.println("Preço " + p.getPreco());
		System.out.println("Total " + (p.getPreco() * p.getQtd()
				));
	
		
	} 

}
