
public class SmartPhone extends Celular {
	private float pixelesCamara;
	private float tamanioMemoriaInterna;
	private float tamanioMemoriaExterna;
	
	//Constructor por defecto
	public SmartPhone() {
	}
	
	//constructor con los atributos de la clase incluso los heredados
	public SmartPhone(String marca, String modelo, String color, float pixelesCamara, float tamanioMemoriaRam, float tamaoDisco) {
	
		super(marca,modelo,color);
		this.pixelesCamara = pixelesCamara;
		this.tamanioMemoriaInterna = tamanioMemoriaRam;
		this.tamanioMemoriaExterna = tamaoDisco;
	}

	//Metodo sobrescrito (override), utilizo codigo de la clase celular y añado codigo que necesito
	public void informarCaracteristicas() {
		// TODO Auto-generated method stub
		super.informarCaracteristicas();
		System.out.println(String.format("SmarPhone calida camara: %s pixeles", pixelesCamara));
		System.out.println(String.format("SmarPhone tamaño de memoria interna: %s Gb",tamanioMemoriaInterna));
		System.out.println(String.format("SmarPhone tamaño de memoria externa: %s Gb",tamanioMemoriaExterna));
	}
	
	//getters y setters
	public float getPixelesCamara() {
		return pixelesCamara;
	}
	public void setPixelesCamara(float pixelescamara) {
		this.pixelesCamara = pixelescamara;
	}
	public float getTamanioMemoriaInterna() {
		return tamanioMemoriaInterna;
	}
 	public void setTamanioMemoriaInterna(float tamanioMemoriaInterna) {
		this.tamanioMemoriaInterna = tamanioMemoriaInterna;
	}
 	public float getTamanioMemoriaExterna() {
		return tamanioMemoriaExterna;
	}
 	public void setTamanioMemoriaExterna(float tamanioMemoriaExterna) {
		this.tamanioMemoriaExterna = tamanioMemoriaExterna;
	}
}
