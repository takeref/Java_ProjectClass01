
public class Test2 {

	public static void main(String[] args) {
		// Creo un nuevo objeto de tipo SmartPhone
		SmartPhone smartphone = new SmartPhone();
		// Le asignpo la marca, modelo, color, pixles camara, tamaño memoria unterna y extena
		smartphone.setMarca("Samsug");
		smartphone.setModelo("S3 MINI");
		smartphone.setColor("Negro");
		smartphone.setPixelesCamara(5);
		smartphone.setTamanioMemoriaInterna(4);
		smartphone.setTamanioMemoriaExterna(8); 
		
		//utilizo lo métodos, llamar, cortarLlamada heredados de la clase celular
		smartphone.llamar("Pablo");
		smartphone.cortarLlamada();
		System.out.println();
		//método sobrescrito
		smartphone.informarCaracteristicas();

	}

}
