package txtutil;

import java.io.PrintWriter;

public class ManipularArquivo {

	PrintWriter pw;
	
	public void abrirArquivo() {
		try {
		
			pw = new PrintWriter("d:/aula2_javaOO.txt");
			System.out.println("Conexão Aberta");
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
	}

	public void gravarDados(String dados){
		try {

			pw.write(dados);
			pw.flush();			
			System.out.println("Dados Gravados.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}


	public void fecharArquivo(){
		try {

			pw.close();
			System.out.println("Conex�o Encerrada.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
