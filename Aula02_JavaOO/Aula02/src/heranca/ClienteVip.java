package heranca;

public class ClienteVip extends ClienteEspecial {
	
	@Override
	public void setLimite(Double saldo) {
		
	super.setLimite(saldo * 2.5);
		
	}

}
