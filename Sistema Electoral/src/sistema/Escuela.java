package sistema;

import java.util.ArrayList;
import java.util.HashMap;

public class Escuela extends Area{
	
	private ArrayList<Mesa> mesas = new ArrayList<Mesa>();
	public Escuela(String nombre, ArrayList<Mesa> mesas){
		super(nombre);
		this.mesas = mesas;
	}
	@Override
	public int getVotosCandidato(Candidato c) {
		int cant = 0;
		for (Mesa m: mesas){
			cant += m.getVotosCandidato(c);
		}
		return cant;
	}

}
