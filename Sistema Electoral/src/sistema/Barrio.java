package sistema;

import java.util.ArrayList;

public class Barrio extends Area{
	private ArrayList<Escuela> escuelas = new ArrayList<Escuela>();
	public Barrio(String nombre, ArrayList<Escuela> escuelas){
		super(nombre);
		this.escuelas = escuelas;
	}
	@Override
	public int getVotosCandidato(Candidato c) {
		int cant = 0;
		for (Escuela e : escuelas){
			cant += e.getVotosCandidato(c);
		}
		return cant;
	}

}
