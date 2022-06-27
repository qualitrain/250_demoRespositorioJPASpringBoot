package org.qtx.persistencia;

import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import org.qtx.entidades.Armadora;
import org.qtx.entidades.ModeloAuto;
import org.qtx.servicios.IGestorDatos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Primary
@Repository
public class GestorDatosRepositoryJPA implements IGestorDatos {
	@Autowired
	private IArmadoraRepository repoArmadora;

	
	public GestorDatosRepositoryJPA() {
		super();
		System.out.println("***** GestorDatosRepositoryJPA *******");
	}

	@Override
	public Armadora getArmadoraXID(String cveArmadora) {
		System.out.println("***** GestorDatosRepositoryJPA.getArmadoraXID() *******");
		Optional<Armadora> armadora = repoArmadora.findById(cveArmadora);
		if(armadora.isPresent())
			return armadora.get();
		return null;
	}

	@Override
	public Set<Armadora> getArmadorasTodas() {
		System.out.println("***** GestorDatosRepositoryJPA.getArmadorasTodas() *******");
		return new HashSet<>(repoArmadora.findAll());
	}

	@Override
	public Map<String, Armadora> getMapaArmadoras() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Armadora insertarArmadora(Armadora armadora) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModeloAuto insertarModeloAuto(ModeloAuto modelo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Armadora getArmadoraConModelosXID(String cveArmadora) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Armadora actualizarArmadora(Armadora armadora) {
		// TODO Auto-generated method stub
		return null;
	}

}
