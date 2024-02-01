package Ej11;

public class main {

	public static void main(String[] arg) {
		Hora miHora = new Hora(12, 30);
        System.out.println("Hora introducida: " + miHora.toString());

        miHora.inc();
        System.out.println("Después de aumentar un minuto: " + miHora.toString());

        miHora.setMinutos(45);
        System.out.println("Después de poner los minutos a 45: " + miHora.toString());

        miHora.setHora(8);
        System.out.println("Después de poner la hora a 8: " + miHora.toString());
	}
}
