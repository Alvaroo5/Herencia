package Ej19;

public class main {

	public static void main(String[] args) {
		   
        Electrodomestico listaElectrodomesticos[]=new Electrodomestico[10];
   
        listaElectrodomesticos[0]=new Electrodomestico(200, 60, 'C', "Verde");
        listaElectrodomesticos[2]=new Electrodomestico(300, 60, 'F', "Verde");
        listaElectrodomesticos[3]=new Electrodomestico(600, 20, 'D', "gris");
        listaElectrodomesticos[4]=new Lavadora(300, 40, 'Z', "blanco", 40);
        listaElectrodomesticos[5]=new Lavadora(400, 100, 'A', "verde", 15);
        listaElectrodomesticos[6]=new Electrodomestico(50, 10);
   
 
   
    }
}
