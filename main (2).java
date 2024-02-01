package Ej17;

import Ej17.Caja.Unidades;

public class main {
	public static void main(String[] args) {
		Caja caja = new Caja(50, 30, 40, Unidades.cm);
	    System.out.println("Representación de la caja: " + caja.toString());
	}
}
