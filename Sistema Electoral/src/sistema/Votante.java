package sistema;

public class Votante {
int dni;
boolean yaVoto;
Candidato voto;
public Votante(int dni){
	this.dni = dni;
}
public void Votar(Candidato voto) {
	if (!yaVoto){
	this.voto = voto;
	yaVoto = true;
	voto.sumarVoto();}
}

public int getDni() {
	return dni;
}
@Override
	public boolean equals(Object o) {
		if(this.dni == ((Votante) o).getDni()){
			return true;
		}else{
		return false;
		}
	}
}
