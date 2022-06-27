package org.qtx.test;

import java.util.Set;

import org.qtx.entidades.Armadora;
import org.qtx.persistencia.GestorDatosJPA;
import org.qtx.persistencia.GestorDatosMemoria;
import org.qtx.servicios.IGestorDatos;

public class TestServicioDatos {
	

	public static void main(String[] args) {
		System.out.println("Probando gestor de datos en memoria");
		IGestorDatos gestorDatosMem = new GestorDatosMemoria();
		Set<Armadora> setArmadoras = gestorDatosMem.getArmadorasTodas();
		System.out.println(setArmadoras);
		
		
		System.out.println("Probando gestor de datos JPA");
		IGestorDatos gestorDatos = new GestorDatosJPA();
		setArmadoras = gestorDatos.getArmadorasTodas();
		System.out.println(setArmadoras);
		
	}

}
