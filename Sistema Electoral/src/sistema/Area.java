package sistema;

public abstract class Area implements VotosCandidato{
String nombre;
public Area(String nombre){
	this.nombre = nombre;
}
public String getNombre() {
	return nombre;
}
public abstract int getVotosCandidato(Candidato c);
}
