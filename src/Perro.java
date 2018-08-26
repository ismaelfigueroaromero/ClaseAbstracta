
public class Perro extends Animal{

	//Constructor, clase Perro.
	public Perro() {
		//super(); ejecuta el constructor de la clase Padre (Animal)
		super();
		//y setea un nombre en 1ra instancia para el perro que se cree
		setNombre("Perro");
	}
	
	//Finalmente se implementa el metodo absrtacto, declarado en clase abstracta Animal.
	public void moverse() {
		System.out.println("El perro esta caminando, ya que es su forma de moverse.");
	}
	
	
}
