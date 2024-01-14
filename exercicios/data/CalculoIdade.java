package data;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CalculoIdade {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String dataNascimento;
		
		System.out.println("Digite sua data de nascimento no formato (yyyy-MM-dd)");
		dataNascimento = entrada.next();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		
		try { 
			LocalDate dataConvertida = LocalDate.parse(dataNascimento, formatter);
			
			 	LocalDate dataAtual = LocalDate.now();

	            Period periodo = Period.between(dataConvertida, dataAtual);

	            int anos = periodo.getYears();
	            int meses = periodo.getMonths();
	            int dias = periodo.getDays();

	            System.out.println("Idade: " + anos + " anos, " + meses + " meses, " + dias + " dias.");
			
		} catch(java.time.format.DateTimeParseException e) {
		System.out.println("Formato de data inválido. Certifique-se de inserir no formato correto.");
		}
	}
}
