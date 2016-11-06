package sistema;

import java.util.ArrayList;

public class Localidad extends Area{
	private ArrayList<Area> lugares = new ArrayList<Area>();
public Localidad(String nombre, ArrayList<Area> lugares){
	super(nombre);
	this.lugares = lugares;
}
@Override
public int getVotosCandidato(Candidato c) {
	int cant = 0;
	for (Area a: lugares){
		cant += a.getVotosCandidato(c);
	}
	return cant;
}
}
