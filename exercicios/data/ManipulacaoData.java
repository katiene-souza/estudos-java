package data;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ManipulacaoData {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String data;

		System.out.println("Insira uma data no formato (yyyy-MM-dd): ");
		data = entrada.nextLine();

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

		try {
			LocalDate dataConvertida = LocalDate.parse(data, formatter);

			int diaDoMes = dataConvertida.getDayOfMonth();
			System.out.println("O dia do mês correspondente é: " + diaDoMes);
		} catch (java.time.format.DateTimeParseException e) {
			System.out.println("Formato de data inválido. Certifique-se de inserir no formato correto.");
		}
	}
}
