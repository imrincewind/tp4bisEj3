package sistema;

import java.util.ArrayList;
import java.util.HashMap;

public class Mesa implements VotosCandidato{
	private int numero;
private ArrayList<Votante> padron = new ArrayList<Votante>();
private HashMap<Candidato,Integer> votosPorCandidato = new HashMap<Candidato, Integer>();
public Mesa(int numero, HashMap<Candidato, Integer> candidatos, ArrayList<Votante> padron){
	this.numero = numero;
	votosPorCandidato = candidatos;
	this.padron = padron;
}
@Override
public int getVotosCandidato(Candidato c) {
	return votosPorCandidato.get(c);
}
public boolean Votar(Votante v, Candidato voto){
	boolean aceptado = false;
	for (Votante e: padron){
		if (e.equals(v)){
			v.Votar(voto);
			int temp = votosPorCandidato.get(voto);
			temp++;
			votosPorCandidato.put(voto, temp);
			aceptado = true;
			
		}
	}
	return aceptado;
	
}
}
