package Ej11;

public class main2 {

	public static void main(String[] arg) {
		HoraExacta miHoraExacta = new HoraExacta(8, 59, 57);
        System.out.println("Hora exacta actual: " + miHoraExacta.toString());

        for(int i = 0; i<5; i++) {
        	miHoraExacta.inc();
            System.out.println("Aumentamos un segundo: " + miHoraExacta.toString());
        }

	}
}
