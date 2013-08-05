package negocio;

public class AvaliacaoAluno {

	public Double gerarMedia(Double nota1,Double nota2){
		
		return(nota1+nota2)/2;
	}

	public String verificarSituacao(Double media){
		
		String situacao = null;
		
		if(media >= 7){
			situacao ="Aprovado";
		}else if(media < 7 && media >= 5){
				situacao="Recuperação";
		}else{				
				situacao=" Reprovado";
			
			 }
	
		return situacao;
			
			
	}
		
		
}
