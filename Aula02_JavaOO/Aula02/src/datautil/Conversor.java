package datautil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Conversor {

 public String javaIoData(Date data){
	 
	 DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
	 return formatador.format(data);
	 }


 public  Date dataToJava(String data){
	 
	 String dia = data.substring(0,2);
	 String mes = data.substring(3,5);
	 String ano = data.substring(6,10);
	 
	 return new Date(mes + "/" + dia + "/" + ano);
	 
	 
	 
 }
}
