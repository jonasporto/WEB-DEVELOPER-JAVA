package sobrecarga;

public class Calculos {

	public int somar(int num1,int num2){
		
		return num1 + num2;
	
		}

	public double somar(double num1,double num2){
		
		return num1 + num2;
	
		}

public int multiplicar(int num1,int num2){
		
		return num1 + num2;

		}
	

        public static void main(String[] args) {
			Calculos c = new Calculos();
			System.out.println("Soma: "+c.somar(15,40));
			System.out.println("Soma: "+c.somar(152.0,10));
			System.out.println("Multiplicação: "+ c.multiplicar(6,12));
		}
}
