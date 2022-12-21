package SistemaDeComunicados.Comparadores;

import java.util.Comparator;

import SistemaDeComunicados.Empleado;

public class ComparadorMensajes implements Comparator<Empleado>{
	
	@Override
	public int compare(Empleado o1, Empleado o2) {
		return o1.getMensajesTotales() - o2.getMensajesTotales();
	}

}