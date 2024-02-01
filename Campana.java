package Ej15;

public class Campana extends instrumento {

	@Override
	public void interpretar() {

		for(int i = 0; i < cantidadNotas; i++) {
			System.out.println(notas[i] + " ");
		}
		System.out.println();
		
	}

	

}
