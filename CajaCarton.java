package Ej17;

public class CajaCarton extends Caja{
	
	private String numEtiqueta;
	
	public CajaCarton(double ancho, double alto, double fondo, String numeroEtiqueta) {
        super(ancho, alto, fondo, Unidades.cm); 
        this.numEtiqueta = numEtiqueta;
    }
	
	@Override
	public double getVolumen() {
		return 0.8 * super.getVolumen();
	}
	 
	
	
}
