package execucao;

import heranca.ClienteEspecial;
import heranca.ClienteVip;
import heranca.Correntista;

public class MainHeranca {

	public static void main(String[] args) {
		
		Correntista c = new Correntista(1001,"Wallace",2000.);
		ClienteEspecial ce = new ClienteEspecial();
		
		ClienteVip cv = new ClienteVip();
		
		cv.setConta(1003);
		cv.setNome("Nat");
		cv.setSaldo(100000.);
		cv.setLimite(cv.getSaldo());
		
		
		ce.setConta(1002);
		ce.setNome("Leo");
		ce.setSaldo(15000.);
		
		ce.setLimite(ce.getSaldo());
		
		
		
		System.out.println("Nome: " + c.getNome());
		System.out.println("Saldo: " + c.getSaldo());
		
		System.out.println("Nome: " + ce.getNome());
		System.out.println("Saldo: " + ce.getSaldo());
		System.out.println("Limite: " + ce.getLimite());
	
		
		System.out.println("Nome: " + cv.getNome());
		System.out.println("Saldo: " + cv.getSaldo());
		System.out.println("Limite: " + cv.getLimite());
	
	
	
	}
	
}