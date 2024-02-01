package Ej12;

public class main {
	 public static void main(String[] arg) {
		 Hora12 miHora12 = new Hora12(11, 59, "am");
	     System.out.println("Hora actual: " + miHora12.toString());

	     miHora12.inc();
	     System.out.println("Aumentamos un minuto: " + miHora12.toString());

	     miHora12.setMinutos(45);
	     System.out.println("Ponemos los minutos a 45: " + miHora12.toString());

	     miHora12.setHora(12);
	     System.out.println("Ponemos la hora a 12: " + miHora12.toString());
	 }
}
