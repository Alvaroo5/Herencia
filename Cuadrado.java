package Ej23;

public class Cuadrado extends PoligonoRegular {

	public Cuadrado() {
		super(10, "azul");
	}

	@Override
	public double getArea() {
		return lado * lado;
	}
	
}
