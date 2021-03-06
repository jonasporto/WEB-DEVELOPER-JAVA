package execucao;

import txtutil.ManipularArquivo;
import input.InputCliente;
import datautil.Conversor;
import entity.Cliente;

public class MainProjeto {

	public static void main(String[] args) {
		Cliente c = new Cliente();
		Conversor convert = new Conversor();
		InputCliente ip = new InputCliente();
		ManipularArquivo ma = new ManipularArquivo();
		
		c.setNome(ip.lerNome());
		c.setEmail(ip.lerEmail());
		c.setSexo(ip.lerSexo());
		
		
		
		c.setDataNasc(convert.dataToJava(ip.lerDataNasc()));
				
		System.out.println("Nome: " + c.getNome());
		System.out.println("E-mail: " + c.getEmail());
		System.out.println("Sexo: " + c.getSexo());
		System.out.println("Nascimento: " + convert.javaIoData(c.getDataNasc()));
		
		
		ma.abrirArquivo();
		ma.gravarDados(c + "\n" + "Nascimento: " + convert.javaIoData(c.getDataNasc()));
		ma.fecharArquivo();
	}
	
}
