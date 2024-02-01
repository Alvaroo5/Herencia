package Ej17;

public class Caja {
	
	private double ancho;
	private double alto;
	private double fondo;
	private Unidades unidad;

    public enum Unidades {
        cm, metros
    }

    public Caja(double ancho, double alto, double fondo, Unidades unidad) {
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
        this.unidad = unidad;
    }
    		
    public double getVolumen() {
    	double volumen = this.ancho + this.alto + this.fondo;
    	return volumen;
    }
    
    public String toString() {
        return "Caja(" + ancho + " " + unidad + ", " + alto + " " + unidad + ", " + fondo + " " + unidad + ")";
    }
	
}
