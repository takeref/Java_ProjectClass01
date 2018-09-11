
public class Test {

	public static void main (String [] Argumentos) {
		
		//creo un nuevo objeto de tipo celular, con el constructor vacio
		Celular celular = new Celular();
		//le asigno la marca modelo y color
		celular.setMarca("Nokia");
		celular.setModelo("2100");
		celular.setColor("Dorado");
		//utilizo los metodos llamar cortar llamada e informacion del telefono 
		celular.llamar("Fer");
		celular.cortarLlamada();
		System.out.println();
		celular.informarCaracteristicas();
	}
}