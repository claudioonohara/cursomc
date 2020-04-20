package br.eti.claudioonohara.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.eti.claudioonohara.cursomc.domain.Pedido;
import br.eti.claudioonohara.cursomc.repositories.PedidoRepository;
import br.eti.claudioonohara.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repo;

	public Pedido find(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo:" + Pedido.class.getName()));
	}
}
