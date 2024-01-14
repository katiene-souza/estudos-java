package data;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DiferencaDatas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String primeiraData, segundaData;

		System.out.println("Insira a primeira data no formato (yyyy-MM-dd): ");
		primeiraData = entrada.next();

		System.out.println("Insira a segunda data no formato (yyyy-MM-dd)");
		segundaData = entrada.next();

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

		try {
			LocalDate primeiraDataConvertida = LocalDate.parse(primeiraData, formatter);
			LocalDate segundaDataConvertida = LocalDate.parse(segundaData, formatter);

			if (primeiraDataConvertida.isBefore(segundaDataConvertida)) {
				System.out.println("A primeira data vem antes da segunda data.");
			} else if (primeiraDataConvertida.isAfter(segundaDataConvertida)) {
				System.out.println("A primeira data vem depois da segunda data.");
			} else {
				System.out.println("As datas são iguais.");
			}
		} catch (java.time.format.DateTimeParseException e) {
			System.out.println("Formato de data inválido. Certifique-se de inserir no formato correto.");
		}
	}
}
