package Ej12;
                                             
public class Hora12 {
	private int hora;
	private int minutos;
	private String periodo;
	
	Hora12(int hora, int minutos, String periodo){
		this.hora=hora;
		this.minutos=minutos;
		this.periodo=periodo;
	}
	
	public void setHora(int numero) {
		if (numero >= 0 && numero < 13) {
            hora = numero;
        } else {
            System.out.println("Las horas deben estar en el rango de 0 a 12.");
        }
	}
	
	public void setMinutos(int numero) {
		if (numero >= 0 && numero < 60) {
            minutos = numero;
        } else {
            System.out.println("Los minutos deben estar en el rango de 0 a 59.");
        }
	}
	
	public void inc() {
        minutos++;
        if (minutos == 60) {
            minutos = 0;
            hora = (hora + 1) % 12;
            if (hora == 0) {
                if (periodo.equals("am")) {
                    periodo = "pm";
                } else {
                    periodo = "am";
                }
            }
        }
    }
	
	public String toString() {
	        return String.format("%02d:%02d %s", hora, minutos, periodo);
	}
}
