package Ej11;

public class Hora {

	public int hora;
	public int minutos;
	
	Hora(int hora, int minutos){
		this.hora=hora;
		this.minutos=minutos;
	}
	
	public void setHora(int numero) {
		if (numero >= 0 && numero < 23) {
            hora = numero;
        } else {
            System.out.println("Las horas deben estar en el rango de 0 a 23.");
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
            hora = (hora + 1) % 24;
        }
    }
	
	 public String toString() {
	        return String.format("%02d:%02d", hora, minutos);
	    }
}
