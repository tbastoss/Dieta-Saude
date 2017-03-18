import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;


public class Test {

	public static void main(String[] args) {
				int ano_atual = Calendar.getInstance().get(Calendar.YEAR);
				System.out.println("Ano Atual: "+ano_atual);
				
				Calendar data_nasc = Calendar.getInstance();
				data_nasc.set(Calendar.MONTH, 3);
				data_nasc.set(Calendar.DAY_OF_MONTH, 16);
				data_nasc.set(Calendar.YEAR, 1996);
				
				SimpleDateFormat simple = new SimpleDateFormat("dd-MM-yyyy");
				
				Date date_simples = data_nasc.getTime();
				
				String data = simple.format(date_simples);
				
				System.out.println("Data Nascimento: " + date_simples);		
	}

}
