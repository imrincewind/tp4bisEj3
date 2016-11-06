package sistema;

public class Candidato {
private String nombre;
private String partido;
private String agrupacion;
int votos;
public Candidato(String nombre, String partido, String agrupacion){
	this.agrupacion = agrupacion;
	this.nombre = nombre;
	this.partido = partido;
}
public void sumarVoto() {
	votos++;
}
public int getVotos() {
	return votos;
}
}
