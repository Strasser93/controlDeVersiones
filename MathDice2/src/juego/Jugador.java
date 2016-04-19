package juego;

public class Jugador {
	//Propiedades
		private String nombre;
		private String apellidos;
		private int edad;
		private int puntos;

		//Constructor 
		//Punto de entrada que se ejeuta al crear un objeto de tipo Jugador
		public Jugador(String nom, String ape, Integer eda) {
			
			nombre=nom;
			apellidos=ape;
			edad=eda;
			puntos=0;
			
		
		}
		public String getNombre(){
			return nombre;
		}
		public String getApellidos(){
			return apellidos;
		}
		public Integer getEdad(){
			return edad;
		}
		public Integer getPuntos(){
			return puntos;
		}
		public void setNombre(String nom){
			nombre=nom;
		}
		public void setApellidos(String ape){
			apellidos=ape;
		}
		public void setEdad (Integer eda){
			edad=eda;
		}
		public void setPuntos (Integer pun){
			puntos=pun;
		}
}
