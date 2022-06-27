package org.qtx.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestArmadoras {
	@Autowired
	private IServicioArmadoras servicio;

	public TestArmadoras() {
		super();
	}

	public IServicioArmadoras getServicio() {
		return servicio;
	}

	public void setServicio(IServicioArmadoras servicio) {
		this.servicio = servicio;
	}
	
	public void testServicio() {
		String armadoras = servicio.getArmadoras();
		System.out.println(armadoras);
	}
}
