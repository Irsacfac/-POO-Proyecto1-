package pruebas;

import programa.Jugador;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jugador p=new Jugador();
		Jugador q=new Jugador("Isaac");
		p.toString();
		q.toString();
		q.cambiarPosicion(4);
		p.toString();
		q.toString();
		q.cambiarPosicion(5);
		p.toString();
		q.toString();
		q.cambiarPosicion(4);//humildad
		p.toString();
		q.toString();
		q.cambiarPosicion(1);//ira
		q.cambiarPosicion(8);//generosidad
		q.cambiarPosicion(9);//lujuria
		p.toString();
		q.toString();
		q.cambiarPosicion(7);//abstinencia
		q.cambiarPosicion(1);//soberbia
		q.cambiarPosicion(10);//paciencia
		q.toString();
		q.cambiarPosicion(4);//gula
		q.cambiarPosicion(13);//templanza
		q.cambiarPosicion(11);//envidia
		q.cambiarPosicion(26);//caridad
		q.toString();
	}

}
