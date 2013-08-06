package input;

import java.util.Scanner;

public class InputCliente {

	public String lerNome(){
		System.out.println("Digite o nome: ");
		Scanner ler = new Scanner(System.in);
		return ler.nextLine();
		
		
	}
	
	public String lerEmail(){
		System.out.println("Digite o e-email: ");
		Scanner ler = new Scanner(System.in);
		return ler.next();
		
		
	}
	public String lerSexo(){
		System.out.println("Digite o sexo: ");
		Scanner ler = new Scanner(System.in);
		return ler.next();
		
		
	}
	public String lerDataNasc(){
		System.out.println("Digite o Data de Nascimento: ");
		Scanner ler = new Scanner(System.in);
		return ler.next();
		
		
	}
}

