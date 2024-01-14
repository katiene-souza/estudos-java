package data;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SomandoMinutos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Insira uma hora no formato (HH:mm): ");
        String horaString = entrada.next();

        System.out.println("Insira o número de minutos a serem adicionados: ");
        int minutosAdicionados = entrada.nextInt();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        try {

            LocalTime hora = LocalTime.parse(horaString, formatter);

            LocalTime horaSomada = hora.plusMinutes(minutosAdicionados);

            System.out.println("Hora resultante após adicionar " + minutosAdicionados + " minutos: " +
                    horaSomada.format(formatter));
        } catch (java.time.format.DateTimeParseException e) {
            System.out.println("Formato de hora inválido. Certifique-se de inserir no formato correto.");
        }
    }
}