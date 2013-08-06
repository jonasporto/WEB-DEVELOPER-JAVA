package execucao;

import entity.Cliente;
import entity.Endereco;

public class MainRelacao {

	public static void main(String[] args) {
		
	
	
		Cliente c = new Cliente("Bia","Bia@uol.com","Feminino");
		Endereco e = new Endereco("Rio branco","Centro","Rio de janeiro");
		
		c.setEndereco(e);
		
		System.out.println("Nome: " + c.getNome());
		System.out.println("Email: " + c.getEmail());
		System.out.println("Sexo: " + c.getSexo());
		
		System.out.println("Rua: " + c.getEndereco().getRua());
		System.out.println("Bairro: " + c.getEndereco().getBairro());
		System.out.println("Cidade: " + c.getEndereco().getCidade());
		
		
		Cliente c2 = new Cliente("Edu","edu@uol.com.br","Masculino");
		c2.setEndereco(new Endereco());
		
		c2.getEndereco().setRua("Presidente Vargas");
		c2.getEndereco().setBairro("Cidade Nova");
		c2.getEndereco().setCidade("Belo Horizonte");
		
		System.out.println("\n");
		System.out.println(c2);
		
		
	}
}
