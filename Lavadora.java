package Ej19;

public class Lavadora extends Electrodomestico{

	 	private final static int carga_def=5;
	    private int carga;
	    
	    public int getCarga() {
	        return carga;
	    }
	  
	    public double precioFinal(){
	        double plus=super.precioFinal();
	  
	        if (carga>30){
	            plus+=50;
	        }
	  
	        return plus;
	    }
	  
	    public Lavadora(double precioBase, double peso, char consumoEnergetico, String color, int carga){
	        super(precioBase,peso, consumoEnergetico,color);
	        this.carga=carga;
	    }
	
}
