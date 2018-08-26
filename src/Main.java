
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Se crea un objeto Perro p, que tambien puede ser creado como Animal
		Perro p = new Perro();
		p.comer();
		p.moverse();
		
		Ave a = new Ave();
		a.comer();
		a.moverse();
		
	 /* Por tema de herencia y POLIMORFISMO tambien se pueden crear asi los animales
	  * Animal p = new Perro(); //donde se crea un nuevo objeto de la clase Animal que será un perro
	  * p.comer();				//ya que clase Perro Hereda de la clase Animal.
	  * p.moverse();
		
	  * Animal a = new Ave();	//mismo caso en Ave, se crea un nuevo Animal que será un Ave...
	  * a.comer();				//AMBOS EJEMPLOS SON DE POLIMORFISMO. :D
	  * a.moverse();
	  */
		
	}
}
