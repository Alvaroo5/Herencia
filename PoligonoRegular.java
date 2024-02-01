package Ej23;

public abstract class PoligonoRegular implements Figura {

	protected double lado;
	protected String color;
	protected int contadorPoligonos = 0;
	
	public PoligonoRegular(double lado, String color) {
        this.lado = lado;
        this.color = color;
        contadorPoligonos++;
    }
	
	public int getContadorPoligonos(){
		return contadorPoligonos;
	}
	
	public String getColor() {
		return color;
	}
	
	
	
}
