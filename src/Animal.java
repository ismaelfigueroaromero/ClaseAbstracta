
public abstract class Animal {
	
	private String nombre;
	//cambio 1
	//cambio 2
	//Se crea el constructor, clase Padre, super clase. en este caso vacio
	public Animal() {	
	}
	
	//Metodo normal, de un animal, que realiza la accion de comer.
	public void comer() {
		System.out.println("El "+nombre+" esta comiendo.");
	}
	
	//Metodo abstracto, es distinto para cada clase hijo... Solo se declara en esta clase, se implementa en cada clase hijo
	public abstract void moverse();
	
	//Metodo que le setea un nombre al animal que se crea.
	public void setNombre(String s) {
		nombre = s;
	}
	
	//Metodo que obtiene dicho nombre.
	public String getNombre() {
		return nombre;
	}
	
	
}
