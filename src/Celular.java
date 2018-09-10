
public class Celular {
		//Atributos de la clase
	private String marca;
	private String modelo;
	private String color;
	
	//Constructor con parametros
	public Celular(String marca, String modelo, String color)
	{
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
	}
	
	//Constructor vacio
	public Celular()
	{
		
	}
	
	//Metodo hacer llamada
	public void llamar(String nombre)
	{
		System.out.println("llamando a: "+ nombre);
	}
	
	//Metodo finalizar llamada
	public void cortarLlamada()
	{
		System.out.println("llamanda finalizada");
	}
	//Metodo para informar de las caracteristicas del celular
	public void informarCaracteristicas()
	{
		System.out.println(String.format("Celular Marca: %s", marca));
		System.out.println(String.format("Celular Modelo: %s", modelo));
		System.out.println(String.format("Celular Color: %s", color));
	}
	
	//Los getters y setters 
	public String getMarca()
	{
		return marca;
	}
	public void setMarca(String marca)
	{
		this.marca = marca;
	}
	public String getModelo()
	{
		return modelo;
	}
	public void  setModelo(String modelo)
	{
		this.modelo = modelo;
	}
	public String getColor()
	{	
		return color;
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	
}
