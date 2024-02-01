package Ej15;

public abstract class instrumento {

	enum NotaMusical {
	    DO, RE, MI, FA, SOL, LA, SI
	}
	
	protected NotaMusical[] notas;
    protected int cantidadNotas;

    public instrumento() {
        this.notas = new NotaMusical[100];
        this.cantidadNotas = 0;
    }

    public void add(NotaMusical nota) {
        if (cantidadNotas < 100) {
            notas[cantidadNotas] = nota;
            cantidadNotas++;
            System.out.println("Nota " + nota + " añadida.");
        } else {
            System.out.println("No es posible añadir más notas.");
        }
    }

    public abstract void interpretar();
}
