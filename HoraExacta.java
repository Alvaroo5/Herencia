package Ej11;

public class HoraExacta extends Hora {

	private int segundos;
	
    public HoraExacta(int hora, int minutos, int segundos) {
        super(hora, minutos);
        setSegundo(segundos);
    }

    public void setSegundo(int valor) {
        if (valor >= 0 && valor < 60) {
            segundos = valor;
        } else {
            System.out.println("Error: Los segundos deben estar en el rango de 0 a 59.");
        }
    }

    @Override
    public void inc() {
        segundos++;
        if (this.segundos == 60) {
            this.segundos = 0;
            super.inc();
        }
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", this.hora, this.minutos, this.segundos);
    }
}
