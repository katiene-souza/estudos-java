package data;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class HorarioAtual {

	public static void main(String[] args) {
		
		LocalDateTime dataHora = LocalDateTime.now();
		
		LocalTime hora = dataHora.toLocalTime();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		
		String horaFormatada = formatter.format(hora); 
		System.out.print("A hora é: " + horaFormatada);
	}

}
