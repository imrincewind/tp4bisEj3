package sistema;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		
		//VOTANTES
		Votante a = new Votante(222);
		Votante b = new Votante(333);
		Votante c = new Votante(444);
		Votante d = new Votante(123);
		Votante e = new Votante(456);
		Votante f = new Votante(789);
		Votante g = new Votante(890);
		Votante h = new Votante(234);
		Votante i = new Votante(567);
		Votante j = new Votante(321);
		Votante k = new Votante(678);
		Votante l = new Votante(724);
		
		//PADRONES
		
		ArrayList<Votante> padron1 = new ArrayList<Votante>();
		ArrayList<Votante> padron2 = new ArrayList<Votante>();
		ArrayList<Votante> padron3 = new ArrayList<Votante>();
		ArrayList<Votante> padron4 = new ArrayList<Votante>();
		ArrayList<Votante> padron5 = new ArrayList<Votante>();
		
		padron1.add(a);
		padron1.add(b);
		padron1.add(c);
		padron1.add(d);
		padron2.add(e);
		padron2.add(f);
		padron3.add(g);
		padron4.add(h);
		padron4.add(i);
		padron4.add(j);
		padron5.add(k);
		padron5.add(l);
		
		
		//CANDIDATOS
		Candidato MM = new Candidato("Mauricio Macri", "PRO", "Roba-Tutti");
		Candidato CFK = new Candidato("Cristina Fernandez", "Frente Para la Victoria", "Vamo que ganamo");
		HashMap<Candidato, Integer> candidatos = new HashMap<Candidato,Integer>();
		candidatos.put(MM, 0);
		candidatos.put(CFK, 0);
		
		//MESAS
		Mesa m1 = new Mesa(1,candidatos,padron1);
		Mesa m2 = new Mesa(2,candidatos,padron2);
		Mesa m3 = new Mesa(3,candidatos,padron3);
		Mesa m4 = new Mesa(4,candidatos,padron4);
		Mesa m5 = new Mesa(5,candidatos,padron5);
		
		ArrayList<Mesa> mesasEsc1 = new ArrayList<Mesa>();
		ArrayList<Mesa> mesasEsc2 = new ArrayList<Mesa>();
		ArrayList<Mesa> mesasEsc3 = new ArrayList<Mesa>();
		
		mesasEsc1.add(m1);
		mesasEsc2.add(m2);
		mesasEsc2.add(m3);
		mesasEsc3.add(m4);
		mesasEsc3.add(m5);
		
		//ESCUELAS
		Escuela esc1= new Escuela("Nestor Kirchner", mesasEsc1);
		Escuela esc2= new Escuela("Tu escuela", mesasEsc2);
		Escuela esc3= new Escuela("Mi escuela", mesasEsc3);
		ArrayList<Escuela> escuelas = new ArrayList<Escuela>();
		escuelas.add(esc1);
		escuelas.add(esc2);
		
		//BARRIO
		Barrio b1= new Barrio("Bicentenario", escuelas);
		
		//arraylist de areas
		ArrayList<Area> areas = new ArrayList<Area>();
		areas.add(b1);
		areas.add(esc3);
		//Localidad
		
		Localidad l1 = new Localidad("La localidad", areas);
		
		// A VOTAR!!
		m1.Votar(a, CFK);
		m1.Votar(b, CFK);
		m1.Votar(c, CFK);
		m1.Votar(d, MM); //buuu
		m2.Votar(e, CFK);
		m2.Votar(f, CFK);
		m3.Votar(g, CFK);
		m4.Votar(h, MM);//buuu
		m4.Votar(i, CFK);
		m4.Votar(j, MM);//buu
		m5.Votar(k, CFK);
		m5.Votar(l, CFK);
		
		
		//A CONTAR!!!
		//POR MESA:
		
		System.out.println(m1.getVotosCandidato(CFK));
		System.out.println(m2.getVotosCandidato(CFK));
		System.out.println(m3.getVotosCandidato(CFK));
		System.out.println(m4.getVotosCandidato(CFK));
		System.out.println(m5.getVotosCandidato(CFK));
		
		System.out.println(m1.getVotosCandidato(MM));
		System.out.println(m2.getVotosCandidato(MM));
		System.out.println(m3.getVotosCandidato(MM));
		System.out.println(m4.getVotosCandidato(MM));
		System.out.println(m5.getVotosCandidato(MM));
		
		//POR ESCUELA:
		System.out.println(esc1.getVotosCandidato(CFK));
		System.out.println(esc2.getVotosCandidato(CFK));
		System.out.println(esc3.getVotosCandidato(CFK));

		System.out.println(esc1.getVotosCandidato(MM));
		System.out.println(esc1.getVotosCandidato(MM));
		System.out.println(esc1.getVotosCandidato(MM));
		
		//POR BARRIO:
		
		System.out.println(b1.getVotosCandidato(CFK));
		System.out.println(l1.getVotosCandidato(MM));

		//POR LOCALIDAD:
		
		System.out.println(l1.getVotosCandidato(CFK));
		System.out.println(l1.getVotosCandidato(MM));
		
	}

}
